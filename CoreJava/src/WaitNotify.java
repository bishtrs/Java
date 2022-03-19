

class Data {
    private int data;
    private volatile boolean consume = false;

    public synchronized void setData(int data) {
        if (!consume) {
            consume = false;
            this.data = data;
            this.notify();
        } else {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized int getData() {
        if (!consume) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            consume = true;
            this.notify();
        }
        return data;
    }
}

class Producer implements Runnable {
    private Data data;

    Producer(Data data) {
        this.data = data;
    }

    public void run() {
        int counter = 0;
        
        while(true) {
            System.out.println("Generating data, please wait...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
			System.out.println("Generated data " + (counter));
            data.setData(counter);
            counter++;
        }
    }
}

class Consumer implements Runnable {
    private Data data;

    Consumer(Data data) {
        this.data = data;
    }

    public void run() {
        while(true) {
            System.out.println("Got data..."  + data.getData());
        }
   }
}
	
public class WaitNotify {
    public static void main(String[] args) {
        Data data = new Data();
		
        Producer producer = new Producer(data);
        Thread producerThread = new Thread(producer);
        Consumer consumer = new Consumer(data);
        Thread consumerThread = new Thread(consumer);
		
        consumerThread.start();
        producerThread.start();
    }
}
	


package threads;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
    
public class MyThread implements Runnable {
    public void run() { 
        System.out.println("Thread started");
    }
	
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        
        // fixed thread pool with four threads
        ExecutorService service = Executors.newFixedThreadPool(4); 
        service.submit(myThread);
        
        // cached thread pool
        service = Executors.newCachedThreadPool(); 
        service.submit(myThread);
        
         // single thread pool
        service = Executors.newSingleThreadExecutor(); 
        service.submit(myThread);
    }
}
    
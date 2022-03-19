import java.util.concurrent.Executor;


public class TaskExecutor implements Executor {
    public void execute(Runnable r) {
        r.run();
    }
	
    public static void main(String[] args) {
        TaskExecutor taskExecutor = new TaskExecutor();
        Runnable runnable = () -> {System.out.println("Thread implementing Runnable started");};
            
        taskExecutor.execute(runnable);
    }
}
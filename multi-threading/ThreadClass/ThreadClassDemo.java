class WorkerThread extends Thread {

    // Task executed by the thread
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(
                Thread.currentThread().getName() + " -> " + i
            );
        }
    }
}

public class ThreadClassDemo {
  public static void main(String[] args) {

        WorkerThread t1 = new WorkerThread();
        WorkerThread t2 = new WorkerThread();

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();   // starts new thread
        t2.start();
    }
}
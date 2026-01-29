public class ThreadLifeCycle {

    public static void main(String[] args) throws InterruptedException {

        // NEW state
        Thread workerThread = new Thread(() -> {
            try {
                System.out.println("Worker thread started. State: RUNNABLE");

                // TIMED_WAITING state
                Thread.sleep(1000);
                System.out.println("Worker thread resumed after sleep.");

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Worker thread interrupted.");
            }
        });
System.out.println("State after creation: " + workerThread.getState()); // NEW

        // RUNNABLE state
        workerThread.start();
        System.out.println("State after start(): " + workerThread.getState());

        // WAITING state (main thread waits for worker thread)
        workerThread.join();

        // TERMINATED state
        System.out.println("State after completion: " + workerThread.getState());
    }
}

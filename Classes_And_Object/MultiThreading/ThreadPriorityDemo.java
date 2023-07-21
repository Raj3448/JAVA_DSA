public class ThreadPriorityDemo {
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();
        int priority = currentThread.getPriority();

        System.out.println("Current thread priority: " + priority);
    }
}


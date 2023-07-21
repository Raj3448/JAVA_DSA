public class Thread implements Runnable {
    private Runnable target;
    private boolean isAlive;
    private String name;

    public Thread() {
        this(null, "Thread");
    }

    public Thread(Runnable target) {
        this(target, "Thread");
    }

    public Thread(Runnable target, String name) {
        this.target = target;
        this.name = name;
    }

    public void run() {
        if (target != null) {
            target.run();
        }
    }

    public void start() {
        if (!isAlive) {
            isAlive = true;
            new Thread(this).start();
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Thread currentThread() {
        // Returns the currently executing thread
        // This is just a simplified version, in reality, it's more complex
        // and platform-specific.
        return null;
    }
}


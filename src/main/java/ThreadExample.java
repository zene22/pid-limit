public class ThreadExample {
    public static void main(String[] args) {
        String max_threads = "10000";
        System.out.println("maximum threads " + max_threads + " is default");
        String envthreads = System.getenv("MAX_THREADS");
        if (envthreads != null && !envthreads.equals("")) {
            max_threads = envthreads;
            System.out.println("maximum threads " + max_threads + " from env variable MAX_THREADS overrrides");
        }
        if (args.length > 0) {
            max_threads = args[0];
            System.out.println("maximum threads " + max_threads + " from call parameter overrrides");
        }
        Integer maxThreads = new Integer(max_threads);
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < maxThreads; i++) {
            new Thread("" + i) {
                public void run() {
                    try {
                        Thread.sleep(20000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread: " + getName() + " finished");
                }
            }.start();
            System.out.println("Started Thread " + i);
        }
    }
}

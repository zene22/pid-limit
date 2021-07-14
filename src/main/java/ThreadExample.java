public class ThreadExample {
    public static void main(String[] args){
        System.out.println(Thread.currentThread().getName());
        for(int i=0; i<10000; i++){
            new Thread("" + i){
                public void run(){
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

public class StacktraceGenerator {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            int i = 0;
            generateOutput(i);
        }
    }

    private static void generateOutput(int i) throws InterruptedException {
        i++;
        if (i < 10) generateOutput(i);
        try {
            throw new ArrayIndexOutOfBoundsException("my new Exception");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(10000);
        System.out.println("This is a normal line on stdout");
        Thread.sleep(10000);
        System.err.println("This is a normal line on stderr");
        Thread.sleep(10000);
        System.out.println("This is another normal line on stdout");
        Thread.sleep(10000);
    }


}

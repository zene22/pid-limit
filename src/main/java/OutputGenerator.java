import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class OutputGenerator {
    private static final Logger logger = LogManager.getLogger(OutputGenerator.class);

    public void generateOutput(int i) throws InterruptedException {
        i++;
        if (i < 10) generateOutput(i);
        try {
            throw new ArrayIndexOutOfBoundsException("my new Exception");
        } catch (Exception e) {
            logger.error("This is an exception", e);
        }
        Thread.sleep(10000);
        logger.debug("This is a normal line on debug");
        Thread.sleep(10000);
        logger.info("This is a normal line on info");
        Thread.sleep(10000);
        logger.warn("This is another normal line on warn");
        Thread.sleep(10000);
    }

}

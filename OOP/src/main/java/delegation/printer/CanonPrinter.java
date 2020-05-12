package delegation.printer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CanonPrinter implements Printer {

    private static final Logger LOGGER = LoggerFactory.getLogger(CanonPrinter.class);

    @Override
    public void print(String message) {
        LOGGER.info("Canon Printer : {}", message);
    }
}

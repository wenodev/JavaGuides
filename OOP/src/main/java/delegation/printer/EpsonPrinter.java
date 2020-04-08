package delegation.printer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EpsonPrinter implements Printer {

    private static final Logger LOGGER = LoggerFactory.getLogger(EpsonPrinter.class);

    @Override
    public void print(String message) {
        LOGGER.info("Epson Printer : {} ", message);
    }
}

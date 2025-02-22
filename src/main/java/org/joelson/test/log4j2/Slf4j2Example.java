package org.joelson.test.log4j2;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4j2Example {

    private static final Logger logger = LoggerFactory.getLogger(Slf4j2Example.class);

    public static void main(String[] args) {
        logger.trace("Trace log message");
        logger.debug("Debug log message");
        logger.info("Info log message");
        logger.error("Error log message");
    }
}

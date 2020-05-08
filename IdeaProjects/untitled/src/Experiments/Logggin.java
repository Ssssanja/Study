package Experiments;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logggin {

    public static final Logger LOGGER = LoggerFactory.getLogger(Logggin.class);

    public static void main(String[] args) {

        LOGGER.info("Test log record!!!");
        LOGGER.error("В программе возникла ошибка!");
    }
}
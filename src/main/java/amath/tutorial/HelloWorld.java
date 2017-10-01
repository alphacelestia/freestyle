package amath.tutorial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class HelloWorld {

    private final static Logger logger = LoggerFactory.getLogger(HelloWorld.class);

    public static void main(String [] args) {
        final String msg = "Hello, Henry";
        logger.info("{}", msg);
    }



}

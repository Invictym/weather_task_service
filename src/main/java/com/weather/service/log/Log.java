package com.weather.service.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {

    private Log() {
    }

    public static Logger logger() {
        return LogManager.getLogger(getCallingClassName());
    }

    private static String getCallingClassName() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String fullClassName = stackTrace[2].getClassName();
        return fullClassName.substring(fullClassName.lastIndexOf('.') + 1);
    }

}

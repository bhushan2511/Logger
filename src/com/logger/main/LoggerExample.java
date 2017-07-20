package com.logger.main;

import com.logger.file.FileLogger;
import com.logger.file.FileOut;
import com.logger.interfaces.Logger;
import com.logger.standard.StandardLogger;
import com.logger.standard.StdOut;
import com.logger.system.err.ErrOut;
import com.logger.system.err.SystemLogger;

public class LoggerExample {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Logger stdLogger = new StandardLogger(Logger.LOG_LEVEL_DEBUG, new StdOut());
        stdLogger.Debug​("Logger prints Debug statement \n");
        stdLogger.Debug​("Logger prints Debug statement \n");


        Logger fileLogger = new FileLogger(Logger.LOG_LEVEL_DEBUG, new FileOut());
        fileLogger.Debug​("Logger prints Debug statement \n");
        fileLogger.Debug​("Logger prints Debug statement \n");

        Logger systemLogger = new SystemLogger(Logger.LOG_LEVEL_DEBUG, new ErrOut());
        systemLogger.Debug​("Logger prints Debug statement \n");
        systemLogger.Debug​("Logger prints Debug statement \n");

    }

}

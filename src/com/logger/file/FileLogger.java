package com.logger.file;

import com.logger.interfaces.Logger;
import com.logger.interfaces.Output;

public class FileLogger implements Logger{
    private final Output output;
    private final int logLevel;
    
    
    public FileLogger(int logLevel, FileOut output) {
    this.logLevel = logLevel;
    this.output = output;
    }
    
    public void Debug​(String msg) {
    log(Logger.LOG_LEVEL_DEBUG, msg);
    }
    
    public void Error​(String msg) {
    log(Logger.LOG_LEVEL_ERROR, msg);
    }
    
    public void Info​(String msg) {
    log(Logger.LOG_LEVEL_INFO, msg);
    }
    
    void log(int requestedLevel, String msg) {
    if ((requestedLevel & this.logLevel) > 0) {
        output.write​(msg);
    }
    
    }
    
    

}

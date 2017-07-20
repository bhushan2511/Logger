package com.logger.interfaces;

public interface Logger {
    public final static int LOG_LEVEL_INFO = 0x0002;
    public final static int LOG_LEVEL_ERROR = 0x0004;
    public final static int LOG_LEVEL_DEBUG = 0x0008;

    public void Debug​(String msg);

    public void Error​(String msg);

    public void Info​(String msg);
}

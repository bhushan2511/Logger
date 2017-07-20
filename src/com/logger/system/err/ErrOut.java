package com.logger.system.err;

import com.logger.interfaces.Output;

public class ErrOut implements Output {


    public void write​(String msg) {
        System.err.println("Got an error: " + msg);
    }

}

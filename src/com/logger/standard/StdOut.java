package com.logger.standard;

import com.logger.interfaces.Output;

public class StdOut implements Output  {
    public void write​(String msg) {
            System.out.print(msg);
        }
}

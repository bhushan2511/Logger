package com.logger.file;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import com.logger.interfaces.Output;

public class FileOut implements Output {
    Logger logger = Logger.getLogger("MyLog");
    FileHandler fh;

    public void write​(String msg) {

        try {
            fh = new FileHandler("/tmp/MyLogFile.log");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

            logger.info(msg);

        }
        catch (SecurityException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}

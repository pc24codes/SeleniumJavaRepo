package com.sample;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    private static Properties props;

    static {
        try {
            props = new Properties();
            FileInputStream fileInputStream= new FileInputStream("src/test/resources/config.properties");
            props.load(fileInputStream);
            // empty commit
        } catch (IOException e){
            e.printStackTrace();
            throw new RuntimeException("Failed to load properties file");
        }
    }

    public static String getProperty(String key) {
        return props.getProperty(key);
    }

}

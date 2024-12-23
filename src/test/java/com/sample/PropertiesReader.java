package com.sample;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReader {

    private static Properties props;

    static {
        try {
            props = new Properties();
            InputStream inputStream= PropertiesReader.class.getClassLoader().getResourceAsStream("config.properties");

            if(inputStream != null){
                props.load(inputStream);
            }
            else {
                throw new RuntimeException("config.properties file not found in classpath");
            }

            props.load(inputStream);
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

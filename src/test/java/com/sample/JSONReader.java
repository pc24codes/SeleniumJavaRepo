package com.sample;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.security.Key;
import java.util.Map;

public class JSONReader {

    private static final String TestDataPath = "src/test/resources/TestData.json";

    public static Map<String, Object> getTestData(){
        ObjectMapper mapper = new ObjectMapper();
        try{
            return mapper.readValue(new File(TestDataPath),Map.class);
        }catch (IOException e){
            throw new RuntimeException(("Failed to read JSON"));
        }
    }

    public static String getValue(String parentKey, String key){ 
        Map<String, Object> testData = getTestData();
        Map<String, String> parentData = (Map<String, String>) testData.get(parentKey);
        return parentData.get(key);
    }

}



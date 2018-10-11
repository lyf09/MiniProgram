package com.cloud.infrastructure.common.utils.json;


import com.cloud.infrastructure.common.utils.pagination.Condition;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public abstract class JsonUtils {

    private static ObjectMapper mapper = new ObjectMapper();

    public static String toJson(Object object) {
        try {
            return mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Map parse(String jsonObject) {
        try {
            return mapper.readValue(jsonObject, Map.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <T> T parse(String jsonObject, Class<T> clazz){
        try {
            return  mapper.readValue(jsonObject, clazz);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<?> parse(String jsonObject, List<?> type){
        try {
            return mapper.readValue(jsonObject, type.getClass());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static void main(String[] args){
        String json = "[{ \"columnName\": \"11\", \"operator\": \"=\" }, { \"columnName\": \"11\", \"operator\": \"=\" }]";

        try {
            List<Condition> list = mapper.readValue(json, List.class);
            System.out.println(list.get(0).getClass());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

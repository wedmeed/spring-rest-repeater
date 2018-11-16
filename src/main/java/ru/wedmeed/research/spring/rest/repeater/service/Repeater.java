package ru.wedmeed.research.spring.rest.repeater.service;

import java.util.HashMap;
import java.util.Map;

public class Repeater {
    public Map<String, String> getResponse() {
        return response;
    }

    private Map<String,String> response;

    public Repeater (Map<String,String> input){
        response = new HashMap<>();
        for (Map.Entry<String, String> entry : input.entrySet()) {
            response.put(entry.getKey(), entry.getValue());

        }
    }


}

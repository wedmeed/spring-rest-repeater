package ru.wedmeed.research.spring.rest.repeater.service;

import ru.wedmeed.research.spring.rest.repeater.web.model.RepeaterRs;

import java.util.Map;

public class Repeater {
    public RepeaterRs getResponse() {
        return response;
    }

    private RepeaterRs response;

    public Repeater (Map<String,Object> input){
        response = new RepeaterRs();
        for (Map.Entry<String, Object> entry : input.entrySet()) {
            response.put(entry.getKey(), entry.getValue());
        }
    }


}

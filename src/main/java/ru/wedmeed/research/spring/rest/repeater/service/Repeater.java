package ru.wedmeed.research.spring.rest.repeater.service;

import ru.wedmeed.research.spring.rest.repeater.web.model.RepeaterRs;

import javax.servlet.http.HttpServletRequest;
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

    public Repeater (HttpServletRequest request, Map<String, Object> input){
        response = new RepeaterRs();
        for (Map.Entry<String, Object> entry : input.entrySet()) {
            response.put(entry.getKey(), entry.getValue());
        }
        response.put("URL", request.getRequestURL());
    }


}

package ru.wedmeed.research.spring.rest.repeater.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.wedmeed.research.spring.rest.repeater.service.Repeater;
import ru.wedmeed.research.spring.rest.repeater.web.model.RepeaterRs;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
public class RepeaterController {

    @GetMapping("/repeat")
    public RepeaterRs repeater(@RequestParam Map<String,Object> input) {
        Repeater repInstance = new Repeater(input);
        return repInstance.getResponse();
    }

    @GetMapping("/**")
    public RepeaterRs repeatWithUrl(HttpServletRequest request,
                                    @RequestParam Map<String,Object> input) {
        Repeater repInstance = new Repeater(request, input);
        return repInstance.getResponse();
    }
}

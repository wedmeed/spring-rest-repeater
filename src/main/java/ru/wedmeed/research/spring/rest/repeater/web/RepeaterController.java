package ru.wedmeed.research.spring.rest.repeater.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.wedmeed.research.spring.rest.repeater.service.Repeater;

import java.util.Map;

@RestController
public class RepeaterController {

    @GetMapping("/repeat")
    public Repeater repeater(@RequestParam Map<String,String> input) {
        return new Repeater(input);
    }
}

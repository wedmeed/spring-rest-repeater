package ru.wedmeed.research.spring.rest.repeater.service;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class RepeaterTests {

    @Test
    public void ConstructorWithValidArgTest(){
        Map<String,Object> reference = new HashMap<String,Object>();
        reference.put("StringKey","StringValue");
        reference.put("IntKey",56);
        reference.put("NullKey",null);
        reference.put("BoolKey",true);
        Map<String,Object> input = new HashMap<String,Object>(reference);

        Repeater subject = new Repeater(input);
        assert(subject.getResponse().equals(reference));
    }

    @Test(expected = NullPointerException.class)
    public void ConstructorWithWrongArgTest(){
        Repeater subject = new Repeater(null);
    }
}

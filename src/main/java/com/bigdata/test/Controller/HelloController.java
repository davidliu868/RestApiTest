package com.bigdata.test.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(method = RequestMethod.GET,produces = "application/json;charset=UTF-8",value="/hello")
    public String say(){
        return "hello胜多负少的";
    }
}

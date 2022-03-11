package com.simplilearn;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    public String hello(){
        return "Hello Ravikant";
    }

    @RequestMapping("/protected")
    public String protectedHello(){
        return "Hello Ravi, I was protected";
    }

    @RequestMapping("/admin")
    public String admin(){
        return "Hello Ravikant from Admin";
    }

}
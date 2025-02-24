package com.bridgelabz.greetingapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/greeting")
public class GreetingControler {
    @Autowired
    private GreetingServices greetingServices ;
    @GetMapping("/hello")
    public String sayHello(){
        return " Hello World!";
    }
    @GetMapping("/services")
    public String sayHelloFromServices(){
        return GreetingServices.getServiceMessage();
    }
}

package com.bridgelabz.greetingapp;

import org.springframework.stereotype.Service;

@Service
public class GreetingServices {
    public static String getServiceMessage(){
        return " Hello World From BridgeLabz ";
    }
}

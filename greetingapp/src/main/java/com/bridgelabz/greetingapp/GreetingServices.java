package com.bridgelabz.greetingapp;

import org.springframework.stereotype.Service;

@Service
public class GreetingServices {
    public static String getServiceMessage(){
        return " Hello World From BridgeLabz ";
    }

    public static String getPesonalizedGreeting(String firstName, String lastName) {
        if(firstName != null && lastName !=null){
            return  "Hello " + firstName +lastName + " !" ;
        } else if (firstName!=null) {
            return " Hello " + firstName +" !";
        } else if (lastName != null) {
            return  " Hello "+ lastName +" !";
        }
        else  {
            return " Hello World " ;
        }
    }
}

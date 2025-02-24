package com.bridgelabz.greetingapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/greeting")
public class GreetingControler {

    @Autowired
    private GreetingServices greetingServices;

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
    @GetMapping("/service")
    public String sayHelloFromService() {
        return greetingServices.getGreetingMessage();
    }

    @GetMapping("/personalized")
    public String personalizedGreeting(@RequestParam(required = false) String firstName,
                                       @RequestParam(required = false) String lastName) {
        return greetingServices.getPersonalizedGreeting(firstName, lastName);
    }
    @PostMapping("/save")
    public Greeting saveGreeting(@RequestBody Greeting greeting) {
        return greetingServices.saveGreeting(greeting);
    }
    @GetMapping("/find/{id}")
    public Optional<Greeting> findGreetingById(@PathVariable Long id) {
        return greetingServices.findGreetingById(id);
    }
    @GetMapping("/all")
    public List<Greeting> getAllGreetings() {
        return greetingServices.getAllGreetings();
    }
    @PutMapping("/update/{id}")
    public Greeting updateGreeting(@PathVariable Long id, @RequestBody Greeting updatedGreeting) {
        return greetingServices.updateGreeting(id, updatedGreeting);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteGreeting(@PathVariable Long id) {
        return greetingServices.deleteGreeting(id);
    }
}

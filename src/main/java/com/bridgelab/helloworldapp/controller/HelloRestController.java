package com.bridgelab.helloworldapp.controller;

import com.bridgelab.helloworldapp.model.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/restCont")
public class HelloRestController {

    @RequestMapping(value = {"","/","/home"})
    public String sayHello(){
        return "This message from RestCon ";
    }


    @GetMapping("/web/message")
    public String getHello(){
        return "Hello from Bridgelabz ";
    }


    @GetMapping(value="/xyz")
    public String Hello(@RequestParam(value="name") String name, @RequestParam(value="age") int age){
    return "Hello " +name+ " whose age is " +age;
    }

    @GetMapping(value="pqr/{name}")
    public String sayHello(@PathVariable String name){
        return  "Hello "+name;
    }

    @PostMapping("/post")
    public String Hi(@RequestBody User user){
        return "Hello "+user.getFirstName()+" "+user.getLastName();
    }

    @PutMapping("/put/{firstName}")
    public String Mesg(@PathVariable String firstName, @RequestParam(value="lastName") String lastName){
        return "Hello "+firstName+" "+lastName;
    }
}
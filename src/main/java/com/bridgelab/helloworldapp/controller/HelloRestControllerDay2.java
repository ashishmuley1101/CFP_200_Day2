package com.bridgelab.helloworldapp.controller;


import com.bridgelab.helloworldapp.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestControllerDay2 {

    //    UseCae 1
    @GetMapping("")
    public String getHello(){
        return "Hello from Bridgelabz ";
    }

    // UseCase 2
    @GetMapping(value="/query")
    public String Hello(@RequestParam(value="name") String name){
        return "Hello " +name+ " from Bridgelabz " ;
    }

    //UseCase 3
    @GetMapping(value="param/{name}")
    public String sayHello(@PathVariable String name){
        return  "Hello "+name+ " from Bridgelabz";
    }

    // UseCase 4
    @PostMapping("/post")
    public String Hi(@RequestBody User user){
        return "Hello "+user.getFirstName()+" "+user.getLastName();
    }

    //UseCase 5
    @PutMapping("/put/{firstName}")
    public String Mesg(@PathVariable String firstName, @RequestParam(value="lastName") String lastName){
        return "Hello "+firstName+" "+lastName+" from Bridgelabz";
    }

}

package com.bridgelab.helloworldapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWebController {

    @GetMapping("/web")
    public String hello(){
        return "hello";
    }

    @GetMapping("/web/message")
    public String message(Model model){
        model.addAttribute("message","This message from CPF 200");
        return "message";
    }
}

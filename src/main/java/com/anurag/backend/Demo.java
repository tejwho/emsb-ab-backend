package com.anurag.backend;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@CrossOrigin (origins="http://localhost:5173/")
@RequestMapping("/anurag")
public class Demo{

    @GetMapping("/hello")
    public String wish(){
        return "Hi how are you?";
    }

    @GetMapping("/welcome")
    public String rocky(){
        return "Rocky neeku ledu Jockey";
    }
}
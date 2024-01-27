package com.example.museumsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeContolloer {
	@GetMapping("/")
    public String index() {
        return "index";
    }   

}

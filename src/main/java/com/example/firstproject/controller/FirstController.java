package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String niceToMeetyou(Model model){
        model.addAttribute("username","광진");
        return "greetings";//templates/greeting.mustache =>브라우저로 전송
    }

}

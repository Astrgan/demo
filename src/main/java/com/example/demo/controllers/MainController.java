package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @GetMapping(path = "/")
    public String mainPage(Model model) {


        String[] array = new String[] {"Winter", "Spring", "Summer", "Autumn"};
        model.addAttribute("data", array);

        return "index";
    }


}

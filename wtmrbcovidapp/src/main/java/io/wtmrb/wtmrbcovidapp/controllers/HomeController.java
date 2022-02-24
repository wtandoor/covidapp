package io.wtmrb.wtmrbcovidapp.controllers;

import io.wtmrb.wtmrbcovidapp.services.CoronaVirusDataServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    CoronaVirusDataServices coronaVirusDataServices;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("locationStats", coronaVirusDataServices.getAllStats());
        return "home";
    }
}

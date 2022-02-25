package io.wtmrb.wtmrbcovidapp.controllers;

import io.wtmrb.wtmrbcovidapp.models.LocationStats;
import io.wtmrb.wtmrbcovidapp.services.CoronaVirusDataServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private CoronaVirusDataServices coronaVirusDataService;

    @GetMapping("/")
    public String home(Model model) {
        List<LocationStats> allStats = coronaVirusDataService.getAllStats();
        model.addAttribute("locationStats", allStats);
        return "home";
    }
}

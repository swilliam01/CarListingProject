package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired
    CarsRepository carsRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @RequestMapping("/")
    public String carsList(Model model){
        model.addAttribute("carstore", carsRepository.findAll());
        return "list";
    }
    @GetMapping("/add")

    public String carForm(Model model){
        model.addAttribute("carstores", new Cars());
        return "carform";
    }

}

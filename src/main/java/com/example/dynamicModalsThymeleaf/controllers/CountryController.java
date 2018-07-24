package com.example.dynamicModalsThymeleaf.controllers;

import com.example.dynamicModalsThymeleaf.entities.Country;
import com.example.dynamicModalsThymeleaf.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CountryController {

    private CountryRepository countryRepository;

    @Autowired
    public CountryController(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @GetMapping("/")
    public String showPage(Model model, @RequestParam(defaultValue = "0") int page) {
        model.addAttribute("data", countryRepository.findAll(new PageRequest(page, 4)));
        model.addAttribute("currentPage", page);
        return "index";
    }

    @PostMapping("/save")
    public String saveCountry(Country c) {
        countryRepository.save(c);

        return "redirect:/";
    }

    @GetMapping("/delete")
    public String deleteCountry(Country c) {
        countryRepository.delete(c);

        return "redirect:/";
    }

    @GetMapping("/findOne")
    @ResponseBody
    public Country findCountry(Integer id) {

        return countryRepository.findOne(id);
    }
}

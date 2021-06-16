package com.ovi.vuethymleaf.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class HomeController {

    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("name", "Saiful Islam Ovi");
        return "dashboard/index";
    }

    @GetMapping("get")
    public ResponseEntity<?> get() {
        var result = List.of("Miyad", "ovi");
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}

package org.mars.spcidades.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Controller
public class MainController {

    @GetMapping("/home")
    public String mainController(Model model) {
        model.addAttribute("mainHour", new Date());

        return "home";
    }
}

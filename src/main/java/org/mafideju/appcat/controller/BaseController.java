package org.mafideju.appcat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @GetMapping("/")
    public String BaseMethod() {
        return "<div style='background-color: black; height: 100%; width: 100%; display: flex; align-items: center; justify-content: center;'>" +
                "<h1 style='color: whitesmoke;'>Who Shot Biggie?</h1></div>";
    }

    @GetMapping("/treino")
    public String BaseMethod2() {
        return "<div style='background-color: black; height: 100%; width: 100%; display: flex; align-items: center; justify-content: center;'>" +
                "<h1 style='color: whitesmoke;'>Run 5K in less than 30 mins!</h1></div>";
    }
}

package org.mafideju.appcat.controller;

import org.mafideju.appcat.service.type.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatController {

    @Value("${info.app.name}")
    private String appName;
    private final Cat Gloria;
    private final Cat Linux;


    @Autowired
    public CatController(
            @Qualifier("gloria") Cat Gloria,
            @Qualifier("linux") Cat Linux
    ) {
        this.Gloria = Gloria;
        this.Linux = Linux;
    }

    @GetMapping("/gloria")
    private String getMoodGloria() {
        return "<div style='background-color: black; height: 100%; width: 100%; display: flex; flex-direction: column; align-items: center; justify-content: center;'>" +
                "<div><h2 style='color: whitesmoke;'> " + appName + " </h2></div>" +
                "<div><h2 style='color: whitesmoke;'> " + Gloria.getDailyMood() + "</h2></div></div>";
    }

    @GetMapping("/linux")
    private String getMoodLinux() {
        return "<div style='background-color: black; height: 100%; width: 100%; display: flex; flex-direction: column; align-items: center; justify-content: center;'>" +
                "<div><h2 style='color: whitesmoke;'> " + appName + " </h2></div>" +
                "<div><h2 style='color: whitesmoke;'> " + Linux.getDailyMood() + "</h2></div></div>";
    }
}

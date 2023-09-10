package org.mafideju.appcat.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @Value("${info.app.name}")
    private String appName;
    @Value("${info.app.description}")
    private String appDesc;

//    @GetMapping("/")
    public String BaseMethod() {
        System.out.println(appName);
        return "<div style='background-color: black; height: 100%; width: 100%; display: flex; flex-direction: column; align-items: center; justify-content: center;'>" +
                "<div><h2 style='color: whitesmoke;'> " + appName + " </h2></div>" +
                "<div><h2 style='color: whitesmoke;'> " + appDesc + "</h2></div></div>";
    }

//    @GetMapping("/treino")
    public String BaseMethod2() {
        return "<div style='background-color: black; height: 100%; width: 100%; display: flex; align-items: center; justify-content: center;'>" +
                "<h1 style='color: whitesmoke;'>Run 5K in less than 30 mins!</h1></div>";
    }
}

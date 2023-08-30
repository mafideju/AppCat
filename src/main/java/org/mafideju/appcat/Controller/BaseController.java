package org.mafideju.appcat.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @GetMapping("/")
    public String BaseMethod() {
        return "<div style='background-color: black; height: 100vh; width: 100%; display: flex; align-items: center; justify-content: center;'>" +
                "<h1 style='color: whitesmoke;'>Who Shot Biggie?</h1></div>";
    }
}

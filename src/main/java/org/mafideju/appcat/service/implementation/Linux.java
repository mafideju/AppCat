package org.mafideju.appcat.service.implementation;

import org.mafideju.appcat.service.type.Cat;
import org.springframework.stereotype.Service;

@Service
public class Linux implements Cat {
    @Override
    public String getDailyMood() {
        return "Brrr Brrr";
    }
}
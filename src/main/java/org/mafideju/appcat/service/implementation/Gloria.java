package org.mafideju.appcat.service.implementation;

import org.mafideju.appcat.service.type.Cat;

public class Gloria implements Cat {

    @Override
    public String getDailyMood() {
        return "Meow";
    }
}

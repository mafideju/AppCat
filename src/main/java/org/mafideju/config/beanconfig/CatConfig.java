package org.mafideju.config.beanconfig;

import org.mafideju.appcat.service.implementation.Gloria;
import org.mafideju.appcat.service.type.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CatConfig {

    @Bean
    public Cat gloria() {
        return new Gloria();
    }
}

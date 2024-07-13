package com.learnspring.mohit.week1Intro.introToSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "frosting.flavour", havingValue = "chocolate")
public class ChocolateFrosting implements Frosting{


    @Override
    public String getFrostingType() {
        return "Chocolate Frosting";
    }
}

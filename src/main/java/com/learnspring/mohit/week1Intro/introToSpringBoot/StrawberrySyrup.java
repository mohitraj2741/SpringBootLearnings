package com.learnspring.mohit.week1Intro.introToSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "syrup.flavour", havingValue = "strawberry")
public class StrawberrySyrup implements Syrup{


    @Override
    public String getSyrupType() {
        return "StrawberrySyrup";
    }
}

package com.example.IntroToSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="syrup.type", havingValue = "choclate")
public class ChoclateSyrup implements Syrup {

    @Override
    public String getSyrupType() {
        return "choclateSyrup";
    }
}

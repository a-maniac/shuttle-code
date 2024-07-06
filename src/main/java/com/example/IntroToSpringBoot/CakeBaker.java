package com.example.IntroToSpringBoot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CakeBaker {

    Logger log= LoggerFactory.getLogger(CakeBaker.class);

    @Autowired
    Syrup syrup;
    @Autowired
    Frosting frosting;

    public String bakeCake(){
        String s="The cake is based with syrup : "+syrup.getSyrupType()+" and the frosting is : "+ frosting.getFrostingType();
        log.info("The cake is baked with syrup:{}, and frosting :{}",syrup.getSyrupType(),frosting.getFrostingType());
     return  s;
    }
}

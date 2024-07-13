package com.learnspring.mohit.week1Intro.introToSpringBoot;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service//shall we use service? as CakeBaker sounds like a service.
public class CakeBaker {

    //constructor injection (which is better? constructor injection ? or Autowired? and why??
    private Syrup syrup;
    private Frosting frosting;


    public CakeBaker( Frosting frosting,Syrup syrup) {
        this.syrup = syrup;
        this.frosting = frosting;
    }

    public void cakeBake(){
        System.out.println("cake is being baked , Frosting: "+frosting.getFrostingType()+" Syrup: "+ syrup.getSyrupType());
    }


}

package com.codingInsights.shibaram.firstWeekProject.firstWeekOfSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {
    final private Froasting f;
    final private Syrup s;
    @Autowired
    public CakeBaker(Froasting f,Syrup s){
        this.f = f;
        this.s = s;
    }

    String bakeCake(){
       return "The cake is baked and it is made up of "+f.getFroastingType()+" and "+s.getSyrupType();
    }
}

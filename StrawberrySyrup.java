package com.codingInsights.shibaram.firstWeekProject.firstWeekOfSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="syrup.env",havingValue = "strawberry")
public class StrawberrySyrup implements  Syrup{
    @Override
    public String getSyrupType() {
        return "Strawberry Syrup";
    }
}

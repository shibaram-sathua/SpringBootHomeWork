package com.codingInsights.shibaram.firstWeekProject.firstWeekOfSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="froasting.env",havingValue = "strawberry")
public class StrawberryFroasting implements Froasting{
    @Override
    public String getFroastingType() {
        return "Strawberry froasting";
    }
}

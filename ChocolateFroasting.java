package com.codingInsights.shibaram.firstWeekProject.firstWeekOfSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="froasting.env",havingValue = "chocolate")
public class ChocolateFroasting implements Froasting {
    @Override
    public String getFroastingType() {
        return "Chocolate froasting";
    }
}

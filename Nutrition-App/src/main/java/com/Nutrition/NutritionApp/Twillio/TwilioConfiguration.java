package com.Nutrition.NutritionApp.Twillio;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
@Setter
@ConfigurationProperties("twilio")
public class TwilioConfiguration {
    private String accountSid;
    private String authToken;
    private String trialNumber;
}

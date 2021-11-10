package com.Nutrition.NutritionApp.Twillio;
import com.Nutrition.NutritionApp.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
@org.springframework.stereotype.Service
public class SmsService {

    private final SmsSender smsSender;

    @Autowired
    public SmsService(@Qualifier("twilio") TwilioSmsSender signUp) {
        this.smsSender = signUp;
    }

    public String sendSms(User user) {
        smsSender.sendSms(user);
        return "done";
    }
}
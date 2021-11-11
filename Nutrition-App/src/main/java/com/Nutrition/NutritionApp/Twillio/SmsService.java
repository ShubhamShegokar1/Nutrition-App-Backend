package com.Nutrition.NutritionApp.Twillio;
import com.Nutrition.NutritionApp.Entity.OTPCheck;
import com.Nutrition.NutritionApp.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
@org.springframework.stereotype.Service
public class SmsService {
    private final SmsSender smsSender;

    @Autowired
    public SmsService(@Qualifier("twilio") TwilioSmsSender user) {
        this.smsSender = user;
    }

    public void sendSms(SmsRequest smsRequest, OTPCheck otpCheck) {
        smsSender.sendSms(smsRequest,otpCheck);
    }
}
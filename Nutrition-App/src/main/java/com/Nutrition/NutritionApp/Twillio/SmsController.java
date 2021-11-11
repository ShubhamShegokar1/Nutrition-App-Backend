package com.Nutrition.NutritionApp.Twillio;
import com.Nutrition.NutritionApp.Entity.OTPCheck;
import com.Nutrition.NutritionApp.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
@RestController
public class SmsController {
    private final SmsService smsService;

    @Autowired
    public SmsController(SmsService smsService) {
        this.smsService = smsService;
    }

    @PostMapping
    public void sendSms(@Valid @RequestBody SmsRequest smsRequest, OTPCheck otpCheck) {
        smsService.sendSms(smsRequest,otpCheck);
    }
}
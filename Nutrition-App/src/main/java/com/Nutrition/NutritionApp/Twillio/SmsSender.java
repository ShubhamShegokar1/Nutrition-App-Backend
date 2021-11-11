package com.Nutrition.NutritionApp.Twillio;

import com.Nutrition.NutritionApp.Entity.OTPCheck;
import com.Nutrition.NutritionApp.Entity.User;

public interface SmsSender {
    String sendSms(SmsRequest smsRequest, OTPCheck otpCheck);
}
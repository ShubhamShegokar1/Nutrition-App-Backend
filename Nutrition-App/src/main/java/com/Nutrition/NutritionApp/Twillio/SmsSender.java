package com.Nutrition.NutritionApp.Twillio;

import com.Nutrition.NutritionApp.Entity.User;

public interface SmsSender {
    String sendSms(User smsRequest);
}
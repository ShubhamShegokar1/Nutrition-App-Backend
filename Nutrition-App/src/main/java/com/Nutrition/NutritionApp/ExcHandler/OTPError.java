package com.Nutrition.NutritionApp.ExcHandler;

public class OTPError extends RuntimeException{
    public OTPError(String msz){
        super(msz);
    }
}

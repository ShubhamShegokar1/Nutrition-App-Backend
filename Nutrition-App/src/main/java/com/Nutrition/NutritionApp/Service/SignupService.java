package com.Nutrition.NutritionApp.Service;

import com.Nutrition.NutritionApp.Entity.Signup;
import com.Nutrition.NutritionApp.Repository.SignupRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignupService {
    @Autowired
    SignupRespository signupRespository;
    public Signup addSignup(Signup signUp) {
     return signupRespository.save(signUp);
    }
}

package com.Nutrition.NutritionApp.Controller;

import com.Nutrition.NutritionApp.Entity.Signup;
import com.Nutrition.NutritionApp.Service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SigupController {

    @Autowired
    SignupService signupService;
    @PostMapping("/Signup")
    public Signup addSignup(@RequestBody Signup signUp){
     return signupService.addSignup(signUp);
    }
}

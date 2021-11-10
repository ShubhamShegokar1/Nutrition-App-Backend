package com.Nutrition.NutritionApp.Controller;
import com.Nutrition.NutritionApp.Entity.User;
import com.Nutrition.NutritionApp.Service.UserService;
import com.Nutrition.NutritionApp.Twillio.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    private final SmsService smsService;

    @Autowired
    public UserController(SmsService smsService) {
        this.smsService = smsService;
    }

    @PostMapping("/Signup")
    public String addSignup(@RequestBody User signUp){
     String str= userService.addSignup(signUp);
     if(str=="Done"){
         smsService.sendSms(signUp);
         return "Signup Successfull";
     }
     return "";
    }

    @PostMapping("login")
    public void sendSms( @RequestBody User signUp) {
        smsService.sendSms(signUp);
    }

}

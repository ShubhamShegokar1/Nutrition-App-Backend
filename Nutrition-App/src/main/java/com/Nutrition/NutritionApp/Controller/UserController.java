package com.Nutrition.NutritionApp.Controller;
import com.Nutrition.NutritionApp.Entity.OTPCheck;
import com.Nutrition.NutritionApp.Entity.User;
import com.Nutrition.NutritionApp.Service.UserService;
import com.Nutrition.NutritionApp.Twillio.SmsRequest;
import com.Nutrition.NutritionApp.Twillio.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@RestController
@CrossOrigin(origins="*")
public class UserController {
    @Autowired
    UserService userService;
    private final SmsService smsService;

    @Autowired
    public UserController(SmsService smsService) {
        this.smsService = smsService;
    }

    @PostMapping("/Register")
    public String addSignup(@RequestBody SmsRequest user, OTPCheck otpCheck)
    {
     String str= userService.addSignup(user);
     if(str=="Done") {
         smsService.sendSms(user,otpCheck);
     }
     return str;
    }

    @PostMapping("login")
    public String sendSms(@RequestBody SmsRequest user, OTPCheck otpCheck)
    {
        String str= userService.addSignup(user);
        if(str=="Done") {
            smsService.sendSms(user,otpCheck);
        }
        return str;
    }
    public WebMvcConfigurer configure() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/*").allowedOrigins("*");
            }
        };
    }
}

package com.Nutrition.NutritionApp.Controller;
import com.Nutrition.NutritionApp.Entity.OTPCheck;
import com.Nutrition.NutritionApp.Service.OTPService;
import com.Nutrition.NutritionApp.Service.UserService;
import com.Nutrition.NutritionApp.Twillio.SmsRequest;
import com.Nutrition.NutritionApp.Twillio.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@RestController
@CrossOrigin(origins="*")
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    OTPService otpService;
    private final SmsService smsService;

    @Autowired
    public UserController(SmsService smsService) {
        this.smsService = smsService;
    }

    @PostMapping("/Register")
    public String addSignup(@RequestBody SmsRequest smsRequest, OTPCheck otpCheck)
    {
     String str= userService.addSignup(smsRequest);
     if(str=="Done") {
         smsService.sendSms(smsRequest,otpCheck);
     }
     return str;
    }


    @PostMapping("/otpCheck")
    public ResponseEntity optCheck (@RequestBody  OTPCheck otpCheck)
    {
        String res=otpService.optCheck(otpCheck);
        return ResponseEntity.ok(res);
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

    @Bean
    public WebMvcConfigurer configure() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/*").allowedOrigins("*");
            }
        };
    }
}

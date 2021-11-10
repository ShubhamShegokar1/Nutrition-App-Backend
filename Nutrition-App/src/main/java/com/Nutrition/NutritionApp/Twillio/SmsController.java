package com.Nutrition.NutritionApp.Twillio;
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
    @RequestMapping("login")
    public void sendSms(@Valid @RequestBody User user) {
        smsService.sendSms(user);
    }
}
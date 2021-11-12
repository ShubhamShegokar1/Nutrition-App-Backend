package com.Nutrition.NutritionApp.Controller;

import com.Nutrition.NutritionApp.Entity.Form;
import com.Nutrition.NutritionApp.Service.FormService;
import com.Nutrition.NutritionApp.Service.OTPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;


@RestController
@CrossOrigin(origins="*")
public class FormController {

    @Autowired
    FormService formService;



    @GetMapping("/forms")
    public List<Form> getAllData() {
        return formService.getAllData();
    }

    @PostMapping("/forms")
    public Form storeAllData(@RequestBody Form form) {
        return formService.storeAllData(form);
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



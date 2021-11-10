package com.Nutrition.NutritionApp.Service;

import com.Nutrition.NutritionApp.Entity.Form;
import com.Nutrition.NutritionApp.Repository.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormService {

    @Autowired
    FormRepository formRepository;

    public List<Form> getAllData(){
        return formRepository.findAll();

    }
    public Form storeAllData(Form form){

        return formRepository.save(form);

    }

}

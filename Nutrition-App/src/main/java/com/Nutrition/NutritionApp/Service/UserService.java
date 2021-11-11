package com.Nutrition.NutritionApp.Service;
import com.Nutrition.NutritionApp.Entity.User;
import com.Nutrition.NutritionApp.Repository.UserRepository;
import com.Nutrition.NutritionApp.Twillio.SmsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public String addSignup(SmsRequest user)
    {
        List<User> list= userRepository.findAll();
        for(User s:list) {
            if(s.getPhoneNumber() ==  user.getPhoneNumber() ) {
                return "Mobile already exit";
            }
        }
     return "Done";
    }

//    public String login(Signup signUp) {
//        Long mobile=signUp.getMobile();
//        String mob=String.valueOf(mobile);
//        if(mob.length()!=10){
//            return "Please enter valid number";
//        }
//        List<Signup> list=signupRespository.findAll();
//        for(Signup s:list) {
//            if ( s.getMobile() == mobile ) {
//                return "Done";
//            }
//        }
//        return "Please register";
//    }
}

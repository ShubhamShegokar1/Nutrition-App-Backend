package com.Nutrition.NutritionApp.Service;

import com.Nutrition.NutritionApp.Entity.OTPCheck;
import com.Nutrition.NutritionApp.Entity.User;
import com.Nutrition.NutritionApp.ExcHandler.OTPError;
import com.Nutrition.NutritionApp.Repository.OTPRespository;
import com.Nutrition.NutritionApp.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OTPService {

    @Autowired
    OTPRespository otpRespository;
    @Autowired
    UserRepository userRepository;

    public String optCheck(OTPCheck otpCheck) {
        List<OTPCheck> list= otpRespository.findAll();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getOtp().equals(otpCheck.getOtp())){
                //userRepository.save(user);
                return "Done";
            }
        }
        throw new OTPError(" Wrong OTP");
    }
    public String loginOtpCheck(OTPCheck otpCheck) {
        List<OTPCheck> list= otpRespository.findAll();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getOtp().equals(otpCheck.getOtp())){
                return "Done";
            }
        }
        throw new OTPError(" Wrong OTP");
    }
}

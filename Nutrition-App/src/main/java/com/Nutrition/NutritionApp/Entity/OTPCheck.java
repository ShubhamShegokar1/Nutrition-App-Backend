package com.Nutrition.NutritionApp.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestBody;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OTPCheck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String mobile;
    private  String otp;
    private Date timeStame;
    public  void method()
    {
        for (int i = 0; i < 4; i++) {
            int randomNum = 0 + (int) (Math.random() * 10);
            otp += randomNum;
        }
    }


    public String setOtp() {
        this.otp=otp;
        return otp;
    }
}

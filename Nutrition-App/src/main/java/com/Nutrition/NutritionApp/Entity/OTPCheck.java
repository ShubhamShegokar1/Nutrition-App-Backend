package com.Nutrition.NutritionApp.Entity;

import lombok.*;
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
@ToString
public class OTPCheck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String mobile;
    private  String otp;
    private Date timeStamp;
    public  void method()
    {
        for (int i = 0; i < 4; i++) {
            int randomNum = 0 + (int) (Math.random() * 10);
            otp += randomNum;
        }
    }

    public String getOtp() {
        this.otp=otp;
        return otp;
    }


    public String setOtp() {
        this.otp=otp;
        return otp;
    }
}

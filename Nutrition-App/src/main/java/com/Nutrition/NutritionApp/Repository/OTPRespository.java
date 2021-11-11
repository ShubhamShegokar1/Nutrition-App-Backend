package com.Nutrition.NutritionApp.Repository;

import com.Nutrition.NutritionApp.Entity.OTPCheck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OTPRespository extends JpaRepository<OTPCheck,Long> {
}

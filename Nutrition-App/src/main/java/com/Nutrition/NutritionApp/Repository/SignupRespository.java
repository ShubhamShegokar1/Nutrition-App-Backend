package com.Nutrition.NutritionApp.Repository;

import com.Nutrition.NutritionApp.Entity.Signup;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SignupRespository extends JpaRepository<Signup,Long> {
}

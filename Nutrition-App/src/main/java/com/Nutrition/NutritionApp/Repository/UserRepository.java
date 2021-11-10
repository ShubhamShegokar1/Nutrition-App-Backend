package com.Nutrition.NutritionApp.Repository;

import com.Nutrition.NutritionApp.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {
}

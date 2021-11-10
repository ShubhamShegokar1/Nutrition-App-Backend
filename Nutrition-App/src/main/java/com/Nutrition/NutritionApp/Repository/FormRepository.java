package com.Nutrition.NutritionApp.Repository;

import com.Nutrition.NutritionApp.Entity.Form;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormRepository extends JpaRepository<Form,Long> {
}

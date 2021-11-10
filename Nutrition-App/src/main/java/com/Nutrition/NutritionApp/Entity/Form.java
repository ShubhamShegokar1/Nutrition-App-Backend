package com.Nutrition.NutritionApp.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Form {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String Name;
    private String Gender;
    private String Dob;
    private String weight;
    private String height;
    private String food;

    @Override
    public String toString() {
        return "Form{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Dob='" + Dob + '\'' +
                ", weight='" + weight + '\'' +
                ", height='" + height + '\'' +
                ", food='" + food + '\'' +
                '}';
    }
}

package com.Nutrition.NutritionApp.DTOs;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ExceptionResponse {
    Date timeStamp;
    String message;
    String Details;
}

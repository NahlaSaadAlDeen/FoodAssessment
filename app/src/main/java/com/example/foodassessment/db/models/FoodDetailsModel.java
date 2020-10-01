package com.example.foodassessment.db.models;

public class FoodDetailsModel {
    public int id;
    public int calories;
    public int carbohydrates;
    public int proteins;
    public int fat;
    public int food_id;    // secondary key for join with food table
}
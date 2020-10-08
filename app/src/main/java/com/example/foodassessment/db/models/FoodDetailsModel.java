package com.example.foodassessment.db.models;

public class FoodDetailsModel {
    public int id;
    public String name;
    public int calories;
    public int carbohydrates;
    public int proteins;
    public int fat;
    public byte[] image;
    public int weight;
    public int cup;
    public int spoon;
    public int dish;
    public int food_id;    // secondary key for join with food table
}
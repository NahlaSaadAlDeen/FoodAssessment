package com.example.foodassessment.db.models;

import java.util.Arrays;

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

    //constructor

    public FoodDetailsModel(int id, String name, int calories, int carbohydrates, int proteins, int fat, byte[] image, int weight, int cup, int spoon, int dish, int food_id) {
        this.id = id;
        this.name = name;
        this.calories = calories;
        this.carbohydrates = carbohydrates;
        this.proteins = proteins;
        this.fat = fat;
        this.image = image;
        this.weight = weight;
        this.cup = cup;
        this.spoon = spoon;
        this.dish = dish;
        this.food_id = food_id;
    }

    //toString

    @Override
    public String toString() {
        return "FoodDetailsModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", calories=" + calories +
                ", carbohydrates=" + carbohydrates +
                ", proteins=" + proteins +
                ", fat=" + fat +
                ", image=" + Arrays.toString(image) +
                ", weight=" + weight +
                ", cup=" + cup +
                ", spoon=" + spoon +
                ", dish=" + dish +
                ", food_id=" + food_id +
                '}';
    }

    //getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(int carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public int getProteins() {
        return proteins;
    }

    public void setProteins(int proteins) {
        this.proteins = proteins;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCup() {
        return cup;
    }

    public void setCup(int cup) {
        this.cup = cup;
    }

    public int getSpoon() {
        return spoon;
    }

    public void setSpoon(int spoon) {
        this.spoon = spoon;
    }

    public int getDish() {
        return dish;
    }

    public void setDish(int dish) {
        this.dish = dish;
    }

    public int getFood_id() {
        return food_id;
    }

    public void setFood_id(int food_id) {
        this.food_id = food_id;
    }
}
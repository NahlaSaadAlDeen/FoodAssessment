package com.example.foodassessment.db.models;

public class FoodDetailsModel {
    public int id;
    public String name;
    public String metric;
    public double calories;
    public double carbohydrates;
    public double proteins;
    public double fat;
    public int cup;
    public int spoon;
    public int dish;
    public long food_id;    // secondary key for join with food table
    public String food_type;


    //constructors

    public FoodDetailsModel(int id, String name, String metric, double calories, double carbohydrates, double proteins, double fat,
                            int cup, int spoon, int dish, long food_id, String food_type) {
        this.id = id;
        this.name = name;
        this.metric = metric;
        this.calories = calories;
        this.carbohydrates = carbohydrates;
        this.proteins = proteins;
        this.fat = fat;
        this.cup = cup;
        this.spoon = spoon;
        this.dish = dish;
        this.food_id = food_id;
        this.food_type = food_type;
    }

    public FoodDetailsModel(String name, String metric, double calories, double carbohydrates, double proteins, double fat,
                            int cup, int spoon, int dish, long food_id, String food_type) {
        this.name = name;
        this.metric = metric;
        this.calories = calories;
        this.carbohydrates = carbohydrates;
        this.proteins = proteins;
        this.fat = fat;
        this.cup = cup;
        this.spoon = spoon;
        this.dish = dish;
        this.food_id = food_id;
        this.food_type = food_type;
    }

    public FoodDetailsModel() {
    }

    //toString

    @Override
    public String toString() {
        return "FoodDetailsModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", metric=" + metric +
                ", calories=" + calories +
                ", carbohydrates=" + carbohydrates +
                ", proteins=" + proteins +
                ", fat=" + fat +
                ", cup=" + cup +
                ", spoon=" + spoon +
                ", dish=" + dish +
                ", food_id=" + food_id +
                ", food_type=" + food_type +
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

    public String getMetric() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }

    public String getFood_type() {
        return food_type;
    }

    public void setFood_type(String food_type) {
        this.food_type = food_type;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public double getProteins() {
        return proteins;
    }

    public void setProteins(double proteins) {
        this.proteins = proteins;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

   /* public byte[] getImage() {
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
    }*/

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

    public long getFood_id() {
        return food_id;
    }

    public void setFood_id(long food_id) {
        this.food_id = food_id;
    }
}
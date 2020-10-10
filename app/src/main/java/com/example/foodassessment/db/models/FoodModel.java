package com.example.foodassessment.db.models;

import java.util.Arrays;

public class FoodModel {
    public int id;
    public String name;
    public String makingMethod;
    public byte[] image;
    public double weight;

    //constructor

    public FoodModel(int id, String name, String makingMethod, byte[] image, double weight) {
        this.id = id;
        this.name = name;
        this.makingMethod = makingMethod;
        this.image = image;
        this.weight = weight;
    }

    //toString

    @Override
    public String toString() {
        return "FoodModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", makingMethod='" + makingMethod + '\'' +
                ", image=" + Arrays.toString(image) +
                ", weight=" + weight +
                '}';
    }

    // getters and setters

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

    public String getMakingMethod() {
        return makingMethod;
    }

    public void setMakingMethod(String makingMethod) {
        this.makingMethod = makingMethod;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
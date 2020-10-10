package com.example.foodassessment.db.models;

import java.util.Arrays;

public class CategoryModel {
    public int id;
    public String name;
    public byte[] image;

    //constructor

    public CategoryModel(int id, String name, byte[] image) {
        this.id = id;
        this.name = name;
        this.image = image;
    }

    //toString

    @Override
    public String toString() {
        return "CategoryModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", image=" + Arrays.toString(image) +
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

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
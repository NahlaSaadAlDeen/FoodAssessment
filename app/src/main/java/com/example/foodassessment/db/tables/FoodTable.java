package com.example.foodassessment.db.tables;

public class FoodTable {
    public static final String TABLE_NAME = "foodTable";
    public static final String FOOD_ID = "_id";     // Column I (Primary Key)
    public static final String FOOD_NAME = "food_name";
    public static final String FOOD_IMAGE = "food_image"; // byte[]
    public static final String FOOD_WEIGHT = "food_weight";
    public static final String FOOD_MAKING_METHOD = "food_making_method";

    public static final String CREATE_STATEMENT = "CREATE TABLE " + TABLE_NAME +
            " (" + FOOD_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + FOOD_NAME +
            " VARCHAR(255) ," + FOOD_WEIGHT + " DOUBLE, " + FOOD_MAKING_METHOD + " TEXT , " +
            FOOD_IMAGE + " BLOB );";
    public static final String DROP_STATEMENT = "DROP TABLE IF EXISTS " + TABLE_NAME;
}
package com.example.foodassessment.db.tables;


public class FoodDetailsTable {
    public static final String TABLE_NAME = "foodDetailsTable";
    public static final String FOOD_DETAILS_ID = "_id";     // Column I (Primary Key)
    public static final String FOOD_DETAILS_NAME = "name";
    public static final String FOOD_DETAILS_CALORIES = "calories";
    public static final String FOOD_DETAILS_CARBOHYDRATES = "carbohydrates";
    public static final String FOOD_DETAILS_PROTEINS = "proteins";
    public static final String FOOD_DETAILS_FAT = "fat";
    public static final String FOOD_DETAILS_WEIGHT = "weight";
    public static final String FOOD_DETAILS_CUP = "cup";
    public static final String FOOD_DETAILS_DISH = "dish";
    public static final String FOOD_DETAILS_SPOON = "spoon";

    public static final String FOOD_DETAILS_FOOD_ID = "food_id";  // secondary key

    public static final String CREATE_STATEMENT = "CREATE TABLE " + TABLE_NAME +
            " (" + FOOD_DETAILS_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + FOOD_DETAILS_NAME +
            " VARCHAR(255) ," + FOOD_DETAILS_CALORIES +
            " INTEGER ," + FOOD_DETAILS_CARBOHYDRATES + " INTEGER, " + FOOD_DETAILS_PROTEINS +
            " INTEGER , " + FOOD_DETAILS_FAT + " INTEGER , "
            + FOOD_DETAILS_WEIGHT + " INTEGER, " + FOOD_DETAILS_CUP +
            " INTEGER , " + FOOD_DETAILS_DISH +
            " INTEGER , " + FOOD_DETAILS_SPOON + " INTEGER , "
            + FOOD_DETAILS_FOOD_ID + " INTEGER );";
    public static final String DROP_STATEMENT = "DROP TABLE IF EXISTS " + TABLE_NAME;
}
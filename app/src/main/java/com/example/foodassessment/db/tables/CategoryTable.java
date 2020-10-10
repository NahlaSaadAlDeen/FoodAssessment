package com.example.foodassessment.db.tables;

public class CategoryTable {
    public static final String TABLE_NAME = "categoryTable";
    public static final String CATEGORY_ID = "_id";     // Column I (Primary Key)
    public static final String CATEGORY_NAME = "category_name";
    public static final String CATEGORY_IMAGE = "category_image"; // byte[]

    public static final String CREATE_STATEMENT = "CREATE TABLE " + TABLE_NAME +
            " (" + CATEGORY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + CATEGORY_NAME + CATEGORY_IMAGE + " BLOB );";
    public static final String DROP_STATEMENT = "DROP TABLE IF EXISTS " + TABLE_NAME;
}
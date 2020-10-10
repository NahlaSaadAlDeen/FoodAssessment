package com.example.foodassessment.db.tables;

public class UserTable {
    public static final String TABLE_NAME = "userTable";
    public static final String USER_ID = "_id";     // Column I (Primary Key)
    public static final String USER_GENDER = "user_gender";
    public static final String USER_AGE = "user_age";
    public static final String USER_HEIGHT = "user_height";
    public static final String USER_WEIGHT = "user_weight";
    public static final String CREATE_STATEMENT = "CREATE TABLE " + TABLE_NAME +
            " (" + USER_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + USER_GENDER + " VARCHAR(25), " + USER_AGE + " INTEGER , " +
            USER_HEIGHT + " DOUBLE , " + USER_WEIGHT + " DOUBLE );";
    public static final String DROP_STATEMENT = "DROP TABLE IF EXISTS " + TABLE_NAME;
}
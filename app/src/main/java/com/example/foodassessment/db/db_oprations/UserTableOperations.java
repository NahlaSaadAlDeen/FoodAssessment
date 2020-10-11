package com.example.foodassessment.db.db_oprations;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.foodassessment.db.DBHelper;
import com.example.foodassessment.db.models.UserModel;
import com.example.foodassessment.db.tables.UserTable;

import java.util.ArrayList;
import java.util.List;

public class UserTableOperations {
    DBHelper helper;

    public UserTableOperations(Context context) {
        helper = new DBHelper(context);
    }

    public boolean insertUserData(UserModel userData) {
        // this func will return a boolean value true if insert done or false if not
        SQLiteDatabase dbb = helper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(UserTable.USER_GENDER, userData.gender);
        contentValues.put(UserTable.USER_AGE, userData.age);
        contentValues.put(UserTable.USER_HEIGHT, userData.height);
        contentValues.put(UserTable.USER_WEIGHT, userData.weight);
        long insert =  dbb.insert(UserTable.TABLE_NAME, null, contentValues);
        //here will return to know if it's done or not to use it as a dialog
        if(insert == -1){
            return false;
        }
        else {
            return true;
        }
    }

    public List<UserModel> getUserData() {
        SQLiteDatabase db = helper.getReadableDatabase();
        /*String[] columns = {UserTable.USER_ID, UserTable.USER_GENDER,
                UserTable.USER_AGE, UserTable.USER_HEIGHT, UserTable.USER_WEIGHT};*/
        List<UserModel> resultList = new ArrayList<>();
        String queryString = "SELECT * FROM " + UserTable.TABLE_NAME;

        Cursor cursor = db.rawQuery(queryString,null);

        if (cursor.moveToFirst()) {
            do {
                int userID = cursor.getInt(0);
                int userGender = cursor.getInt(1);
                int userAge = cursor.getInt(2);
                double userHeight = cursor.getInt(3);
                double userWeight = cursor.getInt(4);
                UserModel newUser = new UserModel(userID, userGender, userAge, userHeight, userWeight);
                resultList.add(newUser);
            }
            while (cursor.moveToNext());
        }
        else {
            //something went wrong
        }
        cursor.close();
        db.close();
        return resultList;
    }
/*
    public int deleteUserData(int id) {
        SQLiteDatabase db = helper.getWritableDatabase();
        String[] whereArgs = {id + ""};

        return db.delete(UserTable.TABLE_NAME, UserTable.USER_ID + " = ?", whereArgs);
    }*/

    /*public int updateUserData(UserModel userData) {
        SQLiteDatabase db = helper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(UserTable.USER_GENDER, userData.gender);
        contentValues.put(UserTable.USER_AGE, userData.age);
        contentValues.put(UserTable.USER_HEIGHT, userData.height);
        contentValues.put(UserTable.USER_WEIGHT, userData.weight);
        String[] whereArgs = {userData.id + ""};
        return db.update(UserTable.TABLE_NAME, contentValues, UserTable.USER_ID + " = ?", whereArgs);
    }*/

}
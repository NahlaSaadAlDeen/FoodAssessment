package com.example.foodassessment.db.db_oprations;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.foodassessment.db.DBHelper;
import com.example.foodassessment.db.models.UserModel;
import com.example.foodassessment.db.tables.UserTable;

public class UserTableOperations {
    DBHelper helper;

    public UserTableOperations(Context context) {
        helper = new DBHelper(context);
    }

    public long insertUserData(UserModel userData) {
        SQLiteDatabase dbb = helper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(UserTable.USER_NAME, userData.name);
        contentValues.put(UserTable.USER_GENDER, userData.gender);
        contentValues.put(UserTable.USER_AGE, userData.age);
        contentValues.put(UserTable.USER_HEIGHT, userData.height);
        contentValues.put(UserTable.USER_WEIGHT, userData.weight);
        return dbb.insert(UserTable.TABLE_NAME, null, contentValues);
    }

    public UserModel getUserData() {
        SQLiteDatabase db = helper.getWritableDatabase();
        String[] columns = {UserTable.USER_ID, UserTable.USER_NAME, UserTable.USER_GENDER,
                UserTable.USER_AGE, UserTable.USER_HEIGHT, UserTable.USER_WEIGHT};
        Cursor cursor = db.query(UserTable.TABLE_NAME, columns, null, null, null, null, null);
        UserModel userModel = new UserModel();

        while (cursor.moveToNext()) {
            userModel.id = cursor.getInt(cursor.getColumnIndex(UserTable.USER_ID));
            userModel.name = cursor.getString(cursor.getColumnIndex(UserTable.USER_NAME));
            userModel.gender = cursor.getInt(cursor.getColumnIndex(UserTable.USER_GENDER));
            userModel.age = cursor.getInt(cursor.getColumnIndex(UserTable.USER_AGE));
            userModel.height = cursor.getInt(cursor.getColumnIndex(UserTable.USER_HEIGHT));
            userModel.weight = cursor.getDouble(cursor.getColumnIndex(UserTable.USER_WEIGHT));
        }
        return userModel;
    }

    public int deleteUserData(int id) {
        SQLiteDatabase db = helper.getWritableDatabase();
        String[] whereArgs = {id + ""};

        return db.delete(UserTable.TABLE_NAME, UserTable.USER_ID + " = ?", whereArgs);
    }

    public int updateUserData(UserModel userData) {
        SQLiteDatabase db = helper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(UserTable.USER_NAME, userData.name);
        contentValues.put(UserTable.USER_GENDER, userData.gender);
        contentValues.put(UserTable.USER_AGE, userData.age);
        contentValues.put(UserTable.USER_HEIGHT, userData.height);
        contentValues.put(UserTable.USER_WEIGHT, userData.weight);
        String[] whereArgs = {userData.id + ""};
        return db.update(UserTable.TABLE_NAME, contentValues, UserTable.USER_ID + " = ?", whereArgs);
    }

}
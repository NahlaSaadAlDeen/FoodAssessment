package com.example.foodassessment.db.db_oprations;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.foodassessment.db.DBHelper;
import com.example.foodassessment.db.models.FoodModel;
import com.example.foodassessment.db.tables.FoodTable;

public class FoodTableOperations {
    DBHelper helper;

    public FoodTableOperations(Context context) {
        helper = new DBHelper(context);
    }

    public long insertFoodData(FoodModel foodData) {
        SQLiteDatabase dbb = helper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(FoodTable.FOOD_NAME, foodData.name);
        contentValues.put(FoodTable.FOOD_WEIGHT, foodData.weight);
        contentValues.put(FoodTable.FOOD_MAKING_METHOD, foodData.makingMethod);
        contentValues.put(FoodTable.FOOD_IMAGE, foodData.image);
        return dbb.insert(FoodTable.TABLE_NAME, null, contentValues);
    }

/*
    public FoodModel getFoodData() {
        SQLiteDatabase db = helper.getWritableDatabase();
        String[] columns = {FoodTable.FOOD_ID, FoodTable.FOOD_NAME, FoodTable.FOOD_MAKING_METHOD,
                FoodTable.FOOD_IMAGE, FoodTable.FOOD_WEIGHT};
        Cursor cursor = db.query(FoodTable.TABLE_NAME, columns, null, null, null, null, null);
        FoodModel foodModel = new FoodModel();

        while (cursor.moveToNext()) {
            foodModel.id = cursor.getInt(cursor.getColumnIndex(FoodTable.FOOD_ID));
            foodModel.name = cursor.getString(cursor.getColumnIndex(FoodTable.FOOD_NAME));
            foodModel.weight = cursor.getInt(cursor.getColumnIndex(FoodTable.FOOD_WEIGHT));
            foodModel.makingMethod = cursor.getString(cursor.getColumnIndex(FoodTable.FOOD_MAKING_METHOD));
            foodModel.image = cursor.getBlob(cursor.getColumnIndex(FoodTable.FOOD_IMAGE));
        }
        return foodModel;
    }

    public int deleteFoodData(int id) {
        SQLiteDatabase db = helper.getWritableDatabase();
        String[] whereArgs = {id + ""};

        return db.delete(FoodTable.TABLE_NAME, FoodTable.FOOD_ID + " = ?", whereArgs);
    }
*/
    public int updateFoodData(FoodModel foodData) {
        SQLiteDatabase db = helper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(FoodTable.FOOD_NAME, foodData.name);
        contentValues.put(FoodTable.FOOD_WEIGHT, foodData.weight);
        contentValues.put(FoodTable.FOOD_MAKING_METHOD, foodData.makingMethod);
        contentValues.put(FoodTable.FOOD_IMAGE, foodData.image);
        String[] whereArgs = {foodData.id + ""};
        return db.update(FoodTable.TABLE_NAME, contentValues, FoodTable.FOOD_ID + " = ?", whereArgs);
    }

}
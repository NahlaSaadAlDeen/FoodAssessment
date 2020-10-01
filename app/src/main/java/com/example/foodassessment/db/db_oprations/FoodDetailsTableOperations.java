package com.example.foodassessment.db.db_oprations;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.foodassessment.db.DBHelper;
import com.example.foodassessment.db.models.FoodDetailsModel;
import com.example.foodassessment.db.tables.FoodDetailsTable;

public class FoodDetailsTableOperations {
    DBHelper helper;

    public FoodDetailsTableOperations(Context context) {
        helper = new DBHelper(context);
    }

    public long insertFoodData(FoodDetailsModel foodData) {
        SQLiteDatabase dbb = helper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(FoodDetailsTable.FOOD_DETAILS_CALORIES, foodData.calories);
        contentValues.put(FoodDetailsTable.FOOD_DETAILS_CARBOHYDRATES, foodData.carbohydrates);
        contentValues.put(FoodDetailsTable.FOOD_DETAILS_PROTEINS, foodData.proteins);
        contentValues.put(FoodDetailsTable.FOOD_DETAILS_FAT, foodData.fat);
        contentValues.put(FoodDetailsTable.FOOD_DETAILS_FOOD_ID, foodData.food_id);
        return dbb.insert(FoodDetailsTable.TABLE_NAME, null, contentValues);
    }


    public FoodDetailsModel getFoodData() {
        SQLiteDatabase db = helper.getWritableDatabase();
        String[] columns = {FoodDetailsTable.FOOD_DETAILS_ID, FoodDetailsTable.FOOD_DETAILS_CALORIES,
                FoodDetailsTable.FOOD_DETAILS_CARBOHYDRATES, FoodDetailsTable.FOOD_DETAILS_PROTEINS,
                FoodDetailsTable.FOOD_DETAILS_FAT, FoodDetailsTable.FOOD_DETAILS_FOOD_ID};
        Cursor cursor = db.query(FoodDetailsTable.TABLE_NAME, columns, null, null, null, null, null);
        FoodDetailsModel foodDetailsModel = new FoodDetailsModel();

        while (cursor.moveToNext()) {
            foodDetailsModel.id = cursor.getInt(cursor.getColumnIndex(FoodDetailsTable.FOOD_DETAILS_ID));
            foodDetailsModel.calories = cursor.getInt(cursor.getColumnIndex(FoodDetailsTable.FOOD_DETAILS_CALORIES));
            foodDetailsModel.carbohydrates = cursor.getInt(cursor.getColumnIndex(FoodDetailsTable.FOOD_DETAILS_CARBOHYDRATES));
            foodDetailsModel.fat = cursor.getInt(cursor.getColumnIndex(FoodDetailsTable.FOOD_DETAILS_FAT));
            foodDetailsModel.proteins = cursor.getInt(cursor.getColumnIndex(FoodDetailsTable.FOOD_DETAILS_PROTEINS));
            foodDetailsModel.food_id = cursor.getInt(cursor.getColumnIndex(FoodDetailsTable.FOOD_DETAILS_FOOD_ID));
        }
        return foodDetailsModel;
    }

    public int deleteFoodData(int id) {
        SQLiteDatabase db = helper.getWritableDatabase();
        String[] whereArgs = {id + ""};

        return db.delete(FoodDetailsTable.TABLE_NAME, FoodDetailsTable.FOOD_DETAILS_ID + " = ?", whereArgs);
    }

    public int updateFoodData(FoodDetailsModel foodData) {
        SQLiteDatabase db = helper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(FoodDetailsTable.FOOD_DETAILS_CALORIES, foodData.calories);
        contentValues.put(FoodDetailsTable.FOOD_DETAILS_CARBOHYDRATES, foodData.carbohydrates);
        contentValues.put(FoodDetailsTable.FOOD_DETAILS_PROTEINS, foodData.proteins);
        contentValues.put(FoodDetailsTable.FOOD_DETAILS_FAT, foodData.fat);
        contentValues.put(FoodDetailsTable.FOOD_DETAILS_FOOD_ID, foodData.food_id);
        String[] whereArgs = {foodData.id + ""};
        return db.update(FoodDetailsTable.TABLE_NAME, contentValues, FoodDetailsTable.FOOD_DETAILS_ID + " = ?", whereArgs);
    }

}
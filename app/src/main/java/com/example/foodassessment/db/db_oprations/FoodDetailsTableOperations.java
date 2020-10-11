package com.example.foodassessment.db.db_oprations;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.foodassessment.db.DBHelper;
import com.example.foodassessment.db.models.FoodDetailsModel;
import com.example.foodassessment.db.tables.FoodDetailsTable;

import java.util.ArrayList;
import java.util.List;

public class FoodDetailsTableOperations {
    DBHelper helper;

    public FoodDetailsTableOperations(Context context) {
        helper = new DBHelper(context);
    }

    public boolean insertFoodData(FoodDetailsModel foodData) {
        SQLiteDatabase dbb = helper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(FoodDetailsTable.FOOD_DETAILS_NAME, foodData.name);
        contentValues.put(FoodDetailsTable.FOOD_DETAILS_METRIC, foodData.metric);
        contentValues.put(FoodDetailsTable.FOOD_DETAILS_FOOD_TYPE, foodData.food_type);
        contentValues.put(FoodDetailsTable.FOOD_DETAILS_CALORIES, foodData.calories);
        contentValues.put(FoodDetailsTable.FOOD_DETAILS_CARBOHYDRATES, foodData.carbohydrates);
        contentValues.put(FoodDetailsTable.FOOD_DETAILS_PROTEINS, foodData.proteins);
        contentValues.put(FoodDetailsTable.FOOD_DETAILS_FAT, foodData.fat);
        contentValues.put(FoodDetailsTable.FOOD_DETAILS_FOOD_ID, foodData.food_id);
        contentValues.put(FoodDetailsTable.FOOD_DETAILS_FOOD_TYPE, foodData.food_type);

        long insert = dbb.insert(FoodDetailsTable.TABLE_NAME, null, contentValues);

        //here will return to know if it's done or not to use it as a dialog
        if (insert == -1) {
            return false;
        } else {
            return true;
        }
    }

    public List<FoodDetailsModel> getFoodData() {
        SQLiteDatabase db = helper.getWritableDatabase();
        String[] columns = {FoodDetailsTable.FOOD_DETAILS_ID, FoodDetailsTable.FOOD_DETAILS_NAME, FoodDetailsTable.FOOD_DETAILS_METRIC,
                FoodDetailsTable.FOOD_DETAILS_CALORIES,
                FoodDetailsTable.FOOD_DETAILS_CARBOHYDRATES, FoodDetailsTable.FOOD_DETAILS_PROTEINS,
                FoodDetailsTable.FOOD_DETAILS_FAT, FoodDetailsTable.FOOD_DETAILS_FOOD_ID, FoodDetailsTable.FOOD_DETAILS_FOOD_TYPE};
        Cursor cursor = db.query(FoodDetailsTable.TABLE_NAME, columns, null, null, null, null, null);
        FoodDetailsModel foodDetailsModel = new FoodDetailsModel();
        List<FoodDetailsModel> resultList = new ArrayList<>();
        while (cursor.moveToNext()) {
            foodDetailsModel.setId(cursor.getInt(cursor.getColumnIndex(FoodDetailsTable.FOOD_DETAILS_ID)));

            foodDetailsModel.setName(cursor.getString(cursor.getColumnIndex(FoodDetailsTable.FOOD_DETAILS_NAME)));
            foodDetailsModel.setMetric(cursor.getString(cursor.getColumnIndex(FoodDetailsTable.FOOD_DETAILS_METRIC)));
            foodDetailsModel.setCalories(cursor.getDouble(cursor.getColumnIndex(FoodDetailsTable.FOOD_DETAILS_CALORIES)));
            foodDetailsModel.setCarbohydrates(cursor.getDouble(cursor.getColumnIndex(FoodDetailsTable.FOOD_DETAILS_CARBOHYDRATES)));
            foodDetailsModel.setFat(cursor.getDouble(cursor.getColumnIndex(FoodDetailsTable.FOOD_DETAILS_FAT)));
            foodDetailsModel.setProteins(cursor.getDouble(cursor.getColumnIndex(FoodDetailsTable.FOOD_DETAILS_PROTEINS)));
            foodDetailsModel.food_id = cursor.getLong(cursor.getColumnIndex(FoodDetailsTable.FOOD_DETAILS_FOOD_ID));
            foodDetailsModel.food_type = cursor.getString(cursor.getColumnIndex(FoodDetailsTable.FOOD_DETAILS_FOOD_TYPE));

            resultList.add(foodDetailsModel);

        }
        cursor.close();
        db.close();
        return resultList;
    }

    /*
    public int deleteFoodData(int id) {
        SQLiteDatabase db = helper.getWritableDatabase();
        String[] whereArgs = {id + ""};

        return db.delete(FoodDetailsTable.TABLE_NAME, FoodDetailsTable.FOOD_DETAILS_ID + " = ?", whereArgs);
    }
*/
    public int updateFoodData(FoodDetailsModel foodData) {
        SQLiteDatabase db = helper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(FoodDetailsTable.FOOD_DETAILS_METRIC, foodData.metric);
        contentValues.put(FoodDetailsTable.FOOD_DETAILS_CALORIES, foodData.calories);
        contentValues.put(FoodDetailsTable.FOOD_DETAILS_CARBOHYDRATES, foodData.carbohydrates);
        contentValues.put(FoodDetailsTable.FOOD_DETAILS_PROTEINS, foodData.proteins);
        contentValues.put(FoodDetailsTable.FOOD_DETAILS_FAT, foodData.fat);
        contentValues.put(FoodDetailsTable.FOOD_DETAILS_FOOD_ID, foodData.food_id);
        contentValues.put(FoodDetailsTable.FOOD_DETAILS_FOOD_TYPE, foodData.food_type);

        String[] whereArgs = {foodData.id + ""};
        return db.update(FoodDetailsTable.TABLE_NAME, contentValues, FoodDetailsTable.FOOD_DETAILS_ID + " = ?", whereArgs);
    }

}
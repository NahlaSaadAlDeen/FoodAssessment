package com.example.foodassessment.db.db_oprations;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.foodassessment.db.DBHelper;
import com.example.foodassessment.db.models.CategoryModel;
import com.example.foodassessment.db.tables.CategoryTable;

public class CategoryTableOperations {
    DBHelper helper;

    public CategoryTableOperations(Context context) {
        helper = new DBHelper(context);
    }

    public long insertCategoryData(CategoryModel categoryData) {
        SQLiteDatabase dbb = helper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(CategoryTable.CATEGORY_NAME, categoryData.name);
        contentValues.put(CategoryTable.CATEGORY_IMAGE, categoryData.image);
        return dbb.insert(CategoryTable.TABLE_NAME, null, contentValues);
    }


    public CategoryModel getCategoryData() {
        SQLiteDatabase db = helper.getWritableDatabase();
        String[] columns = {CategoryTable.CATEGORY_ID, CategoryTable.CATEGORY_NAME, CategoryTable.CATEGORY_IMAGE};
        Cursor cursor = db.query(CategoryTable.TABLE_NAME, columns, null, null, null, null, null);
        CategoryModel categoryModel = new CategoryModel();

        while (cursor.moveToNext()) {
            categoryModel.id = cursor.getInt(cursor.getColumnIndex(CategoryTable.CATEGORY_ID));
            categoryModel.name = cursor.getString(cursor.getColumnIndex(CategoryTable.CATEGORY_NAME));
            categoryModel.image = cursor.getBlob(cursor.getColumnIndex(CategoryTable.CATEGORY_IMAGE));
        }
        return categoryModel;
    }

    public int deleteCategoryData(int id) {
        SQLiteDatabase db = helper.getWritableDatabase();
        String[] whereArgs = {id + ""};

        return db.delete(CategoryTable.TABLE_NAME, CategoryTable.CATEGORY_ID + " = ?", whereArgs);
    }

    public int updateCategoryData(CategoryModel categoryData) {
        SQLiteDatabase db = helper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(CategoryTable.CATEGORY_NAME, categoryData.name);
        contentValues.put(CategoryTable.CATEGORY_IMAGE, categoryData.image);
        String[] whereArgs = {categoryData.id + ""};
        return db.update(CategoryTable.TABLE_NAME, contentValues, CategoryTable.CATEGORY_ID + " = ?", whereArgs);
    }

}
package com.example.foodassessment.db.insert_data;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

import com.example.foodassessment.R;
import com.example.foodassessment.db.db_oprations.FoodDetailsTableOperations;
import com.example.foodassessment.db.db_oprations.FoodTableOperations;
import com.example.foodassessment.db.models.FoodDetailsModel;
import com.example.foodassessment.db.models.FoodModel;

import java.io.ByteArrayOutputStream;

public class DataInsertion {
    Context context;

    public DataInsertion(Context context) {
        this.context = context;
    }

    public boolean insertSaladsFoodDetails() {

        // do insert all salads data in database for first time
        try {
            FoodDetailsTableOperations foodDetailsTableOperations = new FoodDetailsTableOperations(context);
            FoodTableOperations foodTableOperations = new FoodTableOperations(context);

            boolean success = false, success2 = false, success3 = false, success4 = false, success5 = false, success6 = false, success7 = false, success8 = false, success9 = false, success10 = false,
                    success11 = false, success12 = false, success13 = false, success14 = false, success15 = false, success16 = false, success17 = false, success18 = false, success19 = false, success20 = false;

            // السلطات
            // salads
            String foodType = "السلطات";
            byte[] img = convertDrawableToByteArray(R.drawable.k1);
            FoodModel food1 = new FoodModel("بندورة وخيار", "", img, 80);
            long id = foodTableOperations.insertFoodData(food1);
            if (id > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("بندورة وخيار", "مغرفه", 20, 1.5, 0.5, 1.5, 0, 0, 0, id, foodType);
                success = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            byte[] img2 = convertDrawableToByteArray(R.drawable.k2);
            FoodModel food2 = new FoodModel("تبولة", "", img2, 70);
            long id2 = foodTableOperations.insertFoodData(food2);
            if (id2 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("تبولة", "مغرفه", 80, 12, 2, 3, 0, 0, 0, id2, foodType);
                success2 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img3 = convertDrawableToByteArray(R.drawable.k3);
            FoodModel food3 = new FoodModel("سلطة يونانية", "", img3, 50);
            long id3 = foodTableOperations.insertFoodData(food3);
            if (id3 > 0) {
                FoodDetailsModel foodModel3 = new FoodDetailsModel("سلطة يونانية", "مغرفه", 60, 1, 1.5, 6, 0, 0, 0, id3, foodType);
                success3 = foodDetailsTableOperations.insertFoodData(foodModel3);
            }
            byte[] img4 = convertDrawableToByteArray(R.drawable.k4);
            FoodModel food4 = new FoodModel("فتوش", "", img4, 80);
            long id4 = foodTableOperations.insertFoodData(food4);
            if (id4 > 0) {
                FoodDetailsModel foodModel4 = new FoodDetailsModel("فتوش", "مغرفه", 30, 3, 1, 2, 0, 0, 0, id4, foodType);
                success4 = foodDetailsTableOperations.insertFoodData(foodModel4);
            }
            byte[] img5 = convertDrawableToByteArray(R.drawable.k5);
            FoodModel food5 = new FoodModel("سلطة الجرجير", "", img5, 50);
            long id5 = foodTableOperations.insertFoodData(food5);
            if (id5 > 0) {
                FoodDetailsModel foodModel5 = new FoodDetailsModel("سلطة الجرجير", "مغرفه", 15, 1, 0.5, 1, 0, 0, 0, id5, foodType);
                success5 = foodDetailsTableOperations.insertFoodData(foodModel5);
            }
            byte[] img6 = convertDrawableToByteArray(R.drawable.k6);
            FoodModel food6 = new FoodModel("سلطة زعتر اخضر", "", img6, 70);
            long id6 = foodTableOperations.insertFoodData(food6);
            if (id6 > 0) {
                FoodDetailsModel foodModel6 = new FoodDetailsModel("سلطة زعتر اخضر", "مغرفه", 100, 1.5, 2, 9, 0, 0, 0, id6, foodType);
                success6 = foodDetailsTableOperations.insertFoodData(foodModel6);
            }
            byte[] img7 = convertDrawableToByteArray(R.drawable.k7);
            FoodModel food7 = new FoodModel("سلطة ورقيه", "", img7, 90);
            long id7 = foodTableOperations.insertFoodData(food7);
            if (id7 > 0) {
                FoodDetailsModel foodModel7 = new FoodDetailsModel("سلطة ورقيه", "مغرفه", 15, 1.5, 0.5, 1, 0, 0, 0, id7, foodType);
                success7 = foodDetailsTableOperations.insertFoodData(foodModel7);
            }
            byte[] img8 = convertDrawableToByteArray(R.drawable.k8);
            FoodModel food8 = new FoodModel("لبن وخيار", "", img8, 90);
            long id8 = foodTableOperations.insertFoodData(food8);
            if (id8 > 0) {
                FoodDetailsModel foodModel8 = new FoodDetailsModel("لبن وخيار", "مغرفه", 15, 2, 1, 1, 0, 0, 0, id8, foodType);
                success8 = foodDetailsTableOperations.insertFoodData(foodModel8);
            }
            byte[] img9 = convertDrawableToByteArray(R.drawable.k9);
            FoodModel food9 = new FoodModel("بندورة و نعنع", "", img9, 70);
            long id9 = foodTableOperations.insertFoodData(food9);
            if (id9 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("بندورة و نعنع", "مغرفه", 15, 1.5, 0.5, 1.5, 0, 0, 0, id9, foodType);
                success9 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            byte[] img10 = convertDrawableToByteArray(R.drawable.k10);
            FoodModel food10 = new FoodModel("ملفوف احمر", "", img10, 80);
            long id10 = foodTableOperations.insertFoodData(food10);
            if (id10 > 0) {
                FoodDetailsModel foodModel10 = new FoodDetailsModel("ملفوف احمر", "مغرفه", 35, 5, 0.5, 1.5, 0, 0, 0, id10, foodType);
                success10 = foodDetailsTableOperations.insertFoodData(foodModel10);
            }
            byte[] img11 = convertDrawableToByteArray(R.drawable.k11);
            FoodModel food11 = new FoodModel("ملفوف ابيض", "", img11, 80);
            long id11 = foodTableOperations.insertFoodData(food11);
            if (id11 > 0) {
                FoodDetailsModel foodModel11 = new FoodDetailsModel("ملفوف ابيض", "مغرفه", 35, 5, 0.5, 1.5, 0, 0, 0, id11, foodType);
                success11 = foodDetailsTableOperations.insertFoodData(foodModel11);
            }
            byte[] img12 = convertDrawableToByteArray(R.drawable.k12);
            FoodModel food12 = new FoodModel("سلطة بالطحينية", "", img12, 130);
            long id12 = foodTableOperations.insertFoodData(food12);
            if (id12 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("سلطة بالطحينية", "مغرفه", 30, 1.5, 0.5, 2.5, 0, 0, 0, id12, foodType);
                success12 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img13 = convertDrawableToByteArray(R.drawable.k13);
            FoodModel food13 = new FoodModel("السبانخ و الرمان", "", img13, 60);
            long id13 = foodTableOperations.insertFoodData(food13);
            if (id13 > 0) {
                FoodDetailsModel foodModel13 = new FoodDetailsModel("السبانخ و الرمان", "مغرفه", 50, 2, 3, 3, 0, 0, 0, id13, foodType);
                success13 = foodDetailsTableOperations.insertFoodData(foodModel13);
            }
            byte[] img14 = convertDrawableToByteArray(R.drawable.k14);
            FoodModel food14 = new FoodModel("فول اخضر", "", img14, 80);
            long id14 = foodTableOperations.insertFoodData(food14);
            if (id14 > 0) {
                FoodDetailsModel foodModel14 = new FoodDetailsModel("فول اخضر", "مغرفه", 15, 1.5, 0.5, 1.5, 0, 0, 0, id14, foodType);
                success14 = foodDetailsTableOperations.insertFoodData(foodModel14);
            }
            byte[] img15 = convertDrawableToByteArray(R.drawable.k15);
            FoodModel food15 = new FoodModel("سلطة تركية", "", img15, 90);
            long id15 = foodTableOperations.insertFoodData(food15);
            if (id15 > 0) {
                FoodDetailsModel foodModel15 = new FoodDetailsModel("سلطة تركية", "مغرفه", 60, 1, 0.0, 70, 0, 0, 0, id15, foodType);
                success15 = foodDetailsTableOperations.insertFoodData(foodModel15);
            }
            byte[] img16 = convertDrawableToByteArray(R.drawable.k16);
            FoodModel food16 = new FoodModel("ملفوف و جزر", "", img16, 60);
            long id16 = foodTableOperations.insertFoodData(food16);
            if (id16 > 0) {
                FoodDetailsModel foodModel16 = new FoodDetailsModel("ملفوف و جزر", "مغرفه", 15, 1.5, 0.5, 1.5, 0, 0, 0, id16, foodType);
                success16 = foodDetailsTableOperations.insertFoodData(foodModel16);
            }
            byte[] img17 = convertDrawableToByteArray(R.drawable.k17);
            FoodModel food17 = new FoodModel("سلطة تونه", "", img17, 100);
            long id17 = foodTableOperations.insertFoodData(food17);
            if (id17 > 0) {
                FoodDetailsModel foodModel17 = new FoodDetailsModel("سلطة تونه", "مغرفه", 30, 2, 2, 7.5, 0, 0, 0, id17, foodType);
                success17 = foodDetailsTableOperations.insertFoodData(foodModel17);
            }
            byte[] img18 = convertDrawableToByteArray(R.drawable.k18);
            FoodModel food18 = new FoodModel("سلطة شمندر", "", img18, 100);
            long id18 = foodTableOperations.insertFoodData(food18);
            if (id18 > 0) {
                FoodDetailsModel foodModel18 = new FoodDetailsModel("سلطة شمندر", "مغرفه", 50, 2.5, 0.5, 1.5, 0, 0, 0, id18, foodType);
                success18 = foodDetailsTableOperations.insertFoodData(foodModel18);
            }
            byte[] img19 = convertDrawableToByteArray(R.drawable.k19);
            FoodModel food19 = new FoodModel("سلطة ذرة و جزر و مخلل و فلفل حلو", "", img19, 100);
            long id19 = foodTableOperations.insertFoodData(food19);
            if (id19 > 0) {
                FoodDetailsModel foodModel19 = new FoodDetailsModel("سلطة ذرة و جزر و مخلل و فلفل حلو", "مغرفه", 20, 2.5, 0.5, 1, 0, 0, 0, id19, foodType);
                success19 = foodDetailsTableOperations.insertFoodData(foodModel19);
            }
            byte[] img20 = convertDrawableToByteArray(R.drawable.k20);
            FoodModel food20 = new FoodModel("سلطة ملفوف وجزر و مايونيو", "", img20, 120);
            long id20 = foodTableOperations.insertFoodData(food20);
            if (id20 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("سلطة ملفوف وجزر و مايونيز", "مغرفه", 170, 20, 1, 10, 0, 0, 0, id20, foodType);
                success20 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            if (success && success2 && success3 && success4 && success5 && success6 && success7 && success8 && success9 && success10 &&
                    success11 && success12 && success13 && success14 && success15 && success16 && success17 && success18 && success19 && success20) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public boolean insertFruitsFoodDetails() {

        // do insert all fruits data in database for first time
        try {
            FoodDetailsTableOperations foodDetailsTableOperations = new FoodDetailsTableOperations(context);
            FoodTableOperations foodTableOperations = new FoodTableOperations(context);

            boolean success = false, success2 = false, success3 = false, success4 = false, success6 = false, success7 = false, success8 = false, success9 = false, success10 = false, success11 = false, success12 = false, success13 = false, success14 = false, success15 = false, success16 = false, success17 = false, success18 = false, success19 = false, success20 = false,
                    success21 = false, success22 = false, success23 = false, success24 = false, success25 = false, success26 = false, success27 = false, success28 = false, success29 = false, success30 = false, success31 = false, success32 = false, success33 = false, success34 = false, success35 = false, success36 = false, success37 = false, success38 = false, success39 = false, success40 = false,
                    success41 = false, success42 = false, success43 = false, success44 = false, success45 = false, success46 = false, success47 = false, success48 = false, success49 = false, success50 = false, success51 = false, success52 = false, success53 = false, success54 = false, success55 = false, success56 = false, success57 = false, success58 = false, success59 = false, success60 = false,
                    success61 = false, success62 = false, success63 = false, success64 = false, success65 = false, success66 = false, success67 = false, success68 = false, success69 = false, success70 = false, success71 = false, success72 = false, success73 = false;

            // الفواكه
            // Fruits
            String foodType = "الفواكه";

            //تفاح
            byte[] img = convertDrawableToByteArray(R.drawable.d1);
            FoodModel food1 = new FoodModel("تفاح", "", img, 80);
            long id = foodTableOperations.insertFoodData(food1);
            if (id > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("تفاح", "صغير", 40, 10, 0, 0, 0, 0, 0, id, foodType);
                success = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food2 = new FoodModel("تفاح", "", 110);
            long id2 = foodTableOperations.insertFoodData(food2);
            if (id2 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("تفاح", "وسط", 55, 15, 0, 0, 0, 0, 0, id2, foodType);
                success2 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food3 = new FoodModel("تفاح", "", 150);
            long id3 = foodTableOperations.insertFoodData(food3);
            if (id3 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("تفاح", "وسط", 75, 20, 0, 0, 0, 0, 0, id3, foodType);
                success3 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food4 = new FoodModel("تفاح", "", 230);
            long id4 = foodTableOperations.insertFoodData(food4);
            if (id4 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("تفاح", "كبير", 120, 30, 0, 0, 0, 0, 0, id4, foodType);
                success4 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //موز
            byte[] img2 = convertDrawableToByteArray(R.drawable.d2);
            FoodModel food6 = new FoodModel("موز", "", img2, 60);
            long id6 = foodTableOperations.insertFoodData(food6);
            if (id6 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("موز", "صغير", 60, 15, 0, 0, 0, 0, 0, id6, foodType);
                success6 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food7 = new FoodModel("موز", "", 90);
            long id7 = foodTableOperations.insertFoodData(food7);
            if (id7 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("موز", "وسط", 90, 25, 0, 0, 0, 0, 0, id7, foodType);
                success7 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //عنب
            byte[] img8 = convertDrawableToByteArray(R.drawable.d3);
            FoodModel food8 = new FoodModel("عنب", "", img8, 90);
            long id8 = foodTableOperations.insertFoodData(food8);
            if (id8 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("عنب", "نصف كوب", 60, 15, 0, 0, 0, 0, 0, id8, foodType);
                success8 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //اجاص
            byte[] img9 = convertDrawableToByteArray(R.drawable.d4);
            FoodModel food9 = new FoodModel("اجاص", "", img9, 60);
            long id9 = foodTableOperations.insertFoodData(food9);
            if (id9 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("اجاص", "صغير", 30, 7.5, 0, 0, 0, 0, 0, id9, foodType);
                success9 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food10 = new FoodModel("اجاص", "", 90);
            long id10 = foodTableOperations.insertFoodData(food10);
            if (id10 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("اجاص", "صغير", 45, 10, 0, 0, 0, 0, 0, id10, foodType);
                success10 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food11 = new FoodModel("اجاص", "", 140);
            long id11 = foodTableOperations.insertFoodData(food11);
            if (id11 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("اجاص", "وسط", 70, 16, 0, 0, 0, 0, 0, id11, foodType);
                success11 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food12 = new FoodModel("اجاص", "", 200);
            long id12 = foodTableOperations.insertFoodData(food12);
            if (id12 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("اجاص", "كبير", 100, 25, 0, 0, 0, 0, 0, id12, foodType);
                success12 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //مانجا
            byte[] img13 = convertDrawableToByteArray(R.drawable.d5);
            FoodModel food13 = new FoodModel("مانجا", "", img13, 230);
            long id13 = foodTableOperations.insertFoodData(food13);
            if (id13 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("مانجا", "صغير", 80, 20, 0, 0, 0, 0, 0, id13, foodType);
                success13 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food14 = new FoodModel("مانجا", "", 550);
            long id14 = foodTableOperations.insertFoodData(food14);
            if (id14 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("مانجا", "كبير", 190, 50, 0, 0, 0, 0, 0, id14, foodType);
                success14 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //مكعبات مانجا
            byte[] img15 = convertDrawableToByteArray(R.drawable.d6);
            FoodModel food15 = new FoodModel("مكعبات مانجا", "", img15, 180);
            long id15 = foodTableOperations.insertFoodData(food15);
            if (id15 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("مكعبات مانجا", "كوب", 65, 15, 0, 0, 0, 0, 0, id15, foodType);
                success15 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            byte[] img16 = convertDrawableToByteArray(R.drawable.d7);
            FoodModel food16 = new FoodModel("مكعبات مانجا", "", img16, 360);
            long id16 = foodTableOperations.insertFoodData(food16);
            if (id16 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("مكعبات مانجا", "كوبان", 130, 30, 0, 0, 0, 0, 0, id16, foodType);
                success16 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //مكعبات برتقال
            byte[] img17 = convertDrawableToByteArray(R.drawable.d8);
            FoodModel food17 = new FoodModel("مكعبات برتقال", "", img17, 90);
            long id17 = foodTableOperations.insertFoodData(food17);
            if (id17 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("مكعبات برتقال", "نصف كوب", 30, 7, 0, 0, 0, 0, 0, id17, foodType);
                success17 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            byte[] img18 = convertDrawableToByteArray(R.drawable.d9);
            FoodModel food18 = new FoodModel("مكعبات برتقال", "", img18, 180);
            long id18 = foodTableOperations.insertFoodData(food18);
            if (id18 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("مكعبات برتقال", "كوب", 60, 15, 0, 0, 0, 0, 0, id18, foodType);
                success18 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //جريب فروت
            byte[] img19 = convertDrawableToByteArray(R.drawable.d10);
            FoodModel food19 = new FoodModel("جريب فروت", "", img19, 500);
            long id19 = foodTableOperations.insertFoodData(food19);
            if (id19 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("جريب فروت", "حبة كامله", 80, 20, 0, 0, 0, 0, 0, id19, foodType);
                success19 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //جريب فروت مقشر
            byte[] img20 = convertDrawableToByteArray(R.drawable.d11);
            FoodModel food20 = new FoodModel("جريب فروت مقشر", "", img20, 85);
            long id20 = foodTableOperations.insertFoodData(food20);
            if (id20 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("جريب فروت مقشر", "ربع حبة", 20, 5, 0, 0, 0, 0, 0, id20, foodType);
                success20 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food21 = new FoodModel("جريب فروت مقشر", "", 170);
            long id21 = foodTableOperations.insertFoodData(food21);
            if (id21 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("جريب فروت مقشر", "نصف حبه", 40, 10, 0, 0, 0, 0, 0, id20, foodType);
                success21 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //بطيخ
            byte[] img22 = convertDrawableToByteArray(R.drawable.d12);
            FoodModel food22 = new FoodModel("بطيخ", "", img22, 160);
            long id22 = foodTableOperations.insertFoodData(food22);
            if (id22 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("بطيخ", "كوب", 50, 12, 0, 0, 0, 0, 0, id20, foodType);
                success22 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            byte[] img23 = convertDrawableToByteArray(R.drawable.d13);
            FoodModel food23 = new FoodModel("بطيخ", "", img23, 320);
            long id23 = foodTableOperations.insertFoodData(food23);
            if (id23 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("بطيخ", "كوبان", 100, 24, 0, 0, 0, 0, 0, id20, foodType);
                success23 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //شمام
            byte[] img24 = convertDrawableToByteArray(R.drawable.d14);
            FoodModel food24 = new FoodModel("شمام", "", img24, 180);
            long id24 = foodTableOperations.insertFoodData(food24);
            if (id24 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("شمام", "كوب", 60, 15, 0, 0, 0, 0, 0, id20, foodType);
                success24 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            byte[] img25 = convertDrawableToByteArray(R.drawable.d15);
            FoodModel food25 = new FoodModel("شمام", "", img25, 360);
            long id25 = foodTableOperations.insertFoodData(food25);
            if (id25 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("شمام", "كوبان", 120, 30, 0, 0, 0, 0, 0, id20, foodType);
                success25 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //برقوق
            byte[] img26 = convertDrawableToByteArray(R.drawable.d16);
            FoodModel food26 = new FoodModel("برقوق", "", img26, 55);
            long id26 = foodTableOperations.insertFoodData(food26);
            if (id26 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("برقوق", "صغير", 20, 5.5, 0, 0, 0, 0, 0, id20, foodType);
                success26 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food27 = new FoodModel("برقوق", "", 80);
            long id27 = foodTableOperations.insertFoodData(food27);
            if (id27 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("برقوق", "وسط", 30, 8, 0, 0, 0, 0, 0, id20, foodType);
                success27 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food28 = new FoodModel("برقوق", "", 100);
            long id28 = foodTableOperations.insertFoodData(food28);
            if (id28 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("برقوق", "كبير", 40, 10, 0, 0, 0, 0, 0, id20, foodType);
                success28 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //نكترين
            byte[] img29 = convertDrawableToByteArray(R.drawable.d17);
            FoodModel food29 = new FoodModel("نكترين", "", img29, 90);
            long id29 = foodTableOperations.insertFoodData(food29);
            if (id29 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("نكترين", "صغير", 40, 8, 0, 0, 0, 0, 0, id20, foodType);
                success29 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food30 = new FoodModel("نكترين", "", 120);
            long id30 = foodTableOperations.insertFoodData(food30);
            if (id30 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("نكترين", "وسط", 50, 12, 0, 0, 0, 0, 0, id20, foodType);
                success30 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food31 = new FoodModel("نكترين", "", 160);
            long id31 = foodTableOperations.insertFoodData(food31);
            if (id31 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("نكترين", "وسط", 65, 16, 0, 0, 0, 0, 0, id20, foodType);
                success31 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food32 = new FoodModel("نكترين", "", 220);
            long id32 = foodTableOperations.insertFoodData(food32);
            if (id32 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("نكترين", "كبير", 90, 20, 0, 0, 0, 0, 0, id20, foodType);
                success32 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //كيوي
            byte[] img33 = convertDrawableToByteArray(R.drawable.d18);
            FoodModel food33 = new FoodModel("كيوي", "", img33, 60);
            long id33 = foodTableOperations.insertFoodData(food33);
            if (id33 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("كيوي", "صغير", 30, 8, 0, 0, 0, 0, 0, id20, foodType);
                success33 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food34 = new FoodModel("كيوي", "", 80);
            long id34 = foodTableOperations.insertFoodData(food34);
            if (id34 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("كيوي", "وسط", 45, 12, 0, 0, 0, 0, 0, id20, foodType);
                success34 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //أناناس
            byte[] img35 = convertDrawableToByteArray(R.drawable.d19);
            FoodModel food35 = new FoodModel("أناناس", "", img35, 80);
            long id35 = foodTableOperations.insertFoodData(food35);
            if (id35 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("أناناس", "نصف كوب", 60, 15, 0, 0, 0, 0, 0, id20, foodType);
                success35 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //تين
            byte[] img36 = convertDrawableToByteArray(R.drawable.d20);
            FoodModel food36 = new FoodModel("تين", "", img36, 30);
            long id36 = foodTableOperations.insertFoodData(food36);
            if (id36 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("تين", "صغير", 20, 5, 0, 0, 0, 0, 0, id20, foodType);
                success36 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food37 = new FoodModel("تين", "", 40);
            long id37 = foodTableOperations.insertFoodData(food37);
            if (id37 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("تين", "وسط", 30, 7, 0, 0, 0, 0, 0, id20, foodType);
                success37 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food38 = new FoodModel("تين", "", 60);
            long id38 = foodTableOperations.insertFoodData(food38);
            if (id38 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("تين", "كبير", 40, 10, 0, 0, 0, 0, 0, id20, foodType);
                success38 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //فراولة
            byte[] img39 = convertDrawableToByteArray(R.drawable.d21);
            FoodModel food39 = new FoodModel("فراولة", "", img39, 200);
            long id39 = foodTableOperations.insertFoodData(food39);
            if (id39 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("فراولة", "كوب وربع", 60, 15, 0, 0, 0, 0, 0, id20, foodType);
                success39 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //رمان
            byte[] img40 = convertDrawableToByteArray(R.drawable.d22);
            FoodModel food40 = new FoodModel("رمان", "", img40, 250);
            long id40 = foodTableOperations.insertFoodData(food40);
            if (id40 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("رمان", "كوب", 200, 35, 0, 0, 0, 0, 0, id20, foodType);
                success40 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //تمر (3 حبات)
            byte[] img41 = convertDrawableToByteArray(R.drawable.d23);
            FoodModel food41 = new FoodModel("تمر", "", img41, 30);
            long id41 = foodTableOperations.insertFoodData(food41);
            if (id41 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("تمر", "صغير", 60, 15, 0, 0, 0, 0, 0, id20, foodType);
                success41 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food42 = new FoodModel("تمر", "", 70);
            long id42 = foodTableOperations.insertFoodData(food42);
            if (id42 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("تمر", "كبير", 120, 30, 0, 0, 0, 0, 0, id20, foodType);
                success42 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //تمر (5 حبات)
            byte[] img43 = convertDrawableToByteArray(R.drawable.d24);
            FoodModel food43 = new FoodModel("تمر", "", img43, 50);
            long id43 = foodTableOperations.insertFoodData(food43);
            if (id43 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("تمر", "صغير", 100, 25, 0, 0, 0, 0, 0, id20, foodType);
                success43 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food44 = new FoodModel("تمر", "", 100);
            long id44 = foodTableOperations.insertFoodData(food44);
            if (id44 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("تمر", "كبير", 200, 50, 0, 0, 0, 0, 0, id20, foodType);
                success44 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //تمر (7 حبات)
            byte[] img45 = convertDrawableToByteArray(R.drawable.d25);
            FoodModel food45 = new FoodModel("تمر", "", img45, 70);
            long id45 = foodTableOperations.insertFoodData(food45);
            if (id45 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("تمر", "صغير", 150, 35, 0, 0, 0, 0, 0, id20, foodType);
                success45 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food46 = new FoodModel("تمر", "", 170);
            long id46 = foodTableOperations.insertFoodData(food46);
            if (id46 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("تمر", "كبير", 300, 70, 0, 0, 0, 0, 0, id20, foodType);
                success46 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //بلح (3 حبات)
            byte[] img47 = convertDrawableToByteArray(R.drawable.d26);
            FoodModel food47 = new FoodModel("بلح", "", img47, 40);
            long id47 = foodTableOperations.insertFoodData(food47);
            if (id47 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("بلح", "3 حبات", 60, 15, 0, 0, 0, 0, 0, id20, foodType);
                success47 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //بلح (5 حبات)
            byte[] img48 = convertDrawableToByteArray(R.drawable.d27);
            FoodModel food48 = new FoodModel("بلح", "", img48, 70);
            long id48 = foodTableOperations.insertFoodData(food48);
            if (id48 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("بلح", "5 حبات", 100, 25, 0, 0, 0, 0, 0, id20, foodType);
                success48 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //بلح (7 حبات)
            byte[] img49 = convertDrawableToByteArray(R.drawable.d28);
            FoodModel food49 = new FoodModel("بلح", "", img49, 100);
            long id49 = foodTableOperations.insertFoodData(food49);
            if (id49 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("بلح", "7 حبات", 150, 35, 0, 0, 0, 0, 0, id20, foodType);
                success49 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //كلمنتينا
            byte[] img50 = convertDrawableToByteArray(R.drawable.d29);
            FoodModel food50 = new FoodModel("كلمنتينا", "", img50, 50);
            long id50 = foodTableOperations.insertFoodData(food50);
            if (id50 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("كلمنتينا", "صغير", 15, 3.5, 0, 0, 0, 0, 0, id20, foodType);
                success50 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food51 = new FoodModel("كلمنتينا", "", 100);
            long id51 = foodTableOperations.insertFoodData(food51);
            if (id51 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("كلمنتينا", "وسط", 30, 8, 0, 0, 0, 0, 0, id20, foodType);
                success51 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food52 = new FoodModel("كلمنتينا", "", 140);
            long id52 = foodTableOperations.insertFoodData(food52);
            if (id52 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("كلمنتينا", "كبير", 45, 12, 0, 0, 0, 0, 0, id20, foodType);
                success52 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //قشطة
            byte[] img53 = convertDrawableToByteArray(R.drawable.d30);
            FoodModel food53 = new FoodModel("قشطة", "", img53, 200);
            long id53 = foodTableOperations.insertFoodData(food53);
            if (id53 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("قشطة", "صغير", 0, 0, 0, 0, 0, 0, 0, id20, foodType);
                success53 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food54 = new FoodModel("قشطة", "", 270);
            long id54 = foodTableOperations.insertFoodData(food54);
            if (id54 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("قشطة", "كبير", 0, 0, 0, 0, 0, 0, 0, id20, foodType);
                success54 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //زبيب
            byte[] img55 = convertDrawableToByteArray(R.drawable.d31);
            FoodModel food55 = new FoodModel("زبيب", "", img55, 20);
            long id55 = foodTableOperations.insertFoodData(food55);
            if (id55 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("زبيب", "1 ملعقه", 30, 7.5, 0, 0, 0, 0, 0, id20, foodType);
                success55 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            byte[] img56 = convertDrawableToByteArray(R.drawable.d32);
            FoodModel food56 = new FoodModel("زبيب", "", img56, 35);
            long id56 = foodTableOperations.insertFoodData(food56);
            if (id56 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("زبيب", "2 ملاعق", 60, 15, 0, 0, 0, 0, 0, id20, foodType);
                success56 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            byte[] img57 = convertDrawableToByteArray(R.drawable.d33);
            FoodModel food57 = new FoodModel("زبيب", "", img57, 55);
            long id57 = foodTableOperations.insertFoodData(food57);
            if (id57 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("زبيب", "3 ملاعق", 90, 25, 0, 0, 0, 0, 0, id20, foodType);
                success57 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //تين مجفف
            byte[] img58 = convertDrawableToByteArray(R.drawable.d34);
            FoodModel food58 = new FoodModel("تين مجفف", "", img58, 50);
            long id58 = foodTableOperations.insertFoodData(food58);
            if (id58 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("تين مجفف", "حبتان وسط", 90, 20, 0, 0, 0, 0, 0, id20, foodType);
                success58 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            byte[] img59 = convertDrawableToByteArray(R.drawable.d35);
            FoodModel food59 = new FoodModel("تين مجفف", "", img59, 120);
            long id59 = foodTableOperations.insertFoodData(food59);
            if (id59 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("تين مجفف", "5 حبات وسط", 200, 50, 0, 0, 0, 0, 0, id20, foodType);
                success59 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //فواكه  مجفف
            byte[] img60 = convertDrawableToByteArray(R.drawable.d36);
            FoodModel food60 = new FoodModel("فواكه مجفف", "", img60, 30);
            long id60 = foodTableOperations.insertFoodData(food60);
            if (id60 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("فواكه مجفف", "ربع كوب", 50, 12, 0, 0, 0, 0, 0, id20, foodType);
                success60 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            byte[] img61 = convertDrawableToByteArray(R.drawable.d37);
            FoodModel food61 = new FoodModel("فواكه مجفف", "", img61, 60);
            long id61 = foodTableOperations.insertFoodData(food61);
            if (id61 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("فواكه مجفف", "نصف كوب", 100, 25, 0, 0, 0, 0, 0, id20, foodType);
                success61 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            // صبر أو التين الشوكي
            byte[] img62 = convertDrawableToByteArray(R.drawable.d38);
            FoodModel food62 = new FoodModel("صبر أو التين الشوكي", "", img62, 35);
            long id62 = foodTableOperations.insertFoodData(food62);
            if (id62 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("صبر أو التين الشوكي", "صغير", 100, 25, 0, 0, 0, 0, 0, id20, foodType);
                success62 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //فرسمون (كاكا)
            byte[] img63 = convertDrawableToByteArray(R.drawable.d39);
            FoodModel food63 = new FoodModel("فرسمون (كاكا)", "", img63, 90);
            long id63 = foodTableOperations.insertFoodData(food63);
            if (id63 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("فرسمون (كاكا)", "صغير", 80, 16, 0, 0, 0, 0, 0, id20, foodType);
                success63 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food64 = new FoodModel("فرسمون (كاكا)", "", 130);
            long id64 = foodTableOperations.insertFoodData(food64);
            if (id64 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("فرسمون (كاكا)", "وسط", 110, 25, 0, 0, 0, 0, 0, id20, foodType);
                success64 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food65 = new FoodModel("فرسمون (كاكا)", "", 170);
            long id65 = foodTableOperations.insertFoodData(food65);
            if (id65 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("فرسمون (كاكا)", "كبير", 150, 30, 0, 0, 0, 0, 0, id20, foodType);
                success65 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //جوافه
            byte[] img66 = convertDrawableToByteArray(R.drawable.d40);
            FoodModel food66 = new FoodModel("جوافه", "", img66, 70);
            long id66 = foodTableOperations.insertFoodData(food66);
            if (id66 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("جوافه", "صغير", 60, 8, 0, 0, 0, 0, 0, id20, foodType);
                success66 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food67 = new FoodModel("جوافه", "", 100);
            long id67 = foodTableOperations.insertFoodData(food67);
            if (id67 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("جوافه", "صغير", 80, 12, 0, 0, 0, 0, 0, id20, foodType);
                success67 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food68 = new FoodModel("جوافه", "", 150);
            long id68 = foodTableOperations.insertFoodData(food68);
            if (id68 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("جوافه", "وسط", 120, 18, 0, 0, 0, 0, 0, id20, foodType);
                success68 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food69 = new FoodModel("جوافه", "", 175);
            long id69 = foodTableOperations.insertFoodData(food69);
            if (id69 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("جوافه", "كبير", 140, 22, 0, 0, 0, 0, 0, id20, foodType);
                success69 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //فاكهة النجمة
            byte[] img70 = convertDrawableToByteArray(R.drawable.d41);
            FoodModel food70 = new FoodModel("فاكهة النجمة", "", img70, 30);
            long id70 = foodTableOperations.insertFoodData(food70);
            if (id70 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("فاكهة النجمة", "صغير", 7.5, 2, 0, 0, 0, 0, 0, id20, foodType);
                success70 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food71 = new FoodModel("فاكهة النجمة", "", 60);
            long id71 = foodTableOperations.insertFoodData(food71);
            if (id71 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("فاكهة النجمة", "وسط", 15, 4, 0, 0, 0, 0, 0, id20, foodType);
                success71 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food72 = new FoodModel("فاكهة النجمة", "", 70);
            long id72 = foodTableOperations.insertFoodData(food72);
            if (id72 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("فاكهة النجمة", "وسط", 18, 4, 0, 0, 0, 0, 0, id20, foodType);
                success72 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food73 = new FoodModel("فاكهة النجمة", "", 100);
            long id73 = foodTableOperations.insertFoodData(food73);
            if (id73 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("فاكهة النجمة", "كبير", 25, 6, 0, 0, 0, 0, 0, id20, foodType);
                success73 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            if (success && success2 && success3 && success4 && success6 && success7 && success8 && success9 && success10 &&
                    success11 && success12 && success13 && success14 && success15 && success16 && success17 && success18 && success19 && success20 &&
                    success21 && success22 && success23 && success24 && success25 && success26 && success27 && success28 && success29 && success30 &&
                    success31 && success32 && success33 && success34 && success35 && success36 && success37 && success38 && success39 && success40 &&
                    success41 && success42 && success43 && success44 && success45 && success46 && success47 && success48 && success49 && success50 &&
                    success51 && success52 && success53 && success54 && success55 && success56 && success57 && success58 && success59 && success60 &&
                    success61 && success62 && success63 && success64 && success65 && success66 && success67 && success68 && success69 && success70 &&
                    success71 && success72 && success73) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public boolean insertBreadFoodDetails() {

        // do insert all bread data in database for first time
        try {
            FoodDetailsTableOperations foodDetailsTableOperations = new FoodDetailsTableOperations(context);
            FoodTableOperations foodTableOperations = new FoodTableOperations(context);

            boolean success = false, success2 = false, success2_1 = false, success2_2 = false, success3 = false, success3_1 = false, success4 = false,
                    success5 = false, success6 = false, success7 = false, success7_1 = false, success7_2 = false, success7_3 = false, success8 = false,
                    success9 = false, success9_1 = false, success9_2 = false, success10 = false,
                    success11 = false, success11_1 = false, success12 = false, success13 = false;

            // الخبز
            // bread
            String foodType = "الخبز";
            byte[] img = convertDrawableToByteArray(R.drawable.a1);
            FoodModel food1 = new FoodModel("كعك القدس", "", img, 250);
            long id = foodTableOperations.insertFoodData(food1);
            if (id > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("كعك القدس", "كاملة", 660, 125, 25, 8, 0, 0, 0, id, foodType);
                success = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            byte[] img2 = convertDrawableToByteArray(R.drawable.a2);
            FoodModel food2 = new FoodModel("خبز أبيض", "", img2, 60);
            long id2 = foodTableOperations.insertFoodData(food2);
            if (id2 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("خبز أبيض", "صغير", 140, 30, 5, 0, 0, 0, 0, id2, foodType);
                success2 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img2_1 = convertDrawableToByteArray(R.drawable.a3);
            FoodModel food2_1 = new FoodModel("خبز أبيض", "", img2_1, 90);
            long id2_1 = foodTableOperations.insertFoodData(food2_1);
            if (id2_1 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("خبز أبيض", "وسط", 200, 40, 7, 0, 0, 0, 0, id2, foodType);
                success2_1 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img2_2 = convertDrawableToByteArray(R.drawable.a4);
            FoodModel food2_2 = new FoodModel("خبز أبيض", "", img2_2, 150);
            long id2_2 = foodTableOperations.insertFoodData(food2_2);
            if (id2_2 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("خبز أبيض", "كبير", 350, 70, 12, 0.5, 0, 0, 0, id2, foodType);
                success2_2 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img3 = convertDrawableToByteArray(R.drawable.a5);
            FoodModel food3 = new FoodModel("خبز أسمر", "", img3, 60);
            long id3 = foodTableOperations.insertFoodData(food3);
            if (id3 > 0) {
                FoodDetailsModel foodModel3 = new FoodDetailsModel("خبز أسمر", "صغير", 145, 3, 5, 2, 0, 0, 0, id3, foodType);
                success3 = foodDetailsTableOperations.insertFoodData(foodModel3);
            }
            byte[] img3_1 = convertDrawableToByteArray(R.drawable.a6);
            FoodModel food3_1 = new FoodModel("خبز أسمر", "", img3_1, 150);
            long id3_1 = foodTableOperations.insertFoodData(food3_1);
            if (id3_1 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("خبز أسمر", "كبير", 380, 70, 14.5, 5, 0, 0, 0, id2, foodType);
                success3_1 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img4 = convertDrawableToByteArray(R.drawable.a7);
            FoodModel food4 = new FoodModel("خبز شراك", "", img4, 120);
            long id4 = foodTableOperations.insertFoodData(food4);
            if (id4 > 0) {
                FoodDetailsModel foodModel4 = new FoodDetailsModel("خبز شراك", "رغيف كامل", 280, 60, 10, 1, 0, 0, 0, id4, foodType);
                success4 = foodDetailsTableOperations.insertFoodData(foodModel4);
            }
            byte[] img5 = convertDrawableToByteArray(R.drawable.a8);
            FoodModel food5 = new FoodModel("رغيف أبيض (مسخن)", "", img5, 55);
            long id5 = foodTableOperations.insertFoodData(food5);
            if (id5 > 0) {
                FoodDetailsModel foodModel5 = new FoodDetailsModel("رغيف أبيض (مسخن)", "ربع رغيف (230 غم)", 600, 115, 20, 7, 0, 0, 0, id5, foodType);
                success5 = foodDetailsTableOperations.insertFoodData(foodModel5);
            }
            byte[] img6 = convertDrawableToByteArray(R.drawable.a9);
            FoodModel food6 = new FoodModel("رغيف اسمر", "", img6, 60);
            long id6 = foodTableOperations.insertFoodData(food6);
            if (id6 > 0) {
                FoodDetailsModel foodModel6 = new FoodDetailsModel("رغيف اسمر", "ربع رغيف (240 غم)", 650, 120, 24, 8, 0, 0, 0, id6, foodType);
                success6 = foodDetailsTableOperations.insertFoodData(foodModel6);
            }
            byte[] img7 = convertDrawableToByteArray(R.drawable.a10);
            FoodModel food7 = new FoodModel("خبز فينو ابيض", "", img7, 70);
            long id7 = foodTableOperations.insertFoodData(food7);
            if (id7 > 0) {
                FoodDetailsModel foodModel7 = new FoodDetailsModel("خبز فينو ابيض", "صغير", 180, 35, 7, 2, 0, 0, 0, id7, foodType);
                success7 = foodDetailsTableOperations.insertFoodData(foodModel7);
            }
            byte[] img7_1 = convertDrawableToByteArray(R.drawable.a11);
            FoodModel food7_1 = new FoodModel("خبز فينو ابيض", "", img7_1, 90);
            long id7_1 = foodTableOperations.insertFoodData(food7_1);
            if (id7_1 > 0) {
                FoodDetailsModel foodModel7 = new FoodDetailsModel("خبز فينو ابيض", "وسط", 260, 50, 10, 3, 0, 0, 0, id7, foodType);
                success7_1 = foodDetailsTableOperations.insertFoodData(foodModel7);
            }
            byte[] img7_2 = convertDrawableToByteArray(R.drawable.a12);
            FoodModel food7_2 = new FoodModel("خبز فينو ابيض", "", img7_2, 100);
            long id7_2 = foodTableOperations.insertFoodData(food7_2);
            if (id7_2 > 0) {
                FoodDetailsModel foodModel7 = new FoodDetailsModel("خبز فينو ابيض", "وسط", 290, 55, 10, 3.5, 0, 0, 0, id7, foodType);
                success7_2 = foodDetailsTableOperations.insertFoodData(foodModel7);
            }
            byte[] img7_3 = convertDrawableToByteArray(R.drawable.a13);
            FoodModel food7_3 = new FoodModel("خبز فينو ابيض", "", img7_3, 130);
            long id7_3 = foodTableOperations.insertFoodData(food7_3);
            if (id7_3 > 0) {
                FoodDetailsModel foodModel7 = new FoodDetailsModel("خبز فينو ابيض", "كبير", 340, 65, 12, 4, 0, 0, 0, id7, foodType);
                success7_3 = foodDetailsTableOperations.insertFoodData(foodModel7);
            }
            byte[] img8 = convertDrawableToByteArray(R.drawable.a14);
            FoodModel food8 = new FoodModel("خبز فينو اسمر", "", img8, 80);
            long id8 = foodTableOperations.insertFoodData(food8);
            if (id8 > 0) {
                FoodDetailsModel foodModel8 = new FoodDetailsModel("خبز فينو اسمر", "صغير", 200, 40, 7.5, 2.5, 0, 0, 0, id8, foodType);
                success8 = foodDetailsTableOperations.insertFoodData(foodModel8);
            }
            byte[] img9 = convertDrawableToByteArray(R.drawable.a15);
            FoodModel food9 = new FoodModel("خبز برجر ابيض", "", img9, 30);
            long id9 = foodTableOperations.insertFoodData(food9);
            if (id9 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("خبز برجر ابيض", "صغير", 80, 15, 3, 1, 0, 0, 0, id9, foodType);
                success9 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            byte[] img9_1 = convertDrawableToByteArray(R.drawable.a16);
            FoodModel food9_1 = new FoodModel("خبز برجر ابيض", "", img9_1, 110);
            long id9_1 = foodTableOperations.insertFoodData(food9_1);
            if (id9_1 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("خبز برجر ابيض", "وسط", 300, 60, 12, 4, 0, 0, 0, id9, foodType);
                success9_1 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            byte[] img9_2 = convertDrawableToByteArray(R.drawable.a17);
            FoodModel food9_2 = new FoodModel("خبز برجر ابيض", "", img9_2, 130);
            long id9_2 = foodTableOperations.insertFoodData(food9_2);
            if (id9_2 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("خبز برجر ابيض", "كبير", 35, 65, 12, 4, 0, 0, 0, id9, foodType);
                success9_2 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            byte[] img10 = convertDrawableToByteArray(R.drawable.a18);
            FoodModel food10 = new FoodModel("خبز برجر اسمر", "", img10, 80);
            long id10 = foodTableOperations.insertFoodData(food10);
            if (id10 > 0) {
                FoodDetailsModel foodModel10 = new FoodDetailsModel("خبز برجر اسمر", "وسط", 230, 40, 9, 3, 0, 0, 0, id10, foodType);
                success10 = foodDetailsTableOperations.insertFoodData(foodModel10);
            }
            byte[] img11 = convertDrawableToByteArray(R.drawable.a19);
            FoodModel food11 = new FoodModel("خبز توست", "", img11, 30);
            long id11 = foodTableOperations.insertFoodData(food11);
            if (id11 > 0) {
                FoodDetailsModel foodModel11 = new FoodDetailsModel("خبز توست", "أبيض", 80, 16, 2, 1, 0, 0, 0, id11, foodType);
                success11 = foodDetailsTableOperations.insertFoodData(foodModel11);
            }
            FoodModel food11_1 = new FoodModel("خبز توست", "", 20);
            long id11_1 = foodTableOperations.insertFoodData(food11_1);
            if (id11_1 > 0) {
                FoodDetailsModel foodModel11 = new FoodDetailsModel("خبز توست", "أسمر", 70, 12, 2, 1, 0, 0, 0, id11, foodType);
                success11_1 = foodDetailsTableOperations.insertFoodData(foodModel11);
            }
            byte[] img12 = convertDrawableToByteArray(R.drawable.a20);
            FoodModel food12 = new FoodModel("فتوت", "", img12, 40);
            long id12 = foodTableOperations.insertFoodData(food12);
            if (id12 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("فتوت", "مغرفه", 130, 20, 4, 5, 0, 0, 0, id12, foodType);
                success12 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img13 = convertDrawableToByteArray(R.drawable.a21);
            FoodModel food13 = new FoodModel("خبز طابون", "", img13, 300);
            long id13 = foodTableOperations.insertFoodData(food13);
            if (id13 > 0) {
                FoodDetailsModel foodModel13 = new FoodDetailsModel("خبز طابون", "ربع رغيف", 800, 150, 30, 10, 0, 0, 0, id13, foodType);
                success13 = foodDetailsTableOperations.insertFoodData(foodModel13);
            }
            if (success && success2 && success2_1 && success2_2 && success3 && success3_1 && success4 && success5 && success6 && success7 && success7_1 && success7_2
                    && success7_3 && success8 && success9 && success9_1 && success9_2 && success10 &&
                    success11 && success11_1 && success12 && success13) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public boolean insertMeatFoodDetails() {

        // do insert all meat data in database for first time
        try {
            FoodDetailsTableOperations foodDetailsTableOperations = new FoodDetailsTableOperations(context);
            FoodTableOperations foodTableOperations = new FoodTableOperations(context);

            boolean success = false, success2 = false, success2_1 = false, success2_2 = false, success3 = false, success3_1 = false, success4 = false,
                    success5 = false, success6 = false, success7 = false, success7_1 = false, success7_2 = false, success7_3 = false, success8 = false,
                    success9 = false, success9_1 = false, success9_2 = false, success9_3 = false, success10 = false,
                    success11 = false, success11_1 = false, success12 = false, success13 = false, success13_1 = false, success13_2 = false, success14 = false, success15 = false, success16 = false, success17 = false, success18 = false, success18_1 = false, success18_2 = false;

            // اللحوم
            // meat
            String foodType = "اللحوم";
            byte[] img = convertDrawableToByteArray(R.drawable.i1);
            FoodModel food1 = new FoodModel("صدر دجاج حجم صغير", "", img, 80);
            long id = foodTableOperations.insertFoodData(food1);
            if (id > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("صدر دجاج حجم صغير ", "صغير", 140, 0.0, 20, 7.5, 0, 0, 0, id, foodType);
                success = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            byte[] img2 = convertDrawableToByteArray(R.drawable.i2);
            FoodModel food2 = new FoodModel("صدر دجاج حجم وسط", "", img2, 120);
            long id2 = foodTableOperations.insertFoodData(food2);
            if (id2 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("صدر دجاج حجم وسط", "وسط", 220, 0.0, 30, 12, 0, 0, 0, id2, foodType);
                success2 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img2_1 = convertDrawableToByteArray(R.drawable.i3);
            FoodModel food2_1 = new FoodModel("صدر دجاج حجم كبير", "", img2_1, 160);
            long id2_1 = foodTableOperations.insertFoodData(food2_1);
            if (id2_1 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("صدر دجاج حجم كبير", "كبير", 270, 0.0, 35, 15, 0, 0, 0, id2, foodType);
                success2_1 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img2_2 = convertDrawableToByteArray(R.drawable.i4);
            FoodModel food2_2 = new FoodModel("فخذة دجاج حجم صغير", "", img2_2, 70);
            long id2_2 = foodTableOperations.insertFoodData(food2_2);
            if (id2_2 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("فخذة دجاج حجم صغير", "صغير", 180, 0.0, 17, 12, 0, 0, 0, id2, foodType);
                success2_2 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img3 = convertDrawableToByteArray(R.drawable.i5);
            FoodModel food3 = new FoodModel(" فخذة دجاج حجم وسط", "", img3, 70);
            long id3 = foodTableOperations.insertFoodData(food3);
            if (id3 > 0) {
                FoodDetailsModel foodModel3 = new FoodDetailsModel("فخذة دجاج حجم وسط", "وسط", 220, 0.0, 22, 15, 0, 0, 0, id3, foodType);
                success3 = foodDetailsTableOperations.insertFoodData(foodModel3);
            }
            byte[] img3_1 = convertDrawableToByteArray(R.drawable.i6);
            FoodModel food3_1 = new FoodModel("فخذة دجاج حجم كبير ", "", img3_1, 110);
            long id3_1 = foodTableOperations.insertFoodData(food3_1);
            if (id3_1 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("فخذة دجاج حجم كبير ", "كبير", 260, 0.0, 25, 18, 0, 0, 0, id2, foodType);
                success3_1 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img4 = convertDrawableToByteArray(R.drawable.i7);
            FoodModel food4 = new FoodModel("لحمة مفرومة", "", img4, 40);
            long id4 = foodTableOperations.insertFoodData(food4);
            if (id4 > 0) {
                FoodDetailsModel foodModel4 = new FoodDetailsModel("لحمة مفرومة", "2 ملعقه", 70, 0.0, 10, 4, 0, 0, 0, id4, foodType);
                success4 = foodDetailsTableOperations.insertFoodData(foodModel4);
            }
            byte[] img5 = convertDrawableToByteArray(R.drawable.i8);
            FoodModel food5 = new FoodModel("شاورما دجاج", "", img5, 60);
            long id5 = foodTableOperations.insertFoodData(food5);
            if (id5 > 0) {
                FoodDetailsModel foodModel5 = new FoodDetailsModel("شاورما دجاج", "2 ملعقه", 140, 10, 9, 6, 0, 0, 0, id5, foodType);
                success5 = foodDetailsTableOperations.insertFoodData(foodModel5);
            }
            byte[] img6 = convertDrawableToByteArray(R.drawable.i9);
            FoodModel food6 = new FoodModel("لحمة رأس عصفور(عجل)", "", img6, 60);
            long id6 = foodTableOperations.insertFoodData(food6);
            if (id6 > 0) {
                FoodDetailsModel foodModel6 = new FoodDetailsModel("لحمة رأس عصفور(عجل)", "2 ملعقه", 130, 0.0, 12, 9, 0, 0, 0, id6, foodType);
                success6 = foodDetailsTableOperations.insertFoodData(foodModel6);
            }
            byte[] img7 = convertDrawableToByteArray(R.drawable.i10);
            FoodModel food7 = new FoodModel("قطعة لحم عجل", "", img7, 40);
            long id7 = foodTableOperations.insertFoodData(food7);
            if (id7 > 0) {
                FoodDetailsModel foodModel7 = new FoodDetailsModel("قطعة لحم عجل", "صغير", 90, 0.0, 8, 6, 0, 0, 0, id7, foodType);
                success7 = foodDetailsTableOperations.insertFoodData(foodModel7);
            }
            byte[] img7_1 = convertDrawableToByteArray(R.drawable.i11);
            FoodModel food7_1 = new FoodModel("قطعة لحم عجل", "", img7_1, 90);
            long id7_1 = foodTableOperations.insertFoodData(food7_1);
            if (id7_1 > 0) {
                FoodDetailsModel foodModel7 = new FoodDetailsModel("قطعة لحم عجل", "وسط", 200, 0.0, 20, 15, 0, 0, 0, id7, foodType);
                success7_1 = foodDetailsTableOperations.insertFoodData(foodModel7);
            }
            byte[] img7_2 = convertDrawableToByteArray(R.drawable.i12);
            FoodModel food7_2 = new FoodModel("قطعة لحم عجل", "", img7_2, 150);
            long id7_2 = foodTableOperations.insertFoodData(food7_2);
            if (id7_2 > 0) {
                FoodDetailsModel foodModel7 = new FoodDetailsModel("قطعة لحم عجل", "كبير", 370, 0.0, 35, 25, 0, 0, 0, id7, foodType);
                success7_2 = foodDetailsTableOperations.insertFoodData(foodModel7);
            }
            byte[] img7_3 = convertDrawableToByteArray(R.drawable.i13);
            FoodModel food7_3 = new FoodModel("موزات خروف", "", img7_3, 115);
            long id7_3 = foodTableOperations.insertFoodData(food7_3);
            if (id7_3 > 0) {
                FoodDetailsModel foodModel7 = new FoodDetailsModel("موزات خروف", "وسط", 300, 0.0, 30, 20, 0, 0, 0, id7, foodType);
                success7_3 = foodDetailsTableOperations.insertFoodData(foodModel7);
            }
            byte[] img8 = convertDrawableToByteArray(R.drawable.i14);
            FoodModel food8 = new FoodModel("موزات خروف", "", img8, 130);
            long id8 = foodTableOperations.insertFoodData(food8);
            if (id8 > 0) {
                FoodDetailsModel foodModel8 = new FoodDetailsModel("موزات خروف", "وسط", 320, 0.0, 30, 20, 0, 0, 0, id8, foodType);
                success8 = foodDetailsTableOperations.insertFoodData(foodModel8);
            }
            byte[] img9 = convertDrawableToByteArray(R.drawable.i15);
            FoodModel food9 = new FoodModel("ريش خروف", "", img9, 40);
            long id9 = foodTableOperations.insertFoodData(food9);
            if (id9 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("ريش خروف", "وسط", 100, 0.0, 10, 6, 0, 0, 0, id9, foodType);
                success9 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            byte[] img9_1 = convertDrawableToByteArray(R.drawable.i16);
            FoodModel food9_1 = new FoodModel("كبد دجاج", "", img9_1, 60);
            long id9_1 = foodTableOperations.insertFoodData(food9_1);
            if (id9_1 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("كبد دجاج", "2 ملعقه", 160, 8, 15, 6, 0, 0, 0, id9, foodType);
                success9_1 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            FoodModel food9_2 = new FoodModel("كبد دجاج", "", 100);
            long id9_2 = foodTableOperations.insertFoodData(food9_2);
            if (id9_2 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("كبد دجاج", "3 ملاعق", 250, 12, 25, 9, 0, 0, 0, id9, foodType);
                success9_2 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            byte[] img9_3 = convertDrawableToByteArray(R.drawable.i17);
            FoodModel food9_3 = new FoodModel("كبد خروف", "", img9_3, 80);
            long id9_3 = foodTableOperations.insertFoodData(food9_3);
            if (id9_3 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("كبد خروف", "2 ملعقه", 200, 10, 20, 8, 0, 0, 0, id9, foodType);
                success9_3 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            byte[] img10 = convertDrawableToByteArray(R.drawable.i18);
            FoodModel food10 = new FoodModel("قوانص دجاج", "", img10, 50);
            long id10 = foodTableOperations.insertFoodData(food10);
            if (id10 > 0) {
                FoodDetailsModel foodModel10 = new FoodDetailsModel("قوانص دجاج", "2 ملعقه", 90, 0.0, 10, 4.5, 0, 0, 0, id10, foodType);
                success10 = foodDetailsTableOperations.insertFoodData(foodModel10);
            }
            byte[] img11 = convertDrawableToByteArray(R.drawable.i19);
            FoodModel food11 = new FoodModel("قلب خروف", "", img11, 50);
            long id11 = foodTableOperations.insertFoodData(food11);
            if (id11 > 0) {
                FoodDetailsModel foodModel11 = new FoodDetailsModel("قلب خروف", "2 ملعقة", 75, 0.0, 8, 4.5, 0, 0, 0, id11, foodType);
                success11 = foodDetailsTableOperations.insertFoodData(foodModel11);
            }
            byte[] img11_1 = convertDrawableToByteArray(R.drawable.i20);
            FoodModel food11_1 = new FoodModel("فشة خروف (رئتين)", "", img11_1, 70);
            long id11_1 = foodTableOperations.insertFoodData(food11_1);
            if (id11_1 > 0) {
                FoodDetailsModel foodModel11 = new FoodDetailsModel("فشة خروف (رئتين)", "2 ملعقة", 60, 0.0, 10, 2, 0, 0, 0, id11, foodType);
                success11_1 = foodDetailsTableOperations.insertFoodData(foodModel11);
            }
            byte[] img12 = convertDrawableToByteArray(R.drawable.i21);
            FoodModel food12 = new FoodModel("كلاوي خروف", "", img12, 45);
            long id12 = foodTableOperations.insertFoodData(food12);
            if (id12 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("كلاوي خروف", "2 ملعقه", 95, 0.5, 12, 5, 0, 0, 0, id12, foodType);
                success12 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img13 = convertDrawableToByteArray(R.drawable.i22);
            FoodModel food13 = new FoodModel("سمك سلمون", "", img13, 85);
            long id13 = foodTableOperations.insertFoodData(food13);
            if (id13 > 0) {
                FoodDetailsModel foodModel13 = new FoodDetailsModel("سمك سلمون", "صغير", 220, 0.0, 50, 15, 0, 0, 0, id13, foodType);
                success13 = foodDetailsTableOperations.insertFoodData(foodModel13);
            }
            byte[] img13_1 = convertDrawableToByteArray(R.drawable.i23);
            FoodModel food13_1 = new FoodModel("سمك سلمون", "", img13_1, 110);
            long id13_1 = foodTableOperations.insertFoodData(food13_1);
            if (id13_1 > 0) {
                FoodDetailsModel foodModel13 = new FoodDetailsModel("سمك سلمون", "وسط", 280, 0.0, 26, 20, 0, 0, 0, id13, foodType);
                success13_1 = foodDetailsTableOperations.insertFoodData(foodModel13);
            }
            byte[] img13_2 = convertDrawableToByteArray(R.drawable.i23);
            FoodModel food13_2 = new FoodModel("سمك سلمون", "", img13_2, 170);
            long id13_2 = foodTableOperations.insertFoodData(food13_2);
            if (id13_2 > 0) {
                FoodDetailsModel foodModel13 = new FoodDetailsModel("سمك سلمون", "كبير", 430, 0.0, 40, 30, 0, 0, 0, id13, foodType);
                success13_2 = foodDetailsTableOperations.insertFoodData(foodModel13);
            }
            byte[] img14 = convertDrawableToByteArray(R.drawable.i25);
            FoodModel food14 = new FoodModel("سمك دينيس", "", img14, 125);
            long id14 = foodTableOperations.insertFoodData(food14);
            if (id14 > 0) {
                FoodDetailsModel foodModel13 = new FoodDetailsModel("سمك دينيس", "متوسطة", 300, 0.0, 30, 20, 0, 0, 0, id13, foodType);
                success14 = foodDetailsTableOperations.insertFoodData(foodModel13);
            }
            byte[] img15 = convertDrawableToByteArray(R.drawable.i26);
            FoodModel food15 = new FoodModel("سمك سردين", "", img15, 17);
            long id15 = foodTableOperations.insertFoodData(food15);
            if (id15 > 0) {
                FoodDetailsModel foodModel13 = new FoodDetailsModel("سمك سردين", "صغير", 45, 0.0, 4, 3, 0, 0, 0, id13, foodType);
                success15 = foodDetailsTableOperations.insertFoodData(foodModel13);
            }
            byte[] img16 = convertDrawableToByteArray(R.drawable.i27);
            FoodModel food16 = new FoodModel("سمك", "", img16, 60);
            long id16 = foodTableOperations.insertFoodData(food16);
            if (id16 > 0) {
                FoodDetailsModel foodModel13 = new FoodDetailsModel("سمك", "-", 150, 0.0, 14, 10, 0, 0, 0, id13, foodType);
                success16 = foodDetailsTableOperations.insertFoodData(foodModel13);
            }
            byte[] img17 = convertDrawableToByteArray(R.drawable.i28);
            FoodModel food17 = new FoodModel("سمك", "", img17, 90);
            long id17 = foodTableOperations.insertFoodData(food17);
            if (id17 > 0) {
                FoodDetailsModel foodModel13 = new FoodDetailsModel("سمك", "-", 225, 0.0, 20, 15, 0, 0, 0, id13, foodType);
                success17 = foodDetailsTableOperations.insertFoodData(foodModel13);
            }
            byte[] img18 = convertDrawableToByteArray(R.drawable.i29);
            FoodModel food18 = new FoodModel("سمك مقطع", "", img18, 80);
            long id18 = foodTableOperations.insertFoodData(food18);
            if (id18 > 0) {
                FoodDetailsModel foodModel13 = new FoodDetailsModel("سمك مقطع", "ذيل سمكة كبيرة", 200, 0.0, 18, 14, 0, 0, 0, id13, foodType);
                success18 = foodDetailsTableOperations.insertFoodData(foodModel13);
            }
            byte[] img18_1 = convertDrawableToByteArray(R.drawable.i30);
            FoodModel food18_1 = new FoodModel("سمك مقطع", "", img18_1, 60);
            long id18_1 = foodTableOperations.insertFoodData(food18_1);
            if (id18_1 > 0) {
                FoodDetailsModel foodModel13 = new FoodDetailsModel("سمك مقطع", "راس سمكة كبيرة", 140, 0.0, 12, 9.5, 0, 0, 0, id13, foodType);
                success18_1 = foodDetailsTableOperations.insertFoodData(foodModel13);
            }
            byte[] img18_2 = convertDrawableToByteArray(R.drawable.i31);
            FoodModel food18_2 = new FoodModel("سمك مقطع", "", img18_2, 125);
            long id18_2 = foodTableOperations.insertFoodData(food18_2);
            if (id18_2 > 0) {
                FoodDetailsModel foodModel13 = new FoodDetailsModel("سمك مقطع", "وسط سمكة مقطعة", 300, 0.0, 28, 20, 0, 0, 0, id13, foodType);
                success18_2 = foodDetailsTableOperations.insertFoodData(foodModel13);
            }

            if (success && success2 && success2_1 && success2_2 && success3 && success3_1 && success4 && success5 && success6 && success7 && success7_1 && success7_2
                    && success7_3 && success8 && success9 && success9_1 && success9_2 && success9_3 && success10 && success11 && success11_1 && success12 && success13
                    && success13_1 && success13_2 && success14 && success15 && success16 && success17 && success18 && success18_1 && success18_2) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public boolean insertMilkFoodDetails() {

        // do insert all milk data in database for first time
        try {
            FoodDetailsTableOperations foodDetailsTableOperations = new FoodDetailsTableOperations(context);
            FoodTableOperations foodTableOperations = new FoodTableOperations(context);

            boolean success = false, success_1 = false, success_2 = false, success2 = false, success2_1 = false, success2_2 = false, success3 = false, success3_1 = false,
                    success4 = false, success5 = false, success6 = false, success7 = false, success7_1 = false, success7_2 = false, success7_3 = false, success8 = false,
                    success9 = false, success9_1 = false, success9_2 = false;

            // الألبان
            // milk
            String foodType = "الألبان";
            byte[] img = convertDrawableToByteArray(R.drawable.a1);
            FoodModel food1 = new FoodModel("حليب كامل الدسم", "", img, 200);
            long id = foodTableOperations.insertFoodData(food1);
            if (id > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("حليب كامل الدسم", "كوب", 120, 10, 6, 6, 0, 0, 0, id, foodType);
                success = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food1_1 = new FoodModel("حليب بنكهة الكاكاو", "", img, 200);
            long id_1 = foodTableOperations.insertFoodData(food1_1);
            if (id_1 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("حليب بنكهة الكاكاوم", "كوب", 125, 15, 6, 4, 0, 0, 0, id, foodType);
                success_1 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food1_2 = new FoodModel("حليب بنكهة الفراولة", "", img, 200);
            long id_2 = foodTableOperations.insertFoodData(food1_2);
            if (id_2 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("حليب بنكهة الفراولة", "كوب", 140, 25, 5, 3, 0, 0, 0, id, foodType);
                success_2 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            byte[] img2 = convertDrawableToByteArray(R.drawable.a2);
            FoodModel food2 = new FoodModel("حليب مكثف", "", img2, 260);
            long id2 = foodTableOperations.insertFoodData(food2);
            if (id2 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("حليب مكثف", "كوب", 830, 140, 20, 20, 0, 0, 0, id2, foodType);
                success2 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img2_1 = convertDrawableToByteArray(R.drawable.a3);
            FoodModel food2_1 = new FoodModel("لبن", "", img2_1, 300);
            long id2_1 = foodTableOperations.insertFoodData(food2_1);
            if (id2_1 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("لبن", "كوب", 150, 12, 8, 8, 0, 0, 0, id2, foodType);
                success2_1 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img2_2 = convertDrawableToByteArray(R.drawable.a4);
            FoodModel food2_2 = new FoodModel("لبن بنكهة الفراولة", "", img2_2, 220);
            long id2_2 = foodTableOperations.insertFoodData(food2_2);
            if (id2_2 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("لبن بنكهة الفراولة", "كوب", 180, 30, 7, 3, 0, 0, 0, id2, foodType);
                success2_2 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img3 = convertDrawableToByteArray(R.drawable.a5);
            FoodModel food3 = new FoodModel("لبن مخيض", "", img3, 220);
            long id3 = foodTableOperations.insertFoodData(food3);
            if (id3 > 0) {
                FoodDetailsModel foodModel3 = new FoodDetailsModel("لبن مخيض", "كوب", 90, 9, 6, 3, 0, 0, 0, id3, foodType);
                success3 = foodDetailsTableOperations.insertFoodData(foodModel3);
            }
            byte[] img3_1 = convertDrawableToByteArray(R.drawable.a6);
            FoodModel food3_1 = new FoodModel("لبنه", "", img3_1, 60);
            long id3_1 = foodTableOperations.insertFoodData(food3_1);
            if (id3_1 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("لبنه", "2 ملعقة", 75, 0, 7, 5, 0, 0, 0, id2, foodType);
                success3_1 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            FoodModel food4 = new FoodModel("لبنه", "", 120);
            long id4 = foodTableOperations.insertFoodData(food4);
            if (id4 > 0) {
                FoodDetailsModel foodModel4 = new FoodDetailsModel("لبنه", "4 ملاعق", 150, 0, 14, 10, 0, 0, 0, id4, foodType);
                success4 = foodDetailsTableOperations.insertFoodData(foodModel4);
            }
            byte[] img5 = convertDrawableToByteArray(R.drawable.a7);
            FoodModel food5 = new FoodModel("لبنه مع زيت زيتون", "", img5, 40);
            long id5 = foodTableOperations.insertFoodData(food5);
            if (id5 > 0) {
                FoodDetailsModel foodModel5 = new FoodDetailsModel("لبنه مع زيت زيتون", "2 ملعقة", 150, 0, 15, 10, 0, 0, 0, id5, foodType);
                success5 = foodDetailsTableOperations.insertFoodData(foodModel5);
            }
            byte[] img6 = convertDrawableToByteArray(R.drawable.a8);
            FoodModel food6 = new FoodModel("جبنة بلدية (نابلسية)", "", img6, 100);
            long id6 = foodTableOperations.insertFoodData(food6);
            if (id6 > 0) {
                FoodDetailsModel foodModel6 = new FoodDetailsModel("جبنة بلدية (نابلسية)", "ربعي قرص", 330, 0, 25, 27, 0, 0, 0, id6, foodType);
                success6 = foodDetailsTableOperations.insertFoodData(foodModel6);
            }
            byte[] img7 = convertDrawableToByteArray(R.drawable.a9);
            FoodModel food7 = new FoodModel("جبنة بلدية مقلية", "", img7, 80);
            long id7 = foodTableOperations.insertFoodData(food7);
            if (id7 > 0) {
                FoodDetailsModel foodModel7 = new FoodDetailsModel("جبنة بلدية مقلية", "ربعي قرص", 330, 0, 24, 20, 0, 0, 0, id7, foodType);
                success7 = foodDetailsTableOperations.insertFoodData(foodModel7);
            }
            byte[] img7_1 = convertDrawableToByteArray(R.drawable.a10);
            FoodModel food7_1 = new FoodModel("جبن كريمي (دهن)", "", img7_1, 40);
            long id7_1 = foodTableOperations.insertFoodData(food7_1);
            if (id7_1 > 0) {
                FoodDetailsModel foodModel7 = new FoodDetailsModel("جبن كريمي (دهن)", "2 ملعقة", 130, 0.5, 3.5, 12.5, 0, 0, 0, id7, foodType);
                success7_1 = foodDetailsTableOperations.insertFoodData(foodModel7);
            }
            FoodModel food7_2 = new FoodModel("جبن كريمي (دهن)", "", 80);
            long id7_2 = foodTableOperations.insertFoodData(food7_2);
            if (id7_2 > 0) {
                FoodDetailsModel foodModel7 = new FoodDetailsModel("جبن كريمي (دهن)", "4 ملاعق", 260, 1, 7, 25, 0, 0, 0, id7, foodType);
                success7_2 = foodDetailsTableOperations.insertFoodData(foodModel7);
            }
            byte[] img7_3 = convertDrawableToByteArray(R.drawable.a11);
            FoodModel food7_3 = new FoodModel("جبنة موتزريلا", "", img7_3, 30);
            long id7_3 = foodTableOperations.insertFoodData(food7_3);
            if (id7_3 > 0) {
                FoodDetailsModel foodModel7 = new FoodDetailsModel("جبنة موتزريلا", "كوب", 100, 2.5, 5, 8, 0, 0, 0, id7, foodType);
                success7_3 = foodDetailsTableOperations.insertFoodData(foodModel7);
            }
            byte[] img8 = convertDrawableToByteArray(R.drawable.a12);
            FoodModel food8 = new FoodModel("بيض مسلوق", "", img8, 45);
            long id8 = foodTableOperations.insertFoodData(food8);
            if (id8 > 0) {
                FoodDetailsModel foodModel8 = new FoodDetailsModel("بيض مسلوق", "وسط", 75, 0.0, 7, 5, 0, 0, 0, id8, foodType);
                success8 = foodDetailsTableOperations.insertFoodData(foodModel8);
            }
            byte[] img9 = convertDrawableToByteArray(R.drawable.a13);
            FoodModel food9 = new FoodModel("بيض مقلي", "", img9, 54);
            long id9 = foodTableOperations.insertFoodData(food9);
            if (id9 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("بيض مقلي", "وسط", 100, 0.0, 7, 8, 0, 0, 0, id9, foodType);
                success9 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            byte[] img9_2 = convertDrawableToByteArray(R.drawable.a14);
            FoodModel food9_2 = new FoodModel("عجة", "", img9_2, 46);
            long id9_2 = foodTableOperations.insertFoodData(food9_2);
            if (id9_2 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("عجة", "وسط", 150, 6, 8, 10, 0, 0, 0, id9, foodType);
                success9_2 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }

            if (success && success_1 && success_2 && success2 && success2_1 && success2_2 && success3 && success3_1 && success4 && success5 && success6 && success7 &&
                    success7_1 && success7_2 && success7_3 && success8 && success9 && success9_2) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    private byte[] convertDrawableToByteArray(int resourceID) {
        Resources res = context.getResources();
        Drawable drawable = res.getDrawable(resourceID);
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
        return stream.toByteArray();
    }
}

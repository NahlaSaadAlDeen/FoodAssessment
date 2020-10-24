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
                FoodDetailsModel foodModel = new FoodDetailsModel("بطيخ", "كوب", 50, 12, 0, 0, 0, 0, 0, id22, foodType);
                success22 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            byte[] img23 = convertDrawableToByteArray(R.drawable.d13);
            FoodModel food23 = new FoodModel("بطيخ", "", img23, 320);
            long id23 = foodTableOperations.insertFoodData(food23);
            if (id23 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("بطيخ", "كوبان", 100, 24, 0, 0, 0, 0, 0, id23, foodType);
                success23 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //شمام
            byte[] img24 = convertDrawableToByteArray(R.drawable.d14);
            FoodModel food24 = new FoodModel("شمام", "", img24, 180);
            long id24 = foodTableOperations.insertFoodData(food24);
            if (id24 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("شمام", "كوب", 60, 15, 0, 0, 0, 0, 0, id24, foodType);
                success24 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            byte[] img25 = convertDrawableToByteArray(R.drawable.d15);
            FoodModel food25 = new FoodModel("شمام", "", img25, 360);
            long id25 = foodTableOperations.insertFoodData(food25);
            if (id25 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("شمام", "كوبان", 120, 30, 0, 0, 0, 0, 0, id25, foodType);
                success25 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //برقوق
            byte[] img26 = convertDrawableToByteArray(R.drawable.d16);
            FoodModel food26 = new FoodModel("برقوق", "", img26, 55);
            long id26 = foodTableOperations.insertFoodData(food26);
            if (id26 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("برقوق", "صغير", 20, 5.5, 0, 0, 0, 0, 0, id26, foodType);
                success26 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food27 = new FoodModel("برقوق", "", 80);
            long id27 = foodTableOperations.insertFoodData(food27);
            if (id27 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("برقوق", "وسط", 30, 8, 0, 0, 0, 0, 0, id27, foodType);
                success27 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food28 = new FoodModel("برقوق", "", 100);
            long id28 = foodTableOperations.insertFoodData(food28);
            if (id28 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("برقوق", "كبير", 40, 10, 0, 0, 0, 0, 0, id28, foodType);
                success28 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //نكترين
            byte[] img29 = convertDrawableToByteArray(R.drawable.d17);
            FoodModel food29 = new FoodModel("نكترين", "", img29, 90);
            long id29 = foodTableOperations.insertFoodData(food29);
            if (id29 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("نكترين", "صغير", 40, 8, 0, 0, 0, 0, 0, id29, foodType);
                success29 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food30 = new FoodModel("نكترين", "", 120);
            long id30 = foodTableOperations.insertFoodData(food30);
            if (id30 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("نكترين", "وسط", 50, 12, 0, 0, 0, 0, 0, id30, foodType);
                success30 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food31 = new FoodModel("نكترين", "", 160);
            long id31 = foodTableOperations.insertFoodData(food31);
            if (id31 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("نكترين", "وسط", 65, 16, 0, 0, 0, 0, 0, id31, foodType);
                success31 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food32 = new FoodModel("نكترين", "", 220);
            long id32 = foodTableOperations.insertFoodData(food32);
            if (id32 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("نكترين", "كبير", 90, 20, 0, 0, 0, 0, 0, id32, foodType);
                success32 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //كيوي
            byte[] img33 = convertDrawableToByteArray(R.drawable.d18);
            FoodModel food33 = new FoodModel("كيوي", "", img33, 60);
            long id33 = foodTableOperations.insertFoodData(food33);
            if (id33 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("كيوي", "صغير", 30, 8, 0, 0, 0, 0, 0, id33, foodType);
                success33 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food34 = new FoodModel("كيوي", "", 80);
            long id34 = foodTableOperations.insertFoodData(food34);
            if (id34 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("كيوي", "وسط", 45, 12, 0, 0, 0, 0, 0, id34, foodType);
                success34 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //أناناس
            byte[] img35 = convertDrawableToByteArray(R.drawable.d19);
            FoodModel food35 = new FoodModel("أناناس", "", img35, 80);
            long id35 = foodTableOperations.insertFoodData(food35);
            if (id35 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("أناناس", "نصف كوب", 60, 15, 0, 0, 0, 0, 0, id35, foodType);
                success35 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //تين
            byte[] img36 = convertDrawableToByteArray(R.drawable.d20);
            FoodModel food36 = new FoodModel("تين", "", img36, 30);
            long id36 = foodTableOperations.insertFoodData(food36);
            if (id36 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("تين", "صغير", 20, 5, 0, 0, 0, 0, 0, id36, foodType);
                success36 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food37 = new FoodModel("تين", "", 40);
            long id37 = foodTableOperations.insertFoodData(food37);
            if (id37 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("تين", "وسط", 30, 7, 0, 0, 0, 0, 0, id37, foodType);
                success37 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food38 = new FoodModel("تين", "", 60);
            long id38 = foodTableOperations.insertFoodData(food38);
            if (id38 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("تين", "كبير", 40, 10, 0, 0, 0, 0, 0, id38, foodType);
                success38 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //فراولة
            byte[] img39 = convertDrawableToByteArray(R.drawable.d21);
            FoodModel food39 = new FoodModel("فراولة", "", img39, 200);
            long id39 = foodTableOperations.insertFoodData(food39);
            if (id39 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("فراولة", "كوب وربع", 60, 15, 0, 0, 0, 0, 0, id39, foodType);
                success39 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //رمان
            byte[] img40 = convertDrawableToByteArray(R.drawable.d22);
            FoodModel food40 = new FoodModel("رمان", "", img40, 250);
            long id40 = foodTableOperations.insertFoodData(food40);
            if (id40 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("رمان", "كوب", 200, 35, 0, 0, 0, 0, 0, id40, foodType);
                success40 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //تمر (3 حبات)
            byte[] img41 = convertDrawableToByteArray(R.drawable.d23);
            FoodModel food41 = new FoodModel("تمر", "", img41, 30);
            long id41 = foodTableOperations.insertFoodData(food41);
            if (id41 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("تمر", "صغير", 60, 15, 0, 0, 0, 0, 0, id41, foodType);
                success41 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food42 = new FoodModel("تمر", "", 70);
            long id42 = foodTableOperations.insertFoodData(food42);
            if (id42 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("تمر", "كبير", 120, 30, 0, 0, 0, 0, 0, id42, foodType);
                success42 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //تمر (5 حبات)
            byte[] img43 = convertDrawableToByteArray(R.drawable.d24);
            FoodModel food43 = new FoodModel("تمر", "", img43, 50);
            long id43 = foodTableOperations.insertFoodData(food43);
            if (id43 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("تمر", "صغير", 100, 25, 0, 0, 0, 0, 0, id43, foodType);
                success43 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food44 = new FoodModel("تمر", "", 100);
            long id44 = foodTableOperations.insertFoodData(food44);
            if (id44 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("تمر", "كبير", 200, 50, 0, 0, 0, 0, 0, id44, foodType);
                success44 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //تمر (7 حبات)
            byte[] img45 = convertDrawableToByteArray(R.drawable.d25);
            FoodModel food45 = new FoodModel("تمر", "", img45, 70);
            long id45 = foodTableOperations.insertFoodData(food45);
            if (id45 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("تمر", "صغير", 150, 35, 0, 0, 0, 0, 0, id45, foodType);
                success45 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food46 = new FoodModel("تمر", "", 170);
            long id46 = foodTableOperations.insertFoodData(food46);
            if (id46 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("تمر", "كبير", 300, 70, 0, 0, 0, 0, 0, id46, foodType);
                success46 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //بلح (3 حبات)
            byte[] img47 = convertDrawableToByteArray(R.drawable.d26);
            FoodModel food47 = new FoodModel("بلح", "", img47, 40);
            long id47 = foodTableOperations.insertFoodData(food47);
            if (id47 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("بلح", "3 حبات", 60, 15, 0, 0, 0, 0, 0, id47, foodType);
                success47 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //بلح (5 حبات)
            byte[] img48 = convertDrawableToByteArray(R.drawable.d27);
            FoodModel food48 = new FoodModel("بلح", "", img48, 70);
            long id48 = foodTableOperations.insertFoodData(food48);
            if (id48 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("بلح", "5 حبات", 100, 25, 0, 0, 0, 0, 0, id48, foodType);
                success48 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //بلح (7 حبات)
            byte[] img49 = convertDrawableToByteArray(R.drawable.d28);
            FoodModel food49 = new FoodModel("بلح", "", img49, 100);
            long id49 = foodTableOperations.insertFoodData(food49);
            if (id49 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("بلح", "7 حبات", 150, 35, 0, 0, 0, 0, 0, id49, foodType);
                success49 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //كلمنتينا
            byte[] img50 = convertDrawableToByteArray(R.drawable.d29);
            FoodModel food50 = new FoodModel("كلمنتينا", "", img50, 50);
            long id50 = foodTableOperations.insertFoodData(food50);
            if (id50 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("كلمنتينا", "صغير", 15, 3.5, 0, 0, 0, 0, 0, id50, foodType);
                success50 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food51 = new FoodModel("كلمنتينا", "", 100);
            long id51 = foodTableOperations.insertFoodData(food51);
            if (id51 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("كلمنتينا", "وسط", 30, 8, 0, 0, 0, 0, 0, id51, foodType);
                success51 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food52 = new FoodModel("كلمنتينا", "", 140);
            long id52 = foodTableOperations.insertFoodData(food52);
            if (id52 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("كلمنتينا", "كبير", 45, 12, 0, 0, 0, 0, 0, id52, foodType);
                success52 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //قشطة
            byte[] img53 = convertDrawableToByteArray(R.drawable.d30);
            FoodModel food53 = new FoodModel("قشطة", "", img53, 200);
            long id53 = foodTableOperations.insertFoodData(food53);
            if (id53 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("قشطة", "صغير", 0, 0, 0, 0, 0, 0, 0, id53, foodType);
                success53 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food54 = new FoodModel("قشطة", "", 270);
            long id54 = foodTableOperations.insertFoodData(food54);
            if (id54 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("قشطة", "كبير", 0, 0, 0, 0, 0, 0, 0, id54, foodType);
                success54 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //زبيب
            byte[] img55 = convertDrawableToByteArray(R.drawable.d31);
            FoodModel food55 = new FoodModel("زبيب", "", img55, 20);
            long id55 = foodTableOperations.insertFoodData(food55);
            if (id55 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("زبيب", "1 ملعقه", 30, 7.5, 0, 0, 0, 0, 0, id55, foodType);
                success55 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            byte[] img56 = convertDrawableToByteArray(R.drawable.d32);
            FoodModel food56 = new FoodModel("زبيب", "", img56, 35);
            long id56 = foodTableOperations.insertFoodData(food56);
            if (id56 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("زبيب", "2 ملاعق", 60, 15, 0, 0, 0, 0, 0, id56, foodType);
                success56 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            byte[] img57 = convertDrawableToByteArray(R.drawable.d33);
            FoodModel food57 = new FoodModel("زبيب", "", img57, 55);
            long id57 = foodTableOperations.insertFoodData(food57);
            if (id57 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("زبيب", "3 ملاعق", 90, 25, 0, 0, 0, 0, 0, id57, foodType);
                success57 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //تين مجفف
            byte[] img58 = convertDrawableToByteArray(R.drawable.d34);
            FoodModel food58 = new FoodModel("تين مجفف", "", img58, 50);
            long id58 = foodTableOperations.insertFoodData(food58);
            if (id58 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("تين مجفف", "حبتان وسط", 90, 20, 0, 0, 0, 0, 0, id58, foodType);
                success58 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            byte[] img59 = convertDrawableToByteArray(R.drawable.d35);
            FoodModel food59 = new FoodModel("تين مجفف", "", img59, 120);
            long id59 = foodTableOperations.insertFoodData(food59);
            if (id59 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("تين مجفف", "5 حبات وسط", 200, 50, 0, 0, 0, 0, 0, id59, foodType);
                success59 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //فواكه  مجفف
            byte[] img60 = convertDrawableToByteArray(R.drawable.d36);
            FoodModel food60 = new FoodModel("فواكه مجفف", "", img60, 30);
            long id60 = foodTableOperations.insertFoodData(food60);
            if (id60 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("فواكه مجفف", "ربع كوب", 50, 12, 0, 0, 0, 0, 0, id60, foodType);
                success60 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            byte[] img61 = convertDrawableToByteArray(R.drawable.d37);
            FoodModel food61 = new FoodModel("فواكه مجفف", "", img61, 60);
            long id61 = foodTableOperations.insertFoodData(food61);
            if (id61 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("فواكه مجفف", "نصف كوب", 100, 25, 0, 0, 0, 0, 0, id61, foodType);
                success61 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            // صبر أو التين الشوكي
            byte[] img62 = convertDrawableToByteArray(R.drawable.d38);
            FoodModel food62 = new FoodModel("صبر أو التين الشوكي", "", img62, 35);
            long id62 = foodTableOperations.insertFoodData(food62);
            if (id62 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("صبر أو التين الشوكي", "صغير", 100, 25, 0, 0, 0, 0, 0, id62, foodType);
                success62 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //فرسمون (كاكا)
            byte[] img63 = convertDrawableToByteArray(R.drawable.d39);
            FoodModel food63 = new FoodModel("فرسمون (كاكا)", "", img63, 90);
            long id63 = foodTableOperations.insertFoodData(food63);
            if (id63 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("فرسمون (كاكا)", "صغير", 80, 16, 0, 0, 0, 0, 0, id63, foodType);
                success63 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food64 = new FoodModel("فرسمون (كاكا)", "", 130);
            long id64 = foodTableOperations.insertFoodData(food64);
            if (id64 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("فرسمون (كاكا)", "وسط", 110, 25, 0, 0, 0, 0, 0, id64, foodType);
                success64 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food65 = new FoodModel("فرسمون (كاكا)", "", 170);
            long id65 = foodTableOperations.insertFoodData(food65);
            if (id65 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("فرسمون (كاكا)", "كبير", 150, 30, 0, 0, 0, 0, 0, id65, foodType);
                success65 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //جوافه
            byte[] img66 = convertDrawableToByteArray(R.drawable.d40);
            FoodModel food66 = new FoodModel("جوافه", "", img66, 70);
            long id66 = foodTableOperations.insertFoodData(food66);
            if (id66 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("جوافه", "صغير", 60, 8, 0, 0, 0, 0, 0, id66, foodType);
                success66 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food67 = new FoodModel("جوافه", "", 100);
            long id67 = foodTableOperations.insertFoodData(food67);
            if (id67 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("جوافه", "صغير", 80, 12, 0, 0, 0, 0, 0, id67, foodType);
                success67 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food68 = new FoodModel("جوافه", "", 150);
            long id68 = foodTableOperations.insertFoodData(food68);
            if (id68 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("جوافه", "وسط", 120, 18, 0, 0, 0, 0, 0, id68, foodType);
                success68 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food69 = new FoodModel("جوافه", "", 175);
            long id69 = foodTableOperations.insertFoodData(food69);
            if (id69 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("جوافه", "كبير", 140, 22, 0, 0, 0, 0, 0, id69, foodType);
                success69 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            //فاكهة النجمة
            byte[] img70 = convertDrawableToByteArray(R.drawable.d41);
            FoodModel food70 = new FoodModel("فاكهة النجمة", "", img70, 30);
            long id70 = foodTableOperations.insertFoodData(food70);
            if (id70 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("فاكهة النجمة", "صغير", 7.5, 2, 0, 0, 0, 0, 0, id70, foodType);
                success70 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food71 = new FoodModel("فاكهة النجمة", "", 60);
            long id71 = foodTableOperations.insertFoodData(food71);
            if (id71 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("فاكهة النجمة", "وسط", 15, 4, 0, 0, 0, 0, 0, id71, foodType);
                success71 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food72 = new FoodModel("فاكهة النجمة", "", 70);
            long id72 = foodTableOperations.insertFoodData(food72);
            if (id72 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("فاكهة النجمة", "وسط", 18, 4, 0, 0, 0, 0, 0, id72, foodType);
                success72 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food73 = new FoodModel("فاكهة النجمة", "", 100);
            long id73 = foodTableOperations.insertFoodData(food73);
            if (id73 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("فاكهة النجمة", "كبير", 25, 6, 0, 0, 0, 0, 0, id73, foodType);
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
                FoodDetailsModel foodModel2 = new FoodDetailsModel("خبز أبيض", "وسط", 200, 40, 7, 0, 0, 0, 0, id2_1, foodType);
                success2_1 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img2_2 = convertDrawableToByteArray(R.drawable.a4);
            FoodModel food2_2 = new FoodModel("خبز أبيض", "", img2_2, 150);
            long id2_2 = foodTableOperations.insertFoodData(food2_2);
            if (id2_2 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("خبز أبيض", "كبير", 350, 70, 12, 0.5, 0, 0, 0, id2_2, foodType);
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
                FoodDetailsModel foodModel2 = new FoodDetailsModel("خبز أسمر", "كبير", 380, 70, 14.5, 5, 0, 0, 0, id3_1, foodType);
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
                FoodDetailsModel foodModel7 = new FoodDetailsModel("خبز فينو ابيض", "وسط", 260, 50, 10, 3, 0, 0, 0, id7_1, foodType);
                success7_1 = foodDetailsTableOperations.insertFoodData(foodModel7);
            }
            byte[] img7_2 = convertDrawableToByteArray(R.drawable.a12);
            FoodModel food7_2 = new FoodModel("خبز فينو ابيض", "", img7_2, 100);
            long id7_2 = foodTableOperations.insertFoodData(food7_2);
            if (id7_2 > 0) {
                FoodDetailsModel foodModel7 = new FoodDetailsModel("خبز فينو ابيض", "وسط", 290, 55, 10, 3.5, 0, 0, 0, id7_2, foodType);
                success7_2 = foodDetailsTableOperations.insertFoodData(foodModel7);
            }
            byte[] img7_3 = convertDrawableToByteArray(R.drawable.a13);
            FoodModel food7_3 = new FoodModel("خبز فينو ابيض", "", img7_3, 130);
            long id7_3 = foodTableOperations.insertFoodData(food7_3);
            if (id7_3 > 0) {
                FoodDetailsModel foodModel7 = new FoodDetailsModel("خبز فينو ابيض", "كبير", 340, 65, 12, 4, 0, 0, 0, id7_3, foodType);
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
                FoodDetailsModel foodModel9 = new FoodDetailsModel("خبز برجر ابيض", "وسط", 300, 60, 12, 4, 0, 0, 0, id9_1, foodType);
                success9_1 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            byte[] img9_2 = convertDrawableToByteArray(R.drawable.a17);
            FoodModel food9_2 = new FoodModel("خبز برجر ابيض", "", img9_2, 130);
            long id9_2 = foodTableOperations.insertFoodData(food9_2);
            if (id9_2 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("خبز برجر ابيض", "كبير", 35, 65, 12, 4, 0, 0, 0, id9_2, foodType);
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
                FoodDetailsModel foodModel11 = new FoodDetailsModel("خبز توست", "أسمر", 70, 12, 2, 1, 0, 0, 0, id11_1, foodType);
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

    // معجنات
    public boolean insertPastryFoodDetails() {

        // do insert all pastry data in database for first time
        try {
            FoodDetailsTableOperations foodDetailsTableOperations = new FoodDetailsTableOperations(context);
            FoodTableOperations foodTableOperations = new FoodTableOperations(context);

            boolean success = false, success_1 = false, success_2 = false, success2 = false, success2_1 = false, success2_2 = false, success3 = false, success3_1 = false,
                    success3_2 = false, success4 = false, success4_1 = false, success4_2 = false, success5 = false, success5_1 = false, success5_2 = false, success6 = false,
                    success6_1 = false, success7 = false, success7_1 = false, success8 = false, success8_1 = false, success9 = false, success9_1 = false, success10 = false,
                    success10_1 = false, success10_2 = false, success11 = false, success11_1 = false, success11_2 = false, success12 = false, success12_1 = false,
                    success12_2 = false, success12_3 = false;

            // معجنات
            // pastry
            String foodType = "معجنات";
            byte[] img = convertDrawableToByteArray(R.drawable.a22);
            FoodModel food1 = new FoodModel("مناقيش بيض (قدح)", "", img, 60);
            long id = foodTableOperations.insertFoodData(food1);
            if (id > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("مناقيش بيض (قدح)", "صغير", 130, 16, 7, 4, 0, 0, 0, id, foodType);
                success = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food1_1 = new FoodModel("مناقيش بيض (قدح)", "", 80);
            long id_1 = foodTableOperations.insertFoodData(food1_1);
            if (id_1 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("مناقيش بيض (قدح)", "وسط", 170, 20, 9, 5, 0, 0, 0, id_1, foodType);
                success_1 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food1_2 = new FoodModel("مناقيش بيض (قدح)", "", 100);
            long id_2 = foodTableOperations.insertFoodData(food1_2);
            if (id_2 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("مناقيش بيض (قدح)", "كبير", 220, 27, 12, 6, 0, 0, 0, id_2, foodType);
                success_2 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            byte[] img2 = convertDrawableToByteArray(R.drawable.a23);
            FoodModel food2 = new FoodModel("مناقيش جبنة بيضاء", "", img2, 60);
            long id2 = foodTableOperations.insertFoodData(food2);
            if (id2 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("مناقيش جبنة بيضاء", "صغير", 180, 20, 10, 6, 0, 0, 0, id2, foodType);
                success2 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            FoodModel food2_1 = new FoodModel("مناقيش جبنة بيضاء", "", 80);
            long id2_1 = foodTableOperations.insertFoodData(food2_1);
            if (id2_1 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("مناقيش جبنة بيضاء", "وسط", 250, 30, 12, 8, 0, 0, 0, id2_1, foodType);
                success2_1 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            FoodModel food2_2 = new FoodModel("مناقيش جبنة بيضاء", "", 100);
            long id2_2 = foodTableOperations.insertFoodData(food2_2);
            if (id2_2 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("مناقيش جبنة بيضاء", "كبير", 300, 35, 15, 10, 0, 0, 0, id2_2, foodType);
                success2_2 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img3 = convertDrawableToByteArray(R.drawable.a24);
            FoodModel food3 = new FoodModel("مناقيش زعتر دقه", "", img3, 40);
            long id3 = foodTableOperations.insertFoodData(food3);
            if (id3 > 0) {
                FoodDetailsModel foodModel3 = new FoodDetailsModel("مناقيش زعتر دقه", "صغير", 120, 15, 4, 5, 0, 0, 0, id3, foodType);
                success3 = foodDetailsTableOperations.insertFoodData(foodModel3);
            }
            FoodModel food3_1 = new FoodModel("مناقيش زعتر دقه", "", 60);
            long id3_1 = foodTableOperations.insertFoodData(food3_1);
            if (id3_1 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("مناقيش زعتر دقه", "وسط", 170, 20, 6, 7, 0, 0, 0, id3_1, foodType);
                success3_1 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            FoodModel food3_2 = new FoodModel("مناقيش زعتر دقه", "", 80);
            long id3_2 = foodTableOperations.insertFoodData(food3_2);
            if (id3_2 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("مناقيش زعتر دقه", "كبير", 230, 30, 8, 10, 0, 0, 0, id3_2, foodType);
                success3_2 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img4 = convertDrawableToByteArray(R.drawable.a25);
            FoodModel food4 = new FoodModel("مناقيش لحمة سادة", "", img4, 60);
            long id4 = foodTableOperations.insertFoodData(food4);
            if (id4 > 0) {
                FoodDetailsModel foodModel4 = new FoodDetailsModel("مناقيش لحمة سادة", "صغير", 180, 25, 8, 6, 0, 0, 0, id4, foodType);
                success4 = foodDetailsTableOperations.insertFoodData(foodModel4);
            }
            FoodModel food4_1 = new FoodModel("مناقيش لحمة سادة", "", 80);
            long id4_1 = foodTableOperations.insertFoodData(food4_1);
            if (id4_1 > 0) {
                FoodDetailsModel foodModel4 = new FoodDetailsModel("مناقيش لحمة سادة", "وسط", 250, 30, 12, 8, 0, 0, 0, id4_1, foodType);
                success4_1 = foodDetailsTableOperations.insertFoodData(foodModel4);
            }
            FoodModel food4_2 = new FoodModel("مناقيش لحمة سادة", "", 120);
            long id4_2 = foodTableOperations.insertFoodData(food4_2);
            if (id4_2 > 0) {
                FoodDetailsModel foodModel4 = new FoodDetailsModel("مناقيش لحمة سادة", "كبير", 300, 35, 15, 10, 0, 0, 0, id4_2, foodType);
                success4_2 = foodDetailsTableOperations.insertFoodData(foodModel4);
            }
            byte[] img5 = convertDrawableToByteArray(R.drawable.a26);
            FoodModel food5 = new FoodModel("مناقيش لحمة مع بندورة", "", img5, 70);
            long id5 = foodTableOperations.insertFoodData(food5);
            if (id5 > 0) {
                FoodDetailsModel foodModel5 = new FoodDetailsModel("مناقيش لحمة مع بندورة", "صغير", 200, 30, 9, 7, 0, 0, 0, id5, foodType);
                success5 = foodDetailsTableOperations.insertFoodData(foodModel5);
            }
            FoodModel food5_1 = new FoodModel("مناقيش لحمة مع بندورة", "", 90);
            long id5_1 = foodTableOperations.insertFoodData(food5_1);
            if (id5_1 > 0) {
                FoodDetailsModel foodModel5 = new FoodDetailsModel("مناقيش لحمة مع بندورة", "وسط", 270, 40, 12, 9, 0, 0, 0, id5_1, foodType);
                success5_1 = foodDetailsTableOperations.insertFoodData(foodModel5);
            }
            FoodModel food5_2 = new FoodModel("مناقيش لحمة مع بندورة", "", 120);
            long id5_2 = foodTableOperations.insertFoodData(food5_2);
            if (id5_2 > 0) {
                FoodDetailsModel foodModel5 = new FoodDetailsModel("مناقيش لحمة مع بندورة", "كبير", 350, 50, 16, 12, 0, 0, 0, id5_2, foodType);
                success5_2 = foodDetailsTableOperations.insertFoodData(foodModel5);
            }
            byte[] img6 = convertDrawableToByteArray(R.drawable.a27);
            FoodModel food6 = new FoodModel("مطبق سبانخ", "", img6, 800);
            long id6 = foodTableOperations.insertFoodData(food6);
            if (id6 > 0) {
                FoodDetailsModel foodModel6 = new FoodDetailsModel("مطبق سبانخ", "صغير", 170, 25, 5, 6, 0, 0, 0, id6, foodType);
                success6 = foodDetailsTableOperations.insertFoodData(foodModel6);
            }
            FoodModel food6_1 = new FoodModel("مطبق سبانخ", "", 120);
            long id6_1 = foodTableOperations.insertFoodData(food6_1);
            if (id6_1 > 0) {
                FoodDetailsModel foodModel6 = new FoodDetailsModel("مطبق سبانخ", "كبير", 250, 35, 8, 9, 0, 0, 0, id6_1, foodType);
                success6_1 = foodDetailsTableOperations.insertFoodData(foodModel6);
            }
            byte[] img7 = convertDrawableToByteArray(R.drawable.a28);
            FoodModel food7 = new FoodModel("مطبق جبنة بيضاء دوائر", "", img7, 60);
            long id7 = foodTableOperations.insertFoodData(food7);
            if (id7 > 0) {
                FoodDetailsModel foodModel7 = new FoodDetailsModel("مطبق جبنة بيضاء دوائر", "", 150, 15, 7, 5, 0, 0, 0, id7, foodType);
                success7 = foodDetailsTableOperations.insertFoodData(foodModel7);
            }
            FoodModel food7_1 = new FoodModel("مطبق جبنة بيضاء دوائر", "", 90);
            long id7_1 = foodTableOperations.insertFoodData(food7_1);
            if (id7_1 > 0) {
                FoodDetailsModel foodModel7 = new FoodDetailsModel("مطبق جبنة بيضاء دوائر", "", 270, 10, 9, 8, 0, 0, 0, id7_1, foodType);
                success7_1 = foodDetailsTableOperations.insertFoodData(foodModel7);
            }
            byte[] img8 = convertDrawableToByteArray(R.drawable.a29);
            FoodModel food8 = new FoodModel("بيتزا دوائر", "", img8, 200);
            long id8 = foodTableOperations.insertFoodData(food8);
            if (id8 > 0) {
                FoodDetailsModel foodModel8 = new FoodDetailsModel("بيتزا دوائر", "صغير", 550, 75, 25, 15, 0, 0, 0, id8, foodType);
                success8 = foodDetailsTableOperations.insertFoodData(foodModel8);
            }
            FoodModel food8_1 = new FoodModel("بيتزا دوائر", "", 370);
            long id8_1 = foodTableOperations.insertFoodData(food8_1);
            if (id8_1 > 0) {
                FoodDetailsModel foodModel8 = new FoodDetailsModel("بيتزا دوائر", "وسط", 1000, 140, 45, 31, 0, 0, 0, id8_1, foodType);
                success8_1 = foodDetailsTableOperations.insertFoodData(foodModel8);
            }
            byte[] img9 = convertDrawableToByteArray(R.drawable.a30);
            FoodModel food9 = new FoodModel("بيتزا مثلثات", "", img9, 80);
            long id9 = foodTableOperations.insertFoodData(food9);
            if (id9 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("بيتزا مثلثات", "صغير", 220, 30, 10, 6, 0, 0, 0, id9, foodType);
                success9 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            byte[] img9_1 = convertDrawableToByteArray(R.drawable.a31);
            FoodModel food9_1 = new FoodModel("بيتزا مثلثات", "", img9_1, 160);
            long id9_1 = foodTableOperations.insertFoodData(food9_1);
            if (id9_1 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("بيتزا مثلثات", "وسط", 440, 60, 20, 12, 0, 0, 0, id9_1, foodType);
                success9_1 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            byte[] img10 = convertDrawableToByteArray(R.drawable.a32);
            FoodModel food10 = new FoodModel("مطبق جبنة بيضاء و زعتر اخضر", "", img10, 70);
            long id10 = foodTableOperations.insertFoodData(food10);
            if (id10 > 0) {
                FoodDetailsModel foodModel10 = new FoodDetailsModel("مطبق جبنة بيضاء و زعتر اخضر", "", 200, 20, 10, 7, 0, 0, 0, id10, foodType);
                success10 = foodDetailsTableOperations.insertFoodData(foodModel10);
            }
            FoodModel food10_1 = new FoodModel("مطبق جبنة بيضاء و زعتر اخضر", "", 90);
            long id10_1 = foodTableOperations.insertFoodData(food10_1);
            if (id10_1 > 0) {
                FoodDetailsModel foodModel10 = new FoodDetailsModel("مطبق جبنة بيضاء و زعتر اخضر", "", 265, 30, 14, 9, 0, 0, 0, id10_1, foodType);
                success10_1 = foodDetailsTableOperations.insertFoodData(foodModel10);
            }
            FoodModel food10_2 = new FoodModel("مطبق جبنة بيضاء و زعتر اخضر", "", 120);
            long id10_2 = foodTableOperations.insertFoodData(food10_2);
            if (id10_2 > 0) {
                FoodDetailsModel foodModel10 = new FoodDetailsModel("مطبق جبنة بيضاء و زعتر اخضر", "", 350, 40, 18, 11, 0, 0, 0, id10_2, foodType);
                success10_2 = foodDetailsTableOperations.insertFoodData(foodModel10);
            }
            byte[] img11 = convertDrawableToByteArray(R.drawable.a33);
            FoodModel food11 = new FoodModel("مطبق جبنة صفراء وزيتون اسود", "", img11, 70);
            long id11 = foodTableOperations.insertFoodData(food11);
            if (id11 > 0) {
                FoodDetailsModel foodModel11 = new FoodDetailsModel("مطبق جبنة صفراء وزيتون اسود", "", 200, 20, 10, 9, 0, 0, 0, id11, foodType);
                success11 = foodDetailsTableOperations.insertFoodData(foodModel11);
            }
            FoodModel food11_1 = new FoodModel("مطبق جبنة صفراء وزيتون اسود", "", 90);
            long id11_1 = foodTableOperations.insertFoodData(food11_1);
            if (id11_1 > 0) {
                FoodDetailsModel foodModel11 = new FoodDetailsModel("مطبق جبنة صفراء وزيتون اسود", "", 265, 30, 15, 12, 0, 0, 0, id11_1, foodType);
                success11_1 = foodDetailsTableOperations.insertFoodData(foodModel11);
            }
            FoodModel food11_2 = new FoodModel("مطبق جبنة صفراء وزيتون اسود", "", 120);
            long id11_2 = foodTableOperations.insertFoodData(food11_2);
            if (id11_2 > 0) {
                FoodDetailsModel foodModel11 = new FoodDetailsModel("مطبق جبنة صفراء وزيتون اسود", "", 350, 40, 18, 15, 0, 0, 0, id11_2, foodType);
                success11_2 = foodDetailsTableOperations.insertFoodData(foodModel11);
            }
            byte[] img12 = convertDrawableToByteArray(R.drawable.a34);
            FoodModel food12 = new FoodModel("مطبق زعتر اخضر", "", img12, 90);
            long id12 = foodTableOperations.insertFoodData(food12);
            if (id12 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مطبق زعتر اخضر", "صغير", 270, 35, 7, 10, 0, 0, 0, id12, foodType);
                success12 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            FoodModel food12_1 = new FoodModel("مطبق زعتر اخضر", "", 150);
            long id12_1 = foodTableOperations.insertFoodData(food12_1);
            if (id12_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مطبق زعتر اخضر", "صغير", 450, 60, 12, 16, 0, 0, 0, id12_1, foodType);
                success12_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img12_2 = convertDrawableToByteArray(R.drawable.a35);
            FoodModel food12_2 = new FoodModel("مطبق زعتر اخضر", "", img12_2, 350);
            long id12_2 = foodTableOperations.insertFoodData(food12_2);
            if (id12_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مطبق زعتر اخضر", "وسط", 1000, 150, 30, 40, 0, 0, 0, id12_2, foodType);
                success12_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img12_3 = convertDrawableToByteArray(R.drawable.a36);
            FoodModel food12_3 = new FoodModel("مطبق زعتر اخضر", "", img12_3, 520);
            long id12_3 = foodTableOperations.insertFoodData(food12_3);
            if (id12_3 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مطبق زعتر اخضر", "كبير", 1500, 200, 45, 60, 0, 0, 0, id12_3, foodType);
                success12_3 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            if (success && success_1 && success_2 && success2 && success2_1 && success2_2 && success3 && success3_1 && success3_2 && success4 && success4_1 && success4_2
                    && success5 && success5_1 && success5_2 && success6 && success6_1 && success7 && success7_1
                    && success8 && success8_1 && success9 && success9_1 && success10 && success10_1 && success10_2 &&
                    success11 && success11_1 && success11_2 && success12 && success12_1 && success12_2 && success12_3) {
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
                    success9 = false, success9_1 = false, success9_2 = false, success9_3 = false, success10 = false, success11 = false, success11_1 = false,
                    success12 = false, success13 = false, success13_1 = false, success13_2 = false, success14 = false, success15 = false, success16 = false,
                    success17 = false, success18 = false, success18_1 = false, success18_2 = false;

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
                FoodDetailsModel foodModel2 = new FoodDetailsModel("صدر دجاج حجم كبير", "كبير", 270, 0.0, 35, 15, 0, 0, 0, id2_1, foodType);
                success2_1 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img2_2 = convertDrawableToByteArray(R.drawable.i4);
            FoodModel food2_2 = new FoodModel("فخذة دجاج حجم صغير", "", img2_2, 70);
            long id2_2 = foodTableOperations.insertFoodData(food2_2);
            if (id2_2 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("فخذة دجاج حجم صغير", "صغير", 180, 0.0, 17, 12, 0, 0, 0, id2_2, foodType);
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
                FoodDetailsModel foodModel2 = new FoodDetailsModel("فخذة دجاج حجم كبير ", "كبير", 260, 0.0, 25, 18, 0, 0, 0, id3_1, foodType);
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
                FoodDetailsModel foodModel7 = new FoodDetailsModel("قطعة لحم عجل", "وسط", 200, 0.0, 20, 15, 0, 0, 0, id7_1, foodType);
                success7_1 = foodDetailsTableOperations.insertFoodData(foodModel7);
            }
            byte[] img7_2 = convertDrawableToByteArray(R.drawable.i12);
            FoodModel food7_2 = new FoodModel("قطعة لحم عجل", "", img7_2, 150);
            long id7_2 = foodTableOperations.insertFoodData(food7_2);
            if (id7_2 > 0) {
                FoodDetailsModel foodModel7 = new FoodDetailsModel("قطعة لحم عجل", "كبير", 370, 0.0, 35, 25, 0, 0, 0, id7_2, foodType);
                success7_2 = foodDetailsTableOperations.insertFoodData(foodModel7);
            }
            byte[] img7_3 = convertDrawableToByteArray(R.drawable.i13);
            FoodModel food7_3 = new FoodModel("موزات خروف", "", img7_3, 115);
            long id7_3 = foodTableOperations.insertFoodData(food7_3);
            if (id7_3 > 0) {
                FoodDetailsModel foodModel7 = new FoodDetailsModel("موزات خروف", "وسط", 300, 0.0, 30, 20, 0, 0, 0, id7_3, foodType);
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
                FoodDetailsModel foodModel9 = new FoodDetailsModel("كبد دجاج", "2 ملعقه", 160, 8, 15, 6, 0, 0, 0, id9_1, foodType);
                success9_1 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            FoodModel food9_2 = new FoodModel("كبد دجاج", "", 100);
            long id9_2 = foodTableOperations.insertFoodData(food9_2);
            if (id9_2 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("كبد دجاج", "3 ملاعق", 250, 12, 25, 9, 0, 0, 0, id9_2, foodType);
                success9_2 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            byte[] img9_3 = convertDrawableToByteArray(R.drawable.i17);
            FoodModel food9_3 = new FoodModel("كبد خروف", "", img9_3, 80);
            long id9_3 = foodTableOperations.insertFoodData(food9_3);
            if (id9_3 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("كبد خروف", "2 ملعقه", 200, 10, 20, 8, 0, 0, 0, id9_3, foodType);
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
                FoodDetailsModel foodModel11 = new FoodDetailsModel("فشة خروف (رئتين)", "2 ملعقة", 60, 0.0, 10, 2, 0, 0, 0, id11_1, foodType);
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
                FoodDetailsModel foodModel13 = new FoodDetailsModel("سمك سلمون", "وسط", 280, 0.0, 26, 20, 0, 0, 0, id13_1, foodType);
                success13_1 = foodDetailsTableOperations.insertFoodData(foodModel13);
            }
            byte[] img13_2 = convertDrawableToByteArray(R.drawable.i23);
            FoodModel food13_2 = new FoodModel("سمك سلمون", "", img13_2, 170);
            long id13_2 = foodTableOperations.insertFoodData(food13_2);
            if (id13_2 > 0) {
                FoodDetailsModel foodModel13 = new FoodDetailsModel("سمك سلمون", "كبير", 430, 0.0, 40, 30, 0, 0, 0, id13_2, foodType);
                success13_2 = foodDetailsTableOperations.insertFoodData(foodModel13);
            }
            byte[] img14 = convertDrawableToByteArray(R.drawable.i25);
            FoodModel food14 = new FoodModel("سمك دينيس", "", img14, 125);
            long id14 = foodTableOperations.insertFoodData(food14);
            if (id14 > 0) {
                FoodDetailsModel foodModel13 = new FoodDetailsModel("سمك دينيس", "متوسطة", 300, 0.0, 30, 20, 0, 0, 0, id14, foodType);
                success14 = foodDetailsTableOperations.insertFoodData(foodModel13);
            }
            byte[] img15 = convertDrawableToByteArray(R.drawable.i26);
            FoodModel food15 = new FoodModel("سمك سردين", "", img15, 17);
            long id15 = foodTableOperations.insertFoodData(food15);
            if (id15 > 0) {
                FoodDetailsModel foodModel13 = new FoodDetailsModel("سمك سردين", "صغير", 45, 0.0, 4, 3, 0, 0, 0, id15, foodType);
                success15 = foodDetailsTableOperations.insertFoodData(foodModel13);
            }
            byte[] img16 = convertDrawableToByteArray(R.drawable.i27);
            FoodModel food16 = new FoodModel("سمك", "", img16, 60);
            long id16 = foodTableOperations.insertFoodData(food16);
            if (id16 > 0) {
                FoodDetailsModel foodModel13 = new FoodDetailsModel("سمك", "-", 150, 0.0, 14, 10, 0, 0, 0, id16, foodType);
                success16 = foodDetailsTableOperations.insertFoodData(foodModel13);
            }
            byte[] img17 = convertDrawableToByteArray(R.drawable.i28);
            FoodModel food17 = new FoodModel("سمك", "", img17, 90);
            long id17 = foodTableOperations.insertFoodData(food17);
            if (id17 > 0) {
                FoodDetailsModel foodModel13 = new FoodDetailsModel("سمك", "-", 225, 0.0, 20, 15, 0, 0, 0, id17, foodType);
                success17 = foodDetailsTableOperations.insertFoodData(foodModel13);
            }
            byte[] img18 = convertDrawableToByteArray(R.drawable.i29);
            FoodModel food18 = new FoodModel("سمك مقطع", "", img18, 80);
            long id18 = foodTableOperations.insertFoodData(food18);
            if (id18 > 0) {
                FoodDetailsModel foodModel13 = new FoodDetailsModel("سمك مقطع", "ذيل سمكة كبيرة", 200, 0.0, 18, 14, 0, 0, 0, id18, foodType);
                success18 = foodDetailsTableOperations.insertFoodData(foodModel13);
            }
            byte[] img18_1 = convertDrawableToByteArray(R.drawable.i30);
            FoodModel food18_1 = new FoodModel("سمك مقطع", "", img18_1, 60);
            long id18_1 = foodTableOperations.insertFoodData(food18_1);
            if (id18_1 > 0) {
                FoodDetailsModel foodModel13 = new FoodDetailsModel("سمك مقطع", "راس سمكة كبيرة", 140, 0.0, 12, 9.5, 0, 0, 0, id18_1, foodType);
                success18_1 = foodDetailsTableOperations.insertFoodData(foodModel13);
            }
            byte[] img18_2 = convertDrawableToByteArray(R.drawable.i31);
            FoodModel food18_2 = new FoodModel("سمك مقطع", "", img18_2, 125);
            long id18_2 = foodTableOperations.insertFoodData(food18_2);
            if (id18_2 > 0) {
                FoodDetailsModel foodModel13 = new FoodDetailsModel("سمك مقطع", "وسط سمكة مقطعة", 300, 0.0, 28, 20, 0, 0, 0, id18_2, foodType);
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
                    success9 = false, success9_2 = false;

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
                FoodDetailsModel foodModel = new FoodDetailsModel("حليب بنكهة الكاكاوم", "كوب", 125, 15, 6, 4, 0, 0, 0, id_1, foodType);
                success_1 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food1_2 = new FoodModel("حليب بنكهة الفراولة", "", img, 200);
            long id_2 = foodTableOperations.insertFoodData(food1_2);
            if (id_2 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("حليب بنكهة الفراولة", "كوب", 140, 25, 5, 3, 0, 0, 0, id_2, foodType);
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
                FoodDetailsModel foodModel2 = new FoodDetailsModel("لبن", "كوب", 150, 12, 8, 8, 0, 0, 0, id2_1, foodType);
                success2_1 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img2_2 = convertDrawableToByteArray(R.drawable.a4);
            FoodModel food2_2 = new FoodModel("لبن بنكهة الفراولة", "", img2_2, 220);
            long id2_2 = foodTableOperations.insertFoodData(food2_2);
            if (id2_2 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("لبن بنكهة الفراولة", "كوب", 180, 30, 7, 3, 0, 0, 0, id2_2, foodType);
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
                FoodDetailsModel foodModel2 = new FoodDetailsModel("لبنه", "2 ملعقة", 75, 0, 7, 5, 0, 0, 0, id3_1, foodType);
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
                FoodDetailsModel foodModel7 = new FoodDetailsModel("جبن كريمي (دهن)", "2 ملعقة", 130, 0.5, 3.5, 12.5, 0, 0, 0, id7_1, foodType);
                success7_1 = foodDetailsTableOperations.insertFoodData(foodModel7);
            }
            FoodModel food7_2 = new FoodModel("جبن كريمي (دهن)", "", 80);
            long id7_2 = foodTableOperations.insertFoodData(food7_2);
            if (id7_2 > 0) {
                FoodDetailsModel foodModel7 = new FoodDetailsModel("جبن كريمي (دهن)", "4 ملاعق", 260, 1, 7, 25, 0, 0, 0, id7_2, foodType);
                success7_2 = foodDetailsTableOperations.insertFoodData(foodModel7);
            }
            byte[] img7_3 = convertDrawableToByteArray(R.drawable.a11);
            FoodModel food7_3 = new FoodModel("جبنة موتزريلا", "", img7_3, 30);
            long id7_3 = foodTableOperations.insertFoodData(food7_3);
            if (id7_3 > 0) {
                FoodDetailsModel foodModel7 = new FoodDetailsModel("جبنة موتزريلا", "كوب", 100, 2.5, 5, 8, 0, 0, 0, id7_3, foodType);
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
                FoodDetailsModel foodModel9 = new FoodDetailsModel("عجة", "وسط", 150, 6, 8, 10, 0, 0, 0, id9_2, foodType);
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

    public boolean insertDrinksFoodDetails() {

        // do insert all drinks data in database for first time
        try {
            FoodDetailsTableOperations foodDetailsTableOperations = new FoodDetailsTableOperations(context);
            FoodTableOperations foodTableOperations = new FoodTableOperations(context);

            boolean success = false, success2 = false, success3 = false, success4 = false, success5 = false, success6 = false, success7 = false, success8 = false,
                    success9 = false;

            // العصائر و المشروبات
            // drinks
            String foodType = "العصائر و المشروبات";
            byte[] img = convertDrawableToByteArray(R.drawable.l1);
            FoodModel food1 = new FoodModel("عصير تمر هنديم", "", img, 200);
            long id = foodTableOperations.insertFoodData(food1);
            if (id > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("عصير تمر هندي", "كوب", 80, 20, 2, 2, 0, 0, 0, id, foodType);
                success = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            byte[] img2 = convertDrawableToByteArray(R.drawable.l2);
            FoodModel food2 = new FoodModel("عصير خروب", "", img2, 200);
            long id2 = foodTableOperations.insertFoodData(food2);
            if (id2 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("عصير خروب", "كوب", 150, 30, 0, 0, 0, 0, 0, id2, foodType);
                success2 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img3 = convertDrawableToByteArray(R.drawable.l3);
            FoodModel food3 = new FoodModel("عصير كركديه", "", img3, 200);
            long id3 = foodTableOperations.insertFoodData(food3);
            if (id3 > 0) {
                FoodDetailsModel foodModel3 = new FoodDetailsModel("عصير كركديه", "كوب", 0.0, 0.0, 0.0, 0.0, 0, 0, 0, id3, foodType);
                success3 = foodDetailsTableOperations.insertFoodData(foodModel3);
            }
            byte[] img4 = convertDrawableToByteArray(R.drawable.l4);
            FoodModel food4 = new FoodModel("كوكتيل فواكه", "", img4, 200);
            long id4 = foodTableOperations.insertFoodData(food4);
            if (id4 > 0) {
                FoodDetailsModel foodModel4 = new FoodDetailsModel("كوكتيل فواكه", "كوب", 120, 30, 0.0, 0.0, 0, 0, 0, id4, foodType);
                success4 = foodDetailsTableOperations.insertFoodData(foodModel4);
            }
            byte[] img5 = convertDrawableToByteArray(R.drawable.l5);
            FoodModel food5 = new FoodModel("عصير مانجا", "", img5, 200);
            long id5 = foodTableOperations.insertFoodData(food5);
            if (id5 > 0) {
                FoodDetailsModel foodModel5 = new FoodDetailsModel("عصير مانجا", "كوب", 200, 50, 1.5, 0.5, 0, 0, 0, id5, foodType);
                success5 = foodDetailsTableOperations.insertFoodData(foodModel5);
            }
            byte[] img6 = convertDrawableToByteArray(R.drawable.l6);
            FoodModel food6 = new FoodModel("عصير جوافه", "", img6, 200);
            long id6 = foodTableOperations.insertFoodData(food6);
            if (id6 > 0) {
                FoodDetailsModel foodModel6 = new FoodDetailsModel("عصير جوافه", "كوب", 70, 15, 1, 60, 0, 0, 0, id6, foodType);
                success6 = foodDetailsTableOperations.insertFoodData(foodModel6);
            }
            byte[] img7 = convertDrawableToByteArray(R.drawable.l7);
            FoodModel food7 = new FoodModel("عصير رمان", "", img7, 200);
            long id7 = foodTableOperations.insertFoodData(food7);
            if (id7 > 0) {
                FoodDetailsModel foodModel7 = new FoodDetailsModel("عصير رمان", "كوب", 130, 30, 0.5, 1, 0, 0, 0, id7, foodType);
                success7 = foodDetailsTableOperations.insertFoodData(foodModel7);
            }
            byte[] img8 = convertDrawableToByteArray(R.drawable.l8);
            FoodModel food8 = new FoodModel("عصير ليمون", "", img8, 200);
            long id8 = foodTableOperations.insertFoodData(food8);
            if (id8 > 0) {
                FoodDetailsModel foodModel8 = new FoodDetailsModel("عصير ليمون", "كوب", 250, 65, 0.5, 0, 0, 0, 0, id8, foodType);
                success8 = foodDetailsTableOperations.insertFoodData(foodModel8);
            }
            byte[] img9 = convertDrawableToByteArray(R.drawable.l9);
            FoodModel food9 = new FoodModel("اعشاب", "", img9, 100);
            long id9 = foodTableOperations.insertFoodData(food9);
            if (id9 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("اعشاب", "نصف كوب", 0.0, 0.0, 0.0, 0.0, 0, 0, 0, id9, foodType);
                success9 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }

            if (success && success2 && success3 && success4 && success5 && success6 && success7 && success8 && success9) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public boolean insertNutsFoodDetails() {

        // do insert all nuts data in database for first time
        try {
            FoodDetailsTableOperations foodDetailsTableOperations = new FoodDetailsTableOperations(context);
            FoodTableOperations foodTableOperations = new FoodTableOperations(context);

            boolean success = false, success_1 = false, success_2 = false, success2 = false, success2_1 = false, success2_2 = false, success3 = false, success3_1 = false,
                    success3_2 = false, success4 = false, success4_1 = false, success4_2 = false, success5 = false, success5_1 = false, success5_2 = false, success6 = false,
                    success6_1 = false, success6_2 = false, success7 = false, success7_1 = false, success7_2 = false, success8 = false, success8_1 = false,
                    success8_2 = false, success9 = false, success9_1 = false, success9_2 = false, success10 = false, success10_1 = false, success10_2 = false, success11 = false,
                    success11_1 = false, success11_2 = false, success12 = false, success12_1 = false, success12_2 = false;

            // المكسرات و البذور
            // nuts
            String foodType = "المكسرات و البذور";
            byte[] img = convertDrawableToByteArray(R.drawable.m1);
            FoodModel food1 = new FoodModel("لوز", "", img, 15);
            long id = foodTableOperations.insertFoodData(food1);
            if (id > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("لوز", "1 ملعقه", 80, 1, 3, 7, 0, 0, 0, id, foodType);
                success = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food1_1 = new FoodModel("لوز", "", img, 30);
            long id_1 = foodTableOperations.insertFoodData(food1_1);
            if (id_1 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("لوز", "2 ملعقة", 160, 2, 6, 14, 0, 0, 0, id_1, foodType);
                success_1 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food1_2 = new FoodModel("لوز", "", img, 45);
            long id_2 = foodTableOperations.insertFoodData(food1_2);
            if (id_2 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("لوز", "3 ملاعق", 240, 3, 9, 21, 0, 0, 0, id_2, foodType);
                success_2 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            byte[] img2 = convertDrawableToByteArray(R.drawable.m2);
            FoodModel food2 = new FoodModel("جوز عين الجمل", "", img2, 12);
            long id2 = foodTableOperations.insertFoodData(food2);
            if (id2 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("جوز عين الجمل", "1 ملعقه", 80, 0.5, 1.5, 8, 0, 0, 0, id2, foodType);
                success2 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            FoodModel food2_1 = new FoodModel("جوز عين الجمل", "", 24);
            long id2_1 = foodTableOperations.insertFoodData(food2_1);
            if (id2_1 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("جوز عين الجمل", "2 ملعقة", 160, 1, 3, 16, 0, 0, 0, id2_1, foodType);
                success2_1 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            FoodModel food2_2 = new FoodModel("جوز عين الجمل", "", 36);
            long id2_2 = foodTableOperations.insertFoodData(food2_2);
            if (id2_2 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("جوز عين الجمل", "3 ملاعق", 240, 1.5, 4.5, 24, 0, 0, 0, id2_2, foodType);
                success2_2 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img3 = convertDrawableToByteArray(R.drawable.m3);
            FoodModel food3 = new FoodModel("كاشو", "", img3, 15);
            long id3 = foodTableOperations.insertFoodData(food3);
            if (id3 > 0) {
                FoodDetailsModel foodModel3 = new FoodDetailsModel("كاشو", "1 ملعقه", 80, 3, 2.5, 6, 0, 0, 0, id3, foodType);
                success3 = foodDetailsTableOperations.insertFoodData(foodModel3);
            }
            FoodModel food3_1 = new FoodModel("كاشو", "", 30);
            long id3_1 = foodTableOperations.insertFoodData(food3_1);
            if (id3_1 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("كاشو", "2 ملعقة", 160, 6, 5, 12, 0, 0, 0, id3_1, foodType);
                success3_1 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            FoodModel food3_2 = new FoodModel("كاشو", "", 45);
            long id3_2 = foodTableOperations.insertFoodData(food3_2);
            if (id3_2 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("كاشو", "3 ملاعق", 240, 9, 7.5, 18, 0, 0, 0, id3_2, foodType);
                success3_2 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img4 = convertDrawableToByteArray(R.drawable.m4);
            FoodModel food4 = new FoodModel("فستق حلبي", "", img4, 15);
            long id4 = foodTableOperations.insertFoodData(food4);
            if (id4 > 0) {
                FoodDetailsModel foodModel4 = new FoodDetailsModel("فستق حلبي", "1 ملعقة", 100, 2, 3, 8, 0, 0, 0, id4, foodType);
                success4 = foodDetailsTableOperations.insertFoodData(foodModel4);
            }
            FoodModel food4_1 = new FoodModel("فستق حلبي", "", 30);
            long id4_1 = foodTableOperations.insertFoodData(food4_1);
            if (id4_1 > 0) {
                FoodDetailsModel foodModel4 = new FoodDetailsModel("فستق حلبي", "2 ملعقة", 200, 4, 6, 16, 0, 0, 0, id4_1, foodType);
                success4_1 = foodDetailsTableOperations.insertFoodData(foodModel4);
            }
            FoodModel food4_2 = new FoodModel("فستق حلبي", "", 45);
            long id4_2 = foodTableOperations.insertFoodData(food4_2);
            if (id4_2 > 0) {
                FoodDetailsModel foodModel4 = new FoodDetailsModel("فستق حلبي", "3 ملاعق", 300, 6, 9, 24, 0, 0, 0, id4_2, foodType);
                success4_2 = foodDetailsTableOperations.insertFoodData(foodModel4);
            }
            byte[] img5 = convertDrawableToByteArray(R.drawable.m5);
            FoodModel food5 = new FoodModel("بندق", "", img5, 15);
            long id5 = foodTableOperations.insertFoodData(food5);
            if (id5 > 0) {
                FoodDetailsModel foodModel5 = new FoodDetailsModel("بندق", "1 ملعقة", 100, 1, 2.5, 10, 0, 0, 0, id5, foodType);
                success5 = foodDetailsTableOperations.insertFoodData(foodModel5);
            }
            FoodModel food5_1 = new FoodModel("بندق", "", 30);
            long id5_1 = foodTableOperations.insertFoodData(food5_1);
            if (id5_1 > 0) {
                FoodDetailsModel foodModel5 = new FoodDetailsModel("بندق", "2 ملعقة", 200, 2, 5, 20, 0, 0, 0, id5_1, foodType);
                success5_1 = foodDetailsTableOperations.insertFoodData(foodModel5);
            }
            FoodModel food5_2 = new FoodModel("بندق", "", 45);
            long id5_2 = foodTableOperations.insertFoodData(food5_2);
            if (id5_2 > 0) {
                FoodDetailsModel foodModel5 = new FoodDetailsModel("بندق", "3 ملاعق", 300, 3, 7.5, 30, 0, 0, 0, id5_2, foodType);
                success5_2 = foodDetailsTableOperations.insertFoodData(foodModel5);
            }
            byte[] img6 = convertDrawableToByteArray(R.drawable.m6);
            FoodModel food6 = new FoodModel("كستناء", "", img6, 30);
            long id6 = foodTableOperations.insertFoodData(food6);
            if (id6 > 0) {
                FoodDetailsModel foodModel6 = new FoodDetailsModel("كستناء", "3 قطع", 50, 10, 1, 0.5, 0, 0, 0, id6, foodType);
                success6 = foodDetailsTableOperations.insertFoodData(foodModel6);
            }
            byte[] img6_1 = convertDrawableToByteArray(R.drawable.m7);
            FoodModel food6_1 = new FoodModel("كستناء", "", img6_1, 50);
            long id6_1 = foodTableOperations.insertFoodData(food6_1);
            if (id6_1 > 0) {
                FoodDetailsModel foodModel6 = new FoodDetailsModel("كستناء", "5 قطع", 80, 15, 1.5, 1, 0, 0, 0, id6_1, foodType);
                success6_1 = foodDetailsTableOperations.insertFoodData(foodModel6);
            }
            byte[] img6_2 = convertDrawableToByteArray(R.drawable.m8);
            FoodModel food6_2 = new FoodModel("كستناء", "", img6_2, 70);
            long id6_2 = foodTableOperations.insertFoodData(food6_2);
            if (id6_2 > 0) {
                FoodDetailsModel foodModel6 = new FoodDetailsModel("كستناء", "7 قطع", 110, 20, 2, 1.5, 0, 0, 0, id6_2, foodType);
                success6_2 = foodDetailsTableOperations.insertFoodData(foodModel6);
            }
            byte[] img7 = convertDrawableToByteArray(R.drawable.m9);
            FoodModel food7 = new FoodModel("فول سوداني", "", img7, 15);
            long id7 = foodTableOperations.insertFoodData(food7);
            if (id7 > 0) {
                FoodDetailsModel foodModel7 = new FoodDetailsModel("فول سوداني", "1 ملعقة", 100, 1, 4, 8, 0, 0, 0, id7, foodType);
                success7 = foodDetailsTableOperations.insertFoodData(foodModel7);
            }
            FoodModel food7_1 = new FoodModel("فول سوداني", "", 30);
            long id7_1 = foodTableOperations.insertFoodData(food7_1);
            if (id7_1 > 0) {
                FoodDetailsModel foodModel7 = new FoodDetailsModel("فول سوداني", "2 ملعقة", 200, 2, 8, 16, 0, 0, 0, id7_1, foodType);
                success7_1 = foodDetailsTableOperations.insertFoodData(foodModel7);
            }
            FoodModel food7_2 = new FoodModel("فول سوداني", "", 45);
            long id7_2 = foodTableOperations.insertFoodData(food7_2);
            if (id7_2 > 0) {
                FoodDetailsModel foodModel7 = new FoodDetailsModel("فول سوداني", "3 ملاعق", 300, 3, 12, 24, 0, 0, 0, id7_2, foodType);
                success7_2 = foodDetailsTableOperations.insertFoodData(foodModel7);
            }
            byte[] img8 = convertDrawableToByteArray(R.drawable.m10);
            FoodModel food8 = new FoodModel("بذور بطيخ", "", img8, 9);
            long id8 = foodTableOperations.insertFoodData(food8);
            if (id8 > 0) {
                FoodDetailsModel foodModel8 = new FoodDetailsModel("بذور بطيخ", "1 ملعقة", 50, 1, 3, 4, 0, 0, 0, id8, foodType);
                success8 = foodDetailsTableOperations.insertFoodData(foodModel8);
            }
            FoodModel food8_1 = new FoodModel("بذور بطيخ", "", 18);
            long id8_1 = foodTableOperations.insertFoodData(food8_1);
            if (id8_1 > 0) {
                FoodDetailsModel foodModel8 = new FoodDetailsModel("بذور بطيخ", "2 ملعقة", 100, 2, 6, 8, 0, 0, 0, id8_1, foodType);
                success8_1 = foodDetailsTableOperations.insertFoodData(foodModel8);
            }
            FoodModel food8_2 = new FoodModel("بذور بطيخ", "", 27);
            long id8_2 = foodTableOperations.insertFoodData(food8_2);
            if (id8_2 > 0) {
                FoodDetailsModel foodModel8 = new FoodDetailsModel("بذور بطيخ", "3 ملاعق", 150, 3, 9, 12, 0, 0, 0, id8_2, foodType);
                success8_2 = foodDetailsTableOperations.insertFoodData(foodModel8);
            }
            byte[] img9 = convertDrawableToByteArray(R.drawable.m11);
            FoodModel food9 = new FoodModel("ببذور عباد الشمس", "", img9, 8);
            long id9 = foodTableOperations.insertFoodData(food9);
            if (id9 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("ببذور عباد الشمس", "1 ملعقة", 50, 1.5, 1.5, 4, 0, 0, 0, id9, foodType);
                success9 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            FoodModel food9_1 = new FoodModel("بذور عباد الشمس", "", 16);
            long id9_1 = foodTableOperations.insertFoodData(food9_1);
            if (id9_1 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("بذور عباد الشمس", "2 ملعقة", 100, 3, 3, 8, 0, 0, 0, id9_1, foodType);
                success9_1 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            FoodModel food9_2 = new FoodModel("بذور عباد الشمس", "", 24);
            long id9_2 = foodTableOperations.insertFoodData(food9_2);
            if (id9_2 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("بذور عباد الشمس", "3 ملاعق", 150, 4.5, 4.5, 12, 0, 0, 0, id9_2, foodType);
                success9_2 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            byte[] img10 = convertDrawableToByteArray(R.drawable.m12);
            FoodModel food10 = new FoodModel("ببذور قرع", "", img10, 9);
            long id10 = foodTableOperations.insertFoodData(food10);
            if (id10 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("ببذور قرع", "1 ملعقة", 50, 1.5, 2, 4, 0, 0, 0, id10, foodType);
                success10 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            FoodModel food10_1 = new FoodModel("بذور قرع", "", 18);
            long id10_1 = foodTableOperations.insertFoodData(food10_1);
            if (id10_1 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("بذور قرع", "2 ملعقة", 100, 3, 4, 8, 0, 0, 0, id10_1, foodType);
                success10_1 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            FoodModel food10_2 = new FoodModel("بذور قرع", "", 27);
            long id10_2 = foodTableOperations.insertFoodData(food10_2);
            if (id10_2 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("بذور قرع", "3 ملاعق", 150, 4.5, 6, 12, 0, 0, 0, id10_2, foodType);
                success10_2 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            byte[] img11 = convertDrawableToByteArray(R.drawable.m13);
            FoodModel food11 = new FoodModel("حمص (كظامة)", "", img11, 15);
            long id11 = foodTableOperations.insertFoodData(food11);
            if (id11 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("حمص (كظامة)", "1 ملعقة", 50, 9, 3, 1, 0, 0, 0, id11, foodType);
                success11 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            FoodModel food11_1 = new FoodModel("حمص (كظامة)", "", 30);
            long id11_1 = foodTableOperations.insertFoodData(food11_1);
            if (id11_1 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("حمص (كظامة)", "2 ملعقة", 100, 18, 6, 2, 0, 0, 0, id11_1, foodType);
                success11_1 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            FoodModel food11_2 = new FoodModel("حمص (كظامة)", "", 45);
            long id11_2 = foodTableOperations.insertFoodData(food11_2);
            if (id11_2 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("حمص (كظامة)", "3 ملاعق", 150, 27, 9, 3, 0, 0, 0, id11_2, foodType);
                success11_2 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            byte[] img12 = convertDrawableToByteArray(R.drawable.m14);
            FoodModel food12 = new FoodModel("بقوليات محمصه", "", img12, 12);
            long id12 = foodTableOperations.insertFoodData(food12);
            if (id12 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("بقوليات محمصه", "1 ملعقة", 5, 1, 0.5, 0.05, 0, 0, 0, id12, foodType);
                success12 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            FoodModel food12_1 = new FoodModel("بقوليات محمصه", "", 24);
            long id12_1 = foodTableOperations.insertFoodData(food12_1);
            if (id12_1 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("بقوليات محمصه", "2 ملعقة", 10, 2, 1, 0.1, 0, 0, 0, id12_1, foodType);
                success12_1 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            FoodModel food12_2 = new FoodModel("بقوليات محمصه", "", 36);
            long id12_2 = foodTableOperations.insertFoodData(food12_2);
            if (id12_2 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("بقوليات محمصه", "3 ملاعق", 15, 3, 1.5, 0.15, 0, 0, 0, id12_2, foodType);
                success12_2 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }

            if (success && success_1 && success_2 && success2 && success2_1 && success2_2 && success3 && success3_1 && success3_2 && success4 && success4_1 && success4_2 &&
                    success5 && success5_1 && success5_2 && success6 && success6_1 && success6_2 && success7 && success7_1 && success7_2 && success8 && success8_1 &&
                    success8_2 && success9 && success9_1 && success9_2 && success10 && success10_1 && success10_2 && success11 && success11_1 && success11_2 && success12 &&
                    success12_1 && success12_2) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public boolean insertAddsFoodDetails() {

        // do insert all adds data in database for first time
        try {
            FoodDetailsTableOperations foodDetailsTableOperations = new FoodDetailsTableOperations(context);
            FoodTableOperations foodTableOperations = new FoodTableOperations(context);

            boolean success = false, success_1 = false, success2 = false, success2_1 = false, success3 = false, success3_1 = false, success4 = false, success4_1 = false,
                    success5 = false, success5_1 = false, success6 = false, success6_1 = false, success7 = false, success8 = false, success8_1 = false,
                    success8_2 = false, success9 = false;

            // اضافات
            // adds
            String foodType = "اضافات";
            byte[] img = convertDrawableToByteArray(R.drawable.o1);
            FoodModel food1 = new FoodModel("مربى", "", img, 30);
            long id = foodTableOperations.insertFoodData(food1);
            if (id > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("مربى", "1 ملعقه", 60, 20, 0.0, 0.0, 0, 0, 0, id, foodType);
                success = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            byte[] img_1 = convertDrawableToByteArray(R.drawable.o2);
            FoodModel food1_1 = new FoodModel("مربى", "", img_1, 60);
            long id_1 = foodTableOperations.insertFoodData(food1_1);
            if (id_1 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("مربى", "2 ملعقة", 120, 40, 0.0, 0.0, 0, 0, 0, id_1, foodType);
                success_1 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            byte[] img2 = convertDrawableToByteArray(R.drawable.o3);
            FoodModel food2 = new FoodModel("دبس", "", img2, 15);
            long id2 = foodTableOperations.insertFoodData(food2);
            if (id2 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("دبس", "1 ملعقه", 40, 10, 0.0, 0.0, 0, 0, 0, id2, foodType);
                success2 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img2_1 = convertDrawableToByteArray(R.drawable.o4);
            FoodModel food2_1 = new FoodModel("دبس", "", img2_1, 30);
            long id2_1 = foodTableOperations.insertFoodData(food2_1);
            if (id2_1 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("دبس", "2 ملعقة", 80, 20, 0.0, 0.0, 0, 0, 0, id2_1, foodType);
                success2_1 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img3 = convertDrawableToByteArray(R.drawable.o5);
            FoodModel food3 = new FoodModel("سكر", "", img3, 5);
            long id3 = foodTableOperations.insertFoodData(food3);
            if (id3 > 0) {
                FoodDetailsModel foodModel3 = new FoodDetailsModel("سكر", "ملعقه صغيرة", 20, 5, 0.0, 0.0, 0, 0, 0, id3, foodType);
                success3 = foodDetailsTableOperations.insertFoodData(foodModel3);
            }
            FoodModel food3_1 = new FoodModel("سكر", "", 15);
            long id3_1 = foodTableOperations.insertFoodData(food3_1);
            if (id3_1 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("سكر", "ملعقه كبيرة", 60, 15, 0.0, 0.0, 0, 0, 0, id3_1, foodType);
                success3_1 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img4 = convertDrawableToByteArray(R.drawable.o6);
            FoodModel food4 = new FoodModel("عسل", "", img4, 5);
            long id4 = foodTableOperations.insertFoodData(food4);
            if (id4 > 0) {
                FoodDetailsModel foodModel4 = new FoodDetailsModel("عسل", "ملعقه صغيرة", 15, 4, 0.0, 0.0, 0, 0, 0, id4, foodType);
                success4 = foodDetailsTableOperations.insertFoodData(foodModel4);
            }
            byte[] img4_1 = convertDrawableToByteArray(R.drawable.o7);
            FoodModel food4_1 = new FoodModel("عسل", "", img4_1, 30);
            long id4_1 = foodTableOperations.insertFoodData(food4_1);
            if (id4_1 > 0) {
                FoodDetailsModel foodModel4 = new FoodDetailsModel("عسل", "ملعقه كبيرة", 90, 25, 0.0, 0.0, 0, 0, 0, id4_1, foodType);
                success4_1 = foodDetailsTableOperations.insertFoodData(foodModel4);
            }
            byte[] img5 = convertDrawableToByteArray(R.drawable.o8);
            FoodModel food5 = new FoodModel("كاتشاب", "", img5, 20);
            long id5 = foodTableOperations.insertFoodData(food5);
            if (id5 > 0) {
                FoodDetailsModel foodModel5 = new FoodDetailsModel("كاتشاب", "1 ملعقة", 30, 6, 0.0, 0.0, 0, 0, 0, id5, foodType);
                success5 = foodDetailsTableOperations.insertFoodData(foodModel5);
            }
            byte[] img5_1 = convertDrawableToByteArray(R.drawable.o9);
            FoodModel food5_1 = new FoodModel("كاتشاب", "", img5_1, 40);
            long id5_1 = foodTableOperations.insertFoodData(food5_1);
            if (id5_1 > 0) {
                FoodDetailsModel foodModel5 = new FoodDetailsModel("كاتشاب", "2 ملعقة", 60, 7, 0.0, 0.0, 0, 0, 0, id5_1, foodType);
                success5_1 = foodDetailsTableOperations.insertFoodData(foodModel5);
            }
            byte[] img6 = convertDrawableToByteArray(R.drawable.o10);
            FoodModel food6 = new FoodModel("مايونيز", "", img6, 30);
            long id6 = foodTableOperations.insertFoodData(food6);
            if (id6 > 0) {
                FoodDetailsModel foodModel6 = new FoodDetailsModel("مايونيز", "1 ملعقه", 200, 0.0, 0.0, 25, 0, 0, 0, id6, foodType);
                success6 = foodDetailsTableOperations.insertFoodData(foodModel6);
            }
            byte[] img6_1 = convertDrawableToByteArray(R.drawable.o11);
            FoodModel food6_1 = new FoodModel("مايونيز", "", img6_1, 60);
            long id6_1 = foodTableOperations.insertFoodData(food6_1);
            if (id6_1 > 0) {
                FoodDetailsModel foodModel6 = new FoodDetailsModel("مايونيز", "2 ملعقه", 400, 0.0, 0.0, 50, 0, 0, 0, id6_1, foodType);
                success6_1 = foodDetailsTableOperations.insertFoodData(foodModel6);
            }
            byte[] img7 = convertDrawableToByteArray(R.drawable.o12);
            FoodModel food7 = new FoodModel("جوز هند", "", img7, 4);
            long id7 = foodTableOperations.insertFoodData(food7);
            if (id7 > 0) {
                FoodDetailsModel foodModel7 = new FoodDetailsModel("جوز هند", "2 ملعقة", 25, 0.5, 0.0, 2.5, 0, 0, 0, id7, foodType);
                success7 = foodDetailsTableOperations.insertFoodData(foodModel7);
            }
            byte[] img8 = convertDrawableToByteArray(R.drawable.o13);
            FoodModel food8 = new FoodModel("زعتر فلسطيني", "", img8, 9);
            long id8 = foodTableOperations.insertFoodData(food8);
            if (id8 > 0) {
                FoodDetailsModel foodModel8 = new FoodDetailsModel("زعتر فلسطيني", "1 ملعقة", 25, 6, 1, 0.0, 0, 0, 0, id8, foodType);
                success8 = foodDetailsTableOperations.insertFoodData(foodModel8);
            }
            byte[] img8_1 = convertDrawableToByteArray(R.drawable.o14);
            FoodModel food8_1 = new FoodModel("زعتر فلسطيني", "", img8_1, 18);
            long id8_1 = foodTableOperations.insertFoodData(food8_1);
            if (id8_1 > 0) {
                FoodDetailsModel foodModel8 = new FoodDetailsModel("زعتر فلسطيني", "2 ملعقة", 50, 12, 2, 1, 0, 0, 0, id8_1, foodType);
                success8_1 = foodDetailsTableOperations.insertFoodData(foodModel8);
            }
            byte[] img8_2 = convertDrawableToByteArray(R.drawable.o15);
            FoodModel food8_2 = new FoodModel("زعتر فلسطيني", "", img8_2, 27);
            long id8_2 = foodTableOperations.insertFoodData(food8_2);
            if (id8_2 > 0) {
                FoodDetailsModel foodModel8 = new FoodDetailsModel("زعتر فلسطيني", "3 ملاعق", 75, 18, 3, 2, 0, 0, 0, id8_2, foodType);
                success8_2 = foodDetailsTableOperations.insertFoodData(foodModel8);
            }
            byte[] img9 = convertDrawableToByteArray(R.drawable.o16);
            FoodModel food9 = new FoodModel("بشار الذرة", "", img9, 50);
            long id9 = foodTableOperations.insertFoodData(food9);
            if (id9 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("بشار الذرة", "3 اكواب", 125, 15, 2, 5, 0, 0, 0, id9, foodType);
                success9 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            if (success && success_1 && success2 && success2_1 && success3 && success3_1 && success4 && success4_1 && success5 && success5_1 && success6 && success6_1 &&
                    success7 && success8 && success8_1 && success8_2 && success9) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public boolean insertBeansFoodDetails() {

        // do insert all beans data in database for first time
        try {
            FoodDetailsTableOperations foodDetailsTableOperations = new FoodDetailsTableOperations(context);
            FoodTableOperations foodTableOperations = new FoodTableOperations(context);

            boolean success = false, success_1 = false, success_2 = false, success2 = false, success2_1 = false, success2_2 = false, success3 = false, success3_1 = false,
                    success4 = false, success4_1 = false, success5 = false, success5_1 = false, success6 = false, success6_1 = false, success7 = false, success7_1 = false,
                    success8 = false, success8_1 = false, success9 = false, success9_1 = false, success10 = false, success10_1 = false, success11 = false, success11_1 = false;

            // البقوليات
            // beans
            String foodType = "البقوليات";
            byte[] img = convertDrawableToByteArray(R.drawable.g1);
            FoodModel food1 = new FoodModel("مدمس فول", "", img, 25);
            long id = foodTableOperations.insertFoodData(food1);
            if (id > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("مدمس فول", "1 ملعقه", 20, 2.5, 1, 0.1, 0, 0, 0, id, foodType);
                success = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food1_1 = new FoodModel("مدمس فول", "", 50);
            long id_1 = foodTableOperations.insertFoodData(food1_1);
            if (id_1 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("مدمس فول", "2 ملعقة", 40, 5, 2, 0.2, 0, 0, 0, id_1, foodType);
                success_1 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food1_2 = new FoodModel("مدمس فول", "", 75);
            long id_2 = foodTableOperations.insertFoodData(food1_2);
            if (id_2 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("مدمس فول", "3 ملاعق", 60, 7.5, 3, 0.3, 0, 0, 0, id_2, foodType);
                success_2 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            byte[] img2 = convertDrawableToByteArray(R.drawable.g2);
            FoodModel food2 = new FoodModel("مدمس حمص", "", img2, 25);
            long id2 = foodTableOperations.insertFoodData(food2);
            if (id2 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("مدمس حمص", "1 ملعقه", 40, 6, 2, 0.5, 0, 0, 0, id2, foodType);
                success2 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            FoodModel food2_1 = new FoodModel("مدمس حمص", "", 50);
            long id2_1 = foodTableOperations.insertFoodData(food2_1);
            if (id2_1 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("مدمس حمص", "2 ملعقة", 80, 12, 4, 1, 0, 0, 0, id2_1, foodType);
                success2_1 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            FoodModel food2_2 = new FoodModel("مدمس حمص", "", 75);
            long id2_2 = foodTableOperations.insertFoodData(food2_2);
            if (id2_2 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("مدمس حمص", "3 ملاعق", 120, 24, 6, 1.5, 0, 0, 0, id2_2, foodType);
                success2_2 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img3 = convertDrawableToByteArray(R.drawable.g3);
            FoodModel food3 = new FoodModel("عدس حب", "", img3, 60);
            long id3 = foodTableOperations.insertFoodData(food3);
            if (id3 > 0) {
                FoodDetailsModel foodModel3 = new FoodDetailsModel("عدس حب", "ربع كوب", 60, 10, 5, 0.2, 0, 0, 0, id3, foodType);
                success3 = foodDetailsTableOperations.insertFoodData(foodModel3);
            }
            byte[] img3_1 = convertDrawableToByteArray(R.drawable.g4);
            FoodModel food3_1 = new FoodModel("عدس حب", "", img3_1, 120);
            long id3_1 = foodTableOperations.insertFoodData(food3_1);
            if (id3_1 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("عدس حب", "نصف كوب", 120, 20, 10, 0.5, 0, 0, 0, id3_1, foodType);
                success3_1 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img4 = convertDrawableToByteArray(R.drawable.g5);
            FoodModel food4 = new FoodModel("بازيلاء", "", img4, 50);
            long id4 = foodTableOperations.insertFoodData(food4);
            if (id4 > 0) {
                FoodDetailsModel foodModel4 = new FoodDetailsModel("بازيلاء", "ربع كوب", 60, 7.5, 4.5, 0.5, 0, 0, 0, id4, foodType);
                success4 = foodDetailsTableOperations.insertFoodData(foodModel4);
            }
            byte[] img4_1 = convertDrawableToByteArray(R.drawable.g6);
            FoodModel food4_1 = new FoodModel("بازيلاء", "", img4_1, 100);
            long id4_1 = foodTableOperations.insertFoodData(food4_1);
            if (id4_1 > 0) {
                FoodDetailsModel foodModel4 = new FoodDetailsModel("بازيلاء", "نصف كوب", 120, 14, 9, 1, 0, 0, 0, id4_1, foodType);
                success4_1 = foodDetailsTableOperations.insertFoodData(foodModel4);
            }
            byte[] img5 = convertDrawableToByteArray(R.drawable.g7);
            FoodModel food5 = new FoodModel("فاصولياء بيضاء", "", img5, 70);
            long id5 = foodTableOperations.insertFoodData(food5);
            if (id5 > 0) {
                FoodDetailsModel foodModel5 = new FoodDetailsModel("فاصولياء بيضاء", "ربع كوب", 90, 15, 6, 0.2, 0, 0, 0, id5, foodType);
                success5 = foodDetailsTableOperations.insertFoodData(foodModel5);
            }
            byte[] img5_1 = convertDrawableToByteArray(R.drawable.g8);
            FoodModel food5_1 = new FoodModel("فاصولياء بيضاء", "", img5_1, 140);
            long id5_1 = foodTableOperations.insertFoodData(food5_1);
            if (id5_1 > 0) {
                FoodDetailsModel foodModel5 = new FoodDetailsModel("فاصولياء بيضاء", "نصف كوب", 180, 30, 12, 0.5, 0, 0, 0, id5_1, foodType);
                success5_1 = foodDetailsTableOperations.insertFoodData(foodModel5);
            }
            byte[] img6 = convertDrawableToByteArray(R.drawable.g9);
            FoodModel food6 = new FoodModel("لوبيا جافة", "", img6, 60);
            long id6 = foodTableOperations.insertFoodData(food6);
            if (id6 > 0) {
                FoodDetailsModel foodModel6 = new FoodDetailsModel("لوبيا جافة", "ربع كوب", 85, 15, 6, 0.2, 0, 0, 0, id6, foodType);
                success6 = foodDetailsTableOperations.insertFoodData(foodModel6);
            }
            byte[] img6_1 = convertDrawableToByteArray(R.drawable.g10);
            FoodModel food6_1 = new FoodModel("لوبيا جافة", "", img6_1, 120);
            long id6_1 = foodTableOperations.insertFoodData(food6_1);
            if (id6_1 > 0) {
                FoodDetailsModel foodModel6 = new FoodDetailsModel("لوبيا جافة", "نصف كوب", 170, 30, 12, 0.4, 0, 0, 0, id6_1, foodType);
                success6_1 = foodDetailsTableOperations.insertFoodData(foodModel6);
            }
            byte[] img7 = convertDrawableToByteArray(R.drawable.g11);
            FoodModel food7 = new FoodModel("ذرة", "", img7, 70);
            long id7 = foodTableOperations.insertFoodData(food7);
            if (id7 > 0) {
                FoodDetailsModel foodModel7 = new FoodDetailsModel("ذرة", "ربع كوب", 115, 17, 2.5, 6, 0, 0, 0, id7, foodType);
                success7 = foodDetailsTableOperations.insertFoodData(foodModel7);
            }
            byte[] img7_1 = convertDrawableToByteArray(R.drawable.g12);
            FoodModel food7_1 = new FoodModel("ذرة", "", img7_1, 140);
            long id7_1 = foodTableOperations.insertFoodData(food7_1);
            if (id7_1 > 0) {
                FoodDetailsModel foodModel7 = new FoodDetailsModel("ذرة", "نصف كوب", 230, 34, 5, 12, 0, 0, 0, id7_1, foodType);
                success7_1 = foodDetailsTableOperations.insertFoodData(foodModel7);
            }
            byte[] img8 = convertDrawableToByteArray(R.drawable.g13);
            FoodModel food8 = new FoodModel("حمص حب", "", img8, 75);
            long id8 = foodTableOperations.insertFoodData(food8);
            if (id8 > 0) {
                FoodDetailsModel foodModel8 = new FoodDetailsModel("حمص حب", "ربع كوب", 120, 20, 7, 2, 0, 0, 0, id8, foodType);
                success8 = foodDetailsTableOperations.insertFoodData(foodModel8);
            }
            byte[] img8_1 = convertDrawableToByteArray(R.drawable.g14);
            FoodModel food8_1 = new FoodModel("حمص حب", "", img8_1, 170);
            long id8_1 = foodTableOperations.insertFoodData(food8_1);
            if (id8_1 > 0) {
                FoodDetailsModel foodModel8 = new FoodDetailsModel("حمص حب", "نصف كوب", 240, 40, 14, 4, 0, 0, 0, id8_1, foodType);
                success8_1 = foodDetailsTableOperations.insertFoodData(foodModel8);
            }
            byte[] img9 = convertDrawableToByteArray(R.drawable.g15);
            FoodModel food9 = new FoodModel("فول حب", "", img9, 80);
            long id9 = foodTableOperations.insertFoodData(food9);
            if (id9 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("فول حب", "ربع كوب", 60, 8, 4, 0.5, 0, 0, 0, id9, foodType);
                success9 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            byte[] img9_1 = convertDrawableToByteArray(R.drawable.g16);
            FoodModel food9_1 = new FoodModel("فول حب", "", img9_1, 160);
            long id9_1 = foodTableOperations.insertFoodData(food9_1);
            if (id9_1 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("فول حب", "نصف كوب", 120, 16, 8, 1, 0, 0, 0, id9_1, foodType);
                success9_1 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            byte[] img10 = convertDrawableToByteArray(R.drawable.g17);
            FoodModel food10 = new FoodModel("ترمس", "", img10, 70);
            long id10 = foodTableOperations.insertFoodData(food10);
            if (id10 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("ترمس", "ؤبع كوب", 80, 7, 11, 2, 0, 0, 0, id10, foodType);
                success10 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            byte[] img10_1 = convertDrawableToByteArray(R.drawable.g18);
            FoodModel food10_1 = new FoodModel("ترمس", "", img10_1, 140);
            long id10_1 = foodTableOperations.insertFoodData(food10_1);
            if (id10_1 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("ترمس", "نصف كوب", 160, 14, 22, 4, 0, 0, 0, id10_1, foodType);
                success10_1 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            byte[] img11 = convertDrawableToByteArray(R.drawable.g19);
            FoodModel food11 = new FoodModel("بقوليات محمصة", "", img11, 45);
            long id11 = foodTableOperations.insertFoodData(food11);
            if (id11 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("بقوليات محمصة", "ربع كوب", 180, 30, 9, 3, 0, 0, 0, id11, foodType);
                success11 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            FoodModel food11_1 = new FoodModel("بقوليات محمصة", "", 90);
            long id11_1 = foodTableOperations.insertFoodData(food11_1);
            if (id11_1 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("بقوليات محمصة", "نصف كوب", 360, 60, 18, 6, 0, 0, 0, id11_1, foodType);
                success11_1 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            if (success && success_1 && success_2 && success2 && success2_1 && success2_2 && success3 && success3_1 && success4 && success4_1 &&
                    success5 && success5_1 && success6 && success6_1 && success7 && success7_1 && success8 && success8_1 && success9 && success9_1 &&
                    success10 && success10_1 && success11 && success11_1) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public boolean insertFatsFoodDetails() {

        // do insert all fats data in database for first time
        try {
            FoodDetailsTableOperations foodDetailsTableOperations = new FoodDetailsTableOperations(context);
            FoodTableOperations foodTableOperations = new FoodTableOperations(context);

            boolean success = false, success_1 = false, success2 = false, success2_1 = false, success2_2 = false, success3 = false, success3_1 = false, success3_2 = false,
                    success4 = false, success4_1 = false, success4_2 = false, success5 = false, success5_1 = false, success5_2 = false, success6 = false, success7 = false,
                    success7_1 = false, success8 = false, success8_1 = false, success9 = false, success9_1 = false, success9_2 = false;

            // الدهون
            // fats
            String foodType = "الدهون";
            byte[] img = convertDrawableToByteArray(R.drawable.j1);
            FoodModel food1 = new FoodModel("زيت نباتي", "", img, 15);
            long id = foodTableOperations.insertFoodData(food1);
            if (id > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("زيت نباتي", "ملعقة صغيرة", 10, 0.0, 0.0, 1.5, 0, 0, 0, id, foodType);
                success = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            byte[] img_1 = convertDrawableToByteArray(R.drawable.j2);
            FoodModel food1_1 = new FoodModel("زيت نباتي", "", img_1, 40);
            long id_1 = foodTableOperations.insertFoodData(food1_1);
            if (id_1 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("زيت نباتي", "ملعقة كبيرة", 35, 0.0, 0.0, 4, 0, 0, 0, id_1, foodType);
                success_1 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            byte[] img2 = convertDrawableToByteArray(R.drawable.j3);
            FoodModel food2 = new FoodModel("سمنة", "", img2, 8);
            long id2 = foodTableOperations.insertFoodData(food2);
            if (id2 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("سمنة", "ملعقه صغيرة", 70, 0.0, 0.0, 8, 0, 0, 0, id2, foodType);
                success2 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img2_1 = convertDrawableToByteArray(R.drawable.j4);
            FoodModel food2_1 = new FoodModel("سمنة", "", img2_1, 20);
            long id2_1 = foodTableOperations.insertFoodData(food2_1);
            if (id2_1 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("سمنة", "ملعقه كبيرة", 150, 0.0, 0.0, 18, 0, 0, 0, id2_1, foodType);
                success2_1 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img2_2 = convertDrawableToByteArray(R.drawable.j5);
            FoodModel food2_2 = new FoodModel("سمنة", "", img2_2, 40);
            long id2_2 = foodTableOperations.insertFoodData(food2_2);
            if (id2_2 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("سمنة", "2 ملعقة", 300, 0.0, 0.0, 36, 0, 0, 0, id2_2, foodType);
                success2_2 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img3 = convertDrawableToByteArray(R.drawable.j6);
            FoodModel food3 = new FoodModel("سمنة بلدية", "", img3, 8);
            long id3 = foodTableOperations.insertFoodData(food3);
            if (id3 > 0) {
                FoodDetailsModel foodModel3 = new FoodDetailsModel("سمنة بلدية", "ملعقه صغيرة", 60, 0.0, 0.0, 8, 0, 0, 0, id3, foodType);
                success3 = foodDetailsTableOperations.insertFoodData(foodModel3);
            }
            byte[] img3_1 = convertDrawableToByteArray(R.drawable.j7);
            FoodModel food3_1 = new FoodModel("سمنة بلدية", "", img3_1, 20);
            long id3_1 = foodTableOperations.insertFoodData(food3_1);
            if (id3_1 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("سمنة بلدية", "ملعقه كبيرة", 150, 0.0, 0.0, 18, 0, 0, 0, id3_1, foodType);
                success3_1 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img3_2 = convertDrawableToByteArray(R.drawable.j8);
            FoodModel food3_2 = new FoodModel("سمنة بلدية", "", img3_2, 40);
            long id3_2 = foodTableOperations.insertFoodData(food3_2);
            if (id3_2 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("سمنة بلدية", "2 ملعقة", 300, 0.0, 0.0, 36, 0, 0, 0, id3_2, foodType);
                success3_2 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img4 = convertDrawableToByteArray(R.drawable.j9);
            FoodModel food4 = new FoodModel("مرجرين", "", img4, 15);
            long id4 = foodTableOperations.insertFoodData(food4);
            if (id4 > 0) {
                FoodDetailsModel foodModel4 = new FoodDetailsModel("مرجرين", "ملعقه صغيرة", 40, 0.0, 0.0, 5, 0, 0, 0, id4, foodType);
                success4 = foodDetailsTableOperations.insertFoodData(foodModel4);
            }
            byte[] img4_1 = convertDrawableToByteArray(R.drawable.j10);
            FoodModel food4_1 = new FoodModel("مرجرين", "", img4_1, 30);
            long id4_1 = foodTableOperations.insertFoodData(food4_1);
            if (id4_1 > 0) {
                FoodDetailsModel foodModel4 = new FoodDetailsModel("مرجرين", "ملعقه كبييرة", 100, 0.0, 0.0, 12, 0, 0, 0, id4_1, foodType);
                success4_1 = foodDetailsTableOperations.insertFoodData(foodModel4);
            }
            byte[] img4_2 = convertDrawableToByteArray(R.drawable.j11);
            FoodModel food4_2 = new FoodModel("مرجرين", "", img4_2, 45);
            long id4_2 = foodTableOperations.insertFoodData(food4_2);
            if (id4_2 > 0) {
                FoodDetailsModel foodModel4 = new FoodDetailsModel("مرجرين", "2 ملعقة", 200, 0.0, 0.0, 24, 0, 0, 0, id4_2, foodType);
                success4_2 = foodDetailsTableOperations.insertFoodData(foodModel4);
            }
            byte[] img5 = convertDrawableToByteArray(R.drawable.j12);
            FoodModel food5 = new FoodModel("زبدة", "", img5, 8);
            long id5 = foodTableOperations.insertFoodData(food5);
            if (id5 > 0) {
                FoodDetailsModel foodModel5 = new FoodDetailsModel("زبدة", "ملعقه صغيرة", 50, 0.04, 0.03, 5.5, 0, 0, 0, id5, foodType);
                success5 = foodDetailsTableOperations.insertFoodData(foodModel5);
            }
            byte[] img5_1 = convertDrawableToByteArray(R.drawable.j13);
            FoodModel food5_1 = new FoodModel("زبدة", "", img5_1, 20);
            long id5_1 = foodTableOperations.insertFoodData(food5_1);
            if (id5_1 > 0) {
                FoodDetailsModel foodModel5 = new FoodDetailsModel("زبدة", "ملعقه كبيرة", 100, 0.08, 0.06, 11, 0, 0, 0, id5_1, foodType);
                success5_1 = foodDetailsTableOperations.insertFoodData(foodModel5);
            }
            byte[] img5_2 = convertDrawableToByteArray(R.drawable.j14);
            FoodModel food5_2 = new FoodModel("زبدة", "", img5_2, 40);
            long id5_2 = foodTableOperations.insertFoodData(food5_2);
            if (id5_2 > 0) {
                FoodDetailsModel foodModel5 = new FoodDetailsModel("زبدة", "2 ملعقة", 200, 0.16, 0.12, 22, 0, 0, 0, id5_2, foodType);
                success5_2 = foodDetailsTableOperations.insertFoodData(foodModel5);
            }
            byte[] img6 = convertDrawableToByteArray(R.drawable.j15);
            FoodModel food6 = new FoodModel("قشطة حليب", "", img6, 30);
            long id6 = foodTableOperations.insertFoodData(food6);
            if (id6 > 0) {
                FoodDetailsModel foodModel6 = new FoodDetailsModel("قشطة حليب", "2 ملعقة", 80, 1, 1, 8, 0, 0, 0, id6, foodType);
                success6 = foodDetailsTableOperations.insertFoodData(foodModel6);
            }
            byte[] img7 = convertDrawableToByteArray(R.drawable.j16);
            FoodModel food7 = new FoodModel("طحينية", "", img7, 10);
            long id7 = foodTableOperations.insertFoodData(food7);
            if (id7 > 0) {
                FoodDetailsModel foodModel7 = new FoodDetailsModel("طحينية", "ملعقه كبيرة", 60, 1.5, 2.5, 6, 0, 0, 0, id7, foodType);
                success7 = foodDetailsTableOperations.insertFoodData(foodModel7);
            }
            byte[] img7_1 = convertDrawableToByteArray(R.drawable.j17);
            FoodModel food7_1 = new FoodModel("طحينية", "", img7_1, 20);
            long id7_1 = foodTableOperations.insertFoodData(food7_1);
            if (id7_1 > 0) {
                FoodDetailsModel foodModel7 = new FoodDetailsModel("طحينية", "2 ملعقة", 120, 3, 5, 12, 0, 0, 0, id7_1, foodType);
                success7_1 = foodDetailsTableOperations.insertFoodData(foodModel7);
            }
            byte[] img8 = convertDrawableToByteArray(R.drawable.j18);
            FoodModel food8 = new FoodModel("مايونيز", "", img8, 30);
            long id8 = foodTableOperations.insertFoodData(food8);
            if (id8 > 0) {
                FoodDetailsModel foodModel8 = new FoodDetailsModel("مايونيز", "ملعقه كبيرة", 200, 0.0, 0.0, 25, 0, 0, 0, id8, foodType);
                success8 = foodDetailsTableOperations.insertFoodData(foodModel8);
            }
            byte[] img8_1 = convertDrawableToByteArray(R.drawable.j19);
            FoodModel food8_1 = new FoodModel("مايونيز", "", img8_1, 60);
            long id8_1 = foodTableOperations.insertFoodData(food8_1);
            if (id8_1 > 0) {
                FoodDetailsModel foodModel8 = new FoodDetailsModel("مايونيز", "2 ملعقة", 400, 0.0, 0.0, 50, 0, 0, 0, id8_1, foodType);
                success8_1 = foodDetailsTableOperations.insertFoodData(foodModel8);
            }
            byte[] img9 = convertDrawableToByteArray(R.drawable.j20);
            FoodModel food9 = new FoodModel("أفوجادو", "", img9, 50);
            long id9 = foodTableOperations.insertFoodData(food9);
            if (id9 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("أفوجادو", "2 ملعقة", 80, 4.5, 1, 7.5, 0, 0, 0, id9, foodType);
                success9 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            byte[] img9_1 = convertDrawableToByteArray(R.drawable.j21);
            FoodModel food9_1 = new FoodModel("أفوجادو", "", img9_1, 105);
            long id9_1 = foodTableOperations.insertFoodData(food9_1);
            if (id9_1 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("أفوجادو", "4 ملاعق", 160, 9, 2, 15, 0, 0, 0, id9_1, foodType);
                success9_1 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            byte[] img9_2 = convertDrawableToByteArray(R.drawable.j22);
            FoodModel food9_2 = new FoodModel("أفوجادو", "", img9_2, 170);
            long id9_2 = foodTableOperations.insertFoodData(food9_2);
            if (id9_2 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("أفوجادو", "حبة كاملة", 160, 9, 2, 15, 0, 0, 0, id9_2, foodType);
                success9_2 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }

            if (success && success_1 && success2 && success2_1 && success2_2 && success3 && success3_1 && success3_2 && success4 && success4_1 && success4_2 &&
                    success5 && success5_1 && success5_2 && success6 && success7 && success7_1 && success8 && success8_1 &&
                    success9 && success9_1 && success9_2) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public boolean insertGrainsFoodDetails() {

        // do insert all Grains data in database for first time
        try {
            FoodDetailsTableOperations foodDetailsTableOperations = new FoodDetailsTableOperations(context);
            FoodTableOperations foodTableOperations = new FoodTableOperations(context);

            boolean success = false, success_1 = false, success_2 = false, success2 = false, success2_1 = false, success2_2 = false, success3 = false, success3_1 = false,
                    success3_2 = false, success4 = false, success4_1 = false, success4_2 = false, success5 = false, success5_1 = false, success5_2 = false, success6 = false,
                    success6_1 = false, success6_2 = false, success7 = false, success7_1 = false, success7_2 = false, success8 = false, success8_1 = false,
                    success8_2 = false, success9 = false, success9_1 = false, success10 = false, success10_1 = false, success10_2 = false;

            // الحبوب
            // Grains
            String foodType = "الحبوب";
            byte[] img = convertDrawableToByteArray(R.drawable.b1);
            FoodModel food1 = new FoodModel("برغل", "", img, 60);
            long id = foodTableOperations.insertFoodData(food1);
            if (id > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("برغل", "2 مغرفة", 80, 15, 3, 1, 0, 0, 0, id, foodType);
                success = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            byte[] img_1 = convertDrawableToByteArray(R.drawable.b2);
            FoodModel food1_1 = new FoodModel("برغل", "", img_1, 90);
            long id_1 = foodTableOperations.insertFoodData(food1_1);
            if (id_1 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("برغل", "3 مغارف", 120, 22, 4.5, 1.5, 0, 0, 0, id_1, foodType);
                success_1 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            byte[] img_2 = convertDrawableToByteArray(R.drawable.b3);
            FoodModel food1_2 = new FoodModel("برغل", "", img_2, 150);
            long id_2 = foodTableOperations.insertFoodData(food1_2);
            if (id_2 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("برغل", "5 مغارف", 200, 37.5, 7.5, 2.5, 0, 0, 0, id_2, foodType);
                success_2 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            byte[] img2 = convertDrawableToByteArray(R.drawable.b4);
            FoodModel food2 = new FoodModel("فريكه", "", img2, 60);
            long id2 = foodTableOperations.insertFoodData(food2);
            if (id2 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("فريكه", "2 مغرفة", 80, 15, 3, 1, 0, 0, 0, id2, foodType);
                success2 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img2_1 = convertDrawableToByteArray(R.drawable.b5);
            FoodModel food2_1 = new FoodModel("فريكه", "", img2_1, 90);
            long id2_1 = foodTableOperations.insertFoodData(food2_1);
            if (id2_1 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("فريكه", "3 مغارف", 120, 22.5, 4.5, 1.5, 0, 0, 0, id2_1, foodType);
                success2_1 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img2_2 = convertDrawableToByteArray(R.drawable.b6);
            FoodModel food2_2 = new FoodModel("فريكه", "", img2_2, 150);
            long id2_2 = foodTableOperations.insertFoodData(food2_2);
            if (id2_2 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("فريكه", "5 مغارف", 200, 37.5, 7.5, 2.5, 0, 0, 0, id2_2, foodType);
                success2_2 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img3 = convertDrawableToByteArray(R.drawable.b7);
            FoodModel food3 = new FoodModel("سليقه", "", img3, 60);
            long id3 = foodTableOperations.insertFoodData(food3);
            if (id3 > 0) {
                FoodDetailsModel foodModel3 = new FoodDetailsModel("سليقه", "2 مغرفة", 80, 15, 3, 1, 0, 0, 0, id3, foodType);
                success3 = foodDetailsTableOperations.insertFoodData(foodModel3);
            }
            byte[] img3_1 = convertDrawableToByteArray(R.drawable.b8);
            FoodModel food3_1 = new FoodModel("سليقه", "", img3_1, 90);
            long id3_1 = foodTableOperations.insertFoodData(food3_1);
            if (id3_1 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("سليقه", "3 مغارف", 120, 22.5, 4.5, 1.5, 0, 0, 0, id3_1, foodType);
                success3_1 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img3_2 = convertDrawableToByteArray(R.drawable.b9);
            FoodModel food3_2 = new FoodModel("سليقه", "", img3_2, 150);
            long id3_2 = foodTableOperations.insertFoodData(food3_2);
            if (id3_2 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("سليقه", "5 مغارف", 200, 37.5, 7.5, 2.5, 0, 0, 0, id3_2, foodType);
                success3_2 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img4 = convertDrawableToByteArray(R.drawable.b10);
            FoodModel food4 = new FoodModel("شوفان", "", img4, 110);
            long id4 = foodTableOperations.insertFoodData(food4);
            if (id4 > 0) {
                FoodDetailsModel foodModel4 = new FoodDetailsModel("شوفان", "2 مغرفة", 146, 27.5, 5.5, 1.8, 0, 0, 0, id4, foodType);
                success4 = foodDetailsTableOperations.insertFoodData(foodModel4);
            }
            byte[] img4_1 = convertDrawableToByteArray(R.drawable.b11);
            FoodModel food4_1 = new FoodModel("شوفان", "", img4_1, 165);
            long id4_1 = foodTableOperations.insertFoodData(food4_1);
            if (id4_1 > 0) {
                FoodDetailsModel foodModel4 = new FoodDetailsModel("شوفان", "3 مغارف", 220, 41, 8, 2.75, 0, 0, 0, id4_1, foodType);
                success4_1 = foodDetailsTableOperations.insertFoodData(foodModel4);
            }
            byte[] img4_2 = convertDrawableToByteArray(R.drawable.b12);
            FoodModel food4_2 = new FoodModel("شوفان", "", img4_2, 275);
            long id4_2 = foodTableOperations.insertFoodData(food4_2);
            if (id4_2 > 0) {
                FoodDetailsModel foodModel4 = new FoodDetailsModel("شوفان", "5 مغارف", 366, 69, 13.8, 4.6, 0, 0, 0, id4_2, foodType);
                success4_2 = foodDetailsTableOperations.insertFoodData(foodModel4);
            }
            byte[] img5 = convertDrawableToByteArray(R.drawable.b13);
            FoodModel food5 = new FoodModel("كينوا", "", img5, 90);
            long id5 = foodTableOperations.insertFoodData(food5);
            if (id5 > 0) {
                FoodDetailsModel foodModel5 = new FoodDetailsModel("كينوا", "2 مغرفة", 120, 20, 4, 2, 0, 0, 0, id5, foodType);
                success5 = foodDetailsTableOperations.insertFoodData(foodModel5);
            }
            byte[] img5_1 = convertDrawableToByteArray(R.drawable.b14);
            FoodModel food5_1 = new FoodModel("كينوا", "", img5_1, 140);
            long id5_1 = foodTableOperations.insertFoodData(food5_1);
            if (id5_1 > 0) {
                FoodDetailsModel foodModel5 = new FoodDetailsModel("كينوا", "3 مغارف", 180, 30, 6, 3, 0, 0, 0, id5_1, foodType);
                success5_1 = foodDetailsTableOperations.insertFoodData(foodModel5);
            }
            byte[] img5_2 = convertDrawableToByteArray(R.drawable.b15);
            FoodModel food5_2 = new FoodModel("كينوا", "", img5_2, 230);
            long id5_2 = foodTableOperations.insertFoodData(food5_2);
            if (id5_2 > 0) {
                FoodDetailsModel foodModel5 = new FoodDetailsModel("كينوا", "5 مغارف", 300, 50, 10, 5, 0, 0, 0, id5_2, foodType);
                success5_2 = foodDetailsTableOperations.insertFoodData(foodModel5);
            }
            byte[] img6 = convertDrawableToByteArray(R.drawable.b16);
            FoodModel food6 = new FoodModel("أرز أبيض بالزيت", "", img6, 60);
            long id6 = foodTableOperations.insertFoodData(food6);
            if (id6 > 0) {
                FoodDetailsModel foodModel6 = new FoodDetailsModel("أرز أبيض بالزيت", "2 مغرفة", 120, 20, 5, 2, 0, 0, 0, id6, foodType);
                success6 = foodDetailsTableOperations.insertFoodData(foodModel6);
            }
            byte[] img6_1 = convertDrawableToByteArray(R.drawable.b17);
            FoodModel food6_1 = new FoodModel("أرز أبيض بالزيت", "", img6_1, 120);
            long id6_1 = foodTableOperations.insertFoodData(food6_1);
            if (id6_1 > 0) {
                FoodDetailsModel foodModel6 = new FoodDetailsModel("أرز أبيض بالزيت", "3 مغارف", 180, 40, 8, 3, 0, 0, 0, id6_1, foodType);
                success6_1 = foodDetailsTableOperations.insertFoodData(foodModel6);
            }
            byte[] img6_2 = convertDrawableToByteArray(R.drawable.b18);
            FoodModel food6_2 = new FoodModel("أرز أبيض بالزيت", "", img6_2, 150);
            long id6_2 = foodTableOperations.insertFoodData(food6_2);
            if (id6_2 > 0) {
                FoodDetailsModel foodModel6 = new FoodDetailsModel("أرز أبيض بالزيت", "5 مغارف", 300, 60, 15, 5, 0, 0, 0, id6_2, foodType);
                success6_2 = foodDetailsTableOperations.insertFoodData(foodModel6);
            }
            byte[] img7 = convertDrawableToByteArray(R.drawable.b19);
            FoodModel food7 = new FoodModel("أرز أبيض مع الشعيرية بالزيت", "", img7, 60);
            long id7 = foodTableOperations.insertFoodData(food7);
            if (id7 > 0) {
                FoodDetailsModel foodModel7 = new FoodDetailsModel("أرز أبيض مع الشعيرية بالزيت", " 2 مغرفة ", 120, 20, 5, 2, 0, 0, 0, id7, foodType);
                success7 = foodDetailsTableOperations.insertFoodData(foodModel7);
            }
            byte[] img7_1 = convertDrawableToByteArray(R.drawable.b20);
            FoodModel food7_1 = new FoodModel("أرز أبيض مع الشعيرية بالزيت", "", img7_1, 90);
            long id7_1 = foodTableOperations.insertFoodData(food7_1);
            if (id7_1 > 0) {
                FoodDetailsModel foodModel7 = new FoodDetailsModel("أرز أبيض مع الشعيرية بالزيت", "3 مغارف", 180, 40, 8, 3, 0, 0, 0, id7_1, foodType);
                success7_1 = foodDetailsTableOperations.insertFoodData(foodModel7);
            }
            byte[] img7_2 = convertDrawableToByteArray(R.drawable.b21);
            FoodModel food7_2 = new FoodModel("أرز أبيض مع الشعيرية بالزيت", "", img7_2, 150);
            long id7_2 = foodTableOperations.insertFoodData(food7_2);
            if (id7_2 > 0) {
                FoodDetailsModel foodModel7 = new FoodDetailsModel("أرز أبيض مع الشعيرية بالزيت", "5 مغارف", 300, 60, 15, 5, 0, 0, 0, id7_2, foodType);
                success7_2 = foodDetailsTableOperations.insertFoodData(foodModel7);
            }
            byte[] img8 = convertDrawableToByteArray(R.drawable.b22);
            FoodModel food8 = new FoodModel("أرز بني", "", img8, 90);
            long id8 = foodTableOperations.insertFoodData(food8);
            if (id8 > 0) {
                FoodDetailsModel foodModel8 = new FoodDetailsModel("أرز بني", "2 مغرفة", 170, 30, 7, 2, 0, 0, 0, id8, foodType);
                success8 = foodDetailsTableOperations.insertFoodData(foodModel8);
            }
            byte[] img8_1 = convertDrawableToByteArray(R.drawable.b23);
            FoodModel food8_1 = new FoodModel("أرز بني", "", img8_1, 130);
            long id8_1 = foodTableOperations.insertFoodData(food8_1);
            if (id8_1 > 0) {
                FoodDetailsModel foodModel8 = new FoodDetailsModel("أرز بني", "3 مغارف", 250, 60, 10, 3, 0, 0, 0, id8_1, foodType);
                success8_1 = foodDetailsTableOperations.insertFoodData(foodModel8);
            }
            byte[] img8_2 = convertDrawableToByteArray(R.drawable.b24);
            FoodModel food8_2 = new FoodModel("أرز بني", "", img8_2, 220);
            long id8_2 = foodTableOperations.insertFoodData(food8_2);
            if (id8_2 > 0) {
                FoodDetailsModel foodModel8 = new FoodDetailsModel("أرز بني", "5 مغارف", 420, 90, 17, 5, 0, 0, 0, id8_2, foodType);
                success8_2 = foodDetailsTableOperations.insertFoodData(foodModel8);
            }
            byte[] img9 = convertDrawableToByteArray(R.drawable.b25);
            FoodModel food9 = new FoodModel("معكرونة سباغيتي-ساده", "", img9, 80);
            long id9 = foodTableOperations.insertFoodData(food9);
            if (id9 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("معكرونة سباغيتي-ساده", "نصف كوب", 150, 30, 6, 2, 0, 0, 0, id9, foodType);
                success9 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            byte[] img9_1 = convertDrawableToByteArray(R.drawable.b26);
            FoodModel food9_1 = new FoodModel("معكرونة سباغيتي-ساده", "", img9_1, 160);
            long id9_1 = foodTableOperations.insertFoodData(food9_1);
            if (id9_1 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("معكرونة سباغيتي-ساده", "كوب", 300, 60, 12, 4, 0, 0, 0, id9_1, foodType);
                success9_1 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            byte[] img10 = convertDrawableToByteArray(R.drawable.b27);
            FoodModel food10 = new FoodModel("معكرونه مشكله-ساده", "", img10, 80);
            long id10 = foodTableOperations.insertFoodData(food10);
            if (id10 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("معكرونه مشكله-ساده", "2 مغرفة", 160, 30, 6, 2, 0, 0, 0, id10, foodType);
                success10 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            byte[] img10_1 = convertDrawableToByteArray(R.drawable.b28);
            FoodModel food10_1 = new FoodModel("معكرونه مشكله-ساده", "", img10_1, 120);
            long id10_1 = foodTableOperations.insertFoodData(food10_1);
            if (id10_1 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("معكرونه مشكله-ساده", "3 مغارف", 240, 45, 9, 3, 0, 0, 0, id10_1, foodType);
                success10_1 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            byte[] img10_2 = convertDrawableToByteArray(R.drawable.b29);
            FoodModel food10_2 = new FoodModel("معكرونه مشكله-ساده", "", img10_2, 200);
            long id10_2 = foodTableOperations.insertFoodData(food10_2);
            if (id10_2 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("معكرونه مشكله-ساده", "5 مغارف", 400, 75, 15, 5, 0, 0, 0, id10_2, foodType);
                success10_2 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }

            if (success && success_1 && success_2 && success2 && success2_1 && success2_2 && success3 && success3_1 && success3_2 && success4 && success4_1 && success4_2 &&
                    success5 && success5_1 && success5_2 && success6 && success6_1 && success6_2 && success7 && success7_1 && success7_2 && success8 && success8_1 &&
                    success8_2 && success9 && success9_1 && success10 && success10_1 && success10_2) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public boolean insertVegetablesFoodDetails() {

        // do insert all Vegetables data in database for first time
        try {
            FoodDetailsTableOperations foodDetailsTableOperations = new FoodDetailsTableOperations(context);
            FoodTableOperations foodTableOperations = new FoodTableOperations(context);

            boolean success = false, success2 = false, success3 = false, success4 = false, success5 = false, success6 = false, success7 = false, success8 = false,
                    success9 = false, success10 = false, success11 = false, success11_1 = false, success11_2 = false, success12 = false, success13 = false,
                    success13_1 = false, success13_2 = false, success14 = false, success15 = false, success15_1 = false, success15_2 = false, success15_3 = false,
                    success16 = false, success17 = false, success18 = false, success19 = false, success20 = false, success20_1 = false, success20_2 = false, success21 = false,
                    success22 = false, success22_1 = false, success22_2 = false, success23 = false, success23_1 = false, success23_2 = false, success24 = false, success25 = false,
                    success26 = false, success27 = false, success28 = false, success29 = false, success30 = false, success30_1 = false, success30_2 = false, success31 = false,
                    success32 = false, success32_1 = false, success32_2 = false, success33 = false, success33_1 = false, success34 = false, success35 = false, success35_1 = false,
                    success35_2 = false, success36 = false, success37 = false, success38 = false, success39 = false;

            // الخضراوات
            // Vegetables
            String foodType = "الخضراوات";
            byte[] img = convertDrawableToByteArray(R.drawable.c1);
            FoodModel food1 = new FoodModel("خس مفروم", "", img, 60);
            long id = foodTableOperations.insertFoodData(food1);
            if (id > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("خس مفروم", "كوب", 25, 5, 2, 0, 0, 0, 0, id, foodType);
                success = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            byte[] img2 = convertDrawableToByteArray(R.drawable.c2);
            FoodModel food2 = new FoodModel("خس ورق", "", img2, 60);
            long id2 = foodTableOperations.insertFoodData(food2);
            if (id2 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("خس ورق", "5 اوراق", 25, 5, 2, 0, 0, 0, 0, id2, foodType);
                success2 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img3 = convertDrawableToByteArray(R.drawable.c3);
            FoodModel food3 = new FoodModel("بقدونس ", "", img3, 40);
            long id3 = foodTableOperations.insertFoodData(food3);
            if (id3 > 0) {
                FoodDetailsModel foodModel3 = new FoodDetailsModel("بقدونس", "كوب", 25, 5, 2, 0, 0, 0, 0, id3, foodType);
                success3 = foodDetailsTableOperations.insertFoodData(foodModel3);
            }
            byte[] img4 = convertDrawableToByteArray(R.drawable.c4);
            FoodModel food4 = new FoodModel("نعنع", "", img4, 40);
            long id4 = foodTableOperations.insertFoodData(food4);
            if (id4 > 0) {
                FoodDetailsModel foodModel4 = new FoodDetailsModel("نعنع", "كوب", 25, 5, 2, 0, 0, 0, 0, id4, foodType);
                success4 = foodDetailsTableOperations.insertFoodData(foodModel4);
            }
            byte[] img5 = convertDrawableToByteArray(R.drawable.c5);
            FoodModel food5 = new FoodModel("جرجير", "", img5, 30);
            long id5 = foodTableOperations.insertFoodData(food5);
            if (id5 > 0) {
                FoodDetailsModel foodModel5 = new FoodDetailsModel("جرجير", "كوب", 25, 5, 2, 0, 0, 0, 0, id5, foodType);
                success5 = foodDetailsTableOperations.insertFoodData(foodModel5);
            }
            byte[] img6 = convertDrawableToByteArray(R.drawable.c6);
            FoodModel food6 = new FoodModel("بصل اخضر", "", img6, 70);
            long id6 = foodTableOperations.insertFoodData(food6);
            if (id6 > 0) {
                FoodDetailsModel foodModel6 = new FoodDetailsModel("بصل اخضر", "كوب", 25, 5, 2, 0, 0, 0, 0, id6, foodType);
                success6 = foodDetailsTableOperations.insertFoodData(foodModel6);
            }
            byte[] img7 = convertDrawableToByteArray(R.drawable.c7);
            FoodModel food7 = new FoodModel("ملفوف", "", img7, 180);
            long id7 = foodTableOperations.insertFoodData(food7);
            if (id7 > 0) {
                FoodDetailsModel foodModel7 = new FoodDetailsModel("ملفوف", "كوبان", 50, 10, 4, 0, 0, 0, 0, id7, foodType);
                success7 = foodDetailsTableOperations.insertFoodData(foodModel7);
            }
            byte[] img8 = convertDrawableToByteArray(R.drawable.c8);
            FoodModel food8 = new FoodModel("ورق الشومر", "", img8, 70);
            long id8 = foodTableOperations.insertFoodData(food8);
            if (id8 > 0) {
                FoodDetailsModel foodModel8 = new FoodDetailsModel("ورق الشومر", "كوب", 25, 5, 2, 0, 0, 0, 0, id8, foodType);
                success8 = foodDetailsTableOperations.insertFoodData(foodModel8);
            }
            byte[] img9 = convertDrawableToByteArray(R.drawable.c9);
            FoodModel food9 = new FoodModel("زعتر اخضر", "", img9, 25);
            long id9 = foodTableOperations.insertFoodData(food9);
            if (id9 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("زعتر اخضر", "كوب", 25, 5, 2, 0, 0, 0, 0, id9, foodType);
                success9 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            byte[] img10 = convertDrawableToByteArray(R.drawable.c10);
            FoodModel food10 = new FoodModel("بندورة كرزية", "", img10, 150);
            long id10 = foodTableOperations.insertFoodData(food10);
            if (id10 > 0) {
                FoodDetailsModel foodModel10 = new FoodDetailsModel("بندورة كرزية", "كوب", 25, 5, 2, 0, 0, 0, 0, id10, foodType);
                success10 = foodDetailsTableOperations.insertFoodData(foodModel10);
            }
            byte[] img11 = convertDrawableToByteArray(R.drawable.c11);
            FoodModel food11 = new FoodModel("بندورة حب", "", img11, 80);
            long id11 = foodTableOperations.insertFoodData(food11);
            if (id11 > 0) {
                FoodDetailsModel foodModel11 = new FoodDetailsModel("بندورة حب", "صغير", 10, 2, 1, 0, 0, 0, 0, id11, foodType);
                success11 = foodDetailsTableOperations.insertFoodData(foodModel11);
            }
            FoodModel food11_1 = new FoodModel("بندورة حب", "", 160);
            long id11_1 = foodTableOperations.insertFoodData(food11_1);
            if (id11_1 > 0) {
                FoodDetailsModel foodModel11 = new FoodDetailsModel("بندورة حب", "وسط", 20, 4, 2, 0, 0, 0, 0, id11_1, foodType);
                success11_1 = foodDetailsTableOperations.insertFoodData(foodModel11);
            }
            FoodModel food11_2 = new FoodModel("بندورة حب", "", 240);
            long id11_2 = foodTableOperations.insertFoodData(food11_2);
            if (id11_2 > 0) {
                FoodDetailsModel foodModel11 = new FoodDetailsModel("بندورة حب", "كبير", 30, 6, 3, 0, 0, 0, 0, id11_2, foodType);
                success11_2 = foodDetailsTableOperations.insertFoodData(foodModel11);
            }
            byte[] img12 = convertDrawableToByteArray(R.drawable.c12);
            FoodModel food12 = new FoodModel("بندورة مفرومة", "", img12, 200);
            long id12 = foodTableOperations.insertFoodData(food12);
            if (id12 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("بندورة مفرومة", "كوب", 25, 5, 2, 0, 0, 0, 0, id12, foodType);
                success12 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img13 = convertDrawableToByteArray(R.drawable.c13);
            FoodModel food13 = new FoodModel("خيار", "", img13, 25);
            long id13 = foodTableOperations.insertFoodData(food13);
            if (id13 > 0) {
                FoodDetailsModel foodModel13 = new FoodDetailsModel("خيار", "صغير", 3.5, 1, 0, 0, 0, 0, 0, id13, foodType);
                success13 = foodDetailsTableOperations.insertFoodData(foodModel13);
            }
            FoodModel food13_1 = new FoodModel("خيار", "", 50);
            long id13_1 = foodTableOperations.insertFoodData(food13_1);
            if (id13_1 > 0) {
                FoodDetailsModel foodModel13 = new FoodDetailsModel("خيار", "وسط", 7, 1.5, 0.5, 0, 0, 0, 0, id13_1, foodType);
                success13_1 = foodDetailsTableOperations.insertFoodData(foodModel13);
            }
            FoodModel food13_2 = new FoodModel("خيار", "", 150);
            long id13_2 = foodTableOperations.insertFoodData(food13_2);
            if (id13_2 > 0) {
                FoodDetailsModel foodModel13 = new FoodDetailsModel("خيار", "كبير", 21, 4.5, 1.5, 0, 0, 0, 0, id13_2, foodType);
                success13_2 = foodDetailsTableOperations.insertFoodData(foodModel13);
            }
            byte[] img14 = convertDrawableToByteArray(R.drawable.c14);
            FoodModel food14 = new FoodModel("خيار مفروم", "", img14, 200);
            long id14 = foodTableOperations.insertFoodData(food14);
            if (id14 > 0) {
                FoodDetailsModel foodModel14 = new FoodDetailsModel("خيار مفروم", "كوب", 25, 5, 2, 0, 0, 0, 0, id14, foodType);
                success14 = foodDetailsTableOperations.insertFoodData(foodModel14);
            }
            byte[] img15 = convertDrawableToByteArray(R.drawable.c15);
            FoodModel food15 = new FoodModel("فجل", "", img15, 15);
            long id15 = foodTableOperations.insertFoodData(food15);
            if (id15 > 0) {
                FoodDetailsModel foodModel15 = new FoodDetailsModel("فجل", "صغير", 2.5, 0.5, 0, 0, 0, 0, 0, id15, foodType);
                success15 = foodDetailsTableOperations.insertFoodData(foodModel15);
            }
            FoodModel food15_1 = new FoodModel("فجل", "", 30);
            long id15_1 = foodTableOperations.insertFoodData(food15_1);
            if (id15_1 > 0) {
                FoodDetailsModel foodModel15 = new FoodDetailsModel("فجل", "صغير", 5, 1, 0.5, 0, 0, 0, 0, id15_1, foodType);
                success15_1 = foodDetailsTableOperations.insertFoodData(foodModel15);
            }
            FoodModel food15_2 = new FoodModel("فجل", "", 60);
            long id15_2 = foodTableOperations.insertFoodData(food15_2);
            if (id15_2 > 0) {
                FoodDetailsModel foodModel15 = new FoodDetailsModel("فجل", "وسط", 10, 2, 1, 0, 0, 0, 0, id15_2, foodType);
                success15_2 = foodDetailsTableOperations.insertFoodData(foodModel15);
            }
            FoodModel food15_3 = new FoodModel("فجل", "", 90);
            long id15_3 = foodTableOperations.insertFoodData(food15_3);
            if (id15_3 > 0) {
                FoodDetailsModel foodModel15 = new FoodDetailsModel("فجل", "كبير", 12.5, 2.5, 1, 0, 0, 0, 0, id15_3, foodType);
                success15_3 = foodDetailsTableOperations.insertFoodData(foodModel15);
            }
            byte[] img16 = convertDrawableToByteArray(R.drawable.c16);
            FoodModel food16 = new FoodModel("فجل مفروم", "", img16, 180);
            long id16 = foodTableOperations.insertFoodData(food16);
            if (id16 > 0) {
                FoodDetailsModel foodModel16 = new FoodDetailsModel("فجل مفروم", "كوب", 25, 5, 2, 0, 0, 0, 0, id16, foodType);
                success16 = foodDetailsTableOperations.insertFoodData(foodModel16);
            }
            byte[] img17 = convertDrawableToByteArray(R.drawable.c17);
            FoodModel food17 = new FoodModel("بصل مفروم", "", img17, 150);
            long id17 = foodTableOperations.insertFoodData(food17);
            if (id17 > 0) {
                FoodDetailsModel foodModel17 = new FoodDetailsModel("بصل مفروم", "كوب", 25, 5, 2, 0, 0, 0, 0, id17, foodType);
                success17 = foodDetailsTableOperations.insertFoodData(foodModel17);
            }
            byte[] img18 = convertDrawableToByteArray(R.drawable.c18);
            FoodModel food18 = new FoodModel("فلفل حار مفروم", "", img18, 115);
            long id18 = foodTableOperations.insertFoodData(food18);
            if (id18 > 0) {
                FoodDetailsModel foodModel18 = new FoodDetailsModel("فلفل حار مفروم", "كوب", 25, 5, 2, 0, 0, 0, 0, id18, foodType);
                success18 = foodDetailsTableOperations.insertFoodData(foodModel18);
            }
            byte[] img19 = convertDrawableToByteArray(R.drawable.c19);
            FoodModel food19 = new FoodModel("فلفل حلو ملون مفروم", "", img19, 150);
            long id19 = foodTableOperations.insertFoodData(food19);
            if (id19 > 0) {
                FoodDetailsModel foodModel19 = new FoodDetailsModel("فلفل حلو ملون مفروم", "كوب", 25, 5, 2, 0, 0, 0, 0, id19, foodType);
                success19 = foodDetailsTableOperations.insertFoodData(foodModel19);
            }
            byte[] img20 = convertDrawableToByteArray(R.drawable.c20);
            FoodModel food20 = new FoodModel("فلفل حلو اخضر", "", img20, 70);
            long id20 = foodTableOperations.insertFoodData(food20);
            if (id20 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("فلفل حلو اخضر", "صغير ", 12, 2.5, 1, 0, 0, 0, 0, id20, foodType);
                success20 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            FoodModel food20_1 = new FoodModel("فلفل حلو اخضر", "", 100);
            long id20_1 = foodTableOperations.insertFoodData(food20_1);
            if (id20_1 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("فلفل حلو اخضر", "وسط ", 17, 3.5, 1.5, 0, 0, 0, 0, id20_1, foodType);
                success20_1 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            FoodModel food20_2 = new FoodModel("فلفل حلو اخضر", "", 150);
            long id20_2 = foodTableOperations.insertFoodData(food20_2);
            if (id20_2 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("فلفل حلو اخضر", "كبير ", 25, 5, 2, 0, 0, 0, 0, id20_2, foodType);
                success20_2 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img21 = convertDrawableToByteArray(R.drawable.c21);
            FoodModel food21 = new FoodModel("فلفل اصفر حلو", "", img21, 170);
            long id21 = foodTableOperations.insertFoodData(food21);
            if (id21 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("فلفل اصفر حلو", "كبير", 30, 6, 2.5, 0, 0, 0, 0, id21, foodType);
                success21 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img22 = convertDrawableToByteArray(R.drawable.c22);
            FoodModel food22 = new FoodModel("فلفل حلو احمر", "", img22, 60);
            long id22 = foodTableOperations.insertFoodData(food22);
            if (id22 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("فلفل حلو احمر", "صغير", 12, 2, 0.5, 0, 0, 0, 0, id22, foodType);
                success22 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            FoodModel food22_1 = new FoodModel("فلفل حلو احمر", "", 100);
            long id22_1 = foodTableOperations.insertFoodData(food22_1);
            if (id22_1 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("فلفل حلو احمر", "وسط", 17, 3, 1.5, 0, 0, 0, 0, id22_1, foodType);
                success22_1 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            FoodModel food22_2 = new FoodModel("فلفل حلو احمر", "", 180);
            long id22_2 = foodTableOperations.insertFoodData(food22_2);
            if (id22_2 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("فلفل حلو احمر", "كبير", 30, 6, 2, 0, 0, 0, 0, id22_2, foodType);
                success22_2 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img23 = convertDrawableToByteArray(R.drawable.c23);
            FoodModel food23 = new FoodModel("جزر", "", img23, 40);
            long id23 = foodTableOperations.insertFoodData(food23);
            if (id23 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("جزر", "صغير ", 3, 0.5, 0, 0, 0, 0, 0, id23, foodType);
                success23 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            FoodModel food23_1 = new FoodModel("جزر", "", 80);
            long id23_1 = foodTableOperations.insertFoodData(food23_1);
            if (id23_1 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("جزر", "وسط ", 6, 1, 0.5, 0, 0, 0, 0, id23_1, foodType);
                success23_1 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            FoodModel food23_2 = new FoodModel("جزر", "", 100);
            long id23_2 = foodTableOperations.insertFoodData(food23_2);
            if (id23_2 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("جزر", "كبير ", 7, 1.5, 1, 0, 0, 0, 0, id23_2, foodType);
                success23_2 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img24 = convertDrawableToByteArray(R.drawable.c24);
            FoodModel food24 = new FoodModel("جزر مفروم", "", img24, 170);
            long id24 = foodTableOperations.insertFoodData(food24);
            if (id24 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("جزر مفروم", "نصف كوب", 10, 2.5, 1, 0, 0, 0, 0, id24, foodType);
                success24 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img25 = convertDrawableToByteArray(R.drawable.c25);
            FoodModel food25 = new FoodModel("كرفس", "", img25, 150);
            long id25 = foodTableOperations.insertFoodData(food25);
            if (id25 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("كرفس", "كوب", 25, 5, 2, 0, 0, 0, 0, id25, foodType);
                success25 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img26 = convertDrawableToByteArray(R.drawable.c26);
            FoodModel food26 = new FoodModel("باذنجان", "", img26, 80);
            long id26 = foodTableOperations.insertFoodData(food26);
            if (id26 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("باذنجان", "نصف كوب", 13, 2.5, 1, 0, 0, 0, 0, id26, foodType);
                success26 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img27 = convertDrawableToByteArray(R.drawable.c27);
            FoodModel food27 = new FoodModel("بروكليا", "", img27, 45);
            long id27 = foodTableOperations.insertFoodData(food27);
            if (id27 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("بروكلي", "نصف كوب", 12.5, 2.5, 1, 0, 0, 0, 0, id27, foodType);
                success27 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img28 = convertDrawableToByteArray(R.drawable.c28);
            FoodModel food28 = new FoodModel("بروكلي", "", img28, 90);
            long id28 = foodTableOperations.insertFoodData(food28);
            if (id28 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("بروكلي", "كوب", 25, 5, 2, 0, 0, 0, 0, id28, foodType);
                success28 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img29 = convertDrawableToByteArray(R.drawable.c29);
            FoodModel food29 = new FoodModel("قرنبيط (زهرة)", "", img29, 150);
            long id29 = foodTableOperations.insertFoodData(food29);
            if (id29 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("قرنبيط (زهرة)", "نصف كوب", 12.5, 2.5, 1, 0, 0, 0, 0, id29, foodType);
                success29 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img30 = convertDrawableToByteArray(R.drawable.c30);
            FoodModel food30 = new FoodModel("كوسا", "", img30, 35);
            long id30 = foodTableOperations.insertFoodData(food30);
            if (id30 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("كوسا", "صغير", 2.5, 0.5, 0.0, 0, 0, 0, 0, id30, foodType);
                success30 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            FoodModel food30_1 = new FoodModel("كوسا", "", 90);
            long id30_1 = foodTableOperations.insertFoodData(food30_1);
            if (id30_1 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("كوسا", "وسط", 7, 1.5, 0.5, 0, 0, 0, 0, id30_1, foodType);
                success30_1 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            FoodModel food30_2 = new FoodModel("كوسا", "", 160);
            long id30_2 = foodTableOperations.insertFoodData(food30_2);
            if (id30_2 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("كوسا", "كبير", 13, 2.5, 1, 0, 0, 0, 0, id30_2, foodType);
                success30_2 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img31 = convertDrawableToByteArray(R.drawable.c31);
            FoodModel food31 = new FoodModel("كوسا مفرومة", "", img31, 160);
            long id31 = foodTableOperations.insertFoodData(food31);
            if (id31 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("كوسا مفرومة", "نصف كوب", 13, 2.5, 1, 0, 0, 0, 0, id31, foodType);
                success31 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img32 = convertDrawableToByteArray(R.drawable.c32);
            FoodModel food32 = new FoodModel("فطر مشرم فقع", "", img32, 8);
            long id32 = foodTableOperations.insertFoodData(food32);
            if (id32 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("فطر مشرم فقع", "صغير", 2, 0.0, 0.0, 0, 0, 0, 0, id32, foodType);
                success32 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            FoodModel food32_1 = new FoodModel("فطر مشرم فقع", "", 16);
            long id32_1 = foodTableOperations.insertFoodData(food32_1);
            if (id32_1 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("فطر مشرم فقع", "وسط", 4, 0.5, 0.0, 0, 0, 0, 0, id32_1, foodType);
                success32_1 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            FoodModel food32_2 = new FoodModel("فطر مشرم فقع", "", 25);
            long id32_2 = foodTableOperations.insertFoodData(food32_2);
            if (id32_2 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("فطر مشرم فقع", "كبير", 6, 1, 0.5, 0, 0, 0, 0, id30_2, foodType);
                success32_2 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img33 = convertDrawableToByteArray(R.drawable.c33);
            FoodModel food33 = new FoodModel("فطر مفروم", "", img33, 50);
            long id33 = foodTableOperations.insertFoodData(food33);
            if (id33 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("فطر مفروم", "نصف كوب", 13, 2.5, 1, 0, 0, 0, 0, id33, foodType);
                success33 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img33_1 = convertDrawableToByteArray(R.drawable.c34);
            FoodModel food33_1 = new FoodModel("فطر مفروم", "", img33_1, 100);
            long id33_1 = foodTableOperations.insertFoodData(food33_1);
            if (id33_1 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("فطر مفروم", " كوب", 25, 5, 2, 0, 0, 0, 0, id33_1, foodType);
                success33_1 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img34 = convertDrawableToByteArray(R.drawable.c35);
            FoodModel food34 = new FoodModel("فاصولياء خضراء", "", img34, 130);
            long id34 = foodTableOperations.insertFoodData(food34);
            if (id34 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("فاصولياء خضراء", " كوب", 25, 5, 2, 0, 0, 0, 0, id34, foodType);
                success34 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img35 = convertDrawableToByteArray(R.drawable.c36);
            FoodModel food35 = new FoodModel("بطاطا حلوة", "", img35, 50);
            long id35 = foodTableOperations.insertFoodData(food35);
            if (id35 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("بطاطا حلوة", " صغير", 45, 8, 1.5, 0, 0, 0, 0, id35, foodType);
                success35 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            FoodModel food35_1 = new FoodModel("بطاطا حلوة", "", 80);
            long id35_1 = foodTableOperations.insertFoodData(food35_1);
            if (id35_1 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("بطاطا حلوة", " وسط", 75, 15, 2.5, 0, 0, 0, 0, id35_1, foodType);
                success35_1 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            FoodModel food35_2 = new FoodModel("بطاطا حلوة", "", 120);
            long id35_2 = foodTableOperations.insertFoodData(food35_2);
            if (id35_2 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("بطاطا حلوة", " كبير", 110, 20, 4, 0, 0, 0, 0, id35_2, foodType);
                success35_2 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img36 = convertDrawableToByteArray(R.drawable.c37);
            FoodModel food36 = new FoodModel("بطاطا حلوة مفرومة", "", img36, 90);
            long id36 = foodTableOperations.insertFoodData(food36);
            if (id36 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("بطاطا حلوة مفرومة", " نصف كوب", 80, 15, 3, 0, 0, 0, 0, id36, foodType);
                success36 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img37 = convertDrawableToByteArray(R.drawable.c38);
            FoodModel food37 = new FoodModel("بطاطا مسلوقة", "", img37, 90);
            long id37 = foodTableOperations.insertFoodData(food37);
            if (id37 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("بطاطا مسلوقة", " نصف كوب", 80, 15, 3, 0, 0, 0, 0, id37, foodType);
                success37 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img38 = convertDrawableToByteArray(R.drawable.c39);
            FoodModel food38 = new FoodModel("قرع", "", img38, 95);
            long id38 = foodTableOperations.insertFoodData(food38);
            if (id38 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("قرع", " نصف كوب", 80, 15, 3, 0, 0, 0, 0, id38, foodType);
                success38 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img39 = convertDrawableToByteArray(R.drawable.c40);
            FoodModel food39 = new FoodModel("شمندر", "", img39, 75);
            long id39 = foodTableOperations.insertFoodData(food39);
            if (id39 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("شمندر", " نصف كوب", 12.5, 2.5, 1, 0, 0, 0, 0, id39, foodType);
                success39 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }

            if (success && success2 && success3 && success4 && success5 && success6 && success7 && success8 && success9 && success10 &&
                    success11 && success11_1 && success11_2 && success12 && success13 && success13_1 && success13_2 && success14 && success15 &&
                    success15_1 && success15_2 && success15_3 && success16 && success17 && success18 && success19 && success20 && success20_1 && success20_2
                    && success21 && success22 && success22_1 && success22_2 && success23 && success23_1 && success23_2 && success24 && success25 && success26 &&
                    success27 && success28 && success29 && success30 && success30_1 && success30_2 && success31 && success32 && success32_1 && success32_2 && success33 && success33_1
                    && success34 && success35 && success35_1 && success35_2 && success36 && success37 && success38 && success39) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public boolean insertSnacksFoodDetails() {

        // do insert all Snacks data in database for first time
        try {
            FoodDetailsTableOperations foodDetailsTableOperations = new FoodDetailsTableOperations(context);
            FoodTableOperations foodTableOperations = new FoodTableOperations(context);

            boolean success = false, success_1 = false, success2 = false, success2_1 = false, success3 = false, success3_1 = false, success4 = false, success5 = false,
                    success5_1 = false, success6 = false, success6_1 = false, success7 = false, success7_1 = false, success8 = false, success8_1 = false, success8_2 = false,
                    success9 = false, success9_1 = false, success10 = false, success10_1 = false, success11 = false, success12 = false, success13 = false, success14 = false,
                    success15 = false, success16 = false, success17 = false, success18 = false, success19 = false, success20 = false, success21 = false, success21_1 = false,
                    success22 = false, success23 = false, success23_1 = false, success24 = false, success24_1 = false, success25 = false, success25_1 = false, success26 = false,
                    success27 = false, success28 = false, success29 = false, success30 = false, success31 = false, success32 = false, success33 = false, success34 = false,
                    success35 = false, success36 = false, success37 = false, success38 = false, success39 = false, success40 = false, success41 = false, success42 = false,
                    success42_1 = false, success43 = false, success43_1 = false, success44 = false, success44_1 = false, success45 = false, success45_1 = false,
                    success46 = false, success46_1 = false, success47 = false, success47_1 = false, success48 = false, success49 = false, success49_1 = false;

            // المقبلات
            // Snacks
            String foodType = "المقبلات";
            byte[] img = convertDrawableToByteArray(R.drawable.f1);
            FoodModel food1 = new FoodModel("متبل باذنجان (بابا غنوش)", "", img, 80);
            long id = foodTableOperations.insertFoodData(food1);
            if (id > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("متبل باذنجان (بابا غنوش)", "2 ملعقة", 150, 9, 4.5, 11, 0, 0, 0, id, foodType);
                success = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            FoodModel food1_1 = new FoodModel("متبل باذنجان (بابا غنوش)", "", 180);
            long id_1 = foodTableOperations.insertFoodData(food1_1);
            if (id_1 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("متبل باذنجان (بابا غنوش)", "4 ملاعق", 300, 18, 9, 22, 0, 0, 0, id_1, foodType);
                success_1 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            byte[] img2 = convertDrawableToByteArray(R.drawable.f2);
            FoodModel food2 = new FoodModel("متبل كوسا", "", img2, 70);
            long id2 = foodTableOperations.insertFoodData(food2);
            if (id2 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("متبل كوسا", "2 ملعقة", 45, 3, 2, 3, 0, 0, 0, id2, foodType);
                success2 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            FoodModel food2_1 = new FoodModel("متبل كوسا", "", 140);
            long id2_1 = foodTableOperations.insertFoodData(food2_1);
            if (id2_1 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("متبل كوسا", "4 ملاعق", 90, 6, 4, 6, 0, 0, 0, id2_1, foodType);
                success2_1 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img3 = convertDrawableToByteArray(R.drawable.f3);
            FoodModel food3 = new FoodModel("متبل افوكادو", "", img3, 50);
            long id3 = foodTableOperations.insertFoodData(food3);
            if (id3 > 0) {
                FoodDetailsModel foodModel3 = new FoodDetailsModel("متبل افوكادو", "2 ملعقة", 0.0, 0.0, 10, 90, 0, 0, 0, id3, foodType);
                success3 = foodDetailsTableOperations.insertFoodData(foodModel3);
            }
            FoodModel food3_1 = new FoodModel("متبل افوكادو", "", 100);
            long id3_1 = foodTableOperations.insertFoodData(food3_1);
            if (id3_1 > 0) {
                FoodDetailsModel foodModel3 = new FoodDetailsModel("متبل افوكادو", "4 ملاعق", 0.0, 0.0, 20, 180, 0, 0, 0, id3_1, foodType);
                success3_1 = foodDetailsTableOperations.insertFoodData(foodModel3);
            }
            byte[] img4 = convertDrawableToByteArray(R.drawable.f4);
            FoodModel food4 = new FoodModel("مدمس بندورة.", "", img4, 90);
            long id4 = foodTableOperations.insertFoodData(food4);
            if (id4 > 0) {
                FoodDetailsModel foodModel4 = new FoodDetailsModel("مدمس بندورة.", "2 ملعقة", 60, 3, 1, 5, 0, 0, 0, id4, foodType);
                success4 = foodDetailsTableOperations.insertFoodData(foodModel4);
            }
            byte[] img5 = convertDrawableToByteArray(R.drawable.f5);
            FoodModel food5 = new FoodModel("قلاية بندورة.", "", img5, 45);
            long id5 = foodTableOperations.insertFoodData(food5);
            if (id5 > 0) {
                FoodDetailsModel foodModel5 = new FoodDetailsModel("قلاية بندورة.", "2 ملعقة", 35, 2.5, 1, 2.5, 0, 0, 0, id5, foodType);
                success5 = foodDetailsTableOperations.insertFoodData(foodModel5);
            }
            FoodModel food5_1 = new FoodModel("قلاية بندورة.", "", 90);
            long id5_1 = foodTableOperations.insertFoodData(food5_1);
            if (id5_1 > 0) {
                FoodDetailsModel foodModel5 = new FoodDetailsModel("قلاية بندورة.", "4 ملاعق", 70, 5, 2, 5, 0, 0, 0, id5_1, foodType);
                success5_1 = foodDetailsTableOperations.insertFoodData(foodModel5);
            }
            byte[] img6 = convertDrawableToByteArray(R.drawable.f6);
            FoodModel food6 = new FoodModel("حمص", "", img6, 90);
            long id6 = foodTableOperations.insertFoodData(food6);
            if (id6 > 0) {
                FoodDetailsModel foodModel6 = new FoodDetailsModel("حمص", "2 ملعقة", 85, 10, 1.5, 3.5, 0, 0, 0, id6, foodType);
                success6 = foodDetailsTableOperations.insertFoodData(foodModel6);
            }
            FoodModel food6_1 = new FoodModel("حمص", "", 170);
            long id6_1 = foodTableOperations.insertFoodData(food6_1);
            if (id6_1 > 0) {
                FoodDetailsModel foodModel6 = new FoodDetailsModel("حمص", "4 ملاعق", 170, 20, 3, 7, 0, 0, 0, id6, foodType);
                success6_1 = foodDetailsTableOperations.insertFoodData(foodModel6);
            }
            byte[] img7 = convertDrawableToByteArray(R.drawable.f7);
            FoodModel food7 = new FoodModel("مدمس فول", "", img7, 80);
            long id7 = foodTableOperations.insertFoodData(food7);
            if (id7 > 0) {
                FoodDetailsModel foodModel7 = new FoodDetailsModel("مدمس فول", "2 ملعقة", 70, 7.5, 4.5, 2.5, 0, 0, 0, id7, foodType);
                success7 = foodDetailsTableOperations.insertFoodData(foodModel7);
            }
            FoodModel food7_1 = new FoodModel("مدمس فول", "", 160);
            long id7_1 = foodTableOperations.insertFoodData(food7_1);
            if (id7_1 > 0) {
                FoodDetailsModel foodModel7 = new FoodDetailsModel("مدمس فول", "4 ملاعق", 140, 15, 9, 5, 0, 0, 0, id7_1, foodType);
                success7_1 = foodDetailsTableOperations.insertFoodData(foodModel7);
            }
            byte[] img8 = convertDrawableToByteArray(R.drawable.f8);
            FoodModel food8 = new FoodModel("فلافل", "", img8, 35);
            long id8 = foodTableOperations.insertFoodData(food8);
            if (id8 > 0) {
                FoodDetailsModel foodModel8 = new FoodDetailsModel("فلافل", "صغير", 115, 20, 8, 1, 0, 0, 0, id8, foodType);
                success8 = foodDetailsTableOperations.insertFoodData(foodModel8);
            }
            FoodModel food8_1 = new FoodModel("فلافل", "", 40);
            long id8_1 = foodTableOperations.insertFoodData(food8_1);
            if (id8_1 > 0) {
                FoodDetailsModel foodModel8 = new FoodDetailsModel("فلافل", "وسط ", 130, 25, 9, 1.5, 0, 0, 0, id8_1, foodType);
                success8_1 = foodDetailsTableOperations.insertFoodData(foodModel8);
            }
            FoodModel food8_2 = new FoodModel("فلافل", "", 55);
            long id8_2 = foodTableOperations.insertFoodData(food8_2);
            if (id8_2 > 0) {
                FoodDetailsModel foodModel8 = new FoodDetailsModel("فلافل", "كبير", 170, 30, 12, 2, 0, 0, 0, id8_2, foodType);
                success8_2 = foodDetailsTableOperations.insertFoodData(foodModel8);
            }
            byte[] img9 = convertDrawableToByteArray(R.drawable.f9);
            FoodModel food9 = new FoodModel("فلافل محشي", "", img9, 40);
            long id9 = foodTableOperations.insertFoodData(food9);
            if (id9 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("فلافل محشي", "وسط", 130, 20, 10, 1.5, 0, 0, 0, id9, foodType);
                success9 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            byte[] img9_1 = convertDrawableToByteArray(R.drawable.f10);
            FoodModel food9_1 = new FoodModel("فلافل محشي", "", img9_1, 55);
            long id9_1 = foodTableOperations.insertFoodData(food9_1);
            if (id9_1 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("فلافل محشي", "كبير", 180, 30, 15, 2.5, 0, 0, 0, id9_1, foodType);
                success9_1 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            byte[] img10 = convertDrawableToByteArray(R.drawable.f11);
            FoodModel food10 = new FoodModel("مسبحة", "", img10, 65);
            long id10 = foodTableOperations.insertFoodData(food10);
            if (id10 > 0) {
                FoodDetailsModel foodModel10 = new FoodDetailsModel("مسبحة", "2 ملعقة", 150, 12, 5, 8, 0, 0, 0, id10, foodType);
                success10 = foodDetailsTableOperations.insertFoodData(foodModel10);
            }
            FoodModel food10_1 = new FoodModel("مسبحة", "", 130);
            long id10_1 = foodTableOperations.insertFoodData(food10_1);
            if (id10_1 > 0) {
                FoodDetailsModel foodModel10 = new FoodDetailsModel("مسبحة", "4 ملاعق", 300, 24, 10, 16, 0, 0, 0, id10_1, foodType);
                success10_1 = foodDetailsTableOperations.insertFoodData(foodModel10);
            }
            byte[] img11 = convertDrawableToByteArray(R.drawable.f12);
            FoodModel food11 = new FoodModel("مخلل خيار", "", img11, 80);
            long id11 = foodTableOperations.insertFoodData(food11);
            if (id11 > 0) {
                FoodDetailsModel foodModel11 = new FoodDetailsModel("مخلل خيار", "وسط", 45, 10, 0.0, 0.0, 0, 0, 0, id11, foodType);
                success11 = foodDetailsTableOperations.insertFoodData(foodModel11);
            }
            byte[] img12 = convertDrawableToByteArray(R.drawable.f13);
            FoodModel food12 = new FoodModel("مخلل باذنجان بالزيت محشي بالجوز و البقدونس", "", img12, 80);
            long id12 = foodTableOperations.insertFoodData(food12);
            if (id12 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مخلل باذنجان بالزيت محشي بالجوز و البقدونس", "وسط", 85, 6, 2, 6, 0, 0, 0, id12, foodType);
                success12 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img13 = convertDrawableToByteArray(R.drawable.f14);
            FoodModel food13 = new FoodModel("مخلل باذنجان بالزيت.", "", img13, 30);
            long id13 = foodTableOperations.insertFoodData(food13);
            if (id13 > 0) {
                FoodDetailsModel foodModel13 = new FoodDetailsModel("مخلل باذنجان بالزيت.", "صغير", 30, 2, 1, 2, 0, 0, 0, id13, foodType);
                success13 = foodDetailsTableOperations.insertFoodData(foodModel13);
            }
            byte[] img14 = convertDrawableToByteArray(R.drawable.f15);
            FoodModel food14 = new FoodModel("مخلل قرن الغزال", "", img14, 60);
            long id14 = foodTableOperations.insertFoodData(food14);
            if (id14 > 0) {
                FoodDetailsModel foodModel14 = new FoodDetailsModel("مخلل قرن الغزال", "وسط", 5, 2, 0.0, 25, 0, 0, 0, id14, foodType);
                success14 = foodDetailsTableOperations.insertFoodData(foodModel14);
            }
            byte[] img15 = convertDrawableToByteArray(R.drawable.f16);
            FoodModel food15 = new FoodModel("خلطة مخلل بالزيت", "", img15, 40);
            long id15 = foodTableOperations.insertFoodData(food15);
            if (id15 > 0) {
                FoodDetailsModel foodModel15 = new FoodDetailsModel("خلطة مخلل بالزيت", "ملعقه كبيره", 0.0, 0.0, 5, 25, 0, 0, 0, id15, foodType);
                success15 = foodDetailsTableOperations.insertFoodData(foodModel15);
            }
            byte[] img16 = convertDrawableToByteArray(R.drawable.f17);
            FoodModel food16 = new FoodModel("مخلل فلفل", "", img16, 140);
            long id16 = foodTableOperations.insertFoodData(food16);
            if (id16 > 0) {
                FoodDetailsModel foodModel16 = new FoodDetailsModel("مخلل فلفل", "كوب", 40, 10, 1, 0.0, 0, 0, 0, id16, foodType);
                success16 = foodDetailsTableOperations.insertFoodData(foodModel16);
            }
            byte[] img17 = convertDrawableToByteArray(R.drawable.f18);
            FoodModel food17 = new FoodModel("مخلل لفت", "", img17, 170);
            long id17 = foodTableOperations.insertFoodData(food17);
            if (id17 > 0) {
                FoodDetailsModel foodModel17 = new FoodDetailsModel("مخلل لفت", "كوب", 35, 17, 1.5, 0.0, 0, 0, 0, id17, foodType);
                success17 = foodDetailsTableOperations.insertFoodData(foodModel17);
            }
            byte[] img18 = convertDrawableToByteArray(R.drawable.f19);
            FoodModel food18 = new FoodModel("زيتون اخضر", "", img18, 25);
            long id18 = foodTableOperations.insertFoodData(food18);
            if (id18 > 0) {
                FoodDetailsModel foodModel18 = new FoodDetailsModel("زيتون اخضر", "ملعقه كبيرة", 30, 0.0, 0.0, 3, 0, 0, 0, id18, foodType);
                success18 = foodDetailsTableOperations.insertFoodData(foodModel18);
            }
            byte[] img19 = convertDrawableToByteArray(R.drawable.f20);
            FoodModel food19 = new FoodModel("زيتون اسود", "", img19, 25);
            long id19 = foodTableOperations.insertFoodData(food19);
            if (id19 > 0) {
                FoodDetailsModel foodModel19 = new FoodDetailsModel("زيتون اسود", "1 ملعقة", 55, 0.0, 0.0, 6, 0, 0, 0, id19, foodType);
                success19 = foodDetailsTableOperations.insertFoodData(foodModel19);
            }
            byte[] img20 = convertDrawableToByteArray(R.drawable.f21);
            FoodModel food20 = new FoodModel("زيتون محشو", "", img20, 40);
            long id20 = foodTableOperations.insertFoodData(food20);
            if (id20 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("زيتون محشو", "2 ملعقة", 45, 0.0, 0.0, 5, 0, 0, 0, id20, foodType);
                success20 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img21 = convertDrawableToByteArray(R.drawable.f22);
            FoodModel food21 = new FoodModel("شطة", "", img21, 30);
            long id21 = foodTableOperations.insertFoodData(food21);
            if (id21 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("شطة", "1 ملعقة", 30, 8, 0.0, 0.0, 0, 0, 0, id21, foodType);
                success21 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            FoodModel food21_1 = new FoodModel("شطة", "", 30);
            long id21_1 = foodTableOperations.insertFoodData(food21_1);
            if (id21_1 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("شطة", "2 ملعقة", 60, 16, 0.0, 0.0, 0, 0, 0, id21_1, foodType);
                success21_1 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img22 = convertDrawableToByteArray(R.drawable.f23);
            FoodModel food22 = new FoodModel("كبة لحم مقلية", "", img22, 60);
            long id22 = foodTableOperations.insertFoodData(food22);
            if (id22 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("كبة لحم مقلية", "وسط", 150, 15, 7, 7, 0, 0, 0, id22, foodType);
                success22 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img23 = convertDrawableToByteArray(R.drawable.f24);
            FoodModel food23 = new FoodModel("كبة لحم مشوية", "", img23, 80);
            long id23 = foodTableOperations.insertFoodData(food23);
            if (id23 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("كبة لحم مشوية", "وسط", 120, 10, 2, 5, 0, 0, 0, id23, foodType);
                success23 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            FoodModel food23_1 = new FoodModel("كبة لحم مشوية", "", 100);
            long id23_1 = foodTableOperations.insertFoodData(food23_1);
            if (id23_1 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("كبة لحم مشوية", "كبير", 190, 20, 3, 8, 0, 0, 0, id23_1, foodType);
                success23_1 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img24 = convertDrawableToByteArray(R.drawable.f25);
            FoodModel food24 = new FoodModel("خبز توست مثوم", "", img24, 15);
            long id24 = foodTableOperations.insertFoodData(food24);
            if (id24 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("خبز توست مثوم", "صغير", 50, 10, 2, 1, 0, 0, 0, id24, foodType);
                success24 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            FoodModel food24_1 = new FoodModel("خبز توست مثوم", "", 25);
            long id24_1 = foodTableOperations.insertFoodData(food24_1);
            if (id24_1 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("خبز توست مثوم", "وسط", 70, 14, 2, 1, 0, 0, 0, id24_1, foodType);
                success24_1 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img25 = convertDrawableToByteArray(R.drawable.f26);
            FoodModel food25 = new FoodModel("خبز توست مثوم مع جبنة صفراء", "", img25, 20);
            long id25 = foodTableOperations.insertFoodData(food25);
            if (id25 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("خبز توست مثوم مع جبنة صفراء", "وسط", 100, 12, 4, 5, 0, 0, 0, id25, foodType);
                success25 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            FoodModel food25_1 = new FoodModel("خبز توست مثوم مع جبنة صفراء", "", 50);
            long id25_1 = foodTableOperations.insertFoodData(food25_1);
            if (id25_1 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("خبز توست مثوم مع جبنة صفراء", "كبير", 200, 28, 7, 6, 0, 0, 0, id25_1, foodType);
                success25_1 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img26 = convertDrawableToByteArray(R.drawable.f27);
            FoodModel food26 = new FoodModel("بطاطا مقلية (أصابع)", "", img26, 80);
            long id26 = foodTableOperations.insertFoodData(food26);
            if (id26 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("بطاطا مقلية (أصابع)", " كوب", 240, 28, 3, 13, 0, 0, 0, id26, foodType);
                success26 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img27 = convertDrawableToByteArray(R.drawable.f28);
            FoodModel food27 = new FoodModel("كبة البطاطا", "", img27, 50);
            long id27 = foodTableOperations.insertFoodData(food27);
            if (id27 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("كبة البطاطا", "وسط", 70, 2, 7, 5, 0, 0, 0, id27, foodType);
                success27 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img28 = convertDrawableToByteArray(R.drawable.f29);
            FoodModel food28 = new FoodModel("كرات بطاطا مقلية", "", img28, 40);
            long id28 = foodTableOperations.insertFoodData(food28);
            if (id28 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("كرات بطاطا مقلية", "وسط", 15, 2, 2.5, 100, 0, 0, 0, id28, foodType);
                success28 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img29 = convertDrawableToByteArray(R.drawable.f30);
            FoodModel food29 = new FoodModel("كرات بطاطا محسية بالجبنه الصفراء مقلية.", "", img29, 50);
            long id29 = foodTableOperations.insertFoodData(food29);
            if (id29 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("كرات بطاطا محسية بالجبنه الصفراء مقلية.", "وسط", 15, 2, 5, 130, 0, 0, 0, id29, foodType);
                success29 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img30 = convertDrawableToByteArray(R.drawable.f31);
            FoodModel food30 = new FoodModel("بيض و بطاطا مقلي", "", img30, 90);
            long id30 = foodTableOperations.insertFoodData(food30);
            if (id30 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("بيض و بطاطا مقلي", "كوب", 160, 8, 6, 12, 0, 0, 0, id30, foodType);
                success30 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img31 = convertDrawableToByteArray(R.drawable.f32);
            FoodModel food31 = new FoodModel("بيض وبندورة مقلي (شكشوكه)", "", img31, 110);
            long id31 = foodTableOperations.insertFoodData(food31);
            if (id31 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("بيض وبندورة مقلي (شكشوكه)", "كوب", 140, 3, 5, 12, 0, 0, 0, id31, foodType);
                success31 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img32 = convertDrawableToByteArray(R.drawable.f33);
            FoodModel food32 = new FoodModel("بيض وفول اخضر مقلي", "", img32, 100);
            long id32 = foodTableOperations.insertFoodData(food32);
            if (id32 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("بيض وفول اخضر مقلي", "كوب", 140, 3, 5, 12, 0, 0, 0, id32, foodType);
                success32 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img33 = convertDrawableToByteArray(R.drawable.f34);
            FoodModel food33 = new FoodModel("بيض وهليون مقلي", "", img33, 100);
            long id33 = foodTableOperations.insertFoodData(food33);
            if (id33 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("بيض وهليون مقلي", "كوب", 140, 3, 5, 12, 0, 0, 0, id33, foodType);
                success33 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img34 = convertDrawableToByteArray(R.drawable.f35);
            FoodModel food34 = new FoodModel("سمبوسة البطاطا", "", img34, 80);
            long id34 = foodTableOperations.insertFoodData(food34);
            if (id34 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("سمبوسة البطاطا", " وسط", 170, 20, 4, 8, 0, 0, 0, id34, foodType);
                success34 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img35 = convertDrawableToByteArray(R.drawable.f36);
            FoodModel food35 = new FoodModel("سمبوسة اللحمة", "", img35, 60);
            long id35 = foodTableOperations.insertFoodData(food35);
            if (id35 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("سمبوسة اللحمة", " وسط", 160, 12, 7, 10, 0, 0, 0, id35, foodType);
                success35 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img36 = convertDrawableToByteArray(R.drawable.f37);
            FoodModel food36 = new FoodModel("سمبوسة الجبنه البلديه", "", img36, 50);
            long id36 = foodTableOperations.insertFoodData(food36);
            if (id36 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("سمبوسة الجبنه البلديه", " وسط", 230, 18, 7, 14, 0, 0, 0, id36, foodType);
                success36 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img37 = convertDrawableToByteArray(R.drawable.f38);
            FoodModel food37 = new FoodModel("سمبوسة الخضار", "", img37, 60);
            long id37 = foodTableOperations.insertFoodData(food37);
            if (id37 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("سمبوسة الخضار", "وسط", 170, 20, 4, 8, 0, 0, 0, id37, foodType);
                success37 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img38 = convertDrawableToByteArray(R.drawable.f39);
            FoodModel food38 = new FoodModel("خبز مقلي", "", img38, 60);
            long id38 = foodTableOperations.insertFoodData(food38);
            if (id38 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("خبز مقلي", " كوب", 230, 30, 4, 10, 0, 0, 0, id38, foodType);
                success38 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img39 = convertDrawableToByteArray(R.drawable.f40);
            FoodModel food39 = new FoodModel("باذنجان مقلي", "", img39, 70);
            long id39 = foodTableOperations.insertFoodData(food39);
            if (id39 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("باذنجان مقلي", "3 شرائح وسط", 50, 6, 1, 3, 0, 0, 0, id39, foodType);
                success39 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img40 = convertDrawableToByteArray(R.drawable.f41);
            FoodModel food40 = new FoodModel("زهرة مقليه", "", img40, 120);
            long id40 = foodTableOperations.insertFoodData(food40);
            if (id40 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("زهرة مقليه", "كوب", 60, 5, 2, 5, 0, 0, 0, id40, foodType);
                success40 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img41 = convertDrawableToByteArray(R.drawable.f42);
            FoodModel food41 = new FoodModel("بقدونسية", "", img41, 80);
            long id41 = foodTableOperations.insertFoodData(food41);
            if (id41 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("بقدونسية", "نصف كوب", 45, 0.0, 0.0, 5, 0, 0, 0, id41, foodType);
                success41 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img42 = convertDrawableToByteArray(R.drawable.f43);
            FoodModel food42 = new FoodModel("شوربة عدس", "", img42, 140);
            long id42 = foodTableOperations.insertFoodData(food42);
            if (id42 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("شوربة عدس", "نصف كوب", 80, 11, 5, 1.5, 0, 0, 0, id42, foodType);
                success42 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img42_1 = convertDrawableToByteArray(R.drawable.f44);
            FoodModel food42_1 = new FoodModel("شوربة عدس", "", img42_1, 280);
            long id42_1 = foodTableOperations.insertFoodData(food42_1);
            if (id42_1 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("شوربة عدس", "كوب", 160, 22, 10, 3, 0, 0, 0, id42_1, foodType);
                success42_1 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img43 = convertDrawableToByteArray(R.drawable.f45);
            FoodModel food43 = new FoodModel("شوربة أرز", "", img43, 130);
            long id43 = foodTableOperations.insertFoodData(food43);
            if (id43 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("شوربة أرز", "نصف كوب", 50, 5, 1, 2.5, 0, 0, 0, id43, foodType);
                success43 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img43_1 = convertDrawableToByteArray(R.drawable.f46);
            FoodModel food43_1 = new FoodModel("شوربة أرز", "", img43_1, 260);
            long id43_1 = foodTableOperations.insertFoodData(food43_1);
            if (id43_1 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("شوربة أرز", "كوب", 100, 10, 1.5, 5, 0, 0, 0, id43_1, foodType);
                success43_1 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img44 = convertDrawableToByteArray(R.drawable.f47);
            FoodModel food44 = new FoodModel("شوربة لبن", "", img44, 130);
            long id44 = foodTableOperations.insertFoodData(food44);
            if (id44 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("شوربة لبن", "نصف كوب", 3, 2, 4.5, 60, 0, 0, 0, id44, foodType);
                success44 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img44_1 = convertDrawableToByteArray(R.drawable.f48);
            FoodModel food44_1 = new FoodModel("شوربة لبن", "", img44_1, 260);
            long id44_1 = foodTableOperations.insertFoodData(food44_1);
            if (id44_1 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("شوربة لبن", "كوب", 6, 4, 9, 120, 0, 0, 0, id44_1, foodType);
                success44_1 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img45 = convertDrawableToByteArray(R.drawable.f49);
            FoodModel food45 = new FoodModel("شوربة فطر", "", img45, 130);
            long id45 = foodTableOperations.insertFoodData(food45);
            if (id45 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("شوربة فطر", "نصف كوب", 50, 5, 0.5, 3.5, 0, 0, 0, id45, foodType);
                success45 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img45_1 = convertDrawableToByteArray(R.drawable.f50);
            FoodModel food45_1 = new FoodModel("شوربة فطر", "", img45_1, 270);
            long id45_1 = foodTableOperations.insertFoodData(food45_1);
            if (id45_1 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("شوربة فطر", "كوب", 100, 10, 1, 7, 0, 0, 0, id45_1, foodType);
                success45_1 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img46 = convertDrawableToByteArray(R.drawable.f51);
            FoodModel food46 = new FoodModel("شوربة فريكه", "", img46, 150);
            long id46 = foodTableOperations.insertFoodData(food46);
            if (id46 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("شوربة فريكه", "نصف كوب", 35, 7.5, 0.5, 0.5, 0, 0, 0, id46, foodType);
                success46 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img46_1 = convertDrawableToByteArray(R.drawable.f52);
            FoodModel food46_1 = new FoodModel("شوربة فريكه", "", img46_1, 300);
            long id46_1 = foodTableOperations.insertFoodData(food46_1);
            if (id46_1 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("شوربة فريكه", "كوب", 70, 15, 1, 1, 0, 0, 0, id46_1, foodType);
                success46_1 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img47 = convertDrawableToByteArray(R.drawable.f53);
            FoodModel food47 = new FoodModel("شوربة شعيريه", "", img47, 130);
            long id47 = foodTableOperations.insertFoodData(food47);
            if (id47 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("شوربة شعيريه", "نصف كوب", 50, 5, 0.5, 2.5, 0, 0, 0, id47, foodType);
                success47 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img47_1 = convertDrawableToByteArray(R.drawable.f54);
            FoodModel food47_1 = new FoodModel("شوربة شعيريه", "", img47_1, 260);
            long id47_1 = foodTableOperations.insertFoodData(food47_1);
            if (id47_1 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("شوربة شعيريه", "كوب", 100, 10, 1, 5, 0, 0, 0, id47_1, foodType);
                success47_1 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img48 = convertDrawableToByteArray(R.drawable.f55);
            FoodModel food48 = new FoodModel("شوربة خضار", "", img48, 130);
            long id48 = foodTableOperations.insertFoodData(food48);
            if (id48 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("شوربة خضار", "نصف كوب", 50, 10, 2, 0.5, 0, 0, 0, id48, foodType);
                success48 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img49 = convertDrawableToByteArray(R.drawable.f56);
            FoodModel food49 = new FoodModel("حميضة", "", img49, 30);
            long id49 = foodTableOperations.insertFoodData(food49);
            if (id49 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("حميضة", "ملعقة ", 18, 1.5, 0.5, 1.5, 0, 0, 0, id49, foodType);
                success49 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img49_1 = convertDrawableToByteArray(R.drawable.f57);
            FoodModel food49_1 = new FoodModel("حميضة", "", img49_1, 60);
            long id49_1 = foodTableOperations.insertFoodData(food49_1);
            if (id49 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("حميضة", "2 ملعقة ", 36, 3, 1, 3, 0, 0, 0, id49_1, foodType);
                success49_1 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }

            if (success && success_1 && success2 && success2_1 && success3 && success3_1 && success4 && success5 && success5_1 && success6 && success6_1 && success7 && success7_1
                    && success8 && success8_1 && success8_2 && success9 && success9_1 && success10 && success10_1 && success11 && success12 && success13 && success14 &&
                    success15 && success16 && success17 && success18 && success19 && success20 && success21 && success21_1 && success22 && success23 && success23_1 && success24
                    && success24_1 && success25 && success25_1 && success26 && success27 && success28 && success29 && success30 && success31 && success32 && success33 && success34
                    && success35 && success36 && success37 && success38 && success39 && success40 && success41 && success42 && success42_1 && success43 && success43_1 && success44
                    && success44_1 && success45 && success45_1 && success46 && success46_1 && success47 && success47_1 && success48 && success49 && success49_1) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    // الوجبات الرئيسية
    public boolean insertBasicMealsFoodDetails() {

        // do insert all basic meals data in database for first time
        try {
            FoodDetailsTableOperations foodDetailsTableOperations = new FoodDetailsTableOperations(context);
            FoodTableOperations foodTableOperations = new FoodTableOperations(context);

            boolean success = false, success_1 = false, success_2 = false, success2 = false, success2_1 = false, success2_2 = false, success3 = false, success3_1 = false,
                    success3_2 = false, success4 = false, success4_1 = false, success4_2 = false, success5 = false, success5_1 = false, success5_2 = false, success6 = false,
                    success6_1 = false, success6_2 = false, success7 = false, success7_1 = false, success7_2 = false, success8 = false, success8_1 = false, success9 = false,
                    success9_1 = false, success9_2 = false, success10 = false, success10_1 = false, success10_2 = false, success11 = false, success11_1 = false,
                    success11_2 = false, success12 = false, success12_1 = false, success12_2 = false, success12_3 = false, success13 = false, success13_1 = false,
                    success14 = false, success15 = false, success16 = false, success17 = false, success17_1 = false, success17_2 = false, success18 = false, success19 = false,
                    success20 = false, success20_1 = false, success20_2 = false, success21 = false, success21_1 = false, success21_2 = false, success21_3 = false, success22 = false,
                    success23 = false, success24 = false, success24_1 = false, success25 = false, success25_1 = false, success26 = false, success26_1 = false, success27 = false,
                    success27_1 = false, success27_2 = false, success28 = false, success28_1 = false, success29 = false, success29_1 = false, success30 = false, success30_1 = false,
                    success30_2 = false, success31 = false, success31_1 = false, success31_2 = false, success32 = false, success32_1 = false, success32_2 = false, success33 = false,
                    success33_1 = false, success33_2 = false, success34 = false, success34_1 = false, success34_2 = false, success35 = false, success35_1 = false, success35_2 = false,
                    success36 = false, success36_1 = false, success36_2 = false, success37 = false, success37_1 = false, success37_2 = false, success38 = false, success39 = false,
                    success40 = false, success40_1 = false, success40_2 = false, success41 = false, success41_1 = false, success41_2 = false, success42 = false, success42_1 = false,
                    success42_2 = false, success43 = false, success43_1 = false, success43_2 = false, success44 = false, success44_1 = false, success45 = false, success45_1 = false,
                    success45_2 = false, success46 = false, success46_1 = false, success46_2 = false, success47 = false, success47_1 = false, success47_2 = false, success48 = false,
                    success48_1 = false, success49 = false, success49_1 = false, success50 = false, success50_1 = false, success51 = false, success52 = false, success52_1 = false,
                    success52_2 = false, success53 = false, success53_1 = false, success53_2 = false, success54 = false, success54_1 = false, success54_2 = false, success55 = false,
                    success55_1 = false, success56 = false, success56_1 = false, success56_2 = false, success57 = false, success57_1 = false, success57_2 = false, success58 = false,
                    success58_1 = false, success58_2 = false, success59 = false, success59_1 = false, success59_2 = false, success60 = false, success60_1 = false, success60_2 = false,
                    success61 = false, success61_1 = false, success61_2 = false, success62 = false, success62_1 = false, success62_2 = false, success63 = false, success63_1 = false,
                    success63_2 = false, success64 = false, success64_1 = false, success64_2 = false, success65 = false, success65_1 = false, success65_2 = false, success66 = false,
                    success66_1 = false, success66_2 = false, success67 = false, success67_1 = false, success67_2 = false, success68 = false, success68_1 = false, success68_2 = false,
                    success69 = false, success69_1 = false, success69_2 = false, success70 = false, success70_1 = false, success70_2 = false, success71 = false, success71_1 = false,
                    success71_2 = false, success72 = false, success72_1 = false, success73 = false, success73_1 = false, success74 = false, success74_1 = false, success75 = false,
                    success76 = false, success77 = false, success78 = false, success79 = false, success80 = false, success81 = false, success82 = false, success82_1 = false,
                    success83 = false, success84 = false, success85 = false, success85_1 = false, success86 = false, success86_1 = false, success87 = false, success87_1 = false,
                    success87_2 = false, success88 = false, success88_1 = false, success88_2 = false, success89 = false, success89_1 = false, success89_2 = false, success90 = false,
                    success90_1 = false, success90_2 = false, success91 = false, success92 = false, success93 = false, success94 = false, success94_1 = false, success94_2 = false,
                    success95 = false, success95_1 = false, success95_2 = false, success96 = false, success96_1 = false, success96_2 = false, success97 = false, success97_1 = false,
                    success97_2 = false, success98 = false, success98_1 = false, success98_2 = false, success99 = false, success99_1 = false, success99_2 = false, success100 = false,
                    success100_1 = false, success100_2 = false, success101 = false, success101_1 = false, success101_2 = false, success102 = false, success102_1 = false, success102_2 = false,
                    success103 = false, success103_1 = false, success103_2 = false, success104 = false, success104_1 = false, success104_2 = false, success105 = false, success105_1 = false,
                    success105_2 = false, success106 = false, success106_1 = false, success106_2 = false, success107 = false, success107_1 = false, success107_2 = false, success108 = false,
                    success108_1 = false, success108_2 = false, success109 = false, success109_1 = false, success109_2 = false, success110 = false, success110_1 = false, success110_2 = false,
                    success111 = false, success111_1 = false, success111_2 = false, success112 = false, success112_1 = false, success112_2 = false, success113 = false, success113_1 = false,
                    success113_2 = false, success114 = false, success114_1 = false, success114_2 = false, success115 = false, success115_1 = false, success115_2 = false, success116 = false,
                    success116_1 = false, success116_2 = false, success117 = false, success117_1 = false, success117_2 = false, success118 = false, success118_1 = false, success118_2 = false,
                    success119 = false, success119_1 = false, success119_2 = false, success120 = false, success120_1 = false, success120_2 = false, success121 = false, success121_1 = false,
                    success121_2 = false, success122 = false, success122_1 = false, success122_2 = false, success123 = false, success123_1 = false, success123_2 = false, success124 = false,
                    success124_1 = false, success124_2 = false, success125 = false, success125_1 = false, success125_2 = false, success126 = false, success126_1 = false, success126_2 = false,
                    success127 = false, success127_1 = false, success127_2 = false, success128 = false, success128_1 = false, success128_2 = false, success129 = false, success129_1 = false,
                    success129_2 = false, success130 = false, success130_1 = false, success130_2 = false, success131 = false, success132 = false, success133 = false, success133_1 = false,
                    success134 = false, success134_1 = false, success135 = false, success135_1 = false, success136 = false, success136_1 = false, success137 = false, success137_1 = false,
                    success137_2 = false, success138 = false, success139 = false, success139_1 = false, success139_2 = false, success140 = false, success140_1 = false, success140_2 = false,
                    success141 = false, success141_1 = false, success141_2 = false, success142 = false, success143 = false, success143_1 = false, success144 = false, success144_1 = false,
                    success145 = false, success145_1 = false, success145_2 = false, success146 = false, success146_1 = false, success146_2 = false, success147 = false, success147_1 = false,
                    success147_2 = false, success148 = false, success148_1 = false, success149 = false, success149_1 = false, success149_2 = false;

            // الوجبات الرئيسية
            // basic meals
            String foodType = "الوجبات الرئيسية";
            byte[] img = convertDrawableToByteArray(R.drawable.h1_1);
            FoodModel food1 = new FoodModel("صيادية سمك", "", img, 160);
            long id = foodTableOperations.insertFoodData(food1);
            if (id > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("صيادية سمك", "2 مغرفة أرز قطعة سمك متوسطة\n", 340, 20, 25, 16, 0, 0, 0, id, foodType);
                success = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            byte[] img_1 = convertDrawableToByteArray(R.drawable.h1_2);
            FoodModel food1_1 = new FoodModel("صيادية سمك", "", img_1, 200);
            long id_1 = foodTableOperations.insertFoodData(food1_1);
            if (id_1 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("صيادية سمك", "3 مغارف ارز قطة سمك متوسطة", 450, 25, 28, 23, 0, 0, 0, id_1, foodType);
                success_1 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            byte[] img_2 = convertDrawableToByteArray(R.drawable.h1_3);
            FoodModel food1_2 = new FoodModel("صيادية سمك", "", img_2, 350);
            long id_2 = foodTableOperations.insertFoodData(food1_2);
            if (id_2 > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("صيادية سمك", "5 مغارف أرز 2 قطعة  سمك متوسطة", 700, 40, 45, 35, 0, 0, 0, id_2, foodType);
                success_2 = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            byte[] img2 = convertDrawableToByteArray(R.drawable.h2_1);
            FoodModel food2 = new FoodModel("ربيعية فول", "", img2, 70);
            long id2 = foodTableOperations.insertFoodData(food2);
            if (id2 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("ربيعية فول", "2 مغرفة أرز وفول", 115, 12, 2, 5, 0, 0, 0, id2, foodType);
                success2 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img2_1 = convertDrawableToByteArray(R.drawable.h2_2);
            FoodModel food2_1 = new FoodModel("ربيعية فول", "", img2_1, 100);
            long id2_1 = foodTableOperations.insertFoodData(food2_1);
            if (id2_1 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("ربيعية فول", "3 مغارف أرز وفول", 180, 17, 2.5, 10, 0, 0, 0, id2_1, foodType);
                success2_1 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img2_2 = convertDrawableToByteArray(R.drawable.h2_3);
            FoodModel food2_2 = new FoodModel("ربيعية فول", "", img2_2, 160);
            long id2_2 = foodTableOperations.insertFoodData(food2_2);
            if (id2_2 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("ربيعية فول", "5 مغارف أرز", 300, 30, 4, 15, 0, 0, 0, id2_2, foodType);
                success2_2 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img3 = convertDrawableToByteArray(R.drawable.h2_4);
            FoodModel food3 = new FoodModel("ربيعية فول + صدر دجاج 80غم", "", img3, 150);
            long id3 = foodTableOperations.insertFoodData(food3);
            if (id3 > 0) {
                FoodDetailsModel foodModel3 = new FoodDetailsModel("ربيعية فول + صدر دجاج 80غم", "2 مغرفة أرز و فول ", 350, 15, 30, 20, 0, 0, 0, id3, foodType);
                success3 = foodDetailsTableOperations.insertFoodData(foodModel3);
            }
            byte[] img3_1 = convertDrawableToByteArray(R.drawable.h2_5);
            FoodModel food3_1 = new FoodModel("ربيعية فول + صدر دجاج 80غم", "", img3_1, 180);
            long id3_1 = foodTableOperations.insertFoodData(food3_1);
            if (id3_1 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("ربيعية فول + صدر دجاج 80غم", "3 مغارف أرزوفول", 420, 18, 30, 25, 0, 0, 0, id3_1, foodType);
                success3_1 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img3_2 = convertDrawableToByteArray(R.drawable.h2_6);
            FoodModel food3_2 = new FoodModel("ربيعية فول + صدر دجاج 80غم", "", img3_2, 240);
            long id3_2 = foodTableOperations.insertFoodData(food3_2);
            if (id3_2 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("ربيعية فول + صدر دجاج 80غم", "5 مغارف أرزوفول", 550, 30, 35, 30, 0, 0, 0, id3_2, foodType);
                success3_2 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img4 = convertDrawableToByteArray(R.drawable.h2_7);
            FoodModel food4 = new FoodModel("ربيعية فول + فخذة دجاج 70غم", "", img4, 140);
            long id4 = foodTableOperations.insertFoodData(food4);
            if (id4 > 0) {
                FoodDetailsModel foodModel4 = new FoodDetailsModel("ربيعية فول + فخذة دجاج 70غم", "2 مغارف أرزوفول", 370, 15, 25, 20, 0, 0, 0, id4, foodType);
                success4 = foodDetailsTableOperations.insertFoodData(foodModel4);
            }
            byte[] img4_1 = convertDrawableToByteArray(R.drawable.h2_8);
            FoodModel food4_1 = new FoodModel("ربيعية فول + فخذة دجاج 70غم", "", img4_1, 170);
            long id4_1 = foodTableOperations.insertFoodData(food4_1);
            if (id4_1 > 0) {
                FoodDetailsModel foodModel4 = new FoodDetailsModel("ربيعية فول + فخذة دجاج 70غم", "3 مغارف أرزوفول", 440, 20, 25, 25, 0, 0, 0, id4_1, foodType);
                success4_1 = foodDetailsTableOperations.insertFoodData(foodModel4);
            }
            byte[] img4_2 = convertDrawableToByteArray(R.drawable.h2_9);
            FoodModel food4_2 = new FoodModel("ربيعية فول + فخذة دجاج 70غم", "", img4_2, 230);
            long id4_2 = foodTableOperations.insertFoodData(food4_2);
            if (id4_2 > 0) {
                FoodDetailsModel foodModel4 = new FoodDetailsModel("ربيعية فول + فخذة دجاج 70غم", "5مغارف أرزوفول", 560, 30, 25, 30, 0, 0, 0, id4_2, foodType);
                success4_2 = foodDetailsTableOperations.insertFoodData(foodModel4);
            }
            byte[] img5 = convertDrawableToByteArray(R.drawable.h2_10);
            FoodModel food5 = new FoodModel("ربيعية فول. + لحمة عجل 90غم", "", img5, 160);
            long id5 = foodTableOperations.insertFoodData(food5);
            if (id5 > 0) {
                FoodDetailsModel foodModel5 = new FoodDetailsModel("ربيعية فول. + لحمة عجل 90غم", "2 مغارف أرزوفول", 270, 15, 15, 15, 0, 0, 0, id5, foodType);
                success5 = foodDetailsTableOperations.insertFoodData(foodModel5);
            }
            byte[] img5_1 = convertDrawableToByteArray(R.drawable.h2_11);
            FoodModel food5_1 = new FoodModel("ربيعية فول. + لحمة عجل 90غم", "", img5_1, 160);
            long id5_1 = foodTableOperations.insertFoodData(food5_1);
            if (id5_1 > 0) {
                FoodDetailsModel foodModel5 = new FoodDetailsModel("ربيعية فول. + لحمة عجل 90غم", "3 مغارف أرزوفول ", 340, 20, 15, 20, 0, 0, 0, id5_1, foodType);
                success5_1 = foodDetailsTableOperations.insertFoodData(foodModel5);
            }
            byte[] img5_2 = convertDrawableToByteArray(R.drawable.h2_12);
            FoodModel food5_2 = new FoodModel("ربيعية فول. + لحمة عجل 90غم", "", img5_2, 250);
            long id5_2 = foodTableOperations.insertFoodData(food5_2);
            if (id5_2 > 0) {
                FoodDetailsModel foodModel5 = new FoodDetailsModel("ربيعية فول. + لحمة عجل 90غم", "5 مغارف أرزوفول", 450, 30, 20, 25, 0, 0, 0, id5_2, foodType);
                success5_2 = foodDetailsTableOperations.insertFoodData(foodModel5);
            }
            byte[] img6 = convertDrawableToByteArray(R.drawable.h3_1);
            FoodModel food6 = new FoodModel("محشي كوسا", "", img6, 250);
            long id6 = foodTableOperations.insertFoodData(food6);
            if (id6 > 0) {
                FoodDetailsModel foodModel6 = new FoodDetailsModel("محشي كوسا", "3 كوسا متوسطة الحجم", 220, 30, 4, 6, 0, 0, 0, id6, foodType);
                success6 = foodDetailsTableOperations.insertFoodData(foodModel6);
            }
            byte[] img6_1 = convertDrawableToByteArray(R.drawable.h3_2);
            FoodModel food6_1 = new FoodModel("محشي كوسا", "", img6_1, 320);
            long id6_1 = foodTableOperations.insertFoodData(food6_1);
            if (id6_1 > 0) {
                FoodDetailsModel foodModel6 = new FoodDetailsModel("محشي كوسا", "4 كوسا متوسطة الحجم", 320, 40, 5, 9, 0, 0, 0, id6_1, foodType);
                success6_1 = foodDetailsTableOperations.insertFoodData(foodModel6);
            }
            byte[] img6_2 = convertDrawableToByteArray(R.drawable.h3_3);
            FoodModel food6_2 = new FoodModel("محشي كوسا", "", img6_2, 380);
            long id6_2 = foodTableOperations.insertFoodData(food6_2);
            if (id6_2 > 0) {
                FoodDetailsModel foodModel6 = new FoodDetailsModel("محشي كوسا", "5 كوسا متوسطة الحجم", 380, 50, 7, 12, 0, 0, 0, id6_2, foodType);
                success6_2 = foodDetailsTableOperations.insertFoodData(foodModel6);
            }
            byte[] img7 = convertDrawableToByteArray(R.drawable.h4_1);
            FoodModel food7 = new FoodModel("محشي باذنجان", "", img7, 300);
            long id7 = foodTableOperations.insertFoodData(food7);
            if (id7 > 0) {
                FoodDetailsModel foodModel7 = new FoodDetailsModel("محشي باذنجان", "3 باذنجان متوسطة الحجم", 500, 70, 8, 15, 0, 0, 0, id7, foodType);
                success7 = foodDetailsTableOperations.insertFoodData(foodModel7);
            }
            byte[] img7_1 = convertDrawableToByteArray(R.drawable.h4_2);
            FoodModel food7_1 = new FoodModel("محشي باذنجان", "", img7_1, 450);
            long id7_1 = foodTableOperations.insertFoodData(food7_1);
            if (id7_1 > 0) {
                FoodDetailsModel foodModel7 = new FoodDetailsModel("محشي باذنجان", "4 باذنجان متوسطة الحجم", 680, 90, 10, 25, 0, 0, 0, id7_1, foodType);
                success7_1 = foodDetailsTableOperations.insertFoodData(foodModel7);
            }
            byte[] img7_2 = convertDrawableToByteArray(R.drawable.h4_3);
            FoodModel food7_2 = new FoodModel("محشي باذنجان", "", img7_2, 550);
            long id7_2 = foodTableOperations.insertFoodData(food7_2);
            if (id7_2 > 0) {
                FoodDetailsModel foodModel7 = new FoodDetailsModel("محشي باذنجان", "5 باذنجان متوسطة الحجم", 850, 120, 15, 30, 0, 0, 0, id7_2, foodType);
                success7_2 = foodDetailsTableOperations.insertFoodData(foodModel7);
            }
            byte[] img8 = convertDrawableToByteArray(R.drawable.h5);
            FoodModel food8 = new FoodModel("محشي يقطين", "", img8, 90);
            long id8 = foodTableOperations.insertFoodData(food8);
            if (id8 > 0) {
                FoodDetailsModel foodModel8 = new FoodDetailsModel("محشي يقطين", "صغير", 100, 10, 1.5, 5, 0, 0, 0, id8, foodType);
                success8 = foodDetailsTableOperations.insertFoodData(foodModel8);
            }
            FoodModel food8_1 = new FoodModel("محشي يقطين", "", 120);
            long id8_1 = foodTableOperations.insertFoodData(food8_1);
            if (id8_1 > 0) {
                FoodDetailsModel foodModel8 = new FoodDetailsModel("محشي يقطين", "وسط", 130, 15, 2, 5, 0, 0, 0, id8_1, foodType);
                success8_1 = foodDetailsTableOperations.insertFoodData(foodModel8);
            }
            byte[] img9 = convertDrawableToByteArray(R.drawable.h6_1);
            FoodModel food9 = new FoodModel("محشي فليفة", "", img9, 120);
            long id9 = foodTableOperations.insertFoodData(food9);
            if (id9 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("محشي فليفة", "صغير", 110, 10, 1.5, 0.0, 0, 0, 0, id9, foodType);
                success9 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            FoodModel food9_1 = new FoodModel("محشي فليفة", "", 140);
            long id9_1 = foodTableOperations.insertFoodData(food9_1);
            if (id9_1 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("محشي فليفة", "وسط", 130, 15, 2, 0.5, 0, 0, 0, id9_1, foodType);
                success9_1 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            FoodModel food9_2 = new FoodModel("محشي فليفة", "", 170);
            long id9_2 = foodTableOperations.insertFoodData(food9_2);
            if (id9_2 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("محشي فليفة", "كبير", 160, 20, 3, 1, 0, 0, 0, id9_2, foodType);
                success9_2 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            byte[] img10 = convertDrawableToByteArray(R.drawable.h6_2);
            FoodModel food10 = new FoodModel("محشي فليفلة", "", img10, 140);
            long id10 = foodTableOperations.insertFoodData(food10);
            if (id10 > 0) {
                FoodDetailsModel foodModel10 = new FoodDetailsModel("محشي فليفلة", "صغير", 110, 10, 1.5, 0.0, 0, 0, 0, id10, foodType);
                success10 = foodDetailsTableOperations.insertFoodData(foodModel10);
            }
            FoodModel food10_1 = new FoodModel("محشي فليفلة", "", 170);
            long id10_1 = foodTableOperations.insertFoodData(food10_1);
            if (id10_1 > 0) {
                FoodDetailsModel foodModel10 = new FoodDetailsModel("محشي فليفلة", "وسط", 130, 15, 2, 0.5, 0, 0, 0, id10_1, foodType);
                success10_1 = foodDetailsTableOperations.insertFoodData(foodModel10);
            }
            FoodModel food10_2 = new FoodModel("محشي فليفلة", "", 200);
            long id10_2 = foodTableOperations.insertFoodData(food10_2);
            if (id10_2 > 0) {
                FoodDetailsModel foodModel10 = new FoodDetailsModel("محشي فليفلة", "كبير", 160, 20, 3, 1, 0, 0, 0, id10_2, foodType);
                success10_2 = foodDetailsTableOperations.insertFoodData(foodModel10);
            }
            byte[] img11 = convertDrawableToByteArray(R.drawable.h7);
            FoodModel food11 = new FoodModel("محشي خيار", "", img11, 120);
            long id11 = foodTableOperations.insertFoodData(food11);
            if (id11 > 0) {
                FoodDetailsModel foodModel11 = new FoodDetailsModel("محشي خيار", "صغير", 100, 10, 1.5, 5, 0, 0, 0, id11, foodType);
                success11 = foodDetailsTableOperations.insertFoodData(foodModel11);
            }
            FoodModel food11_1 = new FoodModel("محشي خيار", "", 170);
            long id11_1 = foodTableOperations.insertFoodData(food11_1);
            if (id11_1 > 0) {
                FoodDetailsModel foodModel11 = new FoodDetailsModel("محشي خيار", "وسط", 130, 15, 2, 5, 0, 0, 0, id11_1, foodType);
                success11_1 = foodDetailsTableOperations.insertFoodData(foodModel11);
            }
            byte[] img12 = convertDrawableToByteArray(R.drawable.h8);
            FoodModel food12 = new FoodModel("لسينة محشي (ورق  لسان الثور)", "", img12, 170);
            long id12 = foodTableOperations.insertFoodData(food12);
            if (id12 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("لسينة محشي (ورق  لسان الثور)", "كوب", 200, 40, 4, 10, 0, 0, 0, id12, foodType);
                success12 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img13 = convertDrawableToByteArray(R.drawable.h9_1);
            FoodModel food13 = new FoodModel("دوالي (ورق العنب)", "", img13, 90);
            long id13 = foodTableOperations.insertFoodData(food13);
            if (id13 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("دوالي (ورق العنب)", "نصف كوب", 180, 20, 2.5, 10, 0, 0, 0, id13, foodType);
                success13 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img13_1 = convertDrawableToByteArray(R.drawable.h9_2);
            FoodModel food13_1 = new FoodModel("دوالي (ورق العنب)", "", img13_1, 180);
            long id13_1 = foodTableOperations.insertFoodData(food13_1);
            if (id13_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("دوالي (ورق العنب)", "كوب", 360, 40, 5, 15, 0, 0, 0, id13_1, foodType);
                success13_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img14 = convertDrawableToByteArray(R.drawable.h10);
            FoodModel food14 = new FoodModel("ملفوف", "", img14, 240);
            long id14 = foodTableOperations.insertFoodData(food14);
            if (id14 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("ملفوف", "كوب", 450, 50, 6, 10, 0, 0, 0, id14, foodType);
                success14 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img15 = convertDrawableToByteArray(R.drawable.h11);
            FoodModel food15 = new FoodModel("لخنة (ورق القرنبيط)", "", img15, 130);
            long id15 = foodTableOperations.insertFoodData(food15);
            if (id15 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("لخنة (ورق القرنبيط)", "كوب", 350, 40, 5, 15, 0, 0, 0, id15, foodType);
                success15 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img16 = convertDrawableToByteArray(R.drawable.h12);
            FoodModel food16 = new FoodModel("زمطوط أو زعمطوط", "", img16, 170);
            long id16 = foodTableOperations.insertFoodData(food16);
            if (id16 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("زمطوط أو زعمطوط", "كوب", 270, 40, 4, 6, 0, 0, 0, id16, foodType);
                success16 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img17 = convertDrawableToByteArray(R.drawable.h13);
            FoodModel food17 = new FoodModel("لفت محشي + طحينية", "", img17, 60);
            long id17 = foodTableOperations.insertFoodData(food17);
            if (id17 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("لفت محشي + طحينية", "صغير", 80, 5, 1, 5, 0, 0, 0, id17, foodType);
                success17 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            FoodModel food17_1 = new FoodModel("لفت محشي + طحينية", "", 80);
            long id17_1 = foodTableOperations.insertFoodData(food17_1);
            if (id17_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("لفت محشي + طحينية", "وسط", 130, 10, 1.5, 10, 0, 0, 0, id17_1, foodType);
                success17_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            FoodModel food17_2 = new FoodModel("لفت محشي + طحينية", "", 130);
            long id17_2 = foodTableOperations.insertFoodData(food17_2);
            if (id17_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("لفت محشي + طحينية", "كبير", 180, 15, 2, 15, 0, 0, 0, id17_2, foodType);
                success17_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img18 = convertDrawableToByteArray(R.drawable.h14);
            FoodModel food18 = new FoodModel("يلنجي (ورق عنب بالخضار)", "", img18, 200);
            long id18 = foodTableOperations.insertFoodData(food18);
            if (id18 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يلنجي (ورق عنب بالخضار)", "كوب", 400, 50, 5, 15, 0, 0, 0, id18, foodType);
                success18 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img19 = convertDrawableToByteArray(R.drawable.h15);
            FoodModel food19 = new FoodModel("كوارع", "", img19, 380);
            long id19 = foodTableOperations.insertFoodData(food19);
            if (id19 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("كوارع", "", 600, 100, 10, 20, 0, 0, 0, id19, foodType);
                success19 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img20 = convertDrawableToByteArray(R.drawable.h16_1);
            FoodModel food20 = new FoodModel("داوود باشا", "", img20, 270);
            long id20 = foodTableOperations.insertFoodData(food20);
            if (id20 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("داوود باشا", "2 مغرفة أرز+ نصف كوب كرات اللحم بالبندورة", 570, 20, 40, 35, 0, 0, 0, id20, foodType);
                success20 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img20_1 = convertDrawableToByteArray(R.drawable.h16_2);
            FoodModel food20_1 = new FoodModel("داوود باشا", "", img20_1, 330);
            long id20_1 = foodTableOperations.insertFoodData(food20_1);
            if (id20_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("داوود باشا", "3 مغارف أرز+نصف كوب كرات اللحم بالبندورة", 620, 30, 40, 35, 0, 0, 0, id20_1, foodType);
                success20_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img20_2 = convertDrawableToByteArray(R.drawable.h16_3);
            FoodModel food20_2 = new FoodModel("داوود باشا", "", img20_2, 500);
            long id20_2 = foodTableOperations.insertFoodData(food20_2);
            if (id20_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("داوود باشا", "5 مغارف أرز+كوب كرات اللحم بالبندورة", 1000, 40, 70, 70, 0, 0, 0, id20_2, foodType);
                success20_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img21 = convertDrawableToByteArray(R.drawable.h17_1);
            FoodModel food21 = new FoodModel("محشي دجاج بالأرز", "", img21, 900);
            long id21 = foodTableOperations.insertFoodData(food21);
            if (id21 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("محشي دجاج بالأرز", "دجاجة 1 كيلو.", 1400, 100, 80, 100, 0, 0, 0, id21, foodType);
                success21 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img21_1 = convertDrawableToByteArray(R.drawable.h17_2);
            FoodModel food21_1 = new FoodModel("محشي دجاج بالأرز", "", img21_1, 450);
            long id21_1 = foodTableOperations.insertFoodData(food21_1);
            if (id21_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("محشي دجاج بالأرز", "نصف دجاجة 0.5 كيلو", 700, 50, 40, 50, 0, 0, 0, id21_1, foodType);
                success21_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img21_2 = convertDrawableToByteArray(R.drawable.h17_2);
            FoodModel food21_2 = new FoodModel("محشي دجاج بالأرز", "", img21_2, 190);
            long id21_2 = foodTableOperations.insertFoodData(food21_2);
            if (id21_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("محشي دجاج بالأرز", "فخذة الدجاجة محشية", 380, 25, 20, 20, 0, 0, 0, id21_2, foodType);
                success21_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img21_3 = convertDrawableToByteArray(R.drawable.h17_2);
            FoodModel food21_3 = new FoodModel("محشي دجاج بالأرز", "", img21_3, 190);
            long id21_3 = foodTableOperations.insertFoodData(food21_3);
            if (id21_3 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("محشي دجاج بالأرز", "صدر الدجاجة محشية", 400, 25, 20, 20, 0, 0, 0, id21_3, foodType);
                success21_3 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img22 = convertDrawableToByteArray(R.drawable.h18);
            FoodModel food22 = new FoodModel("محشي زغاليل بالأرز", "", img22, 240);
            long id22 = foodTableOperations.insertFoodData(food22);
            if (id22 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("محشي زغاليل بالأرز", "زغلول كامل", 400, 20, 30, 20, 0, 0, 0, id22, foodType);
                success22 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img23 = convertDrawableToByteArray(R.drawable.h18);
            FoodModel food23 = new FoodModel("محشي زغاليل بالأرز", "", img23, 240);
            long id23 = foodTableOperations.insertFoodData(food23);
            if (id23 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("محشي زغاليل بالأرز", "زغلول كامل", 400, 20, 30, 20, 0, 0, 0, id23, foodType);
                success23 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img24 = convertDrawableToByteArray(R.drawable.h19_1);
            FoodModel food24 = new FoodModel("عدس مجروش بالأرز", "", img24, 170);
            long id24 = foodTableOperations.insertFoodData(food24);
            if (id24 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("عدس مجروش بالأرز", "نصف كوب", 140, 15, 5, 5, 0, 0, 0, id24, foodType);
                success24 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img24_1 = convertDrawableToByteArray(R.drawable.h19_2);
            FoodModel food24_1 = new FoodModel("عدس مجروش بالأرز", "", img24_1, 330);
            long id24_1 = foodTableOperations.insertFoodData(food24_1);
            if (id24_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("عدس مجروش بالأرز", "كوب", 280, 30, 10, 10, 0, 0, 0, id24_1, foodType);
                success24_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img25 = convertDrawableToByteArray(R.drawable.h20);
            FoodModel food25 = new FoodModel("محشي بندورة", "", img25, 60);
            long id25 = foodTableOperations.insertFoodData(food25);
            if (id25 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("محشي بندورة", "صغير", 100, 10, 1.5, 4, 0, 0, 0, id25, foodType);
                success25 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            FoodModel food25_1 = new FoodModel("محشي بندورة", "", 90);
            long id25_1 = foodTableOperations.insertFoodData(food25_1);
            if (id25_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("محشي بندورة", "وسط", 140, 15, 2, 5, 0, 0, 0, id25_1, foodType);
                success25_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img26 = convertDrawableToByteArray(R.drawable.h21);
            FoodModel food26 = new FoodModel("محشي بطاطا", "", img26, 90);
            long id26 = foodTableOperations.insertFoodData(food26);
            if (id26 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("محشي بطاطا", "وسط", 160, 20, 2, 5, 0, 0, 0, id26, foodType);
                success26 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            FoodModel food26_1 = new FoodModel("محشي بطاطا", "", 100);
            long id26_1 = foodTableOperations.insertFoodData(food26_1);
            if (id26_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("محشي بطاطا", "وسط", 170, 22, 2.5, 6, 0, 0, 0, id26_1, foodType);
                success26_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img27 = convertDrawableToByteArray(R.drawable.h22);
            FoodModel food27 = new FoodModel("محشي جزر", "", img27, 30);
            long id27 = foodTableOperations.insertFoodData(food27);
            if (id27 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("محشي جزر", "صغير", 50, 5, 1, 2.5, 0, 0, 0, id27, foodType);
                success27 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            FoodModel food27_1 = new FoodModel("محشي جزر", "", 40);
            long id27_1 = foodTableOperations.insertFoodData(food27_1);
            if (id27_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("محشي جزر", "وسط", 60, 7.5, 1.5, 2.5, 0, 0, 0, id27_1, foodType);
                success27_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            FoodModel food27_2 = new FoodModel("محشي جزر", "", 50);
            long id27_2 = foodTableOperations.insertFoodData(food27_2);
            if (id27_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("محشي جزر", "كبير", 90, 9, 2, 5, 0, 0, 0, id27_2, foodType);
                success27_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img28 = convertDrawableToByteArray(R.drawable.h23_1);
            FoodModel food28 = new FoodModel("أرز بالبندورة", "", img28, 150);
            long id28 = foodTableOperations.insertFoodData(food28);
            if (id28 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("أرز بالبندورة", "نصف كوب", 170, 25, 3, 5, 0, 0, 0, id28, foodType);
                success28 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img28_1 = convertDrawableToByteArray(R.drawable.h23_2);
            FoodModel food28_1 = new FoodModel("أرز بالبندورة", "", img28_1, 300);
            long id28_1 = foodTableOperations.insertFoodData(food28_1);
            if (id28_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("أرز بالبندورة", "كوب", 340, 50, 6, 10, 0, 0, 0, id28_1, foodType);
                success28_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img29 = convertDrawableToByteArray(R.drawable.h24_1);
            FoodModel food29 = new FoodModel("لبنية", "", img29, 170);
            long id29 = foodTableOperations.insertFoodData(food29);
            if (id29 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("لبنية", "نصف كوب", 200, 25, 4.5, 8, 0, 0, 0, id29, foodType);
                success29 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img29_1 = convertDrawableToByteArray(R.drawable.h24_2);
            FoodModel food29_1 = new FoodModel("لبنية", "", img29_1, 340);
            long id29_1 = foodTableOperations.insertFoodData(food29_1);
            if (id29_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("لبنية", "كوب", 400, 50, 9, 16, 0, 0, 0, id29_1, foodType);
                success29_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img30 = convertDrawableToByteArray(R.drawable.h25_1);
            FoodModel food30 = new FoodModel("بامية يخنة", "", img30, 270);
            long id30 = foodTableOperations.insertFoodData(food30);
            if (id30 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("بامية يخنة", "2 مغرفة أرز+ نصف كوب يخنة بامية", 220, 25, 6, 10, 0, 0, 0, id30, foodType);
                success30 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img30_1 = convertDrawableToByteArray(R.drawable.h25_2);
            FoodModel food30_1 = new FoodModel("بامية يخنة", "", img30_1, 330);
            long id30_1 = foodTableOperations.insertFoodData(food30_1);
            if (id30_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("بامية يخنة", "3 مغارف أرز+ نصف كوب يخنة بامية", 270, 35, 7, 10, 0, 0, 0, id30_1, foodType);
                success30_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img30_2 = convertDrawableToByteArray(R.drawable.h25_3);
            FoodModel food30_2 = new FoodModel("بامية يخنة", "", img30_2, 500);
            long id30_2 = foodTableOperations.insertFoodData(food30_2);
            if (id30_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("بامية يخنة", "5 مغارف أرز+ كوب يخنة بامية", 300, 50, 9, 15, 0, 0, 0, id30_2, foodType);
                success30_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img31 = convertDrawableToByteArray(R.drawable.h25_4);
            FoodModel food31 = new FoodModel("بامية يخن + صدر دجاج 80 غم", "", img31, 350);
            long id31 = foodTableOperations.insertFoodData(food31);
            if (id31 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("بامية يخن + صدر دجاج 80 غم", "2مغرفة أرز+ نصف كوب يخنة بامية", 450, 25, 35, 25, 0, 0, 0, id31, foodType);
                success31 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img31_1 = convertDrawableToByteArray(R.drawable.h25_5);
            FoodModel food31_1 = new FoodModel("بامية يخن + صدر دجاج 80 غم", "", img31_1, 400);
            long id31_1 = foodTableOperations.insertFoodData(food31_1);
            if (id31_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("بامية يخن + صدر دجاج 80 غم", "3 مغارف أرز+نصف كوب يخنة بامية", 500, 35, 35, 25, 0, 0, 0, id31_1, foodType);
                success31_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img31_2 = convertDrawableToByteArray(R.drawable.h25_6);
            FoodModel food31_2 = new FoodModel("بامية يخن + صدر دجاج 80 غم", "", img31_2, 580);
            long id31_2 = foodTableOperations.insertFoodData(food31_2);
            if (id31_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("بامية يخن + صدر دجاج 80 غم", "5 مغارف أرز+ كوب يخنة بامية", 550, 50, 40, 30, 0, 0, 0, id31_2, foodType);
                success31_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img32 = convertDrawableToByteArray(R.drawable.h25_7);
            FoodModel food32 = new FoodModel("بامية يخنة + فخذة دجاج 70 غم", "", img32, 340);
            long id32 = foodTableOperations.insertFoodData(food32);
            if (id32 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("بامية يخنة + فخذة دجاج 70 غم", "2 مغرفة أرز+ نصف كوب يخنة بامية", 470, 25, 25, 25, 0, 0, 0, id32, foodType);
                success32 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img32_1 = convertDrawableToByteArray(R.drawable.h25_8);
            FoodModel food32_1 = new FoodModel("بامية يخنة + فخذة دجاج 70 غم", "", img32_1, 400);
            long id32_1 = foodTableOperations.insertFoodData(food32_1);
            if (id32_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("بامية يخنة + فخذة دجاج 70 غم", "3مغارف أرز+ نصف كوب يخنة بامية", 530, 35, 25, 25, 0, 0, 0, id32_1, foodType);
                success32_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img32_2 = convertDrawableToByteArray(R.drawable.h25_9);
            FoodModel food32_2 = new FoodModel("بامية يخنة + فخذة دجاج 70 غم", "", img32_2, 870);
            long id32_2 = foodTableOperations.insertFoodData(food32_2);
            if (id32_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("بامية يخنة + فخذة دجاج 70 غم", "5 مغارف أرز+ كوب يخنة بامية", 560, 50, 30, 30, 0, 0, 0, id32_2, foodType);
                success32_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img33 = convertDrawableToByteArray(R.drawable.h25_10);
            FoodModel food33 = new FoodModel("بامية يخنة+ لحمة عجل 90 غم", "", img33, 360);
            long id33 = foodTableOperations.insertFoodData(food33);
            if (id33 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("بامية يخنة+ لحمة عجل 90 غم", "2 مغرفة أرز+ نصف كوب يخنة بامية", 370, 25, 20, 20, 0, 0, 0, id33, foodType);
                success33 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img33_1 = convertDrawableToByteArray(R.drawable.h25_11);
            FoodModel food33_1 = new FoodModel("بامية يخنة+ لحمة عجل 90 غم", "", img33_1, 420);
            long id33_1 = foodTableOperations.insertFoodData(food33_1);
            if (id33_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("بامية يخنة+ لحمة عجل 90 غم", "3 مغارف أرز+ نصف كوب يخنة بامية", 420, 35, 20, 20, 0, 0, 0, id33_1, foodType);
                success33_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img33_2 = convertDrawableToByteArray(R.drawable.h25_12);
            FoodModel food33_2 = new FoodModel("بامية يخنة+ لحمة عجل 90 غم", "", img33_2, 590);
            long id33_2 = foodTableOperations.insertFoodData(food33_2);
            if (id33_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("بامية يخنة+ لحمة عجل 90 غم", "5 مغارف أرز+ كوب يخنة بامية", 460, 50, 25, 25, 0, 0, 0, id33_2, foodType);
                success33_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img34 = convertDrawableToByteArray(R.drawable.h26_1);
            FoodModel food34 = new FoodModel("يخنة بطاطا", "", img34, 220);
            long id34 = foodTableOperations.insertFoodData(food34);
            if (id34 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة بطاطا", "2 مغرفة أرز+نصف كوب يخنة", 200, 30, 3, 6, 0, 0, 0, id34, foodType);
                success34 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img34_1 = convertDrawableToByteArray(R.drawable.h26_2);
            FoodModel food34_1 = new FoodModel("يخنة بطاطا", "", img34_1, 280);
            long id34_1 = foodTableOperations.insertFoodData(food34_1);
            if (id34_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة بطاطا", "3 مغارف أرز+نصف كوب يخنة", 260, 40, 4, 6, 0, 0, 0, id34_1, foodType);
                success34_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img34_2 = convertDrawableToByteArray(R.drawable.h26_3);
            FoodModel food34_2 = new FoodModel("يخنة بطاطا", "", img34_2, 520);
            long id34_2 = foodTableOperations.insertFoodData(food34_2);
            if (id34_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة بطاطا", "5 مغارف أرز+كوب يخنة", 400, 70, 6, 12, 0, 0, 0, id34_2, foodType);
                success34_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img35 = convertDrawableToByteArray(R.drawable.h26_4);
            FoodModel food35 = new FoodModel("يخنة بطاطا +صدر دجاج", "", img35, 300);
            long id35 = foodTableOperations.insertFoodData(food35);
            if (id35 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة بطاطا +صدر دجاج", "2 مغرفة أرز+نصف كوب يخنة", 440, 30, 30, 20, 0, 0, 0, id35, foodType);
                success35 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img35_1 = convertDrawableToByteArray(R.drawable.h26_5);
            FoodModel food35_1 = new FoodModel("يخنة بطاطا +صدر دجاج", "", img35_1, 360);
            long id35_1 = foodTableOperations.insertFoodData(food35_1);
            if (id35_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة بطاطا +صدر دجاج", "3 مغارف أرز+نصف كوب يخنة", 500, 40, 35, 20, 0, 0, 0, id35_1, foodType);
                success35_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img35_2 = convertDrawableToByteArray(R.drawable.h26_6);
            FoodModel food35_2 = new FoodModel("يخنة بطاطا +صدر دجاج", "", img35_2, 600);
            long id35_2 = foodTableOperations.insertFoodData(food35_2);
            if (id35_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة بطاطا +صدر دجاج", "5 مغارف أرز+كوب يخنة", 650, 70, 40, 25, 0, 0, 0, id35_2, foodType);
                success35_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img36 = convertDrawableToByteArray(R.drawable.h26_7);
            FoodModel food36 = new FoodModel("يخنة بطاطا+فخذة دجاج 70 غم", "", img36, 300);
            long id36 = foodTableOperations.insertFoodData(food36);
            if (id36 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة بطاطا+فخذة دجاج 70 غم", "2 مغرفة أرز+نصف كوب يخنة", 460, 30, 25, 20, 0, 0, 0, id36, foodType);
                success36 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img36_1 = convertDrawableToByteArray(R.drawable.h26_8);
            FoodModel food36_1 = new FoodModel("يخنة بطاطا+فخذة دجاج 70 غم", "", img36_1, 350);
            long id36_1 = foodTableOperations.insertFoodData(food36_1);
            if (id36_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة بطاطا+فخذة دجاج 70 غم", "3 مغارف أرز+نصف كوب يخنة", 500, 40, 25, 20, 0, 0, 0, id36_1, foodType);
                success36_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img36_2 = convertDrawableToByteArray(R.drawable.h26_9);
            FoodModel food36_2 = new FoodModel("يخنة بطاطا+فخذة دجاج 70 غم", "", img36_2, 600);
            long id36_2 = foodTableOperations.insertFoodData(food36_2);
            if (id36_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة بطاطا+فخذة دجاج 70 غم", "5 مغارف أرز+كوب يخنة", 660, 70, 30, 30, 0, 0, 0, id36_2, foodType);
                success36_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img37 = convertDrawableToByteArray(R.drawable.h26_7);
            FoodModel food37 = new FoodModel("يخنة بطاط + لحمة عجل 90 غم", "", img37, 300);
            long id37 = foodTableOperations.insertFoodData(food37);
            if (id37 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة بطاط + لحمة عجل 90 غم", "2 مغرفة أرز+نصف كوب يخنة", 350, 30, 15, 15, 0, 0, 0, id37, foodType);
                success37 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img37_1 = convertDrawableToByteArray(R.drawable.h26_8);
            FoodModel food37_1 = new FoodModel("يخنة بطاط + لحمة عجل 90 غم", "", img37_1, 370);
            long id37_1 = foodTableOperations.insertFoodData(food37_1);
            if (id37_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة بطاط + لحمة عجل 90 غم", "3 مغارف أرز+نصف كوب يخنة", 400, 40, 20, 20, 0, 0, 0, id37_1, foodType);
                success37_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img37_2 = convertDrawableToByteArray(R.drawable.h26_9);
            FoodModel food37_2 = new FoodModel("يخنة بطاط + لحمة عجل 90 غم", "", img37_2, 600);
            long id37_2 = foodTableOperations.insertFoodData(food37_2);
            if (id37_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة بطاط + لحمة عجل 90 غم", "5 مغارف أرز+كوب يخنة", 560, 70, 20, 20, 0, 0, 0, id37_2, foodType);
                success37_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img38 = convertDrawableToByteArray(R.drawable.h27);
            FoodModel food38 = new FoodModel("صينية باذنجان", "", img38, 150);
            long id38 = foodTableOperations.insertFoodData(food38);
            if (id38 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("صينية باذنجان", "1 مغرفة دائرية", 230, 5, 2, 20, 0, 0, 0, id38, foodType);
                success38 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img39 = convertDrawableToByteArray(R.drawable.h28);
            FoodModel food39 = new FoodModel("صينية باذنجان بالبندورة و اللحم المفروم", "", img39, 160);
            long id39 = foodTableOperations.insertFoodData(food39);
            if (id39 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("صينية باذنجان بالبندورة و اللحم المفروم", "1 مغرفة دائرية", 200, 5, 2, 15, 0, 0, 0, id39, foodType);
                success39 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img40 = convertDrawableToByteArray(R.drawable.h29_1);
            FoodModel food40 = new FoodModel("يخنة بازيلاء", "", img40, 200);
            long id40 = foodTableOperations.insertFoodData(food40);
            if (id40 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة بازيلاء", "2 مغرفة أرز+نصف كوب يخنة", 215, 30, 10, 4, 0, 0, 0, id40, foodType);
                success40 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img40_1 = convertDrawableToByteArray(R.drawable.h29_2);
            FoodModel food40_1 = new FoodModel("يخنة بازيلاء", "", img40_1, 270);
            long id40_1 = foodTableOperations.insertFoodData(food40_1);
            if (id40_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة بازيلاء", "3مغارف ارز+نصف كوب يخنة", 270, 45, 10, 4, 0, 0, 0, id40_1, foodType);
                success40_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img40_2 = convertDrawableToByteArray(R.drawable.h29_3);
            FoodModel food40_2 = new FoodModel("يخنة بازيلاء", "", img40_2, 440);
            long id40_2 = foodTableOperations.insertFoodData(food40_2);
            if (id40_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة بازيلاء", "5 مغارف ارز+كوب يخنة", 470, 70, 20, 8, 0, 0, 0, id40_2, foodType);
                success40_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img41 = convertDrawableToByteArray(R.drawable.h29_4);
            FoodModel food41 = new FoodModel("يخنة بازيلاء +صدر دجاج80 غم", "", img41, 280);
            long id41 = foodTableOperations.insertFoodData(food41);
            if (id41 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة بازيلاء +صدر دجاج80 غم", "2 مغرفة أرز+نصف كوب يخنة", 450, 30, 40, 15, 0, 0, 0, id41, foodType);
                success41 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img41_1 = convertDrawableToByteArray(R.drawable.h29_5);
            FoodModel food41_1 = new FoodModel("يخنة بازيلاء +صدر دجاج80 غم", "", img41_1, 350);
            long id41_1 = foodTableOperations.insertFoodData(food41_1);
            if (id41_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة بازيلاء +صدر دجاج80 غم", "3مغارف ارز+نصف كوب يخنة", 500, 45, 40, 15, 0, 0, 0, id41_1, foodType);
                success41_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img41_2 = convertDrawableToByteArray(R.drawable.h29_6);
            FoodModel food41_2 = new FoodModel("يخنة بازيلاء +صدر دجاج80 غم", "", img41_2, 520);
            long id41_2 = foodTableOperations.insertFoodData(food41_2);
            if (id41_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة بازيلاء +صدر دجاج80 غم", "5 مغارف ارز+كوب يخنة", 700, 70, 50, 20, 0, 0, 0, id41_2, foodType);
                success41_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img42 = convertDrawableToByteArray(R.drawable.h29_7);
            FoodModel food42 = new FoodModel("يخنة بازيلاء+فخذ الدجاج 70 غم", "", img42, 270);
            long id42 = foodTableOperations.insertFoodData(food42);
            if (id42 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة بازيلاء+فخذ الدجاج 70 غم", "2 مغرفة أرز+نصف كوب يخنة", 470, 30, 30, 20, 0, 0, 0, id42, foodType);
                success42 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img42_1 = convertDrawableToByteArray(R.drawable.h29_8);
            FoodModel food42_1 = new FoodModel("يخنة بازيلاء+فخذ الدجاج 70 غم", "", img42_1, 340);
            long id42_1 = foodTableOperations.insertFoodData(food42_1);
            if (id42_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة بازيلاء+فخذ الدجاج 70 غم", "3مغارف ارز+نصف كوب يخنة", 530, 45, 30, 20, 0, 0, 0, id42_1, foodType);
                success42_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img42_2 = convertDrawableToByteArray(R.drawable.h29_9);
            FoodModel food42_2 = new FoodModel("يخنة بازيلاء+فخذ الدجاج 70 غم", "", img42_2, 500);
            long id42_2 = foodTableOperations.insertFoodData(food42_2);
            if (id42_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة بازيلاء+فخذ الدجاج 70 غم", "5 مغارف ارز+كوب يخنة", 730, 70, 40, 25, 0, 0, 0, id42_2, foodType);
                success42_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img43 = convertDrawableToByteArray(R.drawable.h29_10);
            FoodModel food43 = new FoodModel("يخنة بازيلاء + لحمة عجل 90 غم.", "", img43, 300);
            long id43 = foodTableOperations.insertFoodData(food43);
            if (id43 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة بازيلاء + لحمة عجل 90 غم.", "2 مغرفة أرز+نصف كوب يخنة", 370, 30, 25, 15, 0, 0, 0, id43, foodType);
                success43 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img43_1 = convertDrawableToByteArray(R.drawable.h29_11);
            FoodModel food43_1 = new FoodModel("يخنة بازيلاء + لحمة عجل 90 غم.", "", img43_1, 360);
            long id43_1 = foodTableOperations.insertFoodData(food43_1);
            if (id43_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة بازيلاء + لحمة عجل 90 غم.", "3مغارف ارز+نصف كوب يخنة", 420, 45, 25, 15, 0, 0, 0, id43_1, foodType);
                success43_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img43_2 = convertDrawableToByteArray(R.drawable.h29_12);
            FoodModel food43_2 = new FoodModel("يخنة بازيلاء + لحمة عجل 90 غم.", "", img43_2, 530);
            long id43_2 = foodTableOperations.insertFoodData(food43_2);
            if (id43_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة بازيلاء + لحمة عجل 90 غم.", "5 مغارف ارز+كوب يخنة", 630, 70, 35, 20, 0, 0, 0, id43_2, foodType);
                success43_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img44 = convertDrawableToByteArray(R.drawable.h30_1);
            FoodModel food44 = new FoodModel("يخنة زهرة", "", img44, 280);
            long id44 = foodTableOperations.insertFoodData(food44);
            if (id44 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة زهرة", "3 مغرفة أرز+نصف كوب يخنة", 200, 35, 4.5, 6, 0, 0, 0, id44, foodType);
                success44 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img44_1 = convertDrawableToByteArray(R.drawable.h30_2);
            FoodModel food44_1 = new FoodModel("يخنة زهرة", "", img44_1, 450);
            long id44_1 = foodTableOperations.insertFoodData(food44_1);
            if (id44_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة زهرة", "5 مغارف ارز+كوب يخنة", 340, 50, 8, 10, 0, 0, 0, id44_1, foodType);
                success44_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img45 = convertDrawableToByteArray(R.drawable.h30_3);
            FoodModel food45 = new FoodModel("يخنة زهرة + صدر دجاج 80غم", "", img45, 300);
            long id45 = foodTableOperations.insertFoodData(food45);
            if (id45 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة زهرة + صدر دجاج 80غم", "2 مغرفة أرز+نصف كوب يخنة", 380, 20, 30, 20, 0, 0, 0, id45, foodType);
                success45 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img45_1 = convertDrawableToByteArray(R.drawable.h30_4);
            FoodModel food45_1 = new FoodModel("يخنة زهرة + صدر دجاج 80غم", "", img45_1, 360);
            long id45_1 = foodTableOperations.insertFoodData(food45_1);
            if (id45_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة زهرة + صدر دجاج 80غم", "3مغارف ارز+نصف كوب يخنة", 440, 35, 35, 20, 0, 0, 0, id45_1, foodType);
                success45_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img45_2 = convertDrawableToByteArray(R.drawable.h30_5);
            FoodModel food45_2 = new FoodModel("يخنة زهرة + صدر دجاج 80غم", "", img45_2, 530);
            long id45_2 = foodTableOperations.insertFoodData(food45_2);
            if (id45_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة زهرة + صدر دجاج 80غم", "5 مغارف ارز+كوب يخنة", 570, 50, 75, 25, 0, 0, 0, id45_2, foodType);
                success45_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img46 = convertDrawableToByteArray(R.drawable.h30_6);
            FoodModel food46 = new FoodModel("يخنة زهرة +فخذة دجاج 70 غم", "", img46, 300);
            long id46 = foodTableOperations.insertFoodData(food46);
            if (id46 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة زهرة +فخذة دجاج 70 غم", "2 مغرفة أرز+نصف كوب يخنة", 400, 20, 25, 20, 0, 0, 0, id46, foodType);
                success46 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img46_1 = convertDrawableToByteArray(R.drawable.h30_7);
            FoodModel food46_1 = new FoodModel("يخنة زهرة +فخذة دجاج 70 غم", "", img46_1, 350);
            long id46_1 = foodTableOperations.insertFoodData(food46_1);
            if (id46_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة زهرة +فخذة دجاج 70 غم", "3مغارف ارز+نصف كوب يخنة", 460, 35, 25, 20, 0, 0, 0, id46_1, foodType);
                success46_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img46_2 = convertDrawableToByteArray(R.drawable.h30_8);
            FoodModel food46_2 = new FoodModel("يخنة زهرة +فخذة دجاج 70 غم", "", img46_2, 520);
            long id46_2 = foodTableOperations.insertFoodData(food46_2);
            if (id46_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة زهرة +فخذة دجاج 70 غم", "5 مغارف ارز+كوب يخنة", 600, 50, 30, 25, 0, 0, 0, id46_2, foodType);
                success46_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img47 = convertDrawableToByteArray(R.drawable.h30_9);
            FoodModel food47 = new FoodModel("يخنة دجاج +لحمة 90 غم", "", img47, 320);
            long id47 = foodTableOperations.insertFoodData(food47);
            if (id47 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة دجاج +لحمة 90 غم", "2 مغرفة أرز+نصف كوب يخنة", 300, 20, 15, 15, 0, 0, 0, id47, foodType);
                success47 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img47_1 = convertDrawableToByteArray(R.drawable.h30_10);
            FoodModel food47_1 = new FoodModel("يخنة دجاج +لحمة 90 غم", "", img47_1, 380);
            long id47_1 = foodTableOperations.insertFoodData(food47_1);
            if (id47_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة دجاج +لحمة 90 غم", "3مغارف ارز+نصف كوب يخنة", 350, 35, 20, 15, 0, 0, 0, id47_1, foodType);
                success47_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img47_2 = convertDrawableToByteArray(R.drawable.h30_11);
            FoodModel food47_2 = new FoodModel("يخنة دجاج +لحمة 90 غم", "", img47_2, 550);
            long id47_2 = foodTableOperations.insertFoodData(food47_2);
            if (id47_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة دجاج +لحمة 90 غم", "5 مغارف ارز+كوب يخنة", 500, 50, 20, 20, 0, 0, 0, id47_2, foodType);
                success47_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img48 = convertDrawableToByteArray(R.drawable.h31_1);
            FoodModel food48 = new FoodModel("فول اخضر مسلوق", "", img48, 50);
            long id48 = foodTableOperations.insertFoodData(food48);
            if (id48 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("فول اخضر مسلوق", "ربع كوب", 25, 5, 2, 0.0, 0, 0, 0, id48, foodType);
                success48 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img48_1 = convertDrawableToByteArray(R.drawable.h31_2);
            FoodModel food48_1 = new FoodModel("فول اخضر مسلوق", "", img48_1, 100);
            long id48_1 = foodTableOperations.insertFoodData(food48_1);
            if (id48_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("فول اخضر مسلوق", "نصف كوب", 50, 10, 4, 0.0, 0, 0, 0, id48_1, foodType);
                success48_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img49 = convertDrawableToByteArray(R.drawable.h32_1);
            FoodModel food49 = new FoodModel("فول اخضر مقلي", "", img49, 30);
            long id49 = foodTableOperations.insertFoodData(food49);
            if (id49 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("فول اخضر مقلي", "ربع كوب", 70, 5, 2, 5, 0, 0, 0, id49, foodType);
                success49 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img49_1 = convertDrawableToByteArray(R.drawable.h32_2);
            FoodModel food49_1 = new FoodModel("فول اخضر مقلي", "", img49_1, 60);
            long id49_1 = foodTableOperations.insertFoodData(food49_1);
            if (id49_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("فول اخضر مقلي", "نصف كوب", 140, 10, 4, 10, 0, 0, 0, id49_1, foodType);
                success49_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img50 = convertDrawableToByteArray(R.drawable.h33_1);
            FoodModel food50 = new FoodModel("عكوب مسلوق", "", img50, 100);
            long id50 = foodTableOperations.insertFoodData(food50);
            if (id50 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("عكوب مسلوق", "نصف كوب", 25, 5, 2, 0.0, 0, 0, 0, id50, foodType);
                success50 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img50_1 = convertDrawableToByteArray(R.drawable.h33_2);
            FoodModel food50_1 = new FoodModel("عكوب مسلوق", "", img50_1, 200);
            long id50_1 = foodTableOperations.insertFoodData(food50_1);
            if (id50_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("عكوب مسلوق", "كوب", 50, 10, 4, 0.0, 0, 0, 0, id50_1, foodType);
                success50_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img51 = convertDrawableToByteArray(R.drawable.h34);
            FoodModel food51 = new FoodModel("عكوب مقلي", "", img51, 70);
            long id51 = foodTableOperations.insertFoodData(food51);
            if (id51 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("عكوب مقلي", "نصف كوب", 70, 5, 2, 5, 0, 0, 0, id51, foodType);
                success51 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img52 = convertDrawableToByteArray(R.drawable.h35_1);
            FoodModel food52 = new FoodModel("يخنة فاصولياء خضراء", "", img52, 200);
            long id52 = foodTableOperations.insertFoodData(food52);
            if (id52 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة فاصولياء خضراء", "2 مغرفة ارز+نصف كوب يخنه", 150, 20, 3, 5, 0, 0, 0, id52, foodType);
                success52 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img52_1 = convertDrawableToByteArray(R.drawable.h35_2);
            FoodModel food52_1 = new FoodModel("يخنة فاصولياء خضراء", "", img52_1, 270);
            long id52_1 = foodTableOperations.insertFoodData(food52_1);
            if (id52_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة فاصولياء خضراء", "3 مغارف ارز +نصف كوب يخنه", 200, 20, 4, 6, 0, 0, 0, id52_1, foodType);
                success52_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img52_2 = convertDrawableToByteArray(R.drawable.h35_3);
            FoodModel food52_2 = new FoodModel("يخنة فاصولياء خضراء", "", img52_2, 450);
            long id52_2 = foodTableOperations.insertFoodData(food52_2);
            if (id52_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة فاصولياء خضراء", "5 مغارف ارز+كوب يخنه", 340, 50, 8, 10, 0, 0, 0, id52_2, foodType);
                success52_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img53 = convertDrawableToByteArray(R.drawable.h35_4);
            FoodModel food53 = new FoodModel("يخنة فاصولياء خضراء + صدر دجاجه 80 غم", "", img53, 280);
            long id53 = foodTableOperations.insertFoodData(food53);
            if (id53 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة فاصولياء خضراء + صدر دجاجه 80 غم", "2 مغرفة ارز+نصف كوب يخنه", 380, 20, 30, 20, 0, 0, 0, id53, foodType);
                success53 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img53_1 = convertDrawableToByteArray(R.drawable.h35_5);
            FoodModel food53_1 = new FoodModel("يخنة فاصولياء خضراء + صدر دجاجه 80 غم", "", img53_1, 350);
            long id53_1 = foodTableOperations.insertFoodData(food53_1);
            if (id53_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة فاصولياء خضراء + صدر دجاجه 80 غم", "3 مغارف ارز +نصف كوب يخنه", 440, 20, 35, 20, 0, 0, 0, id53_1, foodType);
                success53_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img53_2 = convertDrawableToByteArray(R.drawable.h35_6);
            FoodModel food53_2 = new FoodModel("يخنة فاصولياء خضراء + صدر دجاجه 80 غم", "", img53_2, 530);
            long id53_2 = foodTableOperations.insertFoodData(food53_2);
            if (id53_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة فاصولياء خضراء + صدر دجاجه 80 غم", "5 مغارف ارز+كوب يخنه", 570, 50, 40, 25, 0, 0, 0, id53_2, foodType);
                success53_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img54 = convertDrawableToByteArray(R.drawable.h35_7);
            FoodModel food54 = new FoodModel("يخنة فاصولياء خضراء+فخذة دجاج 70غم", "", img54, 270);
            long id54 = foodTableOperations.insertFoodData(food54);
            if (id54 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة فاصولياء خضراء+فخذة دجاج 70غم", "2 مغرفة ارز+نصف كوب يخنه", 400, 20, 25, 20, 0, 0, 0, id54, foodType);
                success54 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img54_1 = convertDrawableToByteArray(R.drawable.h35_8);
            FoodModel food54_1 = new FoodModel("يخنة فاصولياء خضراء+فخذة دجاج 70غم", "", img54_1, 340);
            long id54_1 = foodTableOperations.insertFoodData(food54_1);
            if (id54_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة فاصولياء خضراء+فخذة دجاج 70غم", "3 مغارف ارز +نصف كوب يخنه", 460, 20, 25, 20, 0, 0, 0, id54_1, foodType);
                success54_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img54_2 = convertDrawableToByteArray(R.drawable.h35_9);
            FoodModel food54_2 = new FoodModel("يخنة فاصولياء خضراء+فخذة دجاج 70غم", "", img54_2, 520);
            long id54_2 = foodTableOperations.insertFoodData(food54_2);
            if (id54_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة فاصولياء خضراء+فخذة دجاج 70غم", "5 مغارف ارز+كوب يخنه", 600, 50, 30, 25, 0, 0, 0, id54_2, foodType);
                success54_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img55 = convertDrawableToByteArray(R.drawable.h36_1);
            FoodModel food55 = new FoodModel("لوبياء خضراء", "", img55, 100);
            long id55 = foodTableOperations.insertFoodData(food55);
            if (id55 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("لوبياء خضراء", "نصف كوب", 120, 5, 2, 10, 0, 0, 0, id55, foodType);
                success55 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img55_1 = convertDrawableToByteArray(R.drawable.h36_2);
            FoodModel food55_1 = new FoodModel("لوبياء خضراء", "", img55_1, 200);
            long id55_1 = foodTableOperations.insertFoodData(food55_1);
            if (id55_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("لوبياء خضراء", "كوب", 230, 10, 4, 20, 0, 0, 0, id55_1, foodType);
                success55_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img56 = convertDrawableToByteArray(R.drawable.h37_1);
            FoodModel food56 = new FoodModel("يخنة لوبياء جافة", "", img56, 230);
            long id56 = foodTableOperations.insertFoodData(food56);
            if (id56 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة لوبياء جافة", "2 مغرفة ارز+نصف كوب يخنه", 240, 30, 10, 6, 0, 0, 0, id56, foodType);
                success56 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img56_1 = convertDrawableToByteArray(R.drawable.h37_2);
            FoodModel food56_1 = new FoodModel("يخنة لوبياء جافة", "", img56_1, 290);
            long id56_1 = foodTableOperations.insertFoodData(food56_1);
            if (id56_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة لوبياء جافة", "3 مغارف ارز +نصف كوب يخنه", 300, 40, 10, 7, 0, 0, 0, id56_1, foodType);
                success56_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img56_2 = convertDrawableToByteArray(R.drawable.h37_3);
            FoodModel food56_2 = new FoodModel("يخنة لوبياء جافة", "", img56_2, 480);
            long id56_2 = foodTableOperations.insertFoodData(food56_2);
            if (id56_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة لوبياء جافة", "5 مغارف ارز+كوب يخنه", 500, 70, 20, 10, 0, 0, 0, id56_2, foodType);
                success56_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img57 = convertDrawableToByteArray(R.drawable.h37_4);
            FoodModel food57 = new FoodModel("يخنة لوبياء جافة+صدر دجاج80غم", "", img57, 300);
            long id57 = foodTableOperations.insertFoodData(food57);
            if (id57 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة لوبياء جافة+صدر دجاج80غم", "2 مغرفة ارز+نصف كوب يخنه", 480, 30, 40, 20, 0, 0, 0, id57, foodType);
                success57 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img57_1 = convertDrawableToByteArray(R.drawable.h37_5);
            FoodModel food57_1 = new FoodModel("يخنة لوبياء جافة+صدر دجاج80غم", "", img57_1, 370);
            long id57_1 = foodTableOperations.insertFoodData(food57_1);
            if (id57_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة لوبياء جافة+صدر دجاج80غم", "3 مغارف ارز +نصف كوب يخنه", 500, 40, 40, 20, 0, 0, 0, id57_1, foodType);
                success57_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img57_2 = convertDrawableToByteArray(R.drawable.h37_6);
            FoodModel food57_2 = new FoodModel("يخنة لوبياء جافة+صدر دجاج80غم", "", img57_2, 550);
            long id57_2 = foodTableOperations.insertFoodData(food57_2);
            if (id57_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة لوبياء جافة+صدر دجاج80غم", "5 مغارف ارز+كوب يخنه", 750, 70, 50, 25, 0, 0, 0, id57_2, foodType);
                success57_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img58 = convertDrawableToByteArray(R.drawable.h37_7);
            FoodModel food58 = new FoodModel("يخنة لوبياء جافة +فخذة دجاج 70غم", "", img58, 300);
            long id58 = foodTableOperations.insertFoodData(food58);
            if (id58 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة لوبياء جافة +فخذة دجاج 70غم", "2 مغرفة ارز+نصف كوب يخنه", 500, 30, 30, 20, 0, 0, 0, id58, foodType);
                success58 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img58_1 = convertDrawableToByteArray(R.drawable.h37_8);
            FoodModel food58_1 = new FoodModel("يخنة لوبياء جافة +فخذة دجاج 70غم", "", img58_1, 440);
            long id58_1 = foodTableOperations.insertFoodData(food58_1);
            if (id58_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة لوبياء جافة +فخذة دجاج 70غم", "3 مغارف ارز +نصف كوب يخنه", 550, 40, 30, 20, 0, 0, 0, id58_1, foodType);
                success58_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img58_2 = convertDrawableToByteArray(R.drawable.h37_9);
            FoodModel food58_2 = new FoodModel("يخنة لوبياء جافة +فخذة دجاج 70غم", "", img58_2, 550);
            long id58_2 = foodTableOperations.insertFoodData(food58_2);
            if (id58_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة لوبياء جافة +فخذة دجاج 70غم", "5 مغارف ارز+كوب يخنه", 780, 70, 40, 30, 0, 0, 0, id58_2, foodType);
                success58_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img59 = convertDrawableToByteArray(R.drawable.h37_10);
            FoodModel food59 = new FoodModel("يخنة لوبياء جافه+لحمة 90غم", "", img59, 320);
            long id59 = foodTableOperations.insertFoodData(food59);
            if (id59 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة لوبياء جافه+لحمة 90غم", "2 مغرفة ارز+نصف كوب يخنه", 400, 30, 25, 15, 0, 0, 0, id59, foodType);
                success59 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img59_1 = convertDrawableToByteArray(R.drawable.h37_11);
            FoodModel food59_1 = new FoodModel("يخنة لوبياء جافه+لحمة 90غم", "", img59_1, 380);
            long id59_1 = foodTableOperations.insertFoodData(food59_1);
            if (id59_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة لوبياء جافه+لحمة 90غم", "3 مغارف ارز +نصف كوب يخنه", 450, 40, 25, 15, 0, 0, 0, id59_1, foodType);
                success59_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img59_2 = convertDrawableToByteArray(R.drawable.h37_12);
            FoodModel food59_2 = new FoodModel("يخنة لوبياء جافه+لحمة 90غم", "", img59_2, 570);
            long id59_2 = foodTableOperations.insertFoodData(food59_2);
            if (id59_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة لوبياء جافه+لحمة 90غم", "5 مغارف ارز+كوب يخنه", 670, 70, 35, 25, 0, 0, 0, id59_2, foodType);
                success59_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img60 = convertDrawableToByteArray(R.drawable.h38_1);
            FoodModel food60 = new FoodModel("يخنة فاصولياء بيضاء (جافة)", "", img60, 240);
            long id60 = foodTableOperations.insertFoodData(food60);
            if (id60 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة فاصولياء بيضاء (جافة)", "2 مغرفة ارز+نصف كوب يخنه", 250, 30, 10, 6, 0, 0, 0, id60, foodType);
                success60 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img60_1 = convertDrawableToByteArray(R.drawable.h38_2);
            FoodModel food60_1 = new FoodModel("يخنة فاصولياء بيضاء (جافة)", "", img60_1, 300);
            long id60_1 = foodTableOperations.insertFoodData(food60_1);
            if (id60_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة فاصولياء بيضاء (جافة)", "3 مغارف ارز +نصف كوب يخنه", 300, 40, 10, 7, 0, 0, 0, id60_1, foodType);
                success60_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img60_2 = convertDrawableToByteArray(R.drawable.h38_3);
            FoodModel food60_2 = new FoodModel("يخنة فاصولياء بيضاء (جافة)", "", img60_2, 500);
            long id60_2 = foodTableOperations.insertFoodData(food60_2);
            if (id60_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة فاصولياء بيضاء (جافة)", "5 مغارف ارز+كوب يخنه", 500, 70, 20, 15, 0, 0, 0, id60_2, foodType);
                success60_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img61 = convertDrawableToByteArray(R.drawable.h38_4);
            FoodModel food61 = new FoodModel("يخنة فاصولياء بيضاء+صدر دجاج 80غم", "", img61, 320);
            long id61 = foodTableOperations.insertFoodData(food61);
            if (id61 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة فاصولياء بيضاء+صدر دجاج 80غم", "2 مغرفة ارز+نصف كوب يخنه", 500, 30, 30, 20, 0, 0, 0, id61, foodType);
                success61 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img61_1 = convertDrawableToByteArray(R.drawable.h38_5);
            FoodModel food61_1 = new FoodModel("يخنة فاصولياء بيضاء+صدر دجاج 80غم", "", img61_1, 380);
            long id61_1 = foodTableOperations.insertFoodData(food61_1);
            if (id61_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة فاصولياء بيضاء+صدر دجاج 80غم", "3 مغارف ارز +نصف كوب يخنه", 550, 40, 30, 20, 0, 0, 0, id61_1, foodType);
                success61_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img61_2 = convertDrawableToByteArray(R.drawable.h38_6);
            FoodModel food61_2 = new FoodModel("يخنة فاصولياء بيضاء+صدر دجاج 80غم", "", img61_2, 580);
            long id61_2 = foodTableOperations.insertFoodData(food61_2);
            if (id61_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة فاصولياء بيضاء+صدر دجاج 80غم", "5 مغارف ارز+كوب يخنه", 780, 70, 40, 30, 0, 0, 0, id61_2, foodType);
                success61_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img62 = convertDrawableToByteArray(R.drawable.h38_7);
            FoodModel food62 = new FoodModel("يخنة فاصولياء بيضاء+فخذة دجاج70غم", "", img62, 260);
            long id62 = foodTableOperations.insertFoodData(food62);
            if (id62 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة فاصولياء بيضاء+فخذة دجاج70غم", "2 مغرفة ارز+نصف كوب يخنه", 480, 30, 40, 20, 0, 0, 0, id62, foodType);
                success62 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img62_1 = convertDrawableToByteArray(R.drawable.h38_8);
            FoodModel food62_1 = new FoodModel("يخنة فاصولياء بيضاء+فخذة دجاج70غم", "", img62_1, 320);
            long id62_1 = foodTableOperations.insertFoodData(food62_1);
            if (id62_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة فاصولياء بيضاء+فخذة دجاج70غم", "3 مغارف ارز +نصف كوب يخنه", 530, 40, 40, 20, 0, 0, 0, id62_1, foodType);
                success62_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img62_2 = convertDrawableToByteArray(R.drawable.h38_9);
            FoodModel food62_2 = new FoodModel("يخنة فاصولياء بيضاء+فخذة دجاج70غم", "", img62_2, 500);
            long id62_2 = foodTableOperations.insertFoodData(food62_2);
            if (id62_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة فاصولياء بيضاء+فخذة دجاج70غم", "5 مغارف ارز+كوب يخنه", 750, 70, 50, 25, 0, 0, 0, id62_2, foodType);
                success62_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img63 = convertDrawableToByteArray(R.drawable.h38_10);
            FoodModel food63 = new FoodModel("يخنة فاصولياء بيضاء+لحمة 90غم", "", img63, 280);
            long id63 = foodTableOperations.insertFoodData(food63);
            if (id63 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة فاصولياء بيضاء+لحمة 90غم", "2 مغرفة ارز+نصف كوب يخنه", 400, 30, 25, 15, 0, 0, 0, id63, foodType);
                success63 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img63_1 = convertDrawableToByteArray(R.drawable.h38_11);
            FoodModel food63_1 = new FoodModel("يخنة فاصولياء بيضاء+لحمة 90غم", "", img63_1, 340);
            long id63_1 = foodTableOperations.insertFoodData(food63_1);
            if (id63_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة فاصولياء بيضاء+لحمة 90غم", "3 مغارف ارز +نصف كوب يخنه", 450, 40, 25, 15, 0, 0, 0, id63_1, foodType);
                success63_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img63_2 = convertDrawableToByteArray(R.drawable.h38_12);
            FoodModel food63_2 = new FoodModel("يخنة فاصولياء بيضاء+لحمة 90غم", "", img63_2, 540);
            long id63_2 = foodTableOperations.insertFoodData(food63_2);
            if (id63_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة فاصولياء بيضاء+لحمة 90غم", "5 مغارف ارز+كوب يخنه", 650, 70, 35, 25, 0, 0, 0, id63_2, foodType);
                success63_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img64 = convertDrawableToByteArray(R.drawable.h39_1);
            FoodModel food64 = new FoodModel("يخنة سبانخ", "", img64, 200);
            long id64 = foodTableOperations.insertFoodData(food64);
            if (id64 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة سبانخ", "2 مغرفة ارز+نصف كوب يخنه", 130, 20, 3.5, 3, 0, 0, 0, id64, foodType);
                success64 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img64_1 = convertDrawableToByteArray(R.drawable.h39_2);
            FoodModel food64_1 = new FoodModel("يخنة سبانخ", "", img64_1, 250);
            long id64_1 = foodTableOperations.insertFoodData(food64_1);
            if (id64_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة سبانخ", "3 مغارف ارز +نصف كوب يخنه", 180, 30, 5, 30, 0, 0, 0, id64_1, foodType);
                success64_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img64_2 = convertDrawableToByteArray(R.drawable.h39_3);
            FoodModel food64_2 = new FoodModel("يخنة سبانخ", "", img64_2, 440);
            long id64_2 = foodTableOperations.insertFoodData(food64_2);
            if (id64_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة سبانخ", "5 مغارف ارز+كوب يخنه", 300, 50, 9, 35, 0, 0, 0, id64_2, foodType);
                success64_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img65 = convertDrawableToByteArray(R.drawable.h39_4);
            FoodModel food65 = new FoodModel("يخنة سبانخ+صدر دجاج80 غم", "", img65, 250);
            long id65 = foodTableOperations.insertFoodData(food65);
            if (id65 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة سبانخ+صدر دجاج80 غم", "2 مغرفة ارز+نصف كوب يخنه", 280, 20, 20, 15, 0, 0, 0, id65, foodType);
                success65 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img65_1 = convertDrawableToByteArray(R.drawable.h39_5);
            FoodModel food65_1 = new FoodModel("يخنة سبانخ+صدر دجاج80 غم", "", img65_1, 330);
            long id65_1 = foodTableOperations.insertFoodData(food65_1);
            if (id65_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة سبانخ+صدر دجاج80 غم", "3 مغارف ارز +نصف كوب يخنه", 330, 30, 20, 15, 0, 0, 0, id65_1, foodType);
                success65_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img65_2 = convertDrawableToByteArray(R.drawable.h39_6);
            FoodModel food65_2 = new FoodModel("يخنة سبانخ+صدر دجاج80 غم", "", img65_2, 500);
            long id65_2 = foodTableOperations.insertFoodData(food65_2);
            if (id65_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة سبانخ+صدر دجاج80 غم", "5 مغارف ارز+كوب يخنه", 450, 50, 20, 15, 0, 0, 0, id65_2, foodType);
                success65_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img66 = convertDrawableToByteArray(R.drawable.h39_7);
            FoodModel food66 = new FoodModel("يخنة سبانخ+فخذة دجاج 70غم", "", img66, 250);
            long id66 = foodTableOperations.insertFoodData(food66);
            if (id66 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة سبانخ+فخذة دجاج 70غم", "2 مغرفة ارز+نصف كوب يخنه", 400, 20, 25, 20, 0, 0, 0, id66, foodType);
                success66 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img66_1 = convertDrawableToByteArray(R.drawable.h39_8);
            FoodModel food66_1 = new FoodModel("يخنة سبانخ+فخذة دجاج 70غم", "", img66_1, 320);
            long id66_1 = foodTableOperations.insertFoodData(food66_1);
            if (id66_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة سبانخ+فخذة دجاج 70غم", "3 مغارف ارز +نصف كوب يخنه", 450, 30, 25, 18, 0, 0, 0, id66_1, foodType);
                success66_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img66_2 = convertDrawableToByteArray(R.drawable.h39_9);
            FoodModel food66_2 = new FoodModel("يخنة سبانخ+فخذة دجاج 70غم", "", img66_2, 500);
            long id66_2 = foodTableOperations.insertFoodData(food66_2);
            if (id66_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة سبانخ+فخذة دجاج 70غم", "5 مغارف ارز+كوب يخنه", 550, 50, 30, 25, 0, 0, 0, id66_2, foodType);
                success66_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img67 = convertDrawableToByteArray(R.drawable.h39_10);
            FoodModel food67 = new FoodModel("يخنة سبانخ +لحمة 90غم", "", img67, 280);
            long id67 = foodTableOperations.insertFoodData(food67);
            if (id67 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة سبانخ +لحمة 90غم", "2 مغرفة ارز+نصف كوب يخنه", 350, 20, 30, 15, 0, 0, 0, id67, foodType);
                success67 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img67_1 = convertDrawableToByteArray(R.drawable.h39_11);
            FoodModel food67_1 = new FoodModel("يخنة سبانخ +لحمة 90غم", "", img67_1, 350);
            long id67_1 = foodTableOperations.insertFoodData(food67_1);
            if (id67_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة سبانخ +لحمة 90غم", "3 مغارف ارز +نصف كوب يخنه", 420, 30, 35, 15, 0, 0, 0, id67_1, foodType);
                success67_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img67_2 = convertDrawableToByteArray(R.drawable.h39_12);
            FoodModel food67_2 = new FoodModel("يخنة سبانخ +لحمة 90غم", "", img67_2, 500);
            long id67_2 = foodTableOperations.insertFoodData(food67_2);
            if (id67_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة سبانخ +لحمة 90غم", "5 مغارف ارز+كوب يخنه", 530, 50, 35, 20, 0, 0, 0, id67_2, foodType);
                success67_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img68 = convertDrawableToByteArray(R.drawable.h40_1);
            FoodModel food68 = new FoodModel("يخنة ملوخية", "", img68, 120);
            long id68 = foodTableOperations.insertFoodData(food68);
            if (id68 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة ملوخية", "2 مغرفة ارز+نصف كوب يخنه", 130, 20, 3.5, 3, 0, 0, 0, id68, foodType);
                success68 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img68_1 = convertDrawableToByteArray(R.drawable.h40_2);
            FoodModel food68_1 = new FoodModel("يخنة ملوخية", "", img68_1, 120);
            long id68_1 = foodTableOperations.insertFoodData(food68_1);
            if (id68_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة ملوخية", "3 مغارف ارز +نصف كوب يخنه", 180, 30, 4.5, 3, 0, 0, 0, id68_1, foodType);
                success68_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img68_2 = convertDrawableToByteArray(R.drawable.h40_3);
            FoodModel food68_2 = new FoodModel("يخنة ملوخية", "", img68_2, 230);
            long id68_2 = foodTableOperations.insertFoodData(food68_2);
            if (id68_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة ملوخية", "5 مغارف ارز+كوب يخنه", 130, 20, 3.5, 3, 0, 0, 0, id68_2, foodType);
                success68_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img69 = convertDrawableToByteArray(R.drawable.h40_4);
            FoodModel food69 = new FoodModel("يخنة ملوخية+صدر دجاج 80 غم", "", img69, 250);
            long id69 = foodTableOperations.insertFoodData(food69);
            if (id69 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة ملوخية+صدر دجاج 80 غم", "2 مغرفة ارز+نصف كوب يخنه", 360, 20, 30, 15, 0, 0, 0, id69, foodType);
                success69 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img69_1 = convertDrawableToByteArray(R.drawable.h40_5);
            FoodModel food69_1 = new FoodModel("يخنة ملوخية+صدر دجاج 80 غم", "", img69_1, 320);
            long id69_1 = foodTableOperations.insertFoodData(food69_1);
            if (id69_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة ملوخية+صدر دجاج 80 غم", "3 مغارف ارز +نصف كوب يخنه", 420, 30, 35, 15, 0, 0, 0, id69_1, foodType);
                success69_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img69_2 = convertDrawableToByteArray(R.drawable.h40_6);
            FoodModel food69_2 = new FoodModel("يخنة ملوخية+صدر دجاج 80 غم", "", img69_2, 460);
            long id69_2 = foodTableOperations.insertFoodData(food69_2);
            if (id69_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة ملوخية+صدر دجاج 80 غم", "5 مغارف ارز+كوب يخنه", 530, 50, 40, 20, 0, 0, 0, id69_2, foodType);
                success69_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img70 = convertDrawableToByteArray(R.drawable.h40_7);
            FoodModel food70 = new FoodModel("يخنة ملوخية+فخذة دجاج 70غم", "", img70, 250);
            long id70 = foodTableOperations.insertFoodData(food70);
            if (id70 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة ملوخية+فخذة دجاج 70غم", "2 مغرفة ارز+نصف كوب يخنه", 400, 20, 25, 20, 0, 0, 0, id70, foodType);
                success70 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img70_1 = convertDrawableToByteArray(R.drawable.h40_8);
            FoodModel food70_1 = new FoodModel("يخنة ملوخية+فخذة دجاج 70غم", "", img70_1, 300);
            long id70_1 = foodTableOperations.insertFoodData(food70_1);
            if (id70_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة ملوخية+فخذة دجاج 70غم", "3 مغارف ارز +نصف كوب يخنه", 450, 30, 25, 20, 0, 0, 0, id70_1, foodType);
                success70_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img70_2 = convertDrawableToByteArray(R.drawable.h40_9);
            FoodModel food70_2 = new FoodModel("يخنة ملوخية+فخذة دجاج 70غم", "", img70_2, 450);
            long id70_2 = foodTableOperations.insertFoodData(food70_2);
            if (id70_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة ملوخية+فخذة دجاج 70غم", "5 مغارف ارز+كوب يخنه", 550, 50, 30, 20, 0, 0, 0, id70_2, foodType);
                success70_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img71 = convertDrawableToByteArray(R.drawable.h40_10);
            FoodModel food71 = new FoodModel("يخنة ملوخية+لحمة 90غم", "", img71, 250);
            long id71 = foodTableOperations.insertFoodData(food71);
            if (id71 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة ملوخية+لحمة 90غم", "2 مغرفة ارز+نصف كوب يخنه", 280, 20, 15, 15, 0, 0, 0, id71, foodType);
                success71 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img71_1 = convertDrawableToByteArray(R.drawable.h40_11);
            FoodModel food71_1 = new FoodModel("يخنة ملوخية+لحمة 90غم", "", img71_1, 330);
            long id71_1 = foodTableOperations.insertFoodData(food71_1);
            if (id71_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة ملوخية+لحمة 90غم", "3 مغارف ارز +نصف كوب يخنه", 340, 30, 20, 15, 0, 0, 0, id71_1, foodType);
                success71_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img71_2 = convertDrawableToByteArray(R.drawable.h40_12);
            FoodModel food71_2 = new FoodModel("يخنة ملوخية+لحمة 90غم", "", img71_2, 450);
            long id71_2 = foodTableOperations.insertFoodData(food71_2);
            if (id71_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة ملوخية+لحمة 90غم", "5 مغارف ارز+كوب يخنه", 450, 50, 20, 30, 0, 0, 0, id71_2, foodType);
                success71_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img72 = convertDrawableToByteArray(R.drawable.h41_1);
            FoodModel food72 = new FoodModel("خبيزة", "", img72, 80);
            long id72 = foodTableOperations.insertFoodData(food72);
            if (id72 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("خبيزة", "نصف كوب", 120, 5, 2, 10, 0, 0, 0, id72, foodType);
                success72 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img72_1 = convertDrawableToByteArray(R.drawable.h41_2);
            FoodModel food72_1 = new FoodModel("خبيزة", "", img72_1, 150);
            long id72_1 = foodTableOperations.insertFoodData(food72_1);
            if (id72_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("خبيزة", "كوب", 240, 10, 4, 20, 0, 0, 0, id72_1, foodType);
                success72_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img73 = convertDrawableToByteArray(R.drawable.h42_1);
            FoodModel food73 = new FoodModel("لوف", "", img73, 120);
            long id73 = foodTableOperations.insertFoodData(food73);
            if (id73 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("لوف", "نصف كوب", 120, 5, 2, 10, 0, 0, 0, id73, foodType);
                success73 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img73_1 = convertDrawableToByteArray(R.drawable.h42_2);
            FoodModel food73_1 = new FoodModel("لوف", "", img73_1, 250);
            long id73_1 = foodTableOperations.insertFoodData(food73_1);
            if (id73_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("لوف", "كوب", 240, 10, 4, 20, 0, 0, 0, id73_1, foodType);
                success73_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img74 = convertDrawableToByteArray(R.drawable.h43_1);
            FoodModel food74 = new FoodModel("سبانخ حوس", "", img74, 120);
            long id74 = foodTableOperations.insertFoodData(food74);
            if (id74 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("سبانخ حوس", "نصف كوب", 120, 5, 2, 10, 0, 0, 0, id74, foodType);
                success74 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img74_1 = convertDrawableToByteArray(R.drawable.h43_2);
            FoodModel food74_1 = new FoodModel("سبانخ حوس", "", img74_1, 250);
            long id74_1 = foodTableOperations.insertFoodData(food74_1);
            if (id74_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("سبانخ حوس", "كوب", 240, 10, 4, 20, 0, 0, 0, id74_1, foodType);
                success74_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img75 = convertDrawableToByteArray(R.drawable.h44_1);
            FoodModel food75 = new FoodModel("مسخن", "", img75, 180);
            long id75 = foodTableOperations.insertFoodData(food75);
            if (id75 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مسخن", "ربع رغيف طابون", 440, 50, 5, 20, 0, 0, 0, id75, foodType);
                success75 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img76 = convertDrawableToByteArray(R.drawable.h44_2);
            FoodModel food76 = new FoodModel("مسخن مع صدر دجاج 80غم", "", img76, 250);
            long id76 = foodTableOperations.insertFoodData(food76);
            if (id76 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مسخن مع صدر دجاج 80غم", "ربع رغيف طابون", 680, 50, 35, 35, 0, 0, 0, id76, foodType);
                success76 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img77 = convertDrawableToByteArray(R.drawable.h44_3);
            FoodModel food77 = new FoodModel("مسخن مع فخذة دجاج70غم", "", img77, 300);
            long id77 = foodTableOperations.insertFoodData(food77);
            if (id77 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مسخن مع فخذة دجاج70غم", "ربع رغيف طابون", 690, 50, 25, 40, 0, 0, 0, id77, foodType);
                success77 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img78 = convertDrawableToByteArray(R.drawable.h45);
            FoodModel food78 = new FoodModel("فطيرة الراعي", "", img78, 230);
            long id78 = foodTableOperations.insertFoodData(food78);
            if (id78 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("فطيرة الراعي", "1 مغرفة دائرية", 400, 30, 15, 20, 0, 0, 0, id78, foodType);
                success78 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img79 = convertDrawableToByteArray(R.drawable.h46_1);
            FoodModel food79 = new FoodModel("2 كبة لبن + ارز", "", img79, 120);
            long id79 = foodTableOperations.insertFoodData(food79);
            if (id79 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("2 كبة لبن + ارز", "2 مغرفة ارز+نصف كوب لبن", 350, 35, 15, 15, 0, 0, 0, id79, foodType);
                success79 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img80 = convertDrawableToByteArray(R.drawable.h46_2);
            FoodModel food80 = new FoodModel("3 كبة لبن + ارز", "", img80, 200);
            long id80 = foodTableOperations.insertFoodData(food80);
            if (id80 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("3 كبة لبن + ارز", "3 مغارف ارز+نصف كوب لبن", 400, 50, 15, 15, 0, 0, 0, id80, foodType);
                success80 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img81 = convertDrawableToByteArray(R.drawable.h46_3);
            FoodModel food81 = new FoodModel("4 كبة لبن + ارز", "", img81, 300);
            long id81 = foodTableOperations.insertFoodData(food81);
            if (id81 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("4 كبة لبن + ارز", "5 مغارف ارز+كوب لبن", 750, 80, 25, 25, 0, 0, 0, id81, foodType);
                success81 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img82 = convertDrawableToByteArray(R.drawable.h47_1);
            FoodModel food82 = new FoodModel("كبة لبن (من الارز و اللحمة)", "", img82, 90);
            long id82 = foodTableOperations.insertFoodData(food82);
            if (id82 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("كبة لبن (من الارز و اللحمة)", "2 قطعة", 200, 15, 10, 10, 0, 0, 0, id82, foodType);
                success82 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img82_1 = convertDrawableToByteArray(R.drawable.h47_2);
            FoodModel food82_1 = new FoodModel("كبة لبن (من الارز و اللحمة)", "", img82_1, 180);
            long id82_1 = foodTableOperations.insertFoodData(food82_1);
            if (id82_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("كبة لبن (من الارز و اللحمة)", "4 قطع", 400, 30, 15, 20, 0, 0, 0, id82_1, foodType);
                success82_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img83 = convertDrawableToByteArray(R.drawable.h48);
            FoodModel food83 = new FoodModel("فري محشي بالأرز", "", img83, 130);
            long id83 = foodTableOperations.insertFoodData(food83);
            if (id83 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("فري محشي بالأرز", "حجم صغير كامل", 220, 15, 10, 10, 0, 0, 0, id83, foodType);
                success83 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img84 = convertDrawableToByteArray(R.drawable.h49);
            FoodModel food84 = new FoodModel("مشاط", "", img84, 80);
            long id84 = foodTableOperations.insertFoodData(food84);
            if (id84 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مشاط", "قطعة متوسطة", 350, 30, 2, 25, 0, 0, 0, id84, foodType);
                success84 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img85 = convertDrawableToByteArray(R.drawable.h50_1);
            FoodModel food85 = new FoodModel("صينية كفتة مع خضار", "", img85, 230);
            long id85 = foodTableOperations.insertFoodData(food85);
            if (id85 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("صينية كفتة مع خضار", "1 مغرفة دائرية", 550, 15, 40, 30, 0, 0, 0, id85, foodType);
                success85 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img85_1 = convertDrawableToByteArray(R.drawable.h50_2);
            FoodModel food85_1 = new FoodModel("صينية كفتة مع خضار", "", img85_1, 350);
            long id85_1 = foodTableOperations.insertFoodData(food85_1);
            if (id85_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("صينية كفتة مع خضار", "2 مغرفة دائرية", 750, 10, 60, 50, 0, 0, 0, id85_1, foodType);
                success85_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img86 = convertDrawableToByteArray(R.drawable.h51_1);
            FoodModel food86 = new FoodModel("رقاقة و عدس", "", img86, 150);
            long id86 = foodTableOperations.insertFoodData(food86);
            if (id86 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("رقاقة و عدس", "نصف كوب", 300, 40, 15, 5, 0, 0, 0, id86, foodType);
                success86 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img86_1 = convertDrawableToByteArray(R.drawable.h51_2);
            FoodModel food86_1 = new FoodModel("رقاقة و عدس", "", img86_1, 250);
            long id86_1 = foodTableOperations.insertFoodData(food86_1);
            if (id86_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("رقاقة و عدس", "كوب", 500, 80, 20, 10, 0, 0, 0, id86_1, foodType);
                success86_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img87 = convertDrawableToByteArray(R.drawable.h52_1);
            FoodModel food87 = new FoodModel("عكوب مع لبن", "", img87, 150);
            long id87 = foodTableOperations.insertFoodData(food87);
            if (id87 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("عكوب مع لبن", "2 مغرفة ارز+نصف كوب يخنة", 200, 25, 5, 5, 0, 0, 0, id87, foodType);
                success87 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img87_1 = convertDrawableToByteArray(R.drawable.h52_2);
            FoodModel food87_1 = new FoodModel("عكوب مع لبن", "", img87_1, 200);
            long id87_1 = foodTableOperations.insertFoodData(food87_1);
            if (id87_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("عكوب مع لبن", "3 مغارف ارز+نصف كوب يخنة", 250, 35, 8, 7, 0, 0, 0, id87_1, foodType);
                success87_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img87_2 = convertDrawableToByteArray(R.drawable.h52_3);
            FoodModel food87_2 = new FoodModel("عكوب مع لبن", "", img87_2, 330);
            long id87_2 = foodTableOperations.insertFoodData(food87_2);
            if (id87_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("عكوب مع لبن", "5 مغارف ارز+كوب يخنه", 370, 50, 10, 10, 0, 0, 0, id87_2, foodType);
                success87_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img88 = convertDrawableToByteArray(R.drawable.h52_4);
            FoodModel food88 = new FoodModel("يخنة لبن وع جوب +صدر دجاج 80غم", "", img88, 250);
            long id88 = foodTableOperations.insertFoodData(food88);
            if (id88 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة لبن وع جوب +صدر دجاج 80غم", "2 مغرفة ارز+نصف كوب يخنة", 450, 25, 35, 20, 0, 0, 0, id88, foodType);
                success88 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img88_1 = convertDrawableToByteArray(R.drawable.h52_5);
            FoodModel food88_1 = new FoodModel("يخنة لبن وع جوب +صدر دجاج 80غم", "", img88_1, 320);
            long id88_1 = foodTableOperations.insertFoodData(food88_1);
            if (id88_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة لبن وع جوب +صدر دجاج 80غم", "3 مغارف ارز+نصف كوب يخنة", 480, 35, 40, 20, 0, 0, 0, id88_1, foodType);
                success88_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img88_2 = convertDrawableToByteArray(R.drawable.h52_6);
            FoodModel food88_2 = new FoodModel("يخنة لبن وع جوب +صدر دجاج 80غم", "", img88_2, 400);
            long id88_2 = foodTableOperations.insertFoodData(food88_2);
            if (id88_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة لبن وع جوب +صدر دجاج 80غم", "5 مغارف ارز+كوب يخنه", 600, 50, 40, 25, 0, 0, 0, id88_2, foodType);
                success88_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img89 = convertDrawableToByteArray(R.drawable.h52_7);
            FoodModel food89 = new FoodModel("يخنة لبن و عكوب +فخذة دجاج 70غم", "", img89, 220);
            long id89 = foodTableOperations.insertFoodData(food89);
            if (id89 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة لبن و عكوب +فخذة دجاج 70غم", "2 مغرفة ارز+نصف كوب يخنة", 450, 25, 30, 20, 0, 0, 0, id89, foodType);
                success89 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img89_1 = convertDrawableToByteArray(R.drawable.h52_8);
            FoodModel food89_1 = new FoodModel("يخنة لبن و عكوب +فخذة دجاج 70غم", "", img89_1, 280);
            long id89_1 = foodTableOperations.insertFoodData(food89_1);
            if (id89_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة لبن و عكوب +فخذة دجاج 70غم", "3 مغارف ارز+نصف كوب يخنة", 500, 35, 30, 20, 0, 0, 0, id89_1, foodType);
                success89_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img89_2 = convertDrawableToByteArray(R.drawable.h52_9);
            FoodModel food89_2 = new FoodModel("يخنة لبن و عكوب +فخذة دجاج 70غم", "", img89_2, 400);
            long id89_2 = foodTableOperations.insertFoodData(food89_2);
            if (id89_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة لبن و عكوب +فخذة دجاج 70غم", "5 مغارف ارز+كوب يخنه", 630, 50, 30, 25, 0, 0, 0, id89_2, foodType);
                success89_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img90 = convertDrawableToByteArray(R.drawable.h52_10);
            FoodModel food90 = new FoodModel("يخنة لبن و عكوب +فخذة دجاج 70غم", "", img90, 250);
            long id90 = foodTableOperations.insertFoodData(food90);
            if (id90 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة لبن و عكوب +فخذة دجاج 70غم", "2 مغرفة ارز+نصف كوب يخنة", 350, 25, 20, 15, 0, 0, 0, id90, foodType);
                success90 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img90_1 = convertDrawableToByteArray(R.drawable.h52_11);
            FoodModel food90_1 = new FoodModel("يخنة لبن و عكوب +فخذة دجاج 70غم", "", img90_1, 300);
            long id90_1 = foodTableOperations.insertFoodData(food90_1);
            if (id90_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة لبن و عكوب +فخذة دجاج 70غم", "3 مغارف ارز+نصف كوب يخنة", 400, 35, 20, 15, 0, 0, 0, id90_1, foodType);
                success90_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img90_2 = convertDrawableToByteArray(R.drawable.h52_12);
            FoodModel food90_2 = new FoodModel("يخنة لبن و عكوب +فخذة دجاج 70غم", "", img90_2, 400);
            long id90_2 = foodTableOperations.insertFoodData(food90_2);
            if (id90_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("يخنة لبن و عكوب +فخذة دجاج 70غم", "5 مغارف ارز+كوب يخنه", 500, 70, 25, 20, 0, 0, 0, id90_2, foodType);
                success90_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img91 = convertDrawableToByteArray(R.drawable.h53);
            FoodModel food91 = new FoodModel("وجبة سمك مقطع", "", img91, 500);
            long id91 = foodTableOperations.insertFoodData(food91);
            if (id91 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("وجبة سمك مقطع", "سمكة متوسطة كوب ارز", 550, 50, 15, 20, 0, 0, 0, id91, foodType);
                success91 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img92 = convertDrawableToByteArray(R.drawable.h54);
            FoodModel food92 = new FoodModel("وجبة سمكة كاملة", "", img92, 480);
            long id92 = foodTableOperations.insertFoodData(food92);
            if (id92 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("وجبة سمكة كاملة", "سمكة متوسطة+رغيف خبز 60غم+نصف كوب بطاطا مقلية", 450, 60, 25, 25, 0, 0, 0, id92, foodType);
                success92 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img93 = convertDrawableToByteArray(R.drawable.h56);
            FoodModel food93 = new FoodModel("سمكة دنيس محشية", "", img93, 300);
            long id93 = foodTableOperations.insertFoodData(food93);
            if (id93 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("سمكة دنيس محشية", "متوسطة الحجم", 350, 5, 30, 20, 0, 0, 0, id93, foodType);
                success93 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img94 = convertDrawableToByteArray(R.drawable.h57_1);
            FoodModel food94 = new FoodModel("معكرونة سباغيتي بالخضار", "", img94, 90);
            long id94 = foodTableOperations.insertFoodData(food94);
            if (id94 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("معكرونة سباغيتي بالخضار", "2 مغرفة ارز", 150, 20, 2, 5, 0, 0, 0, id94, foodType);
                success94 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img94_1 = convertDrawableToByteArray(R.drawable.h57_2);
            FoodModel food94_1 = new FoodModel("معكرونة سباغيتي بالخضار", "", img94_1, 140);
            long id94_1 = foodTableOperations.insertFoodData(food94_1);
            if (id94_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("معكرونة سباغيتي بالخضار", "3 مغارف ارز", 220, 25, 2.5, 10, 0, 0, 0, id94_1, foodType);
                success94_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img94_2 = convertDrawableToByteArray(R.drawable.h57_3);
            FoodModel food94_2 = new FoodModel("معكرونة سباغيتي بالخضار", "", img94_2, 200);
            long id94_2 = foodTableOperations.insertFoodData(food94_2);
            if (id94_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("معكرونة سباغيتي بالخضار", "5 مغارف ارز", 350, 40, 4, 15, 0, 0, 0, id94_2, foodType);
                success94_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }

            //الوجبات الرئيسية 2
            byte[] img95 = convertDrawableToByteArray(R.drawable.h58_1);
            FoodModel food95 = new FoodModel("منسف لبن", "", img95, 185);
            long id95 = foodTableOperations.insertFoodData(food95);
            if (id95 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("منسف لبن", "2 مغرفة أرز+ نصف كوب لبن", 250, 15, 15, 15, 0, 0, 0, id95, foodType);
                success95 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img95_1 = convertDrawableToByteArray(R.drawable.h58_2);
            FoodModel food95_1 = new FoodModel("منسف لبن", "", img95_1, 250);
            long id95_1 = foodTableOperations.insertFoodData(food95_1);
            if (id95_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("منسف لبن", "3 مغارف ارز + نصف كوب لبن", 320, 20, 15, 15, 0, 0, 0, id95_1, foodType);
                success95_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img95_2 = convertDrawableToByteArray(R.drawable.h58_3);
            FoodModel food95_2 = new FoodModel("منسف لبن", "", img95_2, 380);
            long id95_2 = foodTableOperations.insertFoodData(food95_2);
            if (id95_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("منسف لبن", "5 مغارف أرز+ كوب لبن", 600, 40, 30, 30, 0, 0, 0, id95_2, foodType);
                success95_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img96 = convertDrawableToByteArray(R.drawable.h58_4);
            FoodModel food96 = new FoodModel("منسف لبن+ صدر دجاج", "", img96, 260);
            long id96 = foodTableOperations.insertFoodData(food96);
            if (id96 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("منسف لبن+ صدر دجاج", "2 مغرفة أرز+ نصف كوب لبن", 480, 15, 45, 30, 0, 0, 0, id96, foodType);
                success96 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img96_1 = convertDrawableToByteArray(R.drawable.h58_5);
            FoodModel food96_1 = new FoodModel("منسف لبن+ صدر دجاج", "", img96_1, 330);
            long id96_1 = foodTableOperations.insertFoodData(food96_1);
            if (id96_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("منسف لبن+ صدر دجاج", "3 مغارف ارز + نصف كوب لبن", 550, 25, 45, 30, 0, 0, 0, id96_1, foodType);
                success96_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img96_2 = convertDrawableToByteArray(R.drawable.h58_6);
            FoodModel food96_2 = new FoodModel("منسف لبن+ صدر دجاج", "", img96_2, 460);
            long id96_2 = foodTableOperations.insertFoodData(food96_2);
            if (id96_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("منسف لبن+ صدر دجاج", "5 مغارف أرز+ كوب لبن", 800, 40, 60, 45, 0, 0, 0, id96_2, foodType);
                success96_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img97 = convertDrawableToByteArray(R.drawable.h58_7);
            FoodModel food97 = new FoodModel("منسف لبن+ فخذة دجاج", "", img97, 255);
            long id97 = foodTableOperations.insertFoodData(food97);
            if (id97 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("منسف لبن+ فخذة دجاج", "2 مغرفة أرز+ نصف كوب لبن", 480, 15, 35, 30, 0, 0, 0, id97, foodType);
                success97 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img97_1 = convertDrawableToByteArray(R.drawable.h58_8);
            FoodModel food97_1 = new FoodModel("منسف لبن+ فخذة دجاج", "", img97_1, 320);
            long id97_1 = foodTableOperations.insertFoodData(food97_1);
            if (id97_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("منسف لبن+ فخذة دجاج", "3 مغارف ارز + نصف كوب لبن", 570, 25, 40, 30, 0, 0, 0, id97_1, foodType);
                success97_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img97_2 = convertDrawableToByteArray(R.drawable.h58_9);
            FoodModel food97_2 = new FoodModel("منسف لبن+ فخذة دجاج", "", img97_2, 450);
            long id97_2 = foodTableOperations.insertFoodData(food97_2);
            if (id97_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("منسف لبن+ فخذة دجاج", "5 مغارف أرز+ كوب لبن", 850, 40, 50, 45, 0, 0, 0, id97_2, foodType);
                success97_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img98 = convertDrawableToByteArray(R.drawable.h58_10);
            FoodModel food98 = new FoodModel("منسف لبن+ قطعة لحمة", "", img98, 265);
            long id98 = foodTableOperations.insertFoodData(food98);
            if (id98 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("منسف لبن+ قطعة لحمة", "2 مغرفة أرز+ نصف كوب لبن", 280, 15, 30, 25, 0, 0, 0, id98, foodType);
                success98 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img98_1 = convertDrawableToByteArray(R.drawable.h58_11);
            FoodModel food98_1 = new FoodModel("منسف لبن+ قطعة لحمة", "", img98_1, 330);
            long id98_1 = foodTableOperations.insertFoodData(food98_1);
            if (id98_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("منسف لبن+ قطعة لحمة", "3 مغارف ارز + نصف كوب لبن", 450, 20, 30, 25, 0, 0, 0, id98_1, foodType);
                success98_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img98_2 = convertDrawableToByteArray(R.drawable.h58_12);
            FoodModel food98_2 = new FoodModel("منسف لبن+ قطعة لحمة", "", img98_2, 460);
            long id98_2 = foodTableOperations.insertFoodData(food98_2);
            if (id98_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("منسف لبن+ قطعة لحمة", "5 مغارف أرز+ كوب لبن", 750, 35, 45, 40, 0, 0, 0, id98_2, foodType);
                success98_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img99 = convertDrawableToByteArray(R.drawable.h59_1);
            FoodModel food99 = new FoodModel("كبسة", "", img99, 70);
            long id99 = foodTableOperations.insertFoodData(food99);
            if (id99 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("كبسة", "2 مغرفة ارز +ربع كوب صلصة", 130, 15, 2, 5, 0, 0, 0, id99, foodType);
                success99 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img99_1 = convertDrawableToByteArray(R.drawable.h59_2);
            FoodModel food99_1 = new FoodModel("كبسة", "", img99_1, 120);
            long id99_1 = foodTableOperations.insertFoodData(food99_1);
            if (id99_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("كبسة", "3 مغرفة ارز +ربع كوب صلصة", 200, 30, 3, 6, 0, 0, 0, id99_1, foodType);
                success99_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img99_2 = convertDrawableToByteArray(R.drawable.h59_3);
            FoodModel food99_2 = new FoodModel("كبسة", "", img99_2, 160);
            long id99_2 = foodTableOperations.insertFoodData(food99_2);
            if (id99_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("كبسة", "5 مغرفة ارز +ربع كوب صلصة", 330, 45, 5, 10, 0, 0, 0, id99_2, foodType);
                success99_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img100 = convertDrawableToByteArray(R.drawable.h59_4);
            FoodModel food100 = new FoodModel("كبسة+صدر دجاج", "", img100, 150);
            long id100 = foodTableOperations.insertFoodData(food100);
            if (id100 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("كبسة+صدر دجاج", "2 مغرفة ارز +ربع كوب صلصة", 350, 15, 30, 20, 0, 0, 0, id100, foodType);
                success100 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img100_1 = convertDrawableToByteArray(R.drawable.h59_5);
            FoodModel food100_1 = new FoodModel("كبسة+صدر دجاج", "", img100_1, 200);
            long id100_1 = foodTableOperations.insertFoodData(food100_1);
            if (id100_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("كبسة+صدر دجاج", "3 مغرفة ارز +ربع كوب صلصة", 400, 30, 35, 20, 0, 0, 0, id100_1, foodType);
                success100_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img100_2 = convertDrawableToByteArray(R.drawable.h59_6);
            FoodModel food100_2 = new FoodModel("كبسة+صدر دجاج", "", img100_2, 250);
            long id100_2 = foodTableOperations.insertFoodData(food100_2);
            if (id100_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("كبسة+صدر دجاج", "5 مغرفة ارز +ربع كوب صلصة", 560, 45, 35, 25, 0, 0, 0, id100_2, foodType);
                success100_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img101 = convertDrawableToByteArray(R.drawable.h59_7);
            FoodModel food101 = new FoodModel("كبسة+فخذة دجاج", "", img101, 140);
            long id101 = foodTableOperations.insertFoodData(food101);
            if (id101 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("كبسة+فخذة دجاج", "2 مغرفة ارز +ربع كوب صلصة", 280, 15, 25, 20, 0, 0, 0, id101, foodType);
                success101 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img101_1 = convertDrawableToByteArray(R.drawable.h59_8);
            FoodModel food101_1 = new FoodModel("كبسة+فخذة دجاج", "", img101_1, 200);
            long id101_1 = foodTableOperations.insertFoodData(food101_1);
            if (id101_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("كبسة+فخذة دجاج", "3 مغرفة ارز +ربع كوب صلصة", 350, 30, 25, 20, 0, 0, 0, id101_1, foodType);
                success101_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img101_2 = convertDrawableToByteArray(R.drawable.h59_9);
            FoodModel food101_2 = new FoodModel("كبسة+فخذة دجاج", "", img101_2, 250);
            long id101_2 = foodTableOperations.insertFoodData(food101_2);
            if (id101_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("كبسة+فخذة دجاج", "5 مغرفة ارز +ربع كوب صلصة", 480, 45, 25, 25, 0, 0, 0, id101_2, foodType);
                success101_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img102 = convertDrawableToByteArray(R.drawable.h59_10);
            FoodModel food102 = new FoodModel("كبسة+قطعة لحم", "", img102, 150);
            long id102 = foodTableOperations.insertFoodData(food102);
            if (id102 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("كبسة+قطعة لحم", "2 مغرفة ارز +ربع كوب صلصة", 280, 15, 15, 15, 0, 0, 0, id102, foodType);
                success102 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img102_1 = convertDrawableToByteArray(R.drawable.h59_11);
            FoodModel food102_1 = new FoodModel("كبسة+قطعة لحم", "", img102_1, 200);
            long id102_1 = foodTableOperations.insertFoodData(food102_1);
            if (id102_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("كبسة+قطعة لحم", "3 مغرفة ارز +ربع كوب صلصة", 350, 30, 15, 15, 0, 0, 0, id102_1, foodType);
                success102_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img102_2 = convertDrawableToByteArray(R.drawable.h59_12);
            FoodModel food102_2 = new FoodModel("كبسة+قطعة لحم", "", img102_2, 250);
            long id102_2 = foodTableOperations.insertFoodData(food102_2);
            if (id102_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("كبسة+قطعة لحم", "5 مغرفة ارز +ربع كوب صلصة", 480, 45, 20, 20, 0, 0, 0, id102_2, foodType);
                success102_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img103 = convertDrawableToByteArray(R.drawable.h60_1);
            FoodModel food103 = new FoodModel("مقلوبة", "", img103, 80);
            long id103 = foodTableOperations.insertFoodData(food103);
            if (id103 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مقلوبة", "2 مغرفة ارز", 200, 20, 2, 10, 0, 0, 0, id103, foodType);
                success103 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img103_1 = convertDrawableToByteArray(R.drawable.h60_2);
            FoodModel food103_1 = new FoodModel("مقلوبة", "", img103_1, 120);
            long id103_1 = foodTableOperations.insertFoodData(food103_1);
            if (id103_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مقلوبة", "3 مغرفة ارز", 300, 30, 4, 15, 0, 0, 0, id103_1, foodType);
                success103_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img103_2 = convertDrawableToByteArray(R.drawable.h60_3);
            FoodModel food103_2 = new FoodModel("مقلوبة", "", img103_2, 180);
            long id103_2 = foodTableOperations.insertFoodData(food103_2);
            if (id103_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مقلوبة", "5 مغرفة ارز", 430, 50, 6, 20, 0, 0, 0, id103_2, foodType);
                success103_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img104 = convertDrawableToByteArray(R.drawable.h60_4);
            FoodModel food104 = new FoodModel("مقلوبة +صدر دجاج", "", img104, 160);
            long id104 = foodTableOperations.insertFoodData(food104);
            if (id104 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مقلوبة +صدر دجاج", "2 مغرفة ارز + نصف كوب لبن", 450, 25, 30, 25, 0, 0, 0, id104, foodType);
                success104 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img104_1 = convertDrawableToByteArray(R.drawable.h60_5);
            FoodModel food104_1 = new FoodModel("مقلوبة +صدر دجاج", "", img104_1, 200);
            long id104_1 = foodTableOperations.insertFoodData(food104_1);
            if (id104_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مقلوبة +صدر دجاج", "3 مغرفة ارز + نصف كوب لبن", 540, 30, 35, 30, 0, 0, 0, id104_1, foodType);
                success104_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img104_2 = convertDrawableToByteArray(R.drawable.h60_6);
            FoodModel food104_2 = new FoodModel("مقلوبة +صدر دجاج", "", img104_2, 260);
            long id104_2 = foodTableOperations.insertFoodData(food104_2);
            if (id104_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مقلوبة +صدر دجاج", "5 مغرفة ارز + نصف كوب لبن", 670, 50, 40, 35, 0, 0, 0, id104_2, foodType);
                success104_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img105 = convertDrawableToByteArray(R.drawable.h60_7);
            FoodModel food105 = new FoodModel("مقلوبة +فخذة دجاج", "", img105, 150);
            long id105 = foodTableOperations.insertFoodData(food105);
            if (id105 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مقلوبة +فخذة دجاج", "2 مغرفة ارز + نصف كوب لبن", 450, 25, 25, 15, 0, 0, 0, id105, foodType);
                success105 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img105_1 = convertDrawableToByteArray(R.drawable.h60_8);
            FoodModel food105_1 = new FoodModel("مقلوبة +فخذة دجاج", "", img105_1, 190);
            long id105_1 = foodTableOperations.insertFoodData(food105_1);
            if (id105_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مقلوبة +فخذة دجاج", "3 مغرفة ارز + نصف كوب لبن", 550, 30, 25, 30, 0, 0, 0, id105_1, foodType);
                success105_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img105_2 = convertDrawableToByteArray(R.drawable.h60_9);
            FoodModel food105_2 = new FoodModel("مقلوبة +فخذة دجاج", "", img105_2, 250);
            long id105_2 = foodTableOperations.insertFoodData(food105_2);
            if (id105_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مقلوبة +فخذة دجاج", "5 مغرفة ارز + نصف كوب لبن", 700, 70, 30, 35, 0, 0, 0, id105_2, foodType);
                success105_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img106 = convertDrawableToByteArray(R.drawable.h61_1);
            FoodModel food106 = new FoodModel("أوزي", "", img106, 60);
            long id106 = foodTableOperations.insertFoodData(food106);
            if (id106 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("أوزي", "2 مغرفة ارز", 130, 15, 1.5, 5, 0, 0, 0, id106, foodType);
                success106 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img106_1 = convertDrawableToByteArray(R.drawable.h61_2);
            FoodModel food106_1 = new FoodModel("أوزي", "", img106_1, 120);
            long id106_1 = foodTableOperations.insertFoodData(food106_1);
            if (id106_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("أوزي", "3 مغرفة ارز", 200, 25, 2.5, 8, 0, 0, 0, id106_1, foodType);
                success106_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img106_2 = convertDrawableToByteArray(R.drawable.h61_3);
            FoodModel food106_2 = new FoodModel("أوزي", "", img106_2, 170);
            long id106_2 = foodTableOperations.insertFoodData(food106_2);
            if (id106_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("أوزي", "5 مغارف ارز", 320, 40, 4, 10, 0, 0, 0, id106_2, foodType);
                success106_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img107 = convertDrawableToByteArray(R.drawable.h61_4);
            FoodModel food107 = new FoodModel("أوزي+صدر دجاج", "", img107, 140);
            long id107 = foodTableOperations.insertFoodData(food107);
            if (id107 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("أوزي+صدر دجاج", "2 مغرفة ارز", 350, 15, 30, 20, 0, 0, 0, id107, foodType);
                success107 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img107_1 = convertDrawableToByteArray(R.drawable.h61_5);
            FoodModel food107_1 = new FoodModel("أوزي+صدر دجاج", "", img107_1, 200);
            long id107_1 = foodTableOperations.insertFoodData(food107_1);
            if (id107_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("أوزي+صدر دجاج", "3 مغرفة ارز", 450, 25, 30, 20, 0, 0, 0, id107_1, foodType);
                success107_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img107_2 = convertDrawableToByteArray(R.drawable.h61_5);
            FoodModel food107_2 = new FoodModel("أوزي+صدر دجاج", "", img107_2, 250);
            long id107_2 = foodTableOperations.insertFoodData(food107_2);
            if (id107_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("أوزي+صدر دجاج", "5 مغارف ارز", 550, 40, 35, 25, 0, 0, 0, id107_2, foodType);
                success107_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img108 = convertDrawableToByteArray(R.drawable.h61_7);
            FoodModel food108 = new FoodModel("أوزي", "", img108, 140);
            long id108 = foodTableOperations.insertFoodData(food108);
            if (id108 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("أوزي", "2 مغرفة ارز", 380, 15, 20, 20, 0, 0, 0, id108, foodType);
                success108 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img108_1 = convertDrawableToByteArray(R.drawable.h61_8);
            FoodModel food108_1 = new FoodModel("أوزي", "", img108_1, 200);
            long id108_1 = foodTableOperations.insertFoodData(food108_1);
            if (id108_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("أوزي", "3 مغرفة ارز", 450, 25, 25, 25, 0, 0, 0, id108_1, foodType);
                success108_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img108_2 = convertDrawableToByteArray(R.drawable.h61_9);
            FoodModel food108_2 = new FoodModel("أوزي", "", img108_2, 250);
            long id108_2 = foodTableOperations.insertFoodData(food108_2);
            if (id108_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("أوزي", "5 مغارف ارز", 570, 40, 25, 25, 0, 0, 0, id108_2, foodType);
                success108_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img109 = convertDrawableToByteArray(R.drawable.h62_1);
            FoodModel food109 = new FoodModel("قدرة الشمال", "", img109, 70);
            long id109 = foodTableOperations.insertFoodData(food109);
            if (id109 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("قدرة الشمال", "2 مغرفة ارز", 130, 15, 1.5, 6, 0, 0, 0, id109, foodType);
                success109 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img109_1 = convertDrawableToByteArray(R.drawable.h62_2);
            FoodModel food109_1 = new FoodModel("قدرة الشمال", "", img109_1, 120);
            long id109_1 = foodTableOperations.insertFoodData(food109_1);
            if (id109_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("قدرة الشمال", "3 مغرفة ارز", 200, 25, 3, 8, 0, 0, 0, id109_1, foodType);
                success109_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img109_2 = convertDrawableToByteArray(R.drawable.h62_3);
            FoodModel food109_2 = new FoodModel("قدرة الشمال", "", img109_2, 160);
            long id109_2 = foodTableOperations.insertFoodData(food109_2);
            if (id109_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("قدرة الشمال", "5 مغارف ارز", 300, 40, 4, 10, 0, 0, 0, id109_2, foodType);
                success109_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img110 = convertDrawableToByteArray(R.drawable.h62_4);
            FoodModel food110 = new FoodModel("قدرة الشمال+ صدر دجاج", "", img110, 150);
            long id110 = foodTableOperations.insertFoodData(food110);
            if (id110 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("قدرة الشمال+ صدر دجاج", "2 مغرفة ارز", 350, 15, 30, 20, 0, 0, 0, id110, foodType);
                success110 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img110_1 = convertDrawableToByteArray(R.drawable.h62_5);
            FoodModel food110_1 = new FoodModel("قدرة الشمال+ صدر دجاج", "", img110_1, 200);
            long id110_1 = foodTableOperations.insertFoodData(food110_1);
            if (id110_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("قدرة الشمال+ صدر دجاج", "3 مغرفة ارز", 430, 25, 30, 20, 0, 0, 0, id110_1, foodType);
                success110_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img110_2 = convertDrawableToByteArray(R.drawable.h62_6);
            FoodModel food110_2 = new FoodModel("قدرة الشمال+ صدر دجاج", "", img110_2, 250);
            long id110_2 = foodTableOperations.insertFoodData(food110_2);
            if (id110_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("قدرة الشمال+ صدر دجاج", "5 مغارف ارز", 550, 40, 35, 25, 0, 0, 0, id110_2, foodType);
                success110_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img111 = convertDrawableToByteArray(R.drawable.h62_7);
            FoodModel food111 = new FoodModel("قدرة الشمال+ فخذة دجاج", "", img111, 150);
            long id111 = foodTableOperations.insertFoodData(food111);
            if (id111 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("قدرة الشمال+ فخذة دجاج", "2 مغرفة ارز", 380, 15, 20, 20, 0, 0, 0, id111, foodType);
                success111 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img111_1 = convertDrawableToByteArray(R.drawable.h62_8);
            FoodModel food111_1 = new FoodModel("قدرة الشمال+ فخذة دجاج", "", img111_1, 200);
            long id111_1 = foodTableOperations.insertFoodData(food111_1);
            if (id111_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("قدرة الشمال+ فخذة دجاج", "3 مغرفة ارز", 450, 25, 25, 25, 0, 0, 0, id111_1, foodType);
                success111_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img111_2 = convertDrawableToByteArray(R.drawable.h62_9);
            FoodModel food111_2 = new FoodModel("قدرة الشمال+ فخذة دجاج", "", img111_2, 250);
            long id111_2 = foodTableOperations.insertFoodData(food111_2);
            if (id111_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("قدرة الشمال+ فخذة دجاج", "5 مغارف ارز", 560, 40, 25, 25, 0, 0, 0, id111_2, foodType);
                success111_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img112 = convertDrawableToByteArray(R.drawable.h62_10);
            FoodModel food112 = new FoodModel("قدرة الشمال+ قطعة لحمة", "", img112, 140);
            long id112 = foodTableOperations.insertFoodData(food112);
            if (id112 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("قدرة الشمال+ قطعة لحمة", "2 مغرفة ارز", 180, 15, 15, 15, 0, 0, 0, id112, foodType);
                success112 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img112_1 = convertDrawableToByteArray(R.drawable.h62_11);
            FoodModel food112_1 = new FoodModel("قدرة الشمال+ قطعة لحمة", "", img112_1, 190);
            long id112_1 = foodTableOperations.insertFoodData(food112_1);
            if (id112_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("قدرة الشمال+ قطعة لحمة", "3 مغرفة ارز", 350, 25, 15, 20, 0, 0, 0, id112_1, foodType);
                success112_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img112_2 = convertDrawableToByteArray(R.drawable.h62_12);
            FoodModel food112_2 = new FoodModel("قدرة الشمال+ قطعة لحمة", "", img112_2, 230);
            long id112_2 = foodTableOperations.insertFoodData(food112_2);
            if (id112_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("قدرة الشمال+ قطعة لحمة", "5 مغارف ارز", 450, 40, 20, 20, 0, 0, 0, id112_2, foodType);
                success112_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img113 = convertDrawableToByteArray(R.drawable.h62_10);
            FoodModel food113 = new FoodModel("قدرة الشمال+ قطعة لحمة", "", img113, 140);
            long id113 = foodTableOperations.insertFoodData(food113);
            if (id113 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("قدرة الشمال+ قطعة لحمة", "2 مغرفة ارز", 180, 15, 15, 15, 0, 0, 0, id113, foodType);
                success113 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img113_1 = convertDrawableToByteArray(R.drawable.h62_11);
            FoodModel food113_1 = new FoodModel("قدرة الشمال+ قطعة لحمة", "", img113_1, 190);
            long id113_1 = foodTableOperations.insertFoodData(food113_1);
            if (id113_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("قدرة الشمال+ قطعة لحمة", "3 مغرفة ارز", 350, 25, 15, 20, 0, 0, 0, id113_1, foodType);
                success113_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img113_2 = convertDrawableToByteArray(R.drawable.h62_12);
            FoodModel food113_2 = new FoodModel("قدرة الشمال+ قطعة لحمة", "", img113_2, 230);
            long id113_2 = foodTableOperations.insertFoodData(food113_2);
            if (id113_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("قدرة الشمال+ قطعة لحمة", "5 مغارف ارز", 450, 40, 20, 20, 0, 0, 0, id113_2, foodType);
                success113_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img114 = convertDrawableToByteArray(R.drawable.h63_1);
            FoodModel food114 = new FoodModel("مندي", "", img114, 60);
            long id114 = foodTableOperations.insertFoodData(food114);
            if (id114 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مندي", "2 مغرفة أرز+ نصف كوب صلصة", 130, 15, 2, 5, 0, 0, 0, id114, foodType);
                success114 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img114_1 = convertDrawableToByteArray(R.drawable.h63_2);
            FoodModel food114_1 = new FoodModel("مندي", "", img114_1, 120);
            long id114_1 = foodTableOperations.insertFoodData(food114_1);
            if (id114_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مندي", "3مغارف أرز+ نصف كوب صلصة", 200, 25, 3, 8, 0, 0, 0, id114_1, foodType);
                success114_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img114_2 = convertDrawableToByteArray(R.drawable.h63_3);
            FoodModel food114_2 = new FoodModel("مندي", "", img114_2, 150);
            long id114_2 = foodTableOperations.insertFoodData(food114_2);
            if (id114_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مندي", "5مغارف أرز+ نصف كوب صلصة", 300, 40, 4, 10, 0, 0, 0, id114_2, foodType);
                success114_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img115 = convertDrawableToByteArray(R.drawable.h63_4);
            FoodModel food115 = new FoodModel("مندي + صدر دجاج", "", img115, 140);
            long id115 = foodTableOperations.insertFoodData(food115);
            if (id115 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مندي + صدر دجاج", "2 مغرفة أرز+ صلصة", 380, 15, 25, 20, 0, 0, 0, id115, foodType);
                success115 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img115_1 = convertDrawableToByteArray(R.drawable.h63_5);
            FoodModel food115_1 = new FoodModel("مندي + صدر دجاج", "", img115_1, 200);
            long id115_1 = foodTableOperations.insertFoodData(food115_1);
            if (id115_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مندي + صدر دجاج", "3مغارف أرز+ نصف كوب صلصة", 430, 25, 30, 20, 0, 0, 0, id115_1, foodType);
                success115_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img115_2 = convertDrawableToByteArray(R.drawable.h63_6);
            FoodModel food115_2 = new FoodModel("مندي + صدر دجاج", "", img115_2, 300);
            long id115_2 = foodTableOperations.insertFoodData(food115_2);
            if (id115_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مندي + صدر دجاج", "5مغارف أرز+ نصف كوب صلصة", 530, 40, 35, 20, 0, 0, 0, id115_2, foodType);
                success115_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img116 = convertDrawableToByteArray(R.drawable.h63_7);
            FoodModel food116 = new FoodModel("مندي + فخذة دجاج", "", img116, 130);
            long id116 = foodTableOperations.insertFoodData(food116);
            if (id116 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مندي + فخذة دجاج", "2 مغرفة أرز+ نصف كوب صلصة", 370, 15, 25, 15, 0, 0, 0, id116, foodType);
                success116 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img116_1 = convertDrawableToByteArray(R.drawable.h63_8);
            FoodModel food116_1 = new FoodModel("مندي + فخذة دجاج", "", img116_1, 200);
            long id116_1 = foodTableOperations.insertFoodData(food116_1);
            if (id116_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مندي + فخذة دجاج", "3مغارف أرز+ نصف كوب صلصة", 420, 25, 25, 20, 0, 0, 0, id116_1, foodType);
                success116_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img116_2 = convertDrawableToByteArray(R.drawable.h63_9);
            FoodModel food116_2 = new FoodModel("مندي + فخذة دجاج", "", img116_2, 230);
            long id116_2 = foodTableOperations.insertFoodData(food116_2);
            if (id116_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مندي + فخذة دجاج", "5مغارف أرز+ نصف كوب صلصة", 550, 40, 25, 20, 0, 0, 0, id116_2, foodType);
                success116_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img117 = convertDrawableToByteArray(R.drawable.h63_10);
            FoodModel food117 = new FoodModel("مندي + قطعة لحمة", "", img117, 140);
            long id117 = foodTableOperations.insertFoodData(food117);
            if (id117 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مندي + قطعة لحمة", "2 مغرفة أرز+ نصف كوب صلصة", 280, 15, 15, 15, 0, 0, 0, id117, foodType);
                success117 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img117_1 = convertDrawableToByteArray(R.drawable.h63_11);
            FoodModel food117_1 = new FoodModel("مندي + قطعة لحمة", "", img117_1, 200);
            long id117_1 = foodTableOperations.insertFoodData(food117_1);
            if (id117_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مندي + قطعة لحمة", "3مغارف أرز+ نصف كوب صلصة", 340, 25, 15, 15, 0, 0, 0, id117_1, foodType);
                success117_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img117_2 = convertDrawableToByteArray(R.drawable.h63_12);
            FoodModel food117_2 = new FoodModel("مندي + قطعة لحمة", "", img117_2, 230);
            long id117_2 = foodTableOperations.insertFoodData(food117_2);
            if (id117_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مندي + قطعة لحمة", "5مغارف أرز+ نصف كوب صلصة", 450, 40, 20, 15, 0, 0, 0, id117_2, foodType);
                success117_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img118 = convertDrawableToByteArray(R.drawable.h64_1);
            FoodModel food118 = new FoodModel("برياني", "", img118, 60);
            long id118 = foodTableOperations.insertFoodData(food118);
            if (id118 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("برياني", "2 مغرفة أرز", 130, 15, 1.5, 5, 0, 0, 0, id118, foodType);
                success118 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img118_1 = convertDrawableToByteArray(R.drawable.h64_2);
            FoodModel food118_1 = new FoodModel("برياني", "", img118_1, 100);
            long id118_1 = foodTableOperations.insertFoodData(food118_1);
            if (id118_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("برياني", "3مغارف أرز", 200, 25, 2, 8, 0, 0, 0, id118_1, foodType);
                success118_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img118_2 = convertDrawableToByteArray(R.drawable.h64_3);
            FoodModel food118_2 = new FoodModel("برياني", "", img118_2, 150);
            long id118_2 = foodTableOperations.insertFoodData(food118_2);
            if (id118_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("برياني", "5مغارف أرز", 300, 40, 1, 15, 0, 0, 0, id118_2, foodType);
                success118_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img119 = convertDrawableToByteArray(R.drawable.h64_4);
            FoodModel food119 = new FoodModel("برياني + صدر دجاج", "", img119, 140);
            long id119 = foodTableOperations.insertFoodData(food119);
            if (id119 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("برياني + صدر دجاج", "2 مغرفة أرز", 350, 15, 30, 20, 0, 0, 0, id119, foodType);
                success119 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img119_1 = convertDrawableToByteArray(R.drawable.h64_5);
            FoodModel food119_1 = new FoodModel("برياني + صدر دجاج", "", img119_1, 180);
            long id119_1 = foodTableOperations.insertFoodData(food119_1);
            if (id119_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("برياني + صدر دجاج", "3مغارف أرز", 430, 25, 30, 20, 0, 0, 0, id119_1, foodType);
                success119_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img119_2 = convertDrawableToByteArray(R.drawable.h64_6);
            FoodModel food119_2 = new FoodModel("برياني + صدر دجاج", "", img119_2, 230);
            long id119_2 = foodTableOperations.insertFoodData(food119_2);
            if (id119_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("برياني + صدر دجاج", "5مغارف أرز", 550, 80, 70, 30, 0, 0, 0, id119_2, foodType);
                success119_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img120 = convertDrawableToByteArray(R.drawable.h64_7);
            FoodModel food120 = new FoodModel("برياني + فخذة دجاج", "", img120, 130);
            long id120 = foodTableOperations.insertFoodData(food120);
            if (id120 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("برياني + فخذة دجاج", "2 مغرفة أرز", 350, 15, 20, 20, 0, 0, 0, id120, foodType);
                success120 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img120_1 = convertDrawableToByteArray(R.drawable.h64_8);
            FoodModel food120_1 = new FoodModel("برياني + فخذة دجاج", "", img120_1, 170);
            long id120_1 = foodTableOperations.insertFoodData(food120_1);
            if (id120_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("برياني + فخذة دجاج", "3مغارف أرز", 450, 25, 25, 25, 0, 0, 0, id120_1, foodType);
                success120_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img120_2 = convertDrawableToByteArray(R.drawable.h64_9);
            FoodModel food120_2 = new FoodModel("برياني + فخذة دجاج", "", img120_2, 220);
            long id120_2 = foodTableOperations.insertFoodData(food120_2);
            if (id120_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("برياني + فخذة دجاج", "5مغارف أرز", 550, 80, 60, 30, 0, 0, 0, id120_2, foodType);
                success120_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img121 = convertDrawableToByteArray(R.drawable.h65_1);
            FoodModel food121 = new FoodModel("فول و لبن", "", img121, 230);
            long id121 = foodTableOperations.insertFoodData(food121);
            if (id121 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("فول و لبن", "2 مغرفة أرز+نصف كوب يخنة", 250, 25, 6, 15, 0, 0, 0, id121, foodType);
                success121 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img121_1 = convertDrawableToByteArray(R.drawable.h65_2);
            FoodModel food121_1 = new FoodModel("فول و لبن", "", img121_1, 270);
            long id121_1 = foodTableOperations.insertFoodData(food121_1);
            if (id121_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("فول و لبن", "3مغارف ارز+نصف كوب يخنة", 350, 30, 7, 15, 0, 0, 0, id121_1, foodType);
                success121_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img121_2 = convertDrawableToByteArray(R.drawable.h65_3);
            FoodModel food121_2 = new FoodModel("فول و لبن", "", img121_2, 320);
            long id121_2 = foodTableOperations.insertFoodData(food121_2);
            if (id121_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("فول و لبن", "5 مغارف ارز+كوب يخنة", 500, 50, 15, 25, 0, 0, 0, id121_2, foodType);
                success121_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img122 = convertDrawableToByteArray(R.drawable.h65_4);
            FoodModel food122 = new FoodModel("فول و لبن+صدر دجاج", "", img122, 300);
            long id122 = foodTableOperations.insertFoodData(food122);
            if (id122 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("فول و لبن+صدر دجاج", "2 مغرفة أرز+نصف كوب يخنة", 400, 25, 35, 30, 0, 0, 0, id122, foodType);
                success122 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img122_1 = convertDrawableToByteArray(R.drawable.h65_5);
            FoodModel food122_1 = new FoodModel("فول و لبن+صدر دجاج", "", img122_1, 350);
            long id122_1 = foodTableOperations.insertFoodData(food122_1);
            if (id122_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("فول و لبن+صدر دجاج", "3مغارف ارز+نصف كوب يخنة", 550, 30, 35, 30, 0, 0, 0, id122_1, foodType);
                success122_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img122_2 = convertDrawableToByteArray(R.drawable.h65_6);
            FoodModel food122_2 = new FoodModel("فول و لبن+صدر دجاج", "", img122_2, 400);
            long id122_2 = foodTableOperations.insertFoodData(food122_2);
            if (id122_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("فول و لبن+صدر دجاج", "5 مغارف ارز+كوب يخنة", 750, 50, 40, 40, 0, 0, 0, id122_2, foodType);
                success122_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img123 = convertDrawableToByteArray(R.drawable.h65_7);
            FoodModel food123 = new FoodModel("فول و لبن+فخذة دجاج", "", img123, 300);
            long id123 = foodTableOperations.insertFoodData(food123);
            if (id123 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("فول و لبن+فخذة دجاج", "2 مغرفة أرز+نصف كوب يخنة", 500, 25, 30, 30, 0, 0, 0, id123, foodType);
                success123 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img123_1 = convertDrawableToByteArray(R.drawable.h65_8);
            FoodModel food123_1 = new FoodModel("فول و لبن+فخذة دجاج", "", img123_1, 350);
            long id123_1 = foodTableOperations.insertFoodData(food123_1);
            if (id123_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("فول و لبن+فخذة دجاج", "3مغارف ارز+نصف كوب يخنة", 560, 30, 30, 30, 0, 0, 0, id123_1, foodType);
                success123_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img123_2 = convertDrawableToByteArray(R.drawable.h65_9);
            FoodModel food123_2 = new FoodModel("فول و لبن+فخذة دجاج", "", img123_2, 400);
            long id123_2 = foodTableOperations.insertFoodData(food123_2);
            if (id123_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("فول و لبن+فخذة دجاج", "5 مغارف ارز+كوب يخنة", 780, 50, 35, 40, 0, 0, 0, id123_2, foodType);
                success123_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img124 = convertDrawableToByteArray(R.drawable.h65_10);
            FoodModel food124 = new FoodModel("فول و لبن+قطعة لحمة", "", img124, 300);
            long id124 = foodTableOperations.insertFoodData(food124);
            if (id124 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("فول و لبن+قطعة لحمة", "2 مغرفة أرز+نصف كوب يخنة", 400, 25, 20, 25, 0, 0, 0, id124, foodType);
                success124 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img124_1 = convertDrawableToByteArray(R.drawable.h65_11);
            FoodModel food124_1 = new FoodModel("فول و لبن+قطعة لحمة", "", img124_1, 350);
            long id124_1 = foodTableOperations.insertFoodData(food124_1);
            if (id124_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("فول و لبن+قطعة لحمة", "3مغارف ارز+نصف كوب يخنة", 470, 30, 20, 30, 0, 0, 0, id124_1, foodType);
                success124_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img124_2 = convertDrawableToByteArray(R.drawable.h65_12);
            FoodModel food124_2 = new FoodModel("فول و لبن+قطعة لحمة", "", img124_2, 400);
            long id124_2 = foodTableOperations.insertFoodData(food124_2);
            if (id124_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("فول و لبن+قطعة لحمة", "5 مغارف ارز+كوب يخنة", 680, 50, 30, 35, 0, 0, 0, id124_2, foodType);
                success124_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img125 = convertDrawableToByteArray(R.drawable.h66_1);
            FoodModel food125 = new FoodModel("ششبرك", "", img125, 220);
            long id125 = foodTableOperations.insertFoodData(food125);
            if (id125 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("ششبرك", "2 مغرفة أرز+نصف كوب يخنة", 350, 35, 10, 20, 0, 0, 0, id125, foodType);
                success125 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img125_1 = convertDrawableToByteArray(R.drawable.h66_2);
            FoodModel food125_1 = new FoodModel("ششبرك", "", img125_1, 260);
            long id125_1 = foodTableOperations.insertFoodData(food125_1);
            if (id125_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("ششبرك", "3مغارف ارز+نصف كوب يخنة", 400, 40, 10, 20, 0, 0, 0, id125_1, foodType);
                success125_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img125_2 = convertDrawableToByteArray(R.drawable.h66_3);
            FoodModel food125_2 = new FoodModel("ششبرك", "", img125_2, 480);
            long id125_2 = foodTableOperations.insertFoodData(food125_2);
            if (id125_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("ششبرك", "5 مغارف ارز+كوب يخنة", 700, 80, 20, 35, 0, 0, 0, id125_2, foodType);
                success125_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img126 = convertDrawableToByteArray(R.drawable.h66_4);
            FoodModel food126 = new FoodModel("ششبرك + صدر دجاج", "", img126, 300);
            long id126 = foodTableOperations.insertFoodData(food126);
            if (id126 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("ششبرك + صدر دجاج", "2 مغرفة أرز+نصف كوب يخنة", 500, 35, 25, 30, 0, 0, 0, id126, foodType);
                success126 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img126_1 = convertDrawableToByteArray(R.drawable.h66_5);
            FoodModel food126_1 = new FoodModel("ششبرك + صدر دجاج", "", img126_1, 340);
            long id126_1 = foodTableOperations.insertFoodData(food126_1);
            if (id126_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("ششبرك + صدر دجاج", "3مغارف ارز+نصف كوب يخنة", 560, 45, 25, 30, 0, 0, 0, id126_1, foodType);
                success126_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img126_2 = convertDrawableToByteArray(R.drawable.h66_6);
            FoodModel food126_2 = new FoodModel("ششبرك + صدر دجاج", "", img126_2, 560);
            long id126_2 = foodTableOperations.insertFoodData(food126_2);
            if (id126_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("ششبرك + صدر دجاج", "5 مغارف ارز+كوب يخنة", 860, 80, 35, 50, 0, 0, 0, id126_2, foodType);
                success126_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img127 = convertDrawableToByteArray(R.drawable.h66_7);
            FoodModel food127 = new FoodModel("ششبرك + فخذة دجاج", "", img127, 300);
            long id127 = foodTableOperations.insertFoodData(food127);
            if (id127 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("ششبرك + فخذة دجاج", "2 مغرفة أرز+نصف كوب يخنة", 600, 35, 30, 35, 0, 0, 0, id127, foodType);
                success127 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img127_1 = convertDrawableToByteArray(R.drawable.h66_8);
            FoodModel food127_1 = new FoodModel("ششبرك + فخذة دجاج", "", img127_1, 340);
            long id127_1 = foodTableOperations.insertFoodData(food127_1);
            if (id127_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("ششبرك + فخذة دجاج", "3مغارف ارز+نصف كوب يخنة", 650, 40, 30, 40, 0, 0, 0, id127_1, foodType);
                success127_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img127_2 = convertDrawableToByteArray(R.drawable.h66_9);
            FoodModel food127_2 = new FoodModel("ششبرك + فخذة دجاج", "", img127_2, 560);
            long id127_2 = foodTableOperations.insertFoodData(food127_2);
            if (id127_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("ششبرك + فخذة دجاج", "5 مغارف ارز+كوب يخنة", 960, 80, 40, 50, 0, 0, 0, id127_2, foodType);
                success127_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img128 = convertDrawableToByteArray(R.drawable.h66_10);
            FoodModel food128 = new FoodModel("ششبرك + قطعة لحمة", "", img128, 300);
            long id128 = foodTableOperations.insertFoodData(food128);
            if (id128 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("ششبرك + قطعة لحمة", "2 مغرفة أرز+نصف كوب يخنة", 580, 35, 40, 35, 0, 0, 0, id128, foodType);
                success128 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img128_1 = convertDrawableToByteArray(R.drawable.h66_11);
            FoodModel food128_1 = new FoodModel("ششبرك + قطعة لحمة", "", img128_1, 340);
            long id128_1 = foodTableOperations.insertFoodData(food128_1);
            if (id128_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("ششبرك + قطعة لحمة", "3مغارف ارز+نصف كوب يخنة", 650, 45, 40, 35, 0, 0, 0, id128_1, foodType);
                success128_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img128_2 = convertDrawableToByteArray(R.drawable.h66_12);
            FoodModel food128_2 = new FoodModel("ششبرك + قطعة لحمة", "", img128_2, 560);
            long id128_2 = foodTableOperations.insertFoodData(food128_2);
            if (id128_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("ششبرك + قطعة لحمة", "5 مغارف ارز+كوب يخنة", 950, 80, 50, 15, 0, 0, 0, id128_2, foodType);
                success128_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img129 = convertDrawableToByteArray(R.drawable.h67_1);
            FoodModel food129 = new FoodModel("مخشي الكوسا", "", img129, 260);
            long id129 = foodTableOperations.insertFoodData(food129);
            if (id129 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مخشي الكوسا", "2 مغرفة أرز+نصف كوب يخنة", 500, 25, 35, 35, 0, 0, 0, id129, foodType);
                success129 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img129_1 = convertDrawableToByteArray(R.drawable.h67_2);
            FoodModel food129_1 = new FoodModel("مخشي الكوسا", "", img129_1, 300);
            long id129_1 = foodTableOperations.insertFoodData(food129_1);
            if (id129_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مخشي الكوسا", "3مغارف ارز+نصف كوب يخنة", 600, 30, 35, 35, 0, 0, 0, id129_1, foodType);
                success129_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img129_2 = convertDrawableToByteArray(R.drawable.h67_3);
            FoodModel food129_2 = new FoodModel("مخشي الكوسا", "", img129_2, 530);
            long id129_2 = foodTableOperations.insertFoodData(food129_2);
            if (id129_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مخشي الكوسا", "5 مغارف ارز+كوب يخنة", 880, 50, 45, 50, 0, 0, 0, id129_2, foodType);
                success129_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img130 = convertDrawableToByteArray(R.drawable.h68);
            FoodModel food130 = new FoodModel("مخشي بطاطا", "", img130, 70);
            long id130 = foodTableOperations.insertFoodData(food130);
            if (id130 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مخشي بطاطا", "صغير", 100, 8, 5, 3, 0, 0, 0, id130, foodType);
                success130 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            FoodModel food130_1 = new FoodModel("مخشي بطاطا", "", 90);
            long id130_1 = foodTableOperations.insertFoodData(food130_1);
            if (id130_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مخشي بطاطا", "وسط", 150, 10, 7, 6, 0, 0, 0, id130_1, foodType);
                success130_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            FoodModel food130_2 = new FoodModel("مخشي بطاطا", "", 110);
            long id130_2 = foodTableOperations.insertFoodData(food130_2);
            if (id130_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مخشي بطاطا", "كبير", 200, 12, 10, 12, 0, 0, 0, id130_2, foodType);
                success130_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img131 = convertDrawableToByteArray(R.drawable.h69);
            FoodModel food131 = new FoodModel("رقبة خروف محشية بالارزا", "", img131, 520);
            long id131 = foodTableOperations.insertFoodData(food131);
            if (id131 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("رقبة خروف محشية بالارز", "", 150, 30, 100, 90, 0, 0, 0, id131, foodType);
                success131 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img132 = convertDrawableToByteArray(R.drawable.h70);
            FoodModel food132 = new FoodModel("وجبة شاورما", "", img132, 300);
            long id132 = foodTableOperations.insertFoodData(food132);
            if (id132 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("وجبة شاورما", "", 580, 80, 25, 10, 0, 0, 0, id132, foodType);
                success132 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img133 = convertDrawableToByteArray(R.drawable.h71_1);
            FoodModel food133 = new FoodModel("صينية بطاطا", "", img133, 100);
            long id133 = foodTableOperations.insertFoodData(food133);
            if (id133 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("صينية بطاطا", "نصف كوب", 300, 45, 5, 70, 0, 0, 0, id133, foodType);
                success133 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img133_1 = convertDrawableToByteArray(R.drawable.h71_2);
            FoodModel food133_1 = new FoodModel("صينية بطاطا", "", img133_1, 180);
            long id133_1 = foodTableOperations.insertFoodData(food133_1);
            if (id133_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("صينية بطاطا", "كوب", 500, 90, 10, 14, 0, 0, 0, id133_1, foodType);
                success133_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img134 = convertDrawableToByteArray(R.drawable.h71_3);
            FoodModel food134 = new FoodModel("صينية بطاطا + صدر دجاج", "", img134, 180);
            long id134 = foodTableOperations.insertFoodData(food134);
            if (id134 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("صينية بطاطا + صدر دجاج", "نصف كوب", 520, 45, 35, 20, 0, 0, 0, id134, foodType);
                success134 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img134_1 = convertDrawableToByteArray(R.drawable.h71_4);
            FoodModel food134_1 = new FoodModel("صينية بطاطا + صدر دجاج", "", img134_1, 260);
            long id134_1 = foodTableOperations.insertFoodData(food134_1);
            if (id134_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("صينية بطاطا + صدر دجاج", "كوب", 800, 90, 40, 30, 0, 0, 0, id134_1, foodType);
                success134_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img135 = convertDrawableToByteArray(R.drawable.h71_5);
            FoodModel food135 = new FoodModel("صينية بطاطا + فخذة دجاج", "", img135, 180);
            long id135 = foodTableOperations.insertFoodData(food135);
            if (id135 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("صينية بطاطا + فخذة دجاج", "نصف كوب", 540, 45, 25, 20, 0, 0, 0, id135, foodType);
                success135 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img135_1 = convertDrawableToByteArray(R.drawable.h71_6);
            FoodModel food135_1 = new FoodModel("صينية بطاطا + فخذة دجاج", "", img135_1, 260);
            long id135_1 = foodTableOperations.insertFoodData(food135_1);
            if (id135_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("صينية بطاطا + فخذة دجاج", "كوب", 800, 90, 30, 30, 0, 0, 0, id135_1, foodType);
                success135_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img136 = convertDrawableToByteArray(R.drawable.h71_7);
            FoodModel food136 = new FoodModel("صينية بطاطا + قطعة لحم", "", img136, 200);
            long id136 = foodTableOperations.insertFoodData(food136);
            if (id136 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("صينية بطاطا + قطعة لحم", "نصف كوب", 440, 45, 20, 20, 0, 0, 0, id136, foodType);
                success136 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img136_1 = convertDrawableToByteArray(R.drawable.h71_8);
            FoodModel food136_1 = new FoodModel("صينية بطاطا + قطعة لحم", "", img136_1, 280);
            long id136_1 = foodTableOperations.insertFoodData(food136_1);
            if (id136_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("صينية بطاطا + قطعة لحم", "كوب", 700, 90, 25, 25, 0, 0, 0, id136_1, foodType);
                success136_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img137 = convertDrawableToByteArray(R.drawable.h72_1);
            FoodModel food137 = new FoodModel("صينية كفتة بطحينية", "", img137, 150);
            long id137 = foodTableOperations.insertFoodData(food137);
            if (id137 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("صينية كفتة بطحينية", "2 من مغرفة ارز", 250, 7, 10, 15, 0, 0, 0, id137, foodType);
                success137 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img137_1 = convertDrawableToByteArray(R.drawable.h72_2);
            FoodModel food137_1 = new FoodModel("صينية كفتة بطحينية", "", img137_1, 260);
            long id137_1 = foodTableOperations.insertFoodData(food137_1);
            if (id137_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("صينية كفتة بطحينية", "3 من مغارف ارز", 400, 10, 20, 30, 0, 0, 0, id137_1, foodType);
                success137_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img137_2 = convertDrawableToByteArray(R.drawable.h72_3);
            FoodModel food137_2 = new FoodModel("صينية كفتة بطحينية", "", img137_2, 380);
            long id137_2 = foodTableOperations.insertFoodData(food137_2);
            if (id137_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("صينية كفتة بطحينية", "5 من مغارف ارز", 700, 15, 30, 60, 0, 0, 0, id137_2, foodType);
                success137_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img138 = convertDrawableToByteArray(R.drawable.h74);
            FoodModel food138 = new FoodModel("صينية افخاذ الحبش مع خضار", "", img138, 150);
            long id138 = foodTableOperations.insertFoodData(food138);
            if (id138 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("صينية افخاذ الحبش مع خضار", "كوب", 130, 12, 30, 30, 0, 0, 0, id138, foodType);
                success138 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img139 = convertDrawableToByteArray(R.drawable.h75_1);
            FoodModel food139 = new FoodModel("منسف فريكة", "", img139, 60);
            long id139 = foodTableOperations.insertFoodData(food139);
            if (id139 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("منسف فريكة", "2 من مغرفة الارز", 100, 15, 1.5, 3, 0, 0, 0, id139, foodType);
                success139 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img139_1 = convertDrawableToByteArray(R.drawable.h75_2);
            FoodModel food139_1 = new FoodModel("منسف فريكة", "", img139_1, 100);
            long id139_1 = foodTableOperations.insertFoodData(food139_1);
            if (id139_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("منسف فريكة", "3 من مغرفة الارز", 160, 30, 3, 3.5, 0, 0, 0, id139_1, foodType);
                success139_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img139_2 = convertDrawableToByteArray(R.drawable.h75_3);
            FoodModel food139_2 = new FoodModel("منسف فريكة", "", img139_2, 170);
            long id139_2 = foodTableOperations.insertFoodData(food139_2);
            if (id139_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("منسف فريكة", "5 من مغارف الارز", 280, 45, 4, 6, 0, 0, 0, id139_2, foodType);
                success139_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img140 = convertDrawableToByteArray(R.drawable.h75_4);
            FoodModel food140 = new FoodModel("منسف فريكه مع صدر دجاج", "", img140, 140);
            long id140 = foodTableOperations.insertFoodData(food140);
            if (id140 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("منسف فريكه مع صدر دجاج", "2 من مغرفة الارز", 330, 15, 30, 15, 0, 0, 0, id140, foodType);
                success140 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img140_1 = convertDrawableToByteArray(R.drawable.h75_5);
            FoodModel food140_1 = new FoodModel("منسف فريكه مع صدر دجاج", "", img140_1, 180);
            long id140_1 = foodTableOperations.insertFoodData(food140_1);
            if (id140_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("منسف فريكه مع صدر دجاج", "3 من مغرفة الارز", 400, 30, 30, 18, 0, 0, 0, id140_1, foodType);
                success140_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img140_2 = convertDrawableToByteArray(R.drawable.h75_6);
            FoodModel food140_2 = new FoodModel("منسف فريكه مع صدر دجاج", "", img140_2, 250);
            long id140_2 = foodTableOperations.insertFoodData(food140_2);
            if (id140_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("منسف فريكه مع صدر دجاج", "5 من مغارف الارز", 520, 40, 35, 20, 0, 0, 0, id140_2, foodType);
                success140_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img141 = convertDrawableToByteArray(R.drawable.h75_7);
            FoodModel food141 = new FoodModel("منسف فريكه + فخذة دجاج", "", img141, 140);
            long id141 = foodTableOperations.insertFoodData(food141);
            if (id141 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("منسف فريكه + فخذة دجاج", "2 من مغرفة الارز", 350, 15, 20, 20, 0, 0, 0, id141, foodType);
                success141 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img141_1 = convertDrawableToByteArray(R.drawable.h75_8);
            FoodModel food141_1 = new FoodModel("منسف فريكه + فخذة دجاج", "", img141_1, 180);
            long id141_1 = foodTableOperations.insertFoodData(food141_1);
            if (id141_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("منسف فريكه + فخذة دجاج", "3 من مغرفة الارز", 420, 30, 25, 20, 0, 0, 0, id141_1, foodType);
                success141_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img141_2 = convertDrawableToByteArray(R.drawable.h75_9);
            FoodModel food141_2 = new FoodModel("منسف فريكه + فخذة دجاج", "", img141_2, 250);
            long id141_2 = foodTableOperations.insertFoodData(food141_2);
            if (id141_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("منسف فريكه + فخذة دجاج", "5 من مغارف الارز", 530, 40, 25, 20, 0, 0, 0, id141_2, foodType);
                success141_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img142 = convertDrawableToByteArray(R.drawable.h76);
            FoodModel food142 = new FoodModel("كرة دجاج محشية بالارز", "", img142, 250);
            long id142 = foodTableOperations.insertFoodData(food142);
            if (id142 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("كرة دجاج محشية بالارز", "", 520, 30, 25, 25, 0, 0, 0, id142, foodType);
                success142 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img143 = convertDrawableToByteArray(R.drawable.h77_1);
            FoodModel food143 = new FoodModel("حوس كوسا مع خضار", "", img143, 130);
            long id143 = foodTableOperations.insertFoodData(food143);
            if (id143 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("حوس كوسا مع خضار", "نصف كوب", 200, 2.1, 1, 20, 0, 0, 0, id143, foodType);
                success143 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img143_1 = convertDrawableToByteArray(R.drawable.h77_2);
            FoodModel food143_1 = new FoodModel("حوس كوسا مع خضار", "", img143_1, 270);
            long id143_1 = foodTableOperations.insertFoodData(food143_1);
            if (id143_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("حوس كوسا مع خضار", " كوب", 380, 5, 2, 40, 0, 0, 0, id143_1, foodType);
                success143_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img144 = convertDrawableToByteArray(R.drawable.h78_1);
            FoodModel food144 = new FoodModel("حوس يقطين مع خضار", "", img144, 130);
            long id144 = foodTableOperations.insertFoodData(food144);
            if (id144 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("حوس يقطين مع خضار", "نصف كوب", 140, 2.5, 1, 15, 0, 0, 0, id144, foodType);
                success144 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img144_1 = convertDrawableToByteArray(R.drawable.h78_2);
            FoodModel food144_1 = new FoodModel("حوس يقطين مع خضار", "", img144_1, 220);
            long id144_1 = foodTableOperations.insertFoodData(food144_1);
            if (id144_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("حوس يقطين مع خضار", "كوب", 280, 5, 2, 30, 0, 0, 0, id144_1, foodType);
                success144_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img145 = convertDrawableToByteArray(R.drawable.h80_1);
            FoodModel food145 = new FoodModel("مفتول", "", img145, 100);
            long id145 = foodTableOperations.insertFoodData(food145);
            if (id145 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مفتول", "2 من مغرفة ارز", 150, 25, 2.5, 3, 0, 0, 0, id145, foodType);
                success145 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img145_1 = convertDrawableToByteArray(R.drawable.h80_2);
            FoodModel food145_1 = new FoodModel("مفتول", "", img145_1, 160);
            long id145_1 = foodTableOperations.insertFoodData(food145_1);
            if (id145_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مفتول", "3 من مغارف ارز", 250, 40, 4, 6, 0, 0, 0, id145_1, foodType);
                success145_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img145_2 = convertDrawableToByteArray(R.drawable.h80_3);
            FoodModel food145_2 = new FoodModel("مفتول", "", img145_2, 260);
            long id145_2 = foodTableOperations.insertFoodData(food145_2);
            if (id145_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مفتول", "5 من مغرفة ارز", 420, 70, 7, 9, 0, 0, 0, id145_2, foodType);
                success145_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img146 = convertDrawableToByteArray(R.drawable.h80_4);
            FoodModel food146 = new FoodModel("مفتول +صدر دجاج", "", img146, 180);
            long id146 = foodTableOperations.insertFoodData(food146);
            if (id146 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مفتول +صدر دجاج", "2 من مغرفة ارز", 400, 25, 30, 15, 0, 0, 0, id146, foodType);
                success146 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img146_1 = convertDrawableToByteArray(R.drawable.h80_5);
            FoodModel food146_1 = new FoodModel("مفتول +صدر دجاج", "", img146_1, 240);
            long id146_1 = foodTableOperations.insertFoodData(food146_1);
            if (id146_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مفتول +صدر دجاج", "3 من مغارف ارز", 500, 40, 35, 20, 0, 0, 0, id146_1, foodType);
                success146_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img146_2 = convertDrawableToByteArray(R.drawable.h80_6);
            FoodModel food146_2 = new FoodModel("مفتول +صدر دجاج", "", img146_2, 340);
            long id146_2 = foodTableOperations.insertFoodData(food146_2);
            if (id146_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مفتول +صدر دجاج", "5 من مغرفة ارز", 650, 70, 7, 25, 0, 0, 0, id146_2, foodType);
                success146_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img147 = convertDrawableToByteArray(R.drawable.h80_7);
            FoodModel food147 = new FoodModel("مفتول +فخذة دجاج", "", img147, 180);
            long id147 = foodTableOperations.insertFoodData(food147);
            if (id147 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مفتول +فخذة دجاج", "2 من مغرفة ارز", 400, 25, 24, 20, 0, 0, 0, id147, foodType);
                success147 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img147_1 = convertDrawableToByteArray(R.drawable.h80_8);
            FoodModel food147_1 = new FoodModel("مفتول +فخذة دجاج", "", img147_1, 240);
            long id147_1 = foodTableOperations.insertFoodData(food147_1);
            if (id147_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مفتول +فخذة دجاج", "3 من مغارف ارز", 520, 40, 25, 20, 0, 0, 0, id147_1, foodType);
                success147_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img147_2 = convertDrawableToByteArray(R.drawable.h80_9);
            FoodModel food147_2 = new FoodModel("مفتول +فخذة دجاج", "", img147_2, 340);
            long id147_2 = foodTableOperations.insertFoodData(food147_2);
            if (id147_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مفتول +فخذة دجاج", "5 من مغرفة ارز", 670, 70, 7, 25, 0, 0, 0, id147_2, foodType);
                success147_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img148 = convertDrawableToByteArray(R.drawable.h81_1);
            FoodModel food148 = new FoodModel("خبيزة بالارز", "", img148, 130);
            long id148 = foodTableOperations.insertFoodData(food148);
            if (id148 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("خبيزة بالارز", "نصف كوب", 75, 15, 2.5, 0.5, 0, 0, 0, id148, foodType);
                success148 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img148_1 = convertDrawableToByteArray(R.drawable.h81_2);
            FoodModel food148_1 = new FoodModel("خبيزة بالارز", "", img148_1, 260);
            long id148_1 = foodTableOperations.insertFoodData(food148_1);
            if (id148_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("خبيزة بالارز", "كوب", 150, 30, 5, 1, 0, 0, 0, id148_1, foodType);
                success148_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img149 = convertDrawableToByteArray(R.drawable.h82_1);
            FoodModel food149 = new FoodModel("مجدرة أرز", "", img149, 60);
            long id149 = foodTableOperations.insertFoodData(food149);
            if (id149 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مجدرة أرز", "2 مغرفة ارز", 150, 10, 5, 4, 0, 0, 0, id149, foodType);
                success149 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img149_1 = convertDrawableToByteArray(R.drawable.h82_2);
            FoodModel food149_1 = new FoodModel("مجدرة أرز", "", img149_1, 100);
            long id149_1 = foodTableOperations.insertFoodData(food149_1);
            if (id149_1 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مجدرة أرز", "3 مغارف ارز", 200, 20, 7, 8, 0, 0, 0, id149_1, foodType);
                success149_1 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img149_2 = convertDrawableToByteArray(R.drawable.h82_3);
            FoodModel food149_2 = new FoodModel("مجدرة أرز", "", img149_2, 170);
            long id149_2 = foodTableOperations.insertFoodData(food149_2);
            if (id149_2 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("مجدرة أرز", "5 مغارف ارز", 350, 30, 15, 12, 0, 0, 0, id149_2, foodType);
                success149_2 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }


            if (success && success_1 && success_2 && success2 && success2_1 && success2_2 && success3 && success3_1 &&
                    success3_2 && success4 && success4_1 && success4_2 && success5 && success5_1 && success5_2 && success6 &&
                    success6_1 && success6_2 && success7 && success7_1 && success7_2 && success8 && success8_1 && success9 &&
                    success9_1 && success9_2 && success10 && success10_1 && success10_2 && success11 && success11_1 &&
                    success11_2 && success12 && success12_1 && success12_2 && success12_3 && success13 && success13_1 &&
                    success14 && success15 && success16 && success17 && success17_1 && success17_2 && success18 && success19 &&
                    success20 && success20_1 && success20_2 && success21 && success21_1 && success21_2 && success21_3 && success22 &&
                    success23 && success24 && success24_1 && success25 && success25_1 && success26 && success26_1 && success27 &&
                    success27_1 && success27_2 && success28 && success28_1 && success29 && success29_1 && success30 && success30_1 &&
                    success30_2 && success31 && success31_1 && success31_2 && success32 && success32_1 && success32_2 && success33 &&
                    success33_1 && success33_2 && success34 && success34_1 && success34_2 && success35 && success35_1 && success35_2 &&
                    success36 && success36_1 && success36_2 && success37 && success37_1 && success37_2 && success38 && success39 &&
                    success40 && success40_1 && success40_2 && success41 && success41_1 && success41_2 && success42 && success42_1 &&
                    success42_2 && success43 && success43_1 && success43_2 && success44 && success44_1 && success45 && success45_1 &&
                    success45_2 && success46 && success46_1 && success46_2 && success47 && success47_1 && success47_2 && success48 &&
                    success48_1 && success49 && success49_1 && success50 && success50_1 && success51 && success52 && success52_1 &&
                    success52_2 && success53 && success53_1 && success53_2 && success54 && success54_1 && success54_2 && success55 &&
                    success55_1 && success56 && success56_1 && success56_2 && success57 && success57_1 && success57_2 && success58 &&
                    success58_1 && success58_2 && success59 && success59_1 && success59_2 && success60 && success60_1 && success60_2 &&
                    success61 && success61_1 && success61_2 && success62 && success62_1 && success62_2 && success63 && success63_1 &&
                    success63_2 && success64 && success64_1 && success64_2 && success65 && success65_1 && success65_2 && success66 &&
                    success66_1 && success66_2 && success67 && success67_1 && success67_2 && success68 && success68_1 && success68_2 &&
                    success69 && success69_1 && success69_2 && success70 && success70_1 && success70_2 && success71 && success71_1 &&
                    success71_2 && success72 && success72_1 && success73 && success73_1 && success74 && success74_1 && success75 &&
                    success76 && success77 && success78 && success79 && success80 && success81 && success82 && success82_1 &&
                    success83 && success84 && success85 && success85_1 && success86 && success86_1 && success87 && success87_1 &&
                    success87_2 && success88 && success88_1 && success88_2 && success89 && success89_1 && success89_2 && success90 &&
                    success90_1 && success90_2 && success91 && success92 && success93 && success94 && success94_1 && success94_2 &&
                    success95 && success95_1 && success95_2 && success96 && success96_1 && success96_2 && success97 && success97_1 &&
                    success97_2 && success98 && success98_1 && success98_2 && success99 && success99_1 && success99_2 && success100 &&
                    success100_1 && success100_2 && success101 && success101_1 && success101_2 && success102 && success102_1 && success102_2 &&
                    success103 && success103_1 && success103_2 && success104 && success104_1 && success104_2 && success105 && success105_1 &&
                    success105_2 && success106 && success106_1 && success106_2 && success107 && success107_1 && success107_2 && success108 &&
                    success108_1 && success108_2 && success109 && success109_1 && success109_2 && success110 && success110_1 && success110_2 &&
                    success111 && success111_1 && success111_2 && success112 && success112_1 && success112_2 && success113 && success113_1 &&
                    success113_2 && success114 && success114_1 && success114_2 && success115 && success115_1 && success115_2 && success116 &&
                    success116_1 && success116_2 && success117 && success117_1 && success117_2 && success118 && success118_1 && success118_2 &&
                    success119 && success119_1 && success119_2 && success120 && success120_1 && success120_2 && success121 && success121_1 &&
                    success121_2 && success122 && success122_1 && success122_2 && success123 && success123_1 && success123_2 && success124 &&
                    success124_1 && success124_2 && success125 && success125_1 && success125_2 && success126 && success126_1 && success126_2 &&
                    success127 && success127_1 && success127_2 && success128 && success128_1 && success128_2 && success129 && success129_1 &&
                    success129_2 && success130 && success130_1 && success130_2 && success131 && success132 && success133 && success133_1 &&
                    success134 && success134_1 && success135 && success135_1 && success136 && success136_1 && success137 && success137_1 &&
                    success137_2 && success138 && success139 && success139_1 && success139_2 && success140 && success140_1 && success140_2 &&
                    success141 && success141_1 && success141_2 && success142 && success143 && success143_1 && success144 && success144_1 &&
                    success145 && success145_1 && success145_2 && success146 && success146_1 && success146_2 && success147 && success147_1 &&
                    success147_2 && success148 && success148_1 && success149 && success149_1 && success149_2) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    // منتجات السوق
    public boolean insertBiscuitsFoodDetails() {

        // do insert all Biscuits data in database for first time
        try {
            FoodDetailsTableOperations foodDetailsTableOperations = new FoodDetailsTableOperations(context);
            FoodTableOperations foodTableOperations = new FoodTableOperations(context);

            boolean success = false, success2 = false, success3 = false, success4 = false, success5 = false, success6 = false, success7 = false, success8 = false,
                    success9 = false, success10 = false, success11 = false, success12 = false, success13 = false, success14 = false, success15 = false, success16 = false,
                    success17 = false, success18 = false, success19 = false, success20 = false, success21 = false, success22 = false, success23 = false, success24 = false, success25 = false,
                    success26 = false, success27 = false, success28 = false, success29 = false;

            // الشوكولاتة و البسكويت
            // Biscuits
            String foodType = "الشوكولاتة و البسكويت";
            byte[] img = convertDrawableToByteArray(R.drawable.p1);
            FoodModel food1 = new FoodModel("بسكويت مملح", "", img, 12);
            long id = foodTableOperations.insertFoodData(food1);
            if (id > 0) {
                FoodDetailsModel foodModel = new FoodDetailsModel("بسكويت مملح", "", 240, 10, 1, 2, 0, 0, 0, id, foodType);
                success = foodDetailsTableOperations.insertFoodData(foodModel);
            }
            byte[] img2 = convertDrawableToByteArray(R.drawable.p2);
            FoodModel food2 = new FoodModel("بسكويت مغطى بالشوكولاتة الداكنة", "", img2, 15);
            long id2 = foodTableOperations.insertFoodData(food2);
            if (id2 > 0) {
                FoodDetailsModel foodModel2 = new FoodDetailsModel("بسكويت مغطى بالشوكولاتة الداكنة", "", 80, 10, 1, 4, 0, 0, 0, id2, foodType);
                success2 = foodDetailsTableOperations.insertFoodData(foodModel2);
            }
            byte[] img3 = convertDrawableToByteArray(R.drawable.p3);
            FoodModel food3 = new FoodModel("بسكويت مغطى بالشوكولاتة", "", img3, 15);
            long id3 = foodTableOperations.insertFoodData(food3);
            if (id3 > 0) {
                FoodDetailsModel foodModel3 = new FoodDetailsModel("بسكويت مغطى بالشوكولاتة", "", 90, 12, 1.5, 5, 0, 0, 0, id3, foodType);
                success3 = foodDetailsTableOperations.insertFoodData(foodModel3);
            }
            byte[] img4 = convertDrawableToByteArray(R.drawable.p4);
            FoodModel food4 = new FoodModel("كرات البسكويت محشية بالشوكولاتة", "", img4, 25);
            long id4 = foodTableOperations.insertFoodData(food4);
            if (id4 > 0) {
                FoodDetailsModel foodModel4 = new FoodDetailsModel("كرات البسكويت محشية بالشوكولاتة", "", 130, 15, 1.5, 7, 0, 0, 0, id4, foodType);
                success4 = foodDetailsTableOperations.insertFoodData(foodModel4);
            }
            byte[] img5 = convertDrawableToByteArray(R.drawable.p5);
            FoodModel food5 = new FoodModel("شوكولاتة محشية بجوز الهند", "", img5, 30);
            long id5 = foodTableOperations.insertFoodData(food5);
            if (id5 > 0) {
                FoodDetailsModel foodModel5 = new FoodDetailsModel("شوكولاتة محشية بجوز الهند", "", 140, 15, 1, 7, 0, 0, 0, id5, foodType);
                success5 = foodDetailsTableOperations.insertFoodData(foodModel5);
            }
            byte[] img6 = convertDrawableToByteArray(R.drawable.p6);
            FoodModel food6 = new FoodModel("كراكر سمكي من القمح", "", img6, 50);
            long id6 = foodTableOperations.insertFoodData(food6);
            if (id6 > 0) {
                FoodDetailsModel foodModel6 = new FoodDetailsModel("كراكر سمكي من القمح", "", 250, 30, 3, 10, 0, 0, 0, id6, foodType);
                success6 = foodDetailsTableOperations.insertFoodData(foodModel6);
            }
            byte[] img7 = convertDrawableToByteArray(R.drawable.p7);
            FoodModel food7 = new FoodModel("كيك بكريمة الشوكولاتة و الشوكولاتة الداكنة", "", img7, 25);
            long id7 = foodTableOperations.insertFoodData(food7);
            if (id7 > 0) {
                FoodDetailsModel foodModel7 = new FoodDetailsModel("كيك بكريمة الشوكولاتة و الشوكولاتة الداكنة", "", 115, 15, 1, 6, 0, 0, 0, id7, foodType);
                success7 = foodDetailsTableOperations.insertFoodData(foodModel7);
            }
            byte[] img8 = convertDrawableToByteArray(R.drawable.p8);
            FoodModel food8 = new FoodModel("كيك بالشوكولاتة السوداء و كريمة توت العليق", "", img8, 25);
            long id8 = foodTableOperations.insertFoodData(food8);
            if (id8 > 0) {
                FoodDetailsModel foodModel8 = new FoodDetailsModel("كيك بالشوكولاتة السوداء و كريمة توت العليق", "", 100, 15, 0.5, 4, 0, 0, 0, id8, foodType);
                success8 = foodDetailsTableOperations.insertFoodData(foodModel8);
            }
            byte[] img9 = convertDrawableToByteArray(R.drawable.p9);
            FoodModel food9 = new FoodModel("بسكويت ساندويش بكريمة الكاكاو و البندق", "", img9, 40);
            long id9 = foodTableOperations.insertFoodData(food9);
            if (id9 > 0) {
                FoodDetailsModel foodModel9 = new FoodDetailsModel("بسكويت ساندويش بكريمة الكاكاو و البندق", "", 190, 25, 3, 10, 0, 0, 0, id9, foodType);
                success9 = foodDetailsTableOperations.insertFoodData(foodModel9);
            }
            byte[] img10 = convertDrawableToByteArray(R.drawable.p10);
            FoodModel food10 = new FoodModel("شوكولاتة بالفول السوداني", "", img10, 50);
            long id10 = foodTableOperations.insertFoodData(food10);
            if (id10 > 0) {
                FoodDetailsModel foodModel10 = new FoodDetailsModel("شوكولاتة بالفول السوداني", "", 250, 30, 4, 10, 0, 0, 0, id10, foodType);
                success10 = foodDetailsTableOperations.insertFoodData(foodModel10);
            }
            byte[] img11 = convertDrawableToByteArray(R.drawable.p11);
            FoodModel food11 = new FoodModel("شوكولاتة بالكراميل", "", img11, 50);
            long id11 = foodTableOperations.insertFoodData(food11);
            if (id11 > 0) {
                FoodDetailsModel foodModel11 = new FoodDetailsModel("شوكولاتة بالكراميل", "", 240, 30, 4, 12, 0, 0, 0, id11, foodType);
                success11 = foodDetailsTableOperations.insertFoodData(foodModel11);
            }
            byte[] img12 = convertDrawableToByteArray(R.drawable.p12);
            FoodModel food12 = new FoodModel("كروسان بحشوة الكاكاو", "", img12, 65);
            long id12 = foodTableOperations.insertFoodData(food12);
            if (id12 > 0) {
                FoodDetailsModel foodModel12 = new FoodDetailsModel("كروسان بحشوة الكاكاو", "", 300, 30, 4, 2, 0, 0, 0, id12, foodType);
                success12 = foodDetailsTableOperations.insertFoodData(foodModel12);
            }
            byte[] img13 = convertDrawableToByteArray(R.drawable.p13);
            FoodModel food13 = new FoodModel("شوكولاتة مع الحليب بحشوة من الحليب", "", img13, 25);
            long id13 = foodTableOperations.insertFoodData(food13);
            if (id13 > 0) {
                FoodDetailsModel foodModel13 = new FoodDetailsModel("شوكولاتة مع الحليب بحشوة من الحليب", "", 140, 14, 2, 9, 0, 0, 0, id13, foodType);
                success13 = foodDetailsTableOperations.insertFoodData(foodModel13);
            }
            byte[] img14 = convertDrawableToByteArray(R.drawable.p14);
            FoodModel food14 = new FoodModel("بسكويت بكريم الكاكاو", "", img14, 60);
            long id14 = foodTableOperations.insertFoodData(food14);
            if (id14 > 0) {
                FoodDetailsModel foodModel14 = new FoodDetailsModel("بسكويت بكريم الكاكاو", "", 300, 40, 3, 16, 0, 0, 0, id14, foodType);
                success14 = foodDetailsTableOperations.insertFoodData(foodModel14);
            }
            byte[] img15 = convertDrawableToByteArray(R.drawable.p15);
            FoodModel food15 = new FoodModel("شوكولاتة داكنة", "", img15, 35);
            long id15 = foodTableOperations.insertFoodData(food15);
            if (id15 > 0) {
                FoodDetailsModel foodModel15 = new FoodDetailsModel("شوكولاتة داكنة", "", 200, 20, 2, 12, 0, 0, 0, id15, foodType);
                success15 = foodDetailsTableOperations.insertFoodData(foodModel15);
            }
            byte[] img16 = convertDrawableToByteArray(R.drawable.p16);
            FoodModel food16 = new FoodModel("شوكولاتة بالحليب", "", img16, 35);
            long id16 = foodTableOperations.insertFoodData(food16);
            if (id16 > 0) {
                FoodDetailsModel foodModel16 = new FoodDetailsModel("شوكولاتة بالحليب", "", 200, 20, 3, 12, 0, 0, 0, id16, foodType);
                success16 = foodDetailsTableOperations.insertFoodData(foodModel16);
            }
            byte[] img17 = convertDrawableToByteArray(R.drawable.p17);
            FoodModel food17 = new FoodModel("حبيبات شوكولاتة", "", img17, 20);
            long id17 = foodTableOperations.insertFoodData(food17);
            if (id17 > 0) {
                FoodDetailsModel foodModel17 = new FoodDetailsModel("حبيبات شوكولاتة", "", 100, 3, 0.5, 4, 0, 0, 0, id17, foodType);
                success17 = foodDetailsTableOperations.insertFoodData(foodModel17);
            }
            byte[] img18 = convertDrawableToByteArray(R.drawable.p18);
            FoodModel food18 = new FoodModel("كاندي مغطى بالسكر", "", img18, 60);
            long id18 = foodTableOperations.insertFoodData(food18);
            if (id18 > 0) {
                FoodDetailsModel foodModel18 = new FoodDetailsModel("كاندي مغطى بالسكر", "", 200, 5, 3, 0.0, 0, 0, 0, id18, foodType);
                success18 = foodDetailsTableOperations.insertFoodData(foodModel18);
            }
            byte[] img19 = convertDrawableToByteArray(R.drawable.p19);
            FoodModel food19 = new FoodModel("كاندي", "", img19, 60);
            long id19 = foodTableOperations.insertFoodData(food19);
            if (id19 > 0) {
                FoodDetailsModel foodModel19 = new FoodDetailsModel("كاندي", "", 200, 45, 4, 0.0, 0, 0, 0, id19, foodType);
                success19 = foodDetailsTableOperations.insertFoodData(foodModel19);
            }
            byte[] img20 = convertDrawableToByteArray(R.drawable.p20);
            FoodModel food20 = new FoodModel("شيبس بطاطا مملحة", "", img20, 40);
            long id20 = foodTableOperations.insertFoodData(food20);
            if (id20 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("شيبس بطاطا مملحة", "", 220, 20, 2.5, 15, 0, 0, 0, id20, foodType);
                success20 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img21 = convertDrawableToByteArray(R.drawable.p21);
            FoodModel food21 = new FoodModel("مسلي ذرة متبل", "", img21, 45);
            long id21 = foodTableOperations.insertFoodData(food21);
            if (id21 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("مسلي ذرة متبل", "", 240, 30, 4, 12, 0, 0, 0, id21, foodType);
                success21 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img22 = convertDrawableToByteArray(R.drawable.p22);
            FoodModel food22 = new FoodModel("رقائق شيبس من البطاطا و دقيق القمح و الذرة", "", img22, 25);
            long id22 = foodTableOperations.insertFoodData(food22);
            if (id22 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("رقائق شيبس من البطاطا و دقيق القمح و الذرة", "", 135, 4, 1, 8, 0, 0, 0, id22, foodType);
                success22 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img23 = convertDrawableToByteArray(R.drawable.p23);
            FoodModel food23 = new FoodModel("شيبس الذرة بنكهة الجبنة الحارة", "", img23, 20);
            long id23 = foodTableOperations.insertFoodData(food23);
            if (id23 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("شيبس الذرة بنكهة الجبنة الحارة", "", 100, 10, 1, 5, 0, 0, 0, id23, foodType);
                success23 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img24 = convertDrawableToByteArray(R.drawable.p24);
            FoodModel food24 = new FoodModel("ذرة منفوشة بزبدة الفستق", "", img24, 20);
            long id24 = foodTableOperations.insertFoodData(food24);
            if (id24 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("ذرة منفوشة بزبدة الفستق", "", 98, 10.5, 1.5, 6, 0, 0, 0, id24, foodType);
                success24 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img25 = convertDrawableToByteArray(R.drawable.p25);
            FoodModel food25 = new FoodModel("شيبس من البطاطا", "", img25, 15);
            long id25 = foodTableOperations.insertFoodData(food25);
            if (id25 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("شيبس من البطاطا", "", 80, 10, 0.0, 5, 0, 0, 0, id25, foodType);
                success25 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img26 = convertDrawableToByteArray(R.drawable.p26);
            FoodModel food26 = new FoodModel("شيبس بطاطا مجففة بالبابريكا", "", img26, 20);
            long id26 = foodTableOperations.insertFoodData(food26);
            if (id26 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("شيبس بطاطا مجففة بالبابريكا", "", 70, 8, 1, 4, 0, 0, 0, id26, foodType);
                success26 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img27 = convertDrawableToByteArray(R.drawable.p27);
            FoodModel food27 = new FoodModel("مسليات بشكل دجاج واصابع بطاطا", "", img27, 20);
            long id27 = foodTableOperations.insertFoodData(food27);
            if (id27 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("مسليات بشكل دجاج واصابع بطاطا", "", 120, 60, 4, 29, 0, 0, 0, id27, foodType);
                success27 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img28 = convertDrawableToByteArray(R.drawable.p28);
            FoodModel food28 = new FoodModel("شيبس بطاطا", "", img28, 40);
            long id28 = foodTableOperations.insertFoodData(food28);
            if (id28 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("شيبس بطاطا", "", 74, 8, 1, 4, 0, 0, 0, id28, foodType);
                success28 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            byte[] img29 = convertDrawableToByteArray(R.drawable.p29);
            FoodModel food29 = new FoodModel("بسكويت مملح (قسماط)", "", img29, 36);
            long id29 = foodTableOperations.insertFoodData(food29);
            if (id29 > 0) {
                FoodDetailsModel foodModel20 = new FoodDetailsModel("بسكويت مملح (قسماط)", "", 160, 30, 3, 4, 0, 0, 0, id20, foodType);
                success29 = foodDetailsTableOperations.insertFoodData(foodModel20);
            }
            if (success && success2 && success3 && success4 && success5 && success6 && success7 && success8 && success9 && success10 &&
                    success11 && success12 && success13 && success14 && success15 && success16 && success17 && success18 && success19 && success20
                    && success21 && success22 && success23 && success24 && success25 && success26 && success27 && success28 && success29) {
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

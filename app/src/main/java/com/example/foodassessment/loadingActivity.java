package com.example.foodassessment;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.foodassessment.db.db_oprations.FoodDetailsTableOperations;
import com.example.foodassessment.db.db_oprations.FoodTableOperations;
import com.example.foodassessment.db.db_oprations.UserTableOperations;

import java.util.Locale;

public class loadingActivity extends AppCompatActivity {
    UserTableOperations userTableOperations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading_activity);


        // change language of this activity
        String languageToLoad = "ar";
        Locale locale = new Locale(languageToLoad);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config,
                getBaseContext().getResources().getDisplayMetrics());
        this.setContentView(R.layout.loading_activity);
        userTableOperations = new UserTableOperations(this);


        new android.os.Handler().postDelayed(
                new Runnable() {
                    public void run() {
                        boolean isEmpty = new FoodDetailsTableOperations(loadingActivity.this).getFoodData().isEmpty();

                        int sizeFoodDetails = new FoodDetailsTableOperations(loadingActivity.this).getFoodData().size();
                        int sizeFood = new FoodTableOperations(loadingActivity.this).getFoodData().size();

                        if (!isEmpty) {
                            Toast.makeText(loadingActivity.this, "Data Already Inserted..." + sizeFoodDetails + ", " + sizeFood, Toast.LENGTH_SHORT).show();

                        } else {
                            Toast.makeText(loadingActivity.this, "No Data Found ", Toast.LENGTH_SHORT).show();

                        }
                        // check if there's no user go to sign up activity, else go to start and help activity
                        if (userTableOperations.getUserData().isEmpty()) {
                            Intent intent = new Intent(loadingActivity.this, SignUpActivity.class);
                            startActivity(intent);
                        } else {
                            Intent intent = new Intent(loadingActivity.this, StartOrHelpActivity.class);
                            startActivity(intent);
                        }
                    }
                }, 3000
        );
    }
}
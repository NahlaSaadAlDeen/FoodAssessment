package com.example.foodassessment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

import java.util.Locale;

public class loadingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading_activity);
        
        // change language of this activity
        String languageToLoad  = "ar";
        Locale locale = new Locale(languageToLoad);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config,
                getBaseContext().getResources().getDisplayMetrics());
        this.setContentView(R.layout.loading_activity);

        new android.os.Handler().postDelayed(
              new Runnable(){
                  public void run(){
                      Intent intent = new Intent(loadingActivity.this, SignUpActivity.class);
                      startActivity(intent);
                  }
              }, 3000
        );
    }
}
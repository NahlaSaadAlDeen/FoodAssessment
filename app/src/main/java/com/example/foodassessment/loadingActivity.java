package com.example.foodassessment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

import com.example.foodassessment.db.db_oprations.UserTableOperations;

import java.util.Locale;

public class loadingActivity extends AppCompatActivity {
   UserTableOperations userTableOperations;
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
       userTableOperations = new UserTableOperations(this);


        new android.os.Handler().postDelayed(
              new Runnable(){
                  public void run(){
                      // check if there's no user go to sign up activity, else go to start and help activity
                      if( userTableOperations.getUserData().isEmpty()) {
                          Intent intent = new Intent(loadingActivity.this, SignUpActivity.class);
                          startActivity(intent);
                      }
                      else{
                          Intent intent = new Intent(loadingActivity.this, StartOrHelpActivity.class);
                          startActivity(intent);
                      }
                  }
              }, 3000
        );
    }
}
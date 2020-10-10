package com.example.foodassessment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.foodassessment.db.db_oprations.UserTableOperations;
import com.example.foodassessment.db.models.UserModel;

import java.util.Locale;

public class SignUpActivity extends AppCompatActivity {
    private Button createAccount;
    private EditText et_age, et_length, et_weight;
    private RadioGroup radioGroup;
    private RadioButton radioButtonSelected;

    //UserTableOperations userTableOperations;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        // change language of this activity
        String languageToLoad  = "ar";
        Locale locale = new Locale(languageToLoad);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config,
                getBaseContext().getResources().getDisplayMetrics());
        this.setContentView(R.layout.activity_sign_up);

        // Get data from the form
        et_age = findViewById(R.id.et_age);
        et_length = findViewById(R.id.et_length);
        et_weight = findViewById(R.id.et_weight);
        radioGroup = (RadioGroup) findViewById(R.id.radio_group);

        createAccount = findViewById(R.id.help_btn);

        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UserModel userModel;
                radioButtonSelected = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
                String vote = radioButtonSelected.getText().toString();
                try {
                    userModel = new UserModel(-1, vote,
                            Integer.parseInt(String.valueOf(et_age.getText())),
                            Double.parseDouble(String.valueOf(et_length.getText())),
                            Double.parseDouble(String.valueOf(et_weight.getText())));

                    UserTableOperations userTableOperations = new UserTableOperations(SignUpActivity.this);
                    boolean success = userTableOperations.insertUserData(userModel);

                    Toast.makeText(SignUpActivity.this,"Success" + success , Toast.LENGTH_SHORT).show();
                } catch (Exception e){
                    Toast.makeText(SignUpActivity.this, "Something went wrong", Toast.LENGTH_SHORT).show();
                }



               /* Intent intent = new Intent(SignUpActivity.this, StartOrHelpActivity.class);
                startActivity(intent);*/
            }
        });
    }
}
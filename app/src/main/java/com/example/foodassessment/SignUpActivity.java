package com.example.foodassessment;

import android.content.res.Configuration;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.foodassessment.db.db_oprations.UserTableOperations;
import com.example.foodassessment.db.insert_data.DataInsertion;
import com.example.foodassessment.db.models.UserModel;

import java.util.Locale;

public class SignUpActivity extends AppCompatActivity {
    private Button createAccount;
    private EditText et_age, et_length, et_weight;
    private RadioGroup radioGroup;
    private RadioButton radioButtonSelected;
    private ProgressBar progressBar;

    //UserTableOperations userTableOperations;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        // change language of this activity
        String languageToLoad = "ar";
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
        radioGroup = findViewById(R.id.radio_group);

        createAccount = findViewById(R.id.help_btn);

        progressBar = findViewById(R.id.progress);
        findViewById(R.id.load_data_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DataTask loadertask = new DataTask();
                loadertask.execute();
            }
        });
        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UserModel userModel;
                radioButtonSelected = findViewById(radioGroup.getCheckedRadioButtonId());
                String vote = radioButtonSelected.getText().toString();
                try {
                    userModel = new UserModel(-1, 1,
                            Integer.parseInt(String.valueOf(et_age.getText())),
                            Double.parseDouble(String.valueOf(et_length.getText())),
                            Double.parseDouble(String.valueOf(et_weight.getText())));

                    UserTableOperations userTableOperations = new UserTableOperations(SignUpActivity.this);
                    boolean success = userTableOperations.insertUserData(userModel);

                    Toast.makeText(SignUpActivity.this, "Success" + success, Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    Toast.makeText(SignUpActivity.this, "Something went wrong", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    class DataTask extends AsyncTask<Void, Void, Void> {
        @Override
        protected void onPreExecute() {
            progressBar.setVisibility(View.VISIBLE);
        }

        @Override
        protected Void doInBackground(Void... params) {
            // your data loading code goes here
            try {
                DataInsertion dataInsertion = new DataInsertion(SignUpActivity.this);
                boolean successSalads = dataInsertion.insertSaladsFoodDetails();
                boolean successFruits = dataInsertion.insertFruitsFoodDetails();
                boolean successBread = dataInsertion.insertBreadFoodDetails();
                boolean successMeat = dataInsertion.insertMeatFoodDetails();
                boolean successMilk = dataInsertion.insertMilkFoodDetails();
                boolean successDrinks = dataInsertion.insertDrinksFoodDetails();
                boolean successNuts = dataInsertion.insertNutsFoodDetails();
                boolean successAdds = dataInsertion.insertAddsFoodDetails();
                boolean successBeans = dataInsertion.insertBeansFoodDetails();
                boolean successFats = dataInsertion.insertFatsFoodDetails();
                boolean successGrains = dataInsertion.insertGrainsFoodDetails();
                boolean successBiscuits = dataInsertion.insertBiscuitsFoodDetails();
                boolean successVegetables = dataInsertion.insertVegetablesFoodDetails();
                boolean successSnacks = dataInsertion.insertSnacksFoodDetails();
                Log.e("result", successSalads + " + " + successFruits + " + " + successBread + " + " + successMeat + " + " + successMilk
                        + " + " + successDrinks + " + " + successNuts + " + " + successAdds + " + " + successBeans + " + " + successFats + " + " + successGrains
                        + " + " + successBiscuits + " + " + successVegetables + " + " + successSnacks);

            } catch (Exception e) {
                progressBar.setVisibility(View.GONE);

                Toast.makeText(SignUpActivity.this, "Something went wrong....", Toast.LENGTH_SHORT).show();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            progressBar.setVisibility(View.GONE);

        }

        @Override
        protected void onProgressUpdate(Void... values) {

            super.onProgressUpdate(values);
        }
    }
}

package com.example.foodassessment;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.foodassessment.db.DBHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     /*   DBHelper helper = new DBHelper(MainActivity.this);
        Toast.makeText(MainActivity.this,
                helper.toString(),
                Toast.LENGTH_SHORT).show();*/
    }
}
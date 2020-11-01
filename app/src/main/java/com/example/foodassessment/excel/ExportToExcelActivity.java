package com.example.foodassessment.excel;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.foodassessment.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExportToExcelActivity extends AppCompatActivity {
    public static final String TAG = ExportToExcelActivity.class.getSimpleName();
    private Context mContext;
    private final int DIR_SELECTOR_CODE = 200;
    private final List<Map<Integer, Object>> dataList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_export);
        mContext = this;

        findViewById(R.id.write_xlsx).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // test data for now
                HashMap<Integer, Object> one = new HashMap<>(10);
                one.put(1, "a");
                one.put(2, "a");
                one.put(3, "a");
                dataList.add(one);
                HashMap<Integer, Object> two = new HashMap<>(10);
                two.put(1, "b");
                two.put(2, "b");
                two.put(3, "b");
                dataList.add(two);

                openFolderSelector();
            }
        });
    }

    /**
     * open the local filer and select the folder
     */
    private void openFolderSelector() {
        Intent intent = new Intent(Intent.ACTION_CREATE_DOCUMENT);
        intent.setType("application/*");
        intent.putExtra(Intent.EXTRA_TITLE,
                System.currentTimeMillis() + ".xlsx");
        startActivityForResult(intent, DIR_SELECTOR_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == DIR_SELECTOR_CODE && resultCode == Activity.RESULT_OK) {
            Uri uri = data.getData();
            if (uri == null) return;
            Log.e(TAG, "onActivityResult: " + "filePath：" + uri.getPath());
            Toast.makeText(mContext, "Exporting...", Toast.LENGTH_SHORT).show();
            //you can modify readExcelList, then write to excel.
            ExcelUtil.writeExcelNew(this, dataList, uri);
        }
    }
}

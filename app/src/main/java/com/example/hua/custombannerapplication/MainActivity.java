package com.example.hua.custombannerapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GoCustomBanner(View view) {
        goActivity(CustomBannerActivity.class);
    }


    public void GoCustomUseBanner(View view) {
        goActivity(CustomUseActivity.class);
    }


    private void goActivity(Class clazz) {
        Intent intent = new Intent(this,clazz);
        startActivity(intent);
    }
}

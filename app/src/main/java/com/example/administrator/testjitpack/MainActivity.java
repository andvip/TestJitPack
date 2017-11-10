package com.example.administrator.testjitpack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.screenlibrary.FastClickUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FastClickUtils.isFastDoubleClick();
    }
}

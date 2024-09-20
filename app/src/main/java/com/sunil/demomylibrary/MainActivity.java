package com.sunil.demomylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.sunil.mylibrary.CustomToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomToast.INSTANCE.s(this,"dmnksv");
    }
}
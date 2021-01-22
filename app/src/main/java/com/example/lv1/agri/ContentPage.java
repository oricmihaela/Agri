package com.example.lv1.agri;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ContentPage extends AppCompatActivity {
    BaseAdapter baseAdapter;
    UserData userData;
    String id;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_page);


        baseAdapter = new BaseAdapter(this);
       // userData = baseAdapter.getUser();
    }
}

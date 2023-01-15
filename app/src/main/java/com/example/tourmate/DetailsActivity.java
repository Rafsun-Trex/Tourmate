package com.example.tourmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    int resultValue = -1;

    TextView title, details;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        findAllViews();
        getIntentValue();
        setData();
    }

    private void setData() {
    }

    private void findAllViews() {
        title = findViewById(R.id.txt_title);
        details = findViewById(R.id.txt_details);
        imageView = findViewById(R.id.img_main);
    }

    private void getIntentValue() {
        Intent i = getIntent();
        resultValue = i.getExtras().getInt("place", -1);
    }
}
package com.example.tourmate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class welcome extends AppCompatActivity {
    EditText locationEditTxt, budgetEditTxt, preferenceEditTxt;
    MaterialButton findTourBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        locationEditTxt = findViewById(R.id.locationEditTxt);
        budgetEditTxt = findViewById(R.id.budgetEditTxt);
        preferenceEditTxt = findViewById(R.id.preferenceEditTxt);
        findTourBtn = findViewById(R.id.findTourBtn);

        findTourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(welcome.this, "Tour suggestions are on the way!!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
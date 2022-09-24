package com.example.tourmate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

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
                Intent intent = new Intent(welcome.this, result_recview.class);
                startActivity(intent);
            }
        });
    }
}
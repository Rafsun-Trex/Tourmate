package com.example.tourmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class tourService extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_service);

        TextView username = findViewById(R.id.username);
        TextView password = findViewById(R.id.password);
        MaterialButton loginbtn = findViewById(R.id.loginbtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("admin")&& password.getText().toString().equals("admin")){
                    Toast.makeText(tourService.this,"Login Successful", Toast.LENGTH_SHORT ).show();
                    Intent intent = new Intent(tourService.this, welcome.class);
                    startActivity(intent);

                }
                else
                {
                    Toast.makeText(tourService.this,"Wrong username or password", Toast.LENGTH_SHORT ).show();
                }
            }
        });
    }
}
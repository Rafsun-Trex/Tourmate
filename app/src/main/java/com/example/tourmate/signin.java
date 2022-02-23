package com.example.tourmate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class signin extends AppCompatActivity {
    FirebaseAuth auth;
    TextView useremail, password, signUpNow;
    MaterialButton loginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        auth = FirebaseAuth.getInstance();
        useremail = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginbtn = findViewById(R.id.loginbtn);
        signUpNow = findViewById(R.id.others);


        loginbtn.setOnClickListener(view -> {
            login();
        });

        signUpNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(signin.this, registration.class);
                startActivity(intent);
            }
        });
    }
    public void login(){
        String email = useremail.getText().toString();
        String pass = password.getText().toString();

        if(TextUtils.isEmpty(email)){
            Toast.makeText(this, "Enter email!", Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(pass)){
            Toast.makeText(this, "Enter password!", Toast.LENGTH_SHORT).show();
            return;
        }
        if(pass.length()<6){
            Toast.makeText(this, "Password too short!", Toast.LENGTH_SHORT).show();
            return;
        }

        auth.signInWithEmailAndPassword(email, pass)
                .addOnCompleteListener(signin.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(signin.this, "Login successful!", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(signin.this,welcome.class));
                        }
                        else
                        {
                            Toast.makeText(signin.this, "Error "+task.getException(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }


}
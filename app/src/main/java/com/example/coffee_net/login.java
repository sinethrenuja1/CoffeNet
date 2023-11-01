package com.example.coffee_net;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {

    EditText emailor_username;
    EditText Password;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailor_username=findViewById(R.id.email_username);
        Password=findViewById(R.id.password);

        login=findViewById(R.id.btn_login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (emailor_username.getText().toString().equals("Admin") && Password.getText().toString().equals(1234)){
                    Intent intent = new Intent(login.this, Register.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

    }
}
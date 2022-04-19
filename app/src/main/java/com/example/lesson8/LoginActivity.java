package com.example.lesson8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button btn_login,btn_tirkelu;
    EditText et_email, et_password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_login= findViewById(R.id.btn_login);
        btn_tirkelu = findViewById(R.id.btn_tirkelu);

        et_email = findViewById(R.id.et_email);
        et_password = findViewById(R.id.et_password);

        btn_tirkelu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registrationIntent = new Intent(LoginActivity.this,RegistrationActivity.class);
                startActivity(registrationIntent);
            }
        });
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(et_email.getText())){
                    et_email.setError("Заполните полю...");
                    return;
                }
                if(TextUtils.isEmpty(et_password.getText())){
                    et_password.setError("Заполните полю...");
                    return;
                }
                if(et_email.getText().toString().equals("ulbossya@gmail.com")&&et_password.getText().toString().equals("1234")){
                    Intent registrationIntent = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(registrationIntent);
                }else{
                    Toast.makeText(LoginActivity.this, "Email or Password wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
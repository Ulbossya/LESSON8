package com.example.lesson8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistrationActivity extends AppCompatActivity {

    EditText et_email, et_name, et_password;
    Button btn_tirkelu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        btn_tirkelu = findViewById(R.id.btn_tirkelu);
        et_email = findViewById(R.id.et_email);
        et_name = findViewById(R.id.et_name);
        et_password = findViewById(R.id.et_password);

        btn_tirkelu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(et_email.getText())){
                    et_email.setError("Заполните полю...");
                    return;
                }
                if(TextUtils.isEmpty(et_name.getText())){
                    et_name.setError("Заполните полю...");
                    return;
                }
                if(TextUtils.isEmpty(et_password.getText())){
                    et_password.setError("Заполните полю...");
                    return;
                }
                Intent registrationIntent = new Intent(RegistrationActivity  .this,MainActivity.class);
                startActivity(registrationIntent);
            }
        }) ;
    }
}
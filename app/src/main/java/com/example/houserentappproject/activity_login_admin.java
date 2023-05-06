package com.example.houserentappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class activity_login_admin extends AppCompatActivity {

    private EditText email, password;
    private Button SignInbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_admin);




//        Intent act_user_login = new Intent(activity_login_admin.this, activity_login_user.class);
//
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//              startActivity(act_user_login);
//            }
//        }

        email = findViewById(R.id.email_et);
        password = findViewById(R.id.password_et);
        SignInbtn = findViewById(R.id.btn_sign_in);

        SignInbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_login_admin.this , act_adminAct.class);
                startActivity(intent);
//                login();
            }
        });


    }
    private void login()
    {
        String email1 = email.getText().toString();
        String password1 = password.getText().toString();
        if (!TextUtils.isEmpty(email1) && !TextUtils.isEmpty(password1))
        {
            if (email1.equals("admin") && password1.equals("Admin"))
            {
                Intent intent = new Intent(activity_login_admin.this , AdminActivity.class);
                startActivity(intent);
            }
            else
            {
                Toast.makeText(this, "Please enter correct Email and Password", Toast.LENGTH_SHORT).show();
            }
        }
        else
        {
            Toast.makeText(this, "Please enter Email and password", Toast.LENGTH_SHORT).show();

        }
    }


}
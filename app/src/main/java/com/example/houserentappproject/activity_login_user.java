package com.example.houserentappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class activity_login_user extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_user);

        Intent act_user_reg = new Intent(activity_login_user.this , activity_registration_user.class);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(act_user_reg);
            }
        },3000);

    }
}
package com.example.houserentappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class activity_typeofuser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_typeofuser);

        Intent act_admin_login = new Intent(activity_typeofuser.this, activity_login_admin.class);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(act_admin_login);
            }
        },3000);


    }
}
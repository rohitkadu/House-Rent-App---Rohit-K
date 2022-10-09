package com.example.houserentappproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class activity_typeofuser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_typeofuser);


        CardView cv_admin = findViewById(R.id.cv_admin);
        CardView cv_user = findViewById(R.id.cv_user);

        cv_admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act_login_admin = new Intent(activity_typeofuser.this , activity_login_admin.class);
                startActivity(act_login_admin);
            }
        });


        cv_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act_login_user = new Intent(activity_typeofuser.this , activity_neworexistinguser.class);
                startActivity(act_login_user);
            }
        });



//        Intent act_admin_login = new Intent(activity_typeofuser.this, activity_login_admin.class);
//
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                startActivity(act_admin_login);
//            }
//        },3000);


    }
}
package com.example.houserentappproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_neworexistinguser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neworexistinguser);


        CardView cv_newuser = findViewById(R.id.cv_newuser);
        CardView cv_existinguser = findViewById(R.id.cv_existinguser);


        cv_newuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent act_newuser_reg = new Intent(activity_neworexistinguser.this , activity_registration_user.class);
                startActivity(act_newuser_reg);

            }
        });


        cv_existinguser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent act_existinguser_login = new Intent(activity_neworexistinguser.this , activity_login_user.class);
                startActivity(act_existinguser_login);

            }
        });


    }
}
package com.example.houserentappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_reg_successful extends AppCompatActivity {

    ImageView profile_image ;
    TextView profile_name , profile_email ;
    Button btn_sign_out , btn_continue ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_successful);

        Intent recBundle =getIntent();
        String name = recBundle.getStringExtra("name");
        String email = recBundle.getStringExtra("email");

        profile_image = findViewById(R.id.profile_image);
        profile_name = findViewById(R.id.profile_name);
        profile_email = findViewById(R.id.profile_email);
        btn_sign_out = findViewById(R.id.btn_sign_out);
        btn_continue = findViewById(R.id.btn_continue);

        profile_name.setText(name);
        profile_email.setText(email);


        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i_select_city = new Intent(getApplicationContext() , activity_selectcity.class);
                startActivity(i_select_city);
                finish();

            }
        });

    }
}
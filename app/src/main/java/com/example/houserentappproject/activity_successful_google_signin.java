package com.example.houserentappproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

public class activity_successful_google_signin extends AppCompatActivity {

    public static final String GOOGLE_ACCOUNT = "google_account";
    ImageView profile_image ;
    TextView profile_name , profile_email ;
    Button btn_sign_out , btn_continue ;
    GoogleSignInClient mGoogleSignInClient ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_successful_google_signin);

        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();
        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);

        GoogleSignInAccount googleSignInAccount = getIntent().getParcelableExtra(GOOGLE_ACCOUNT);

        profile_image = findViewById(R.id.profile_image);
        profile_name = findViewById(R.id.profile_name);
        profile_email = findViewById(R.id.profile_email);
        btn_sign_out = findViewById(R.id.btn_sign_out);
        btn_continue = findViewById(R.id.btn_continue);


//        Picasso.get().load(googleSignInAccount.getPhotoUrl()).into(profile_image);
        profile_name.setText(googleSignInAccount.getDisplayName());
        profile_email.setText(googleSignInAccount.getEmail());


        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Intent act_select_city = new Intent(activity_successful_google_signin.this , activity_selectcity.class);
//                startActivity(act_select_city);

                Intent act_select_city = new Intent(activity_successful_google_signin.this , activity_selectcity.class);
                startActivity(act_select_city);

            }
        });


        btn_sign_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.btn_sign_out:
                        signOut();
                        break;
                }
            }
        });

//        mGoogleSignInClient.signOut()
//                .addOnCompleteListener(this, new OnCompleteListener<Void>() {
//                    @Override
//                    public void onComplete(@NonNull Task<Void> task) {
//                        Intent signin_again = new Intent(activity_successful_google_signin.this , activity_login_user.class);
//                        startActivity(signin_again);
//                    }
//                });


    }

    private void signOut() {
                mGoogleSignInClient.signOut()
                .addOnCompleteListener(this, new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        Intent signin_again = new Intent(activity_successful_google_signin.this , activity_login_user.class);
                        startActivity(signin_again);
                        finish();
                    }
                });
    }
}
package com.example.androide.citycleaner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignIn_government extends AppCompatActivity {

    Button homeButtonGovernment;
    Button signUpButtonGovernment;
    Button signInGovernment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_government);

        homeButtonGovernment = (Button)findViewById(R.id.homeButtonGovernment);
        signUpButtonGovernment = (Button)findViewById(R.id.signUpButtonGovernment);
        signInGovernment = (Button)findViewById(R.id.signInGovernment);

        homeButtonGovernment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignIn_government.this,GovernmentActivity.class);
                startActivity(intent);
            }
        });
        signUpButtonGovernment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignIn_government.this,SignUp_government.class);
                startActivity(intent);
            }
        });
        signInGovernment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignIn_government.this,Menu_government.class);
                startActivity(intent);
            }
        });
    }
}

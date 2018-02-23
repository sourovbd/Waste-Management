package com.example.androide.citycleaner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUp_government extends AppCompatActivity {

    Button homeButtonGovernment;
    Button singInButtonGovernment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_government);

        homeButtonGovernment = (Button)findViewById(R.id.homeButtonGovernment);
        singInButtonGovernment = (Button)findViewById(R.id.singInButtonGovernment);

        homeButtonGovernment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp_government.this,GovernmentActivity.class);
                startActivity(intent);
            }
        });

        singInButtonGovernment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp_government.this,SignIn_government.class);
                startActivity(intent);
            }
        });
    }
}

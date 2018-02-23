package com.example.androide.citycleaner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUp_business extends AppCompatActivity {

    Button homeButtonBusiness;
    Button singInButtonBusiness;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_business);

        homeButtonBusiness = (Button)findViewById(R.id.homeButtonBusiness);
        singInButtonBusiness = (Button)findViewById(R.id.singInButtonBusiness);

        homeButtonBusiness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp_business.this,BusinessActivity.class);
                startActivity(intent);
            }
        });
        singInButtonBusiness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp_business.this,SignIn_business.class);
                startActivity(intent);
            }
        });
    }
}

package com.example.androide.citycleaner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BusinessActivity extends AppCompatActivity {

    Button singInButtonBusiness;
    Button signUpButtonBusiness;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business);

        singInButtonBusiness = (Button)findViewById(R.id.singInButtonBusiness);
        signUpButtonBusiness = (Button)findViewById(R.id.signUpButtonBusiness);

        singInButtonBusiness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BusinessActivity.this,SignIn_business.class);
                startActivity(intent);
            }
        });
        signUpButtonBusiness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BusinessActivity.this,SignUp_business.class);
                startActivity(intent);
            }
        });
    }
}

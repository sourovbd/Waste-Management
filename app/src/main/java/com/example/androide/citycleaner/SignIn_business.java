package com.example.androide.citycleaner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignIn_business extends AppCompatActivity {

    Button homeButtonBusiness;
    Button signUpButtonBusiness;
    Button signInBusiness;
    EditText EmailOrPhoneBusiness, PasswordBusiness;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_business);

        homeButtonBusiness = (Button)findViewById(R.id.homeButtonBusiness);
        signUpButtonBusiness = (Button)findViewById(R.id.signUpButtonBusiness);
        signInBusiness = (Button)findViewById(R.id.signInBusiness);
        EmailOrPhoneBusiness = (EditText)findViewById(R.id.emailOrPhoneBusiness);
        PasswordBusiness = (EditText)findViewById(R.id.passwordBusiness);

        homeButtonBusiness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignIn_business.this,BusinessActivity.class);
                startActivity(intent);
            }
        });
        signUpButtonBusiness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignIn_business.this,SignUp_business.class);
                startActivity(intent);
            }
        });
        signInBusiness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignIn_business.this,Menu_business.class);
                startActivity(intent);
            }
        });
    }
   /* public void OnLogin(View view){

        String username = EmailOrPhoneBusiness.getText().toString();
        String password = PasswordBusiness.getText().toString();
        String type = "login";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type, username, password);
    }*/
}

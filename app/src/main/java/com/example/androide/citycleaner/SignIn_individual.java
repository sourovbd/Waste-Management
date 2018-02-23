package com.example.androide.citycleaner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignIn_individual extends AppCompatActivity {
    EditText UsernameEt, PasswordEt;
    Button homeButtonIndividual;
    Button signUpButtonIndividual;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_individual);

        homeButtonIndividual = (Button)findViewById(R.id.homeButtonIndividual);
        signUpButtonIndividual = (Button)findViewById(R.id.signUpButtonIndividual);
        UsernameEt = (EditText)findViewById(R.id.emailMobIndividual);
        PasswordEt = (EditText)findViewById(R.id.passwordIndividual);

        homeButtonIndividual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignIn_individual.this,IndividualActivity.class);
                startActivity(intent);
            }
        });
        signUpButtonIndividual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignIn_individual.this,SignUp_individual.class);
                startActivity(intent);
            }
        });
    }

    public void OnLogin(View view) {
//           Intent intent = new Intent(SignIn_individual.this,Menu_Individual.class);
//           startActivity(intent);
        Log.v("login value","hello");
        String username = UsernameEt.getText().toString();
        String password = PasswordEt.getText().toString();
        String type = "login";
        if(TextUtils.isEmpty(username) && TextUtils.isEmpty(password)){
            Toast.makeText(this,"Please enter username & password!",Toast.LENGTH_LONG).show();
        }else if(TextUtils.isEmpty(password)){
            Toast.makeText(this,"Please enter password!",Toast.LENGTH_LONG).show();
        }else if(TextUtils.isEmpty(password)){
            Toast.makeText(this,"Please enter password correctly!",Toast.LENGTH_LONG).show();
        }else{
            BackgroundWorker backgroundWorker = new BackgroundWorker(this);
            backgroundWorker.execute(type, username, password);
        }
    }
}

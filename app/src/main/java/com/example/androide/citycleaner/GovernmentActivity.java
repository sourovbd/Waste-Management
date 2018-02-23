package com.example.androide.citycleaner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GovernmentActivity extends AppCompatActivity {

    Button singInButtonGovernment;
    Button signUpButtonGovernment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_government);

        singInButtonGovernment = (Button)findViewById(R.id.singInButtonGovernment);
        signUpButtonGovernment = (Button)findViewById(R.id.signUpButtonGovernment);

        singInButtonGovernment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GovernmentActivity.this,SignIn_government.class);
                startActivity(intent);
            }
        });
        signUpButtonGovernment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GovernmentActivity.this,SignUp_government.class);
                startActivity(intent);
            }
        });
    }
}

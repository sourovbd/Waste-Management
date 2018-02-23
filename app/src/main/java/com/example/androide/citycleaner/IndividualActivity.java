package com.example.androide.citycleaner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IndividualActivity extends AppCompatActivity {

    Button singInButtonIndividual;
    Button signUpButtonIndividual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual);

        singInButtonIndividual = (Button)findViewById(R.id.singInButtonIndividual);
        signUpButtonIndividual = (Button)findViewById(R.id.signUpButtonIndividual);

        singInButtonIndividual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndividualActivity.this,SignIn_individual.class);
                startActivity(intent);
            }
        });
        signUpButtonIndividual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndividualActivity.this,SignUp_individual.class);
                startActivity(intent);
            }
        });
    }
}





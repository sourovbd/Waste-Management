package com.example.androide.citycleaner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.text.TextUtils;
import android.widget.Toast;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUp_individual extends AppCompatActivity {
    EditText Name, Email,Username,Password,ContactNo,Address,NID,Gender;
    Button homeButtonIndividual;
    Button singInButtonIndividual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_individual);

        homeButtonIndividual = (Button)findViewById(R.id.homeButtonIndividual);
        singInButtonIndividual = (Button)findViewById(R.id.singInButtonIndividual);
        Name = (EditText)findViewById(R.id.name);
        Email = (EditText)findViewById(R.id.email);
        Username = (EditText)findViewById(R.id.username);
        Password = (EditText)findViewById(R.id.password);
        ContactNo = (EditText)findViewById(R.id.contactNo);
        Address = (EditText)findViewById(R.id.address);
        NID = (EditText)findViewById(R.id.nid);
        Gender = (EditText)findViewById(R.id.gender);

        homeButtonIndividual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp_individual.this,IndividualActivity.class);
                startActivity(intent);
            }
        });
        singInButtonIndividual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp_individual.this,SignIn_individual.class);
                startActivity(intent);
            }
        });
    }
    public void OnReg(View view) {
        Log.v("login value","hello");
        String name = Name.getText().toString();
        String email = Email.getText().toString();
        String username = Username.getText().toString();
        String password = Password.getText().toString();
        String contactNo = ContactNo.getText().toString();
        String address = Address.getText().toString();
        String nid = NID.getText().toString();
        String gender = Gender.getText().toString();
        String type = "register";
        if(TextUtils.isEmpty(name) && TextUtils.isEmpty(email) && TextUtils.isEmpty(username)
                && TextUtils.isEmpty(password) && TextUtils.isEmpty(contactNo) && TextUtils.isEmpty(address)
                && TextUtils.isEmpty(nid) && TextUtils.isEmpty(gender)){
            Toast.makeText(this,"Please fill up all fields!",Toast.LENGTH_LONG).show();
        }else if(TextUtils.isEmpty(name)){
            Toast.makeText(this,"Please enter name!",Toast.LENGTH_LONG).show();
        }else if(TextUtils.isEmpty(email)){
            Toast.makeText(this,"Please enter email!",Toast.LENGTH_LONG).show();
        }else if(TextUtils.isEmpty(username)){
            Toast.makeText(this,"Please enter username!",Toast.LENGTH_LONG).show();
        }else if(TextUtils.isEmpty(password)){
            Toast.makeText(this,"Please enter password!",Toast.LENGTH_LONG).show();
        }else if(TextUtils.isEmpty(contactNo)){
            Toast.makeText(this,"Please enter contactNo!",Toast.LENGTH_LONG).show();
        }else if(TextUtils.isEmpty(address)){
            Toast.makeText(this,"Please enter address!",Toast.LENGTH_LONG).show();
        }else if(TextUtils.isEmpty(nid)){
            Toast.makeText(this,"Please enter nid!",Toast.LENGTH_LONG).show();
        }else if(TextUtils.isEmpty(gender)){
            Toast.makeText(this,"Please enter gender!",Toast.LENGTH_LONG).show();
        }else{
            BackgroundWorker_Registration backgroundWorker_Registration = new BackgroundWorker_Registration(this);
            backgroundWorker_Registration.execute(type, name, email, username, password, contactNo, address, nid, gender);
        }
    }
}

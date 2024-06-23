package com.example.mybarapp.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.mybarapp.MainActivity;
import com.example.mybarapp.R;

// LoginActivity class represents the activity for user login
public class LoginActivity extends AppCompatActivity {

    @Override
    // onCreate method is called when the activity is first created
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content view to the layout defined in activity_login.xml
        setContentView(R.layout.activity_login);

    }

    // Method triggered when the "Register" button is clicked
    public void register(View view) {

        // Start the RegistrationActivity when the Register button is clicked
        startActivity(new Intent(LoginActivity.this, RegistationActivity.class));
    }

    // Method triggered when the "Main Activity" button is clicked
    public void mainActivity(View view) {

        // Start the MainActivity when the Main Activity button is clicked
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
    }
}
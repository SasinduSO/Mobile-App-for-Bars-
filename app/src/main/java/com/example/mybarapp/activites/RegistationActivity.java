package com.example.mybarapp.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.mybarapp.MainActivity;
import com.example.mybarapp.R;

// RegistrationActivity class represents the activity for user registration
public class RegistationActivity extends AppCompatActivity {

    @Override
    // onCreate method is called when the activity is first created
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content view to the layout defined in activity_registration.xml
        setContentView(R.layout.activity_registation);
    }

    // Method triggered when the "Login" button is clicked
    public void login(View view) {

        // Start the LoginActivity when the Login button is clicked
        startActivity(new Intent(RegistationActivity.this, LoginActivity.class));
    }

    // Method triggered when the "Main Activity" button is clicked
    public void mainActivity(View view) {

        // Start the MainActivity when the Main Activity button is clicked
        startActivity(new Intent(RegistationActivity.this, MainActivity.class));
    }
}
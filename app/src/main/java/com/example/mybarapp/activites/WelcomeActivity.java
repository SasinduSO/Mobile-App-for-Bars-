package com.example.mybarapp.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.mybarapp.R;

// WelcomeActivity class represents the welcome screen of the application
public class WelcomeActivity extends AppCompatActivity {

    @Override
    // onCreate method is called when the activity is first created
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Request no title bar for the activity
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        // Set the window to be in fullscreen mode
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Set the content view to the layout defined in activity_welcome.xml
        setContentView(R.layout.activity_welcome);
    }

    // Method triggered when the "Register" button is clicked
    public void register(View view) {

        // Start the RegistrationActivity when the Register button is clicked
        startActivity(new Intent(WelcomeActivity.this, RegistationActivity.class));
    }

    // Method triggered when the "Login" button is clicked
    public void login(View view) {

        // Start the RegistrationActivity when the Login button is clicked
        startActivity(new Intent(WelcomeActivity.this,RegistationActivity.class));
    }
}
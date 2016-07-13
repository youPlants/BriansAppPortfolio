package com.example.android.briansappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void showToastMessage(String text) {
        Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
    }
//Temporarily displays a toast message, inventially will house an intent for the Popular Movies App
    public void popularMoviesApp(View view) {
        showToastMessage("This button will launch the Popular Movies App");
    }
    //Temporarily displays a toast message, inventially will house an intent for the Stock Hawk App
    public void stock_hawk_app(View view) {
        showToastMessage("This button will launch the Stock Hawk App");
    }
    //Temporarily displays a toast message, inventially will house an intent for the Build It Bigger App
    public void buildItBigger(View view) {
        showToastMessage("This button will launch the Build It Bigger App");
    }
    //Temporarily displays a toast message, inventially will house an intent for the Make Your App Material
    public void makeAppMaterial(View view) {
        showToastMessage("This button will launch the Make Your App Material App");
    }
    //Temporarily displays a toast message, inventially will house an intent for the Go Ubiquitous App
    public void goUbiquitous(View view) {
        showToastMessage("This button will launch the Go Ubiquitous App");
    }
    //Temporarily displays a toast message, inventially will house an intent for the Custom Capstone App
    public void capstone(View view) {
        showToastMessage("This button will launch the Capstone App");
    }
}


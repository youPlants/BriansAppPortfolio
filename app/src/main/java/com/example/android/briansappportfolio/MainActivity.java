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
    public void popularMoviesApp (View view) {
      Toast.makeText(MainActivity.this, "This button will launch the popular movies app", Toast.LENGTH_SHORT).show();
        return;
    }
    public void stock_hawk_app (View view) {
        Toast.makeText(MainActivity.this, "This button will launch the Stock Hawk App", Toast.LENGTH_SHORT).show();
        return;
    }
    public void buildItBigger (View view) {
        Toast.makeText(MainActivity.this, "This button will launch the Build It Bigger App", Toast.LENGTH_SHORT).show();
        return;
    }
    public void makeAppMaterial (View view) {
        Toast.makeText(MainActivity.this, "This button will launch the Make Your App Material App", Toast.LENGTH_SHORT).show();
        return;
    }
    public void goUbiquitous (View view) {
        Toast.makeText(MainActivity.this, "This button will launch the Go Ubiquitous App", Toast.LENGTH_SHORT).show();
        return;
    }
    public void capstone (View view) {
        Toast.makeText(MainActivity.this, "This button will launch the Capstone App", Toast.LENGTH_SHORT).show();
        return;
    }
}


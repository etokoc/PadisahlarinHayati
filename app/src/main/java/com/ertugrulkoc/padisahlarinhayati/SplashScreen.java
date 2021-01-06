package com.ertugrulkoc.padisahlarinhayati;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SplashScreen extends AppCompatActivity {
    ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        imageButton = findViewById(R.id.imageButton);
    }

    public void start(View view){
        Intent intent = new Intent(this,MainActivity.class);
        finish();
        startActivity(intent);

    }
}
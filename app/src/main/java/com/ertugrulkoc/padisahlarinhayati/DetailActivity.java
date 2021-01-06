package com.ertugrulkoc.padisahlarinhayati;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import static com.ertugrulkoc.padisahlarinhayati.MainActivity.secilmisResim;

public class DetailActivity extends AppCompatActivity {
    TextView textView;
    TextView hayatText;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        textView = findViewById(R.id.textView_Padisah_ad);
        hayatText = findViewById(R.id.hayatText);
        imageView = findViewById(R.id.imageViewPadisah);

        Intent intent = getIntent();
        String padisahAd = intent.getStringExtra("PadisahAd");
        textView.setText(padisahAd);
        String hayat = intent.getStringExtra("PadisahHayat");
        hayatText.setText(hayat);
        imageView.setImageBitmap(secilmisResim);
    }
}
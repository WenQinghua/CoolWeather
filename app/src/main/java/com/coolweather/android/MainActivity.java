package com.coolweather.android;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences preferences = getSharedPreferences("weather", Context.MODE_PRIVATE);
        String weatherString = preferences.getString("weather", null);
        if (weatherString != null) {
            Intent intent = new Intent(this, WeatherActivity.class);
//            Toast.makeText(getApplicationContext(), weatherString, Toast.LENGTH_SHORT).show();
            startActivity(intent);
            finish();
        }
    }
}
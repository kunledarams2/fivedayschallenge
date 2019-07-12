package com.e.alc4phase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.e.alc4phase1.Activity.About_ALC;
import com.e.alc4phase1.Activity.Profile;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void about_Alc(View view) {
        Intent intent =new Intent(this, About_ALC.class);
        startActivity(intent);
    }

    public void my_Profile(View view) {

        Intent intent =new Intent(this, Profile.class);
        startActivity(intent);
    }
}

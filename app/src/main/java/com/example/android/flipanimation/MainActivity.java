package com.example.android.flipanimation;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void flipView(View view){

    }
    void gotoPhone1(View v){
        Intent phoneActivity = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"9125825698"));
        startActivity(phoneActivity);

    }
}

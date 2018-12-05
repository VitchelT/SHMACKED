package com.alwaysexpected.its.shmacked;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    // INTENTS (shmackedonmap = INDICATE THAT USER IS SHMACKED IN LOCATION,       )


public void shmackedonmap(View view) {
    Intent shmackedonmap = new Intent(this,MapsActivity.class);
    startActivity(shmackedonmap);



}



}

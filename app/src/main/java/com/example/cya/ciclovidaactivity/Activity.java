package com.example.cya.ciclovidaactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_);
        Log.i("CicloVida", "onCreate");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("CicloVida", "onDestroy");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("CicloVida", "onStart");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i("CicloVida", "onStop");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("CicloVida", "onRestart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i("CicloVida", "onResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i("CicloVida", "onPause");
    }
}

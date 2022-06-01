package com.example.horizontalscrollapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG ="rony" ;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= findViewById(R.id.button);
        Log.d(TAG, "This app is working properly");
        //Log.e(TAG, "This app is error");
        button.setOnClickListener(new View.OnClickListener() {
            private static final String TAG = "rony";

            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "There is a click on this button ", Toast.LENGTH_SHORT).show();

                Log.d(TAG, "This button is working properly");


            }
        });
    }
}
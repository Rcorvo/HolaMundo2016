package com.example.raulcorvo.holamundo2016;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("Hola Mundo", "Estamos en onCreate");
        super.onCreate(savedInstanceState);
        Object o = null;
        o.toString();
        setContentView(R.layout.activity_main);
    }
}

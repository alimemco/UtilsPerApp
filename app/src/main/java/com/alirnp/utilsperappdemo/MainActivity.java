package com.alirnp.utilsperappdemo;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.alirnp.utilsperapp.base.UtilsPerApp;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UtilsPerApp.config();

        boolean connected = UtilsPerApp.isConnected(this);
        String status = connected ? "connected" : "error connection";

        Toast.makeText(this, status+" (checked with framework)", Toast.LENGTH_SHORT).show();


    }
}

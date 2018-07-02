package com.example.wydnn.firsttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 private  String Temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Temp="汪耀东";
        android.widget.Toast.makeText(MainActivity.this,"你好啊", Toast.LENGTH_SHORT).show();
    }
}

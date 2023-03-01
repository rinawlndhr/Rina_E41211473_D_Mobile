package com.example.minggu_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void menu1(View view) {
        Intent intent = new Intent(MainActivity.this, LiniearActivity.class);
        startActivity(intent);
    }

    public void menu2(View view) {
        Intent intent = new Intent(MainActivity.this, RelativeActivity.class);
        startActivity(intent);
    }

    public void menu3(View view) {
        Intent intent = new Intent(MainActivity.this, ConstraintActivity.class);
        startActivity(intent);
    }

    public void menu4(View view) {
        Intent intent = new Intent(MainActivity.this, FrameActivity.class);
        startActivity(intent);
    }

    public void menu5(View view) {
        Intent intent = new Intent(MainActivity.this, TableActivity.class);
        startActivity(intent);
    }

    public void menu6(View view) {
        Intent intent = new Intent(MainActivity.this, DesignActivity.class);
        startActivity(intent);
    }

    public void menu7(View view) {
        Intent intent = new Intent(MainActivity.this, ScrollViewActivity.class);
        startActivity(intent);
    }

    public void menu8(View view) {
        Intent intent = new Intent(MainActivity.this, ScrollView2Activity.class);
        startActivity(intent);
    }
}
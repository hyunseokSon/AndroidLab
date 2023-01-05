package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout linear = new LinearLayout(this);

        Button btn = new Button(this);
        btn.setText("버튼 1");
        linear.addView(btn);

        Button btn2 = new Button(this);
        btn2.setText("버튼 2");
        linear.addView(btn2);

        setContentView(linear);
    }
}
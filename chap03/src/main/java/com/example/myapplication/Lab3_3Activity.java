package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class Lab3_3Activity extends AppCompatActivity {

    Button trueBtn;
    TextView targetTextView;
    Button falseBtn;
    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3_3);

        //View 객체 획득
        trueBtn = findViewById(R.id.btn_visible_true);
        targetTextView = findViewById(R.id.text_visible_target);
        falseBtn = findViewById(R.id.btn_visible_false);

        checkBox = findViewById(R.id.checkbox);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    checkBox.setText("is Checked");
                } else {
                    checkBox.setText("is unChecked");
                }
            }
        });
    }
}

//    //버튼 이벤트 콜백함수
//    @Override
//    public void onClick(View v) {
//        if(v==trueBtn)
//        {
//            //trueBtn이 눌리면 targetTextView를 visible 상태로 변경.
//            targetTextView.setVisibility(v.VISIBLE);
//        }
//        else if (v==falseBtn)
//        {
//            //falseBtn 눌리면 targetTextView를 invisible 상태로 변경
//            targetTextView.setVisibility(v.INVISIBLE);
//        }
//    }
//}
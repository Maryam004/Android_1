package com.example.screen3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText calculation,result;
private String curr,res;
private Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
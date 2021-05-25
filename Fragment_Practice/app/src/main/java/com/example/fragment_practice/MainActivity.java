package com.example.fragment_practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_SignIn,btn_SignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_SignIn=findViewById(R.id.signIn);
        btn_SignUp=findViewById(R.id.signUp);
        btn_SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             FragmentManager fm=getSupportFragmentManager();
             fm.beginTransaction().replace(R.id.holder,new Sign_In_Fragment());
            }
        });
    }
}
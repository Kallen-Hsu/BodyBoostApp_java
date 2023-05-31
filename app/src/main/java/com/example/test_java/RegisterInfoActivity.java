package com.example.test_java;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterInfoActivity extends AppCompatActivity{
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_register_info);
            Button finishButton = (Button) findViewById(R.id.finish);
            finishButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setClass(RegisterInfoActivity.this,MainActivity.class);
                    startActivity(intent);
                    Toast toast = Toast.makeText(RegisterInfoActivity.this,"註冊成功", Toast.LENGTH_LONG);
                    toast.show();
                }
            });


        }

}

package com.example.gasanimal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView t1, t2;
    private EditText ed_login, ed_parol;
    private Button btn_list2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed_login = findViewById(R.id.ed_login);
        ed_parol = findViewById(R.id.ed_parol);
        btn_list2 = findViewById(R.id.btn_list2);




    }

    public void setClik(View view) {
       Intent intent = new Intent(MainActivity.this,MainActivity2.class);
       startActivity(intent);
    }
}
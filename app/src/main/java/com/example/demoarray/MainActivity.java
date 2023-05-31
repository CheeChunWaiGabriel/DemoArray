package com.example.demoarray;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView tv;
    String[] fruits;


    String txt="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.Textbox);
        fruits=new String[3];
        fruits[0]="apple";
        fruits[1]="banana";
        fruits[2]="cherry";
        txt+="Fruits"+"\n";
        txt+="====="+"\n";
        for (int i=0; i<fruits.length; i++){
            txt+=fruits[i]+"\n";
        }
        tv.setText(txt);


    }
}

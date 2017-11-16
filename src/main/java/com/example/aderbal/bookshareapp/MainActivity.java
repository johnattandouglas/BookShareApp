package com.example.aderbal.bookshareapp;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void handleTv1click() {
        Intent tv1intent = new Intent();
        tv1intent.setComponent(new ComponentName("com.example.aderbal.bookshareapp", "com.example.aderbal.bookshareapp.ForgotPassword"));
        setResult(Activity.RESULT_OK, tv1intent);
        startActivity(tv1intent);
    }

    public void handleTv2click() {
        Intent tv2intent = new Intent();
        tv2intent.setComponent(new ComponentName("com.example.aderbal.bookshareapp", "com.example.aderbal.bookshareapp.CreateAccount"));
        setResult(Activity.RESULT_OK, tv2intent);
        startActivity(tv2intent);
    }

    public void handleB1click() {
        Intent b1intent = new Intent();
        b1intent.setComponent(new ComponentName("com.example.aderbal.bookshareapp", "com.example.aderbal.bookshareapp.Home"));
        setResult(Activity.RESULT_OK, b1intent);
        startActivity(b1intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv1 = (TextView) findViewById(R.id.textView4);
        tv1.setOnClickListener(
            new View.OnClickListener(){
                public void onClick(View v) {
                    handleTv1click();
                }
            }
        );

        TextView tv2 = (TextView) findViewById(R.id.textView5);
        tv2.setOnClickListener(
            new View.OnClickListener(){
                public void onClick(View v) {
                    handleTv2click();
                }
            }
        );

        Button b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener(
            new View.OnClickListener(){
                public void onClick(View v) {
                    handleB1click();
                }
            }
        );
    }
}

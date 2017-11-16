package com.example.aderbal.bookshareapp;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    public void handleB16click() {
        Intent b16intent = new Intent();
        b16intent.setComponent(new ComponentName("com.example.aderbal.bookshareapp", "com.example.aderbal.bookshareapp.ManageFriends"));
        setResult(Activity.RESULT_OK, b16intent);
        startActivity(b16intent);
    }

    public void handleB17click() {
        Intent b17intent = new Intent();
        b17intent.setComponent(new ComponentName("com.example.aderbal.bookshareapp", "com.example.aderbal.bookshareapp.ManageCollection"));
        setResult(Activity.RESULT_OK, b17intent);
        startActivity(b17intent);
    }

    public void handleB18click() {
        Intent b18intent = new Intent();
        b18intent.setComponent(new ComponentName("com.example.aderbal.bookshareapp", "com.example.aderbal.bookshareapp.Loans"));
        setResult(Activity.RESULT_OK, b18intent);
        startActivity(b18intent);
    }

    public void handleB19click() {
        Intent b19intent = new Intent();
        b19intent.setComponent(new ComponentName("com.example.aderbal.bookshareapp", "com.example.aderbal.bookshareapp.Reminders"));
        setResult(Activity.RESULT_OK, b19intent);
        startActivity(b19intent);
    }

    public void handleB20click() {
        Intent b20intent = new Intent();
        b20intent.setComponent(new ComponentName("com.example.aderbal.bookshareapp", "com.example.aderbal.bookshareapp.PublicLibrary"));
        setResult(Activity.RESULT_OK, b20intent);
        startActivity(b20intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button b16 = (Button) findViewById(R.id.button16);
        b16.setOnClickListener(
            new View.OnClickListener(){
                public void onClick(View v) {
                    handleB16click();
                }
            }
        );

        Button b17 = (Button) findViewById(R.id.button17);
        b17.setOnClickListener(
            new View.OnClickListener(){
                public void onClick(View v) {
                    handleB17click();
                }
            }
        );

        Button b18 = (Button) findViewById(R.id.button18);
        b18.setOnClickListener(
            new View.OnClickListener(){
                public void onClick(View v) {
                    handleB18click();
                }
            }
        );

        Button b19 = (Button) findViewById(R.id.button19);
        b19.setOnClickListener(
            new View.OnClickListener(){
                public void onClick(View v) {
                    handleB19click();
                }
            }
        );

        Button b20 = (Button) findViewById(R.id.button20);
        b20.setOnClickListener(
            new View.OnClickListener(){
                public void onClick(View v) {
                    handleB20click();
                }
            }
        );
    }
}

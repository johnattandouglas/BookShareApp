package com.example.aderbal.bookshareapp;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ManageCollection extends AppCompatActivity {

    public void handleB5click() {
        Intent b5intent = new Intent();
        b5intent.setComponent(new ComponentName("com.example.aderbal.bookshareapp", "com.example.aderbal.bookshareapp.ManageBooks"));
        setResult(Activity.RESULT_OK, b5intent);
        startActivity(b5intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_collection);

        Button b5 = (Button) findViewById(R.id.button5);
        b5.setOnClickListener(
            new View.OnClickListener(){
                public void onClick(View v) {
                    handleB5click();
                }
            }
        );
    }
}

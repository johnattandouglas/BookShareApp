package com.example.aderbal.bookshareapp;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ManageFriends extends AppCompatActivity {

    public void handleB22click() {
        Intent b22intent = new Intent();
        b22intent.setComponent(new ComponentName("com.example.aderbal.bookshareapp", "com.example.aderbal.bookshareapp.FriendCollection"));
        setResult(Activity.RESULT_OK, b22intent);
        startActivity(b22intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_friends);

        Button b22 = (Button) findViewById(R.id.button22);
        b22.setOnClickListener(
            new View.OnClickListener(){
                public void onClick(View v) {
                    handleB22click();
                }
            }
        );
    }
}

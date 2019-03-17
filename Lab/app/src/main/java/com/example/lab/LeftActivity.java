package com.example.lab;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static android.view.View.*;

public class LeftActivity extends AppCompatActivity {
    private Button _next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialization();
        addEvents();
    }

    private void initialization(){
        this._next = (Button)findViewById(R.id.next_button);
    }

    private void addEvents(){
        _next.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainActivity = new Intent(LeftActivity.this, MainActivity.class);
                startActivity(mainActivity);
            }
        });
    }
}

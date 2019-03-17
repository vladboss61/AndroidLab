package com.example.lab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button _next;
    private Button _previous;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialization();
        addEvents();
    }

    private void initialization(){
        this._next = (Button)findViewById(R.id.next_button);
        this._previous = (Button)findViewById(R.id.previous_button);
    }

    private void addEvents(){
        _next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rightActivity = new Intent(MainActivity.this, RightActivity.class);
                startActivity(rightActivity);
            }
        });

        _previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent leftActivity = new Intent(MainActivity.this, LeftActivity.class);
                startActivity(leftActivity);
            }
        });
    }
}

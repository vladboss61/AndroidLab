package com.example.lab;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class RightActivity extends AppCompatActivity {
    private Button _previous;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialization();
        addEvents();
    }

    private void initialization(){
        this._previous = (Button)findViewById(R.id.previous_button);
    }

    private void addEvents(){
        _previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainActivity = new Intent(RightActivity.this, MainActivity.class);
                startActivity(mainActivity);
            }
        });
    }
}

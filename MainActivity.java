package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView electronics = (TextView) findViewById(R.id.electronics);

        electronics.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent electronicsIntent = new Intent(MainActivity.this,ElectronicActivity.class);
                startActivity(electronicsIntent);
            }
        });
    }
}

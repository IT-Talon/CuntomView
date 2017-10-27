package com.talon.cuntomview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private DialView dialView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dialView = findViewById(R.id.dialView);
        dialView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialView.setCreditValueWithAnim(new Random().nextInt(950 - 350) + 350);
            }
        });
    }
}

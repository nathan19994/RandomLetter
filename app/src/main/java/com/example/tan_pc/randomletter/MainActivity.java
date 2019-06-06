package com.example.tan_pc.randomletter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Generate;
        final TextView DisplayLetter;
        Generate = (Button)findViewById(R.id.BTNGenerate);
        DisplayLetter = (TextView) findViewById(R.id.TXTLetter);
        Generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String letters ="abcdefghijklmnopqrstuvwxyz";
                int random = new Random().nextInt(26);

                DisplayLetter.setText(String.valueOf(letters.charAt(random)));



            }
        });

    }
}

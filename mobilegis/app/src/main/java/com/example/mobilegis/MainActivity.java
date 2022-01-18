package com.example.mobilegis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnshowmap, btnshowdata, btninputdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnshowmap = (Button) findViewById(R.id.btnShowmap);
        btnshowdata = (Button) findViewById(R.id.btnShowdata);
        btninputdata =(Button) findViewById(R.id.btnInputdata);

        //memberikan asksi ketika button di klik

        btnshowmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ShowMap.class);
                startActivity(intent);
            }
        });

        btnshowdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListPeternakan.class);
                startActivity(intent);
            }
        });

        btninputdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, InputPeternakan.class);
                startActivity(intent);
            }
        });

    }
}
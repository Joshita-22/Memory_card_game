package com.example.mem_card;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {
private Button single_player;
private Button multi_player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        single_player=(Button) findViewById(R.id.single_player);
        multi_player=(Button) findViewById(R.id.multi_player);
        single_player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent it1=new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(it1);
            }


        });
        multi_player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(it);

            }
        });
    }


}
package com.example.testbed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

public class ending extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ending);
        TextView tv1 = (TextView) findViewById(R.id.textView3);
        int x = getIntent().getIntExtra("x", 0);
        ImageButton undo = (ImageButton)findViewById(R.id.undo);
        ImageButton start = (ImageButton)findViewById(R.id.start);
        undo.setOnClickListener(view ->
        {Intent intent2 = new Intent(ending.this,MainActivity.class);
            startActivity(intent2);


        });
        start.setOnClickListener(view ->
        {Intent intent = new Intent(ending.this,gamepart1.class);
            startActivity(intent);


        });
        if (x > 0) {
            tv1.setText("After assembling the map, she manages to find her way home, learning that with willpower, perserverance and resourcefulness, she will be able to overcome most challenges");
        } else {
            tv1.setText("One day,  Joyce was being nagged by her mother to start doing her school homework. Trying to escape, she ran out of her house and accidentally fell into a hole and knocked herself out. /n" +
                "After she woke up, she found herself in an unfamiliar environment, much resembling wonderland. Wanting to get home, she sees three points where she can look for clues.");

        }
    }
}
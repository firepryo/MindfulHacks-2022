package com.example.testbed;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

public class gamepart1 extends AppCompatActivity {
                 int x=1;
    static int y=0;
    static int z=0;
    static int q=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamepart1);
        ImageButton undo = (ImageButton)findViewById(R.id.undo);

        ImageButton anthill = (ImageButton)findViewById(R.id.anthill);
        ImageButton waterpool = (ImageButton)findViewById(R.id.waterpool);
        ImageButton ending = (ImageButton)findViewById(R.id.ending);

        ImageButton tightrope = (ImageButton)findViewById(R.id.tightrope);
        ImageView character=findViewById(R.id.character);
        if (y == 1&&z==1&&q==1) {
            ending.setImageResource(R.drawable.end);

        }
        undo.setOnClickListener(view ->
        {Intent intent2 = new Intent(gamepart1.this,MainActivity.class);

            startActivity(intent2);


        });
        ending.setOnClickListener(view -> {
                    if (y == 1&&z==1&&q==1) {
                        Intent intent1 = new Intent(gamepart1.this, ending.class);
                        intent1.putExtra("x", 3);
                        startActivity(intent1);
                    }
                });
        anthill.setOnClickListener(view -> {
            q=1;
            ObjectAnimator animation = ObjectAnimator.ofFloat(character, "translationX", -600f);
            animation.setDuration(1500);
            animation.start();
            final Handler handler1 = new Handler();
            handler1.postDelayed(() -> {
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(character, "translationY", 400f);
                animation1.setDuration(1500);
                animation1.start();
            }, 1500);

            final Handler handler = new Handler();
            handler.postDelayed(() -> {
                Intent intent = new Intent(gamepart1.this,gamepart1process.class);
                intent.putExtra("x", 1);
                startActivity(intent);
            }, 3000);

        });
        waterpool.setOnClickListener(view -> {
            y=1;
            ObjectAnimator animation = ObjectAnimator.ofFloat(character, "translationX", 600f);
            animation.setDuration(1500);
            animation.start();
            final Handler handler1 = new Handler();
            handler1.postDelayed(() -> {
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(character, "translationY", 400f);
                animation1.setDuration(1500);
                animation1.start();
            }, 1500);
            final Handler handler = new Handler();
            handler.postDelayed(() -> {
                Intent intent = new Intent(gamepart1.this,gamepart1process.class);
                intent.putExtra("x", 3);
                startActivity(intent);
            }, 3000);

        });
        tightrope.setOnClickListener(view -> {
            z=1;
            ObjectAnimator animation = ObjectAnimator.ofFloat(character, "translationX", 600f);
            animation.setDuration(1500);
            animation.start();
            final Handler handler1 = new Handler();
            handler1.postDelayed(() -> {
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(character, "translationY", -500f);
                animation1.setDuration(1500);
                animation1.start();
            }, 1500);

            final Handler handler = new Handler();
            handler.postDelayed(() -> {
                Intent intent = new Intent(gamepart1.this,gamepart1process.class);
                intent.putExtra("x", 2);
                startActivity(intent);
            }, 3000);

        });
    }
}
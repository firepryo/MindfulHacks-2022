package com.example.testbed;
import android.os.Handler;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView character=findViewById(R.id.character);
        ImageButton minigame = (ImageButton)findViewById(R.id.minigame);
        ImageButton chatbot = (ImageButton)findViewById(R.id.chatbot);
        ImageButton therapy = (ImageButton)findViewById(R.id.therapy);


        minigame.setOnClickListener(view -> {
            ObjectAnimator animation = ObjectAnimator.ofFloat(character, "translationX", 800f);
            animation.setDuration(3000);
            animation.start();
            Intent intent = new Intent(MainActivity.this,ending.class);

            final Handler handler = new Handler();
            handler.postDelayed(() -> {
                // Do something after 5s = 5000ms
                startActivity(intent);
            }, 3000);

        });
        chatbot.setOnClickListener(view -> {
            ObjectAnimator animation = ObjectAnimator.ofFloat(character, "translationX", -800f);
            animation.setDuration(3000);
            animation.start();
            Intent intent = new Intent(MainActivity.this,chatbotmain.class);

            final Handler handler = new Handler();
            handler.postDelayed(() -> {
                // Do something after 5s = 5000ms
                startActivity(intent);
            }, 3000);

        });
        therapy.setOnClickListener(view -> {
            ObjectAnimator animation = ObjectAnimator.ofFloat(character, "translationY", 400f);
            animation.setDuration(3000);
            animation.start();
            Intent intent = new Intent(MainActivity.this,therapymain.class);

            final Handler handler = new Handler();
            handler.postDelayed(() -> {
                // Do something after 5s = 5000ms
                startActivity(intent);
            }, 3000);

        });




    }
}
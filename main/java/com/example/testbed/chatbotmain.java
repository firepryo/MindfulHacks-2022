package com.example.testbed;

import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

import io.kommunicate.KmConversationBuilder;
import io.kommunicate.Kommunicate;
import io.kommunicate.callbacks.KmCallback;

public class chatbotmain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Kommunicate.init(chatbotmain.this, "1a6a885dfdc74802ceee77fb10054dc5a");
        setContentView(R.layout.activity_chatbotmain);
        ImageButton undo = (ImageButton)findViewById(R.id.undo);

        undo.setOnClickListener(view -> {

            Intent intent = new Intent(chatbotmain.this,MainActivity.class);

            final Handler handler = new Handler();
            handler.postDelayed(() -> {
                // Do something after 5s = 5000ms
                startActivity(intent);
            }, 100);

        });
        Kommunicate.openConversation(chatbotmain.this);
        new KmConversationBuilder(chatbotmain.this)
                .setSingleConversation(false) // Pass false if you would like to create new conversation every time user starts a conversation. This is true by default which means only one conversation will open for the user every time the user starts a conversation.
                .createConversation(new KmCallback() {
                    @Override
                    public void onSuccess(Object message) {
                        String conversationId = message.toString();
                    }

                    @Override
                    public void onFailure(Object error) {
                        Log.d("ConversationTest", "Error : " + error);
                    }
                });
    }
}
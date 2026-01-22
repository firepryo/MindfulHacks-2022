package com.example.testbed;

import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageButton;

public class therapymain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_therapymain);
        MyListData[] myListData = new MyListData[] {
                new MyListData("Caroline Ho\n Specialises in: autism, fears & phobias,  & LGBTQIA+ issues.",R.drawable.caroline),
                new MyListData("Glennamarie Meenachi\n Specialises in: mood issues, bipolar disorder,", R.drawable.glennamarie),
                new MyListData("Abigail Yang\nSpecialises in:separation, grief (incl anticipatory loss), non-death loss, end of life", R.drawable.abigail_final_platform_pic_1),
                new MyListData("Punitha Gunasegaran\nSpecialises in:couples therapy, self-harm, addictions, trauma and PTSD,", R.drawable.punitha),
                new MyListData("Lilian Ong\nSpecialises in: pregnancy & postnatal-related issues, anger management", R.drawable.lilian_profile_image),
                new MyListData("Maltrish Kaur\nSpecialises in:anxiety, depression, work or academic stress, burnout, relationship problems", R.drawable.maltrish_platform),
                new MyListData("Lenca Yew\nSpecialises in:anxiety, depression, self-esteem, work-related stress, grief", R.drawable.lencayew),
                new MyListData("Joseph Quek\nSpecialises in:depression, mood instability, work stress, burnout, BPD, health issues", R.drawable.joseph),
        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(therapymain.this));
        recyclerView.setAdapter(adapter);
        ImageButton undo = (ImageButton)findViewById(R.id.undo);
        undo.setOnClickListener(view -> {

            Intent intent = new Intent(therapymain.this,MainActivity.class);

            final Handler handler = new Handler();
            handler.postDelayed(() -> {
                // Do something after 5s = 5000ms
                startActivity(intent);
            }, 100);

        });
    }

}
package com.example.testbed;

import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class gamepart1process extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamepart1process);
        int x = getIntent().getIntExtra("x", 1);
        ImageButton undo = (ImageButton) findViewById(R.id.undo);
        TextView tv1 = (TextView) findViewById(R.id.textView2);

        ConstraintLayout layout = (ConstraintLayout) this.findViewById(R.id.background);


        undo.setOnClickListener(view -> {

            Intent intent = new Intent(gamepart1process.this, gamepart1.class);

            final Handler handler = new Handler();
            handler.postDelayed(() -> {
                // Do something after 5s = 5000ms
                startActivity(intent);
            }, 100);

        });


            if (x == 1) {
                layout.setBackgroundResource(R.drawable.anthill);
                tv1.setText("Joyce decided to follow the ants in the hopes that they will lead her out of the endless fields of grass.\n" +
                        "After 20 minutes, Joyce's hopes started to waver, but she carried on.\n" +
                        "While the ants did not lead her out, she found a map piece.  \n" +
                        "Joyce then peered to… \n");
                tv1.setTextColor(getResources().getColor(R.color.white));
                Intent intent = new Intent(gamepart1process.this,gamepart1.class);
                intent.putExtra("y", 1);


            }
            if (x == 2) {
                layout.setBackgroundResource(R.drawable.tightrope1);
                tv1.setText("A tight rope appeared in her path.Even with her fear of heights, Joyce took a breath, and pictured  being at the center of the spotlight.\n" +
                        "Through force of will, she crossed the tightrope and found a map piece. \n");
                tv1.setTextColor(getResources().getColor(R.color.white));


            }
            if (x == 3) {


                layout.setBackgroundResource(R.drawable.puddle);
                tv1.setText("Joyce gathers the things around in her vicinity and builds a raft. She gets onto the raft and starts paddling the water with a makeshift paddle to push the raft to get to the other side. .. \n" +
                        "Joyce still sees no end in sight… except for a map piece ");
                tv1.setTextColor(getResources().getColor(R.color.black));

            }


    }
}


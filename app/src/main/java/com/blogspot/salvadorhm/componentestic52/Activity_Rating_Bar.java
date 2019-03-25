package com.blogspot.salvadorhm.componentestic52;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class Activity_Rating_Bar extends AppCompatActivity {
    RatingBar ratingBar;

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__rating__bar);
        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        ratingBar.setMax(5);

        button = (Button) findViewById(R.id.button);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(Activity_Rating_Bar.this, "Stars: "+rating, Toast.LENGTH_SHORT).show();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                
                Toast.makeText(Activity_Rating_Bar.this, "Stars:", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

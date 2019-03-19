package com.blogspot.salvadorhm.componentestic52;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class Activity_CheckBox extends AppCompatActivity {
    CheckBox ch1, ch2, ch3;
    ImageView iv1, iv2, iv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__check_box);

        ch1= findViewById(R.id.checkBox1);
        ch2= findViewById(R.id.checkBox2);
        ch3= findViewById(R.id.checkBox3);

        iv1= findViewById(R.id.imageView1);
        iv2= findViewById(R.id.imageView2);
        iv3= findViewById(R.id.imageView3);
    }

    public void mostrar (View view){
        iv1.setImageResource(R.drawable.img4);
        iv2.setImageResource(R.drawable.img4);
        iv3.setImageResource(R.drawable.img4);

        if (ch1.isChecked()==true){
            iv1.setImageResource(R.drawable.img1);
        }
        if (ch2.isChecked()==true){
            iv2.setImageResource(R.drawable.img2);
        }
        if (ch3.isChecked()==true){
            iv3.setImageResource(R.drawable.img3);
        }
    }
}

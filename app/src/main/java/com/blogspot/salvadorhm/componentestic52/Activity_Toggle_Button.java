package com.blogspot.salvadorhm.componentestic52;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

public class Activity_Toggle_Button extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__toggle__button);
        ToggleButton toggleButton = (ToggleButton) findViewById(R.id.toggleButton);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    RelativeLayout rl = (RelativeLayout)findViewById(R.id.relativeToggleButton);
                    //aplicas color.
                    rl.setBackgroundColor(Color.parseColor("#000000"));

                    //Color de titulo
                    TextView textViewTitle = (TextView) findViewById(R.id.toggleButtonTitle);
                    textViewTitle.setTextColor(Color.parseColor("#FFFFFF"));

                    //Color de texto primario
                    TextView textViewText = (TextView) findViewById(R.id.toggleButtonText);
                    textViewText.setTextColor(Color.parseColor("#FFFFFF"));

                    //Color de texto secundario
                    TextView textViewButton = (TextView) findViewById(R.id.toggleButtonDescription);
                    textViewButton.setTextColor(Color.parseColor("#FFFFFF"));

                    //Color titulo ejemplo
                    TextView textViewExample = (TextView) findViewById(R.id.titleExample);
                    textViewExample.setTextColor(Color.parseColor("#FFFFFF"));
                } else {
                    RelativeLayout rl = (RelativeLayout)findViewById(R.id.relativeToggleButton);
                    //aplicas color.
                    rl.setBackgroundColor(Color.parseColor("#FFFFFF"));

                    //Color de titulo
                    TextView textViewTitle = (TextView) findViewById(R.id.toggleButtonTitle);
                    textViewTitle.setTextColor(Color.parseColor("#000000"));

                    //Color de texto primario
                    TextView textViewText = (TextView) findViewById(R.id.toggleButtonText);
                    textViewText.setTextColor(Color.parseColor("#000000"));

                    //Color de texto secundario
                    TextView textViewButton = (TextView) findViewById(R.id.toggleButtonDescription);
                    textViewButton.setTextColor(Color.parseColor("#000000"));

                    //Color titulo ejemplo
                    TextView textViewExample = (TextView) findViewById(R.id.titleExample);
                    textViewExample.setTextColor(Color.parseColor("#000000"));
                }
            }
        });
    }
}

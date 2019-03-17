package com.blogspot.salvadorhm.componentestic52;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity_Button extends AppCompatActivity implements View.OnClickListener {
    Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__button);
        boton =(Button) findViewById(R.id.button10);

        boton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button10:
                Toast.makeText(getApplicationContext(),"Hola",Toast.LENGTH_SHORT).show();
                break;
                default:
                    break;
        }
    }
}

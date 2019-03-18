package com.blogspot.salvadorhm.componentestic52;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_Image_Button extends AppCompatActivity {
    private TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__image__button);
        texto= (TextView)findViewById(R.id.texto);
    }
    public void Info(View view){
       texto.setText("El Image Button es un botón con mejor estética y puede ser una imagen, básicamente es una imagen que realiza un evento(acción) en concreto");
    }
}

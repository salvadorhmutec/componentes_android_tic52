package com.blogspot.salvadorhm.componentestic52;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity__Edit_Text extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity___edit__text);
        Button suma = (Button)findViewById(R.id.btnSumar);
        suma.setOnClickListener(OkListener);
    }
    private View.OnClickListener OkListener = new View.OnClickListener(){

        public void onClick(View view){
            calcularSuma();
        }

    };

    public void calcularSuma(){

        EditText numero1 = (EditText)findViewById(R.id.edtNumero1);
        EditText numero2 = (EditText)findViewById(R.id.edtNumero2);
        float Numero1 =  Float.parseFloat(numero1.getText().toString());
        float Numero2 =  Float.parseFloat(numero2.getText().toString());
        float totalSuma = Numero1 + Numero2;
        Toast.makeText(this, "El resultado de la suma es: " + totalSuma,Toast.LENGTH_LONG).show();
    }
}

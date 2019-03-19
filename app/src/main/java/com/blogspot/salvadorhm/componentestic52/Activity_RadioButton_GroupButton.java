package com.blogspot.salvadorhm.componentestic52;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Activity_RadioButton_GroupButton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__radio_button__group_button);
        RadioButton radioButton_Piratas = (RadioButton) findViewById(R.id.radio_pirates);
        RadioButton radioButton_Ninjas = (RadioButton) findViewById(R.id.radio_ninjas);
    }

    public void onRadioButtonClicked(View view){
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()){
            case R.id.radio_pirates:
                if(checked){
                    Toast.makeText(this,"Los piratas son los mejores!",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.radio_ninjas:
                if(checked){
                    Toast.makeText(this,"Los ninjas son los mejores!",Toast.LENGTH_SHORT).show();
                }
                break;
        }

    }
}

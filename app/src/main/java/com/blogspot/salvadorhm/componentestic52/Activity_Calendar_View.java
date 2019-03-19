package com.blogspot.salvadorhm.componentestic52;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;



public class Activity_Calendar_View extends AppCompatActivity {

    CalendarView calendarView;
    TextView myDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__calendar__view);
        initComponents();
    }

    private void initComponents(){
        calendarView = (CalendarView)findViewById(R.id.cal_view_calendario);
        myDate = (TextView)findViewById(R.id.txt_myDate);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) { //i = al año i1 = al mes i2= al dia
                String fecha = i2 + "/" + (i1 + 1) + "/" + i; //Se guarda en una variable la fecha que se selecciona
                myDate.setText(fecha);//Agrega la fecha seleccionada al TtxView
            }
        });
    }
    public void guardarOnClick(View view){
        try{
            String texto;
            texto = (String)myDate.getText();//Recibe la fecha seleccionada por el usuario
            Toast.makeText(Activity_Calendar_View.this,"Esta es tu fecha: "+texto, Toast.LENGTH_SHORT).show();//Enviar ,emsaje al usuario
        }catch(Exception ex){
            Log.e("Error guardar;", "Message" + ex.getMessage());//Envia un mensaje de error
        }
    }
}

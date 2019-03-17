package com.blogspot.salvadorhm.componentestic52;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionMenu;/*Se importo una libreria de nombre com.github.clans:fab.FloatingActionMenu*/

public class Activity_Floating_Action_Buttom extends AppCompatActivity {
    FloatingActionMenu actionMenu;   /*Hacemos una referencia*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__floating__action__buttom);

        actionMenu=(FloatingActionMenu)findViewById(R.id.fabPrincipal); /*se busca por el id en este caso fabPrincipal1*/
        actionMenu.setClosedOnTouchOutside(true);/*Seleccionamos el metodo asociado*/
    }
    public void clicSubMenu1(View view){/*Hace referencia a una vista*/
        Toast.makeText(this, "Sub Menu 1 Tocado",Toast.LENGTH_SHORT).show();//
    }/*--Captura de click(evento) sobre el boton de submenu1
       --*Con el Toast mostrar un mensaje*/
    public void clicSubMenu2(View view){
        Toast.makeText(this, "Sub Menu 2 Tocado",Toast.LENGTH_SHORT).show();//
    }/*--Captura de click(evento) sobre el boton de submenu1
       --*Con el Toast mostrar un mensaje*/
}

/*FloatingActionMenu*/
/*Se importo una libreria de nombre com.github.clans:fab
* Posteriormente se le proporciona un id al floatingMenu
* Al igual que dimensiones
* Se le asigno un texto con un fab label
* Se alinea al borde inferior y del lado derecho*/

/*FloatingActionButton*/
/*Estos se colocan dentro del menu ya que se despliegan de este
 * --Al igual que se le asigna un id para identificador
 * --Se añade el evento onClick con un respectivo nombre
 * de identificacion el cual tambien lleva por nombre el metodo
 * --Al igual que dimensiones
 * --Se le asigno un texto con un fab label
 * --Se le otorga un icono */


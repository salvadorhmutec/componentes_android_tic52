package com.blogspot.salvadorhm.componentestic52;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionMenu;

public class Activity_Floating_Action_Buttom extends AppCompatActivity {
    FloatingActionMenu actionMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__floating__action__buttom);

        actionMenu=(FloatingActionMenu)findViewById(R.id.fabPrincipal);
        actionMenu.setClosedOnTouchOutside(true);
    }
    public void clicSubMenu1(View view){
        Toast.makeText(this, "Sub Menu 1 Tocado",Toast.LENGTH_SHORT).show();
    }
    public void clicSubMenu2(View view){
        Toast.makeText(this, "Sub Menu 2 Tocado",Toast.LENGTH_SHORT).show();
    }
}


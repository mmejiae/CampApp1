package com.example.usercimd.campapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton=(Button)findViewById(R.id.BotonIngresar);
        boton.setOnClickListener(this);
    }
    public void onClick(View view){
        Intent i=new Intent(this,Ingresar.class);
        startActivity(i);
    }
    }



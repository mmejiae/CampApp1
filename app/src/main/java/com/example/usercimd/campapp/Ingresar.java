package com.example.usercimd.campapp;

import android.os.Bundle;
import android.app.Activity;

public class Ingresar extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

}

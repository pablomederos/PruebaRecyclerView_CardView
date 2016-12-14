package com.pmcoder.pruebarecyclerview;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.pmcoder.pruebarecyclerview.fragments.*;
import android.support.v7.widget.Toolbar;

import static com.pmcoder.pruebarecyclerview.R.id.container;


public class MainActivity extends AppCompatActivity {

    imageFragment imFragment = new imageFragment();
    mainFragment homeFragment = new mainFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Probando RecyclerView");

        getSupportFragmentManager().beginTransaction().replace(container, homeFragment).commit();



    }

    public void imagen (){
        getSupportFragmentManager().beginTransaction().replace(container, imFragment).commit();
    }
}

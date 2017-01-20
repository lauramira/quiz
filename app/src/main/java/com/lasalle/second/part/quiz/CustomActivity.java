package com.lasalle.second.part.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by Usuario on 20/01/2017.
 */

public abstract class CustomActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResourceId());

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        customizeToolBar();
    }

    protected abstract int getLayoutResourceId();
    protected abstract void customizeToolBar();

    public Toolbar getToolbar(){return toolbar; } ;
}

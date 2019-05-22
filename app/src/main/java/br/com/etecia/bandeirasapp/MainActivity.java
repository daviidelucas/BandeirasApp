package br.com.etecia.bandeirasapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.lang.reflect.Array;

import br.com.etecia.bandeirasapp.model.State;

public class MainActivity extends AppCompatActivity {

    State states [] = {new State("","", "", "")};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }




}

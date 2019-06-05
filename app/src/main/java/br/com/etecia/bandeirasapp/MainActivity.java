package br.com.etecia.bandeirasapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;

import br.com.etecia.bandeirasapp.model.State;

public class MainActivity extends AppCompatActivity {

    private ListView statesList;
    State states [] = {
            new State("São Paulo","São Paulo é uma das 27 unidades federativas do Brasil. Está situado na Região Sudeste e tem por limites os estados de Minas Gerais a norte e nordeste, Paraná a sul, Rio de Janeiro a leste e Mato Grosso do Sul a oeste, além do Oceano Atlântico a sudeste.", "248.209 km²", "44,04 milhões"),
            new State("Rio de Janeiro","Rio de Janeiro é uma das 27 unidades federativas do Brasil. Situa-se a sudeste da região Sudeste do país, tendo como limites os estados de Minas Gerais, Espírito Santo e São Paulo, além do Oceano Atlântico. ", "43.696 km²", "16,72 milhões"),
            new State("Minas Gerais","Minas Gerais é uma das 27 unidades federativas do Brasil, sendo o quarto estado com a maior área territorial e o segundo em quantidade de habitantes, localizada na Região Sudeste do país.", "586.528 km km²", "20,87 milhões"),
            new State("Espírito Santo","O Espírito Santo é uma das 27 unidades federativas do Brasil. Está localizado na região Sudeste. Faz fronteira com o oceano Atlântico a leste, com a Bahia ao norte, com Minas Gerais a oeste e noroeste e com o estado do Rio de Janeiro ao sul.", "46.095 km²", "3,885 milhões")};

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.statesList = findViewById(R.id.lstEstados);

        ArrayAdapter adapter = new ArrayAdapter<>(
         this,
         android.R.layout.simple_list_item_1,
         android.R.id.text1,
                this.states
        );
        this.statesList.setAdapter(adapter);

    }





}

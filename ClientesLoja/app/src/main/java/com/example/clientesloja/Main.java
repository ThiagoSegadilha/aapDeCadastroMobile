package com.example.clientesloja;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        List<String> clientes = new ArrayList<>(Arrays.asList("Tonny Stark", "Petter Parker", "Natasha Romanoff"));

        ListView listaDeClientes = findViewById(R.id.activity_main_lista_de_clientes);

        listaDeClientes.setAdapter(new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                clientes));
    }

}

package com.example.clientesloja

import android.app.Activity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import java.util.ArrayList
import java.util.Arrays.asList

class MainActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val clientes: List<String> = ArrayList(
            asList("Tonny Stark", "Petter Parker", "Natasha Romanoff", "Thor", "Loki")
        )

        val listaDeClientes = findViewById<ListView>(R.id.activity_main_lista_de_clientes)

        listaDeClientes.setAdapter(ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            clientes))

    }
}
package com.example.clientesloja

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.ListView
import java.util.ArrayList
import java.util.Arrays.asList

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        setTitle("Lista de clientes")

        val clientes: List<String> = ArrayList(
            asList("Tonny Stark", "Petter Parker", "Natasha Romanoff", "Thor", "Loki")
        )

        val listaDeClientes = findViewById<ListView>(R.id.activity_main_lista_de_clientes)

        listaDeClientes.setAdapter(ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            clientes))

    }
}
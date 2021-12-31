package com.example.clientesloja.ui.activity

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.clientesloja.R
import com.example.clientesloja.dao.ClienteDao

class ListaClientesActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_lista_clientes)
        setTitle("Lista de clientes")

        val botaoCriarNovoCliente = findViewById<FloatingActionButton>(R.id.activity_lista_cliente_fab_novo_cliente)
        botaoCriarNovoCliente.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, FormularioClienteActivity::class.java))
        })
    }

    override fun onResume() {
        super.onResume()

        val clienteDao = ClienteDao()
        val listaDeClientes = findViewById<ListView>(R.id.activity_lista_de_clientes_listview)

        listaDeClientes.setAdapter(ArrayAdapter(this,
            android.R.layout.simple_list_item_1, clienteDao.todosOsClientes()))
    }
}
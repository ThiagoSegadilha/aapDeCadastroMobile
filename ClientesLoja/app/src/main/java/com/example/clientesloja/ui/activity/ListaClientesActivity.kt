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

class ListaClientesActivity : AppCompatActivity() {

    val TITULO_APPBAR = "Lista de clientes"
    private val clienteDao = ClienteDao()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_lista_clientes)

        setTitle(TITULO_APPBAR)

        configuracaoFabNovoCliente()
    }

    override fun onResume() {
        super.onResume()
        configuracaoLista(clienteDao)
    }

    private fun configuracaoLista(clienteDao: ClienteDao) {
        val listaDeClientes = findViewById<ListView>(R.id.activity_lista_de_clientes_listview)

        listaDeClientes.setAdapter(
            ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1, clienteDao.todosOsClientes()
            )
        )
    }

    private fun configuracaoFabNovoCliente() {
        val botaoCriarNovoCliente = findViewById<FloatingActionButton>(R.id.activity_lista_cliente_fab_novo_cliente)

        botaoCriarNovoCliente.setOnClickListener {
            abreFormularioClienteActivity()
        }
    }

    private fun abreFormularioClienteActivity() {
        startActivity(Intent(this, FormularioClienteActivity::class.java))
    }
}

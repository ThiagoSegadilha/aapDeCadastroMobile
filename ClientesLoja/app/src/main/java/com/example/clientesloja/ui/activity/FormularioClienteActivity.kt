package com.example.clientesloja.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.clientesloja.R
import com.example.clientesloja.dao.ClienteDao
import com.example.clientesloja.model.Cliente

class FormularioClienteActivity : AppCompatActivity() {

    private lateinit var campoNome: EditText
    private lateinit var campoTelefone: EditText
    private lateinit var campoEmail: EditText
    val alunoDao = ClienteDao()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario_cliente)

        setTitle("Formulario de cliente")

        inicializacaoDosAtributos()

        configuracaoBotaoSalvar()

    }

    private fun configuracaoBotaoSalvar() {
        val botaoSalvar = findViewById<Button>(R.id.activity_formulario_cliente_botao_salvar)
        botaoSalvar.setOnClickListener {
            val clienteCriado = criaCliente(campoNome, campoTelefone, campoEmail)
            salva(alunoDao, clienteCriado)
        }
    }

    private fun criaCliente(
        campoNome: EditText,
        campoTelefone: EditText,
        campoEmail: EditText
    ): Cliente {
        val nome = campoNome.text.toString()
        val telefone = campoTelefone.text.toString()
        val email = campoEmail.text.toString()

        val clienteCriado = Cliente(nome, telefone, email)
        return clienteCriado
    }

    private fun salva(alunoDao: ClienteDao, clienteCriado: Cliente) {

        alunoDao.salvar(clienteCriado)
        finish()
    }

    private fun inicializacaoDosAtributos() {
        campoNome = findViewById(R.id.activity_formulario_cliente_nome)
        campoTelefone = findViewById(R.id.activity_formulario_cliente_telefone)
        campoEmail = findViewById(R.id.activity_formulario_cliente_email)
    }
}

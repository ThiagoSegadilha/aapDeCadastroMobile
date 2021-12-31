package com.example.clientesloja.ui.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.clientesloja.R
import com.example.clientesloja.dao.ClienteDao
import com.example.clientesloja.model.Cliente

class FormularioClienteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario_cliente)
        val alunoDao = ClienteDao()

        setTitle("Formulario de cliente")

        val campoNome = findViewById<EditText>(R.id.activity_formulario_cliente_nome)
        val campoTelefone = findViewById<EditText>(R.id.activity_formulario_cliente_telefone)
        val campoEmail = findViewById<EditText>(R.id.activity_formulario_cliente_email)

        val botaoSalvar = findViewById<Button>(R.id.activity_formulario_cliente_botao_salvar)
        botaoSalvar.setOnClickListener(View.OnClickListener {
            val nome = campoNome.text.toString()
            val telefone = campoTelefone.text.toString()
            val email = campoEmail.text.toString()

            val clienteCriado = Cliente(nome, telefone, email)
            alunoDao.salvar(clienteCriado)

            finish()
        })

    }
}
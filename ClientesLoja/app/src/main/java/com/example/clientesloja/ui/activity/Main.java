package com.example.clientesloja.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.clientesloja.R;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main extends Activity {

//    private final static List<Cliente> clientes = new ArrayList<>();
//
//    public void salvar(Cliente clienteCriado) {
//        clientes.add(clienteCriado);
//    }
//
//    public List<Cliente> todosOsClientes() {
//        return new ArrayList<>(clientes);
//    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_lista_clientes);

        List<String> clientes = new ArrayList<>(Arrays.asList("Tonny Stark", "Petter Parker", "Natasha Romanoff"));

        ListView listaDeClientes = findViewById(R.id.activity_lista_de_clientes_listview);

        listaDeClientes.setAdapter(new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                clientes));


        final EditText campoNome = findViewById(R.id.activity_formulario_cliente_nome);

        Button botao = findViewById(R.id.activity_formulario_cliente_botao_salvar);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = campoNome.getText().toString();
            }
        });
    }

}

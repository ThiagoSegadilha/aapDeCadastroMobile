package com.example.clientesloja.dao;

import com.example.clientesloja.model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteDao {

    private final static List<Cliente> clientes = new ArrayList<>();

    public void salvar(Cliente clienteCriado) {
        clientes.add(clienteCriado);
    }

    public List<Cliente> todosOsClientes() {
        return new ArrayList<>(clientes);
    }
}

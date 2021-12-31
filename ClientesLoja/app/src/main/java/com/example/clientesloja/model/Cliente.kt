package com.example.clientesloja.model

class Cliente(val nome: String, val telefone: String, val email: String) {

    override fun toString(): String {
        return nome
    }
}
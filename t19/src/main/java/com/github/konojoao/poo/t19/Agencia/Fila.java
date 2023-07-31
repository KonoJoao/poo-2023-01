package com.github.konojoao.poo.t19;

import java.util.ArrayList;

public class Fila {
    private ArrayList<Cliente> clientes;

    public void adicionarCliente(){
        this.clientes.add(new Cliente());
    }

    public void acharCliente(ìnt identificacao){
        System.out.println(this.clientes.get(identificacao).getNome());
    }
    
}

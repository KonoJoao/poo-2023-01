package com.github.konojoao.poo.t19.onibus;

import java.util.ArrayList;

public class Passageiro {
    private ArrayList<Viagem> viagens = new ArraList<>();

    public void adicionarViagem(){
        this.viagens.add(new Viagem());
    }
}

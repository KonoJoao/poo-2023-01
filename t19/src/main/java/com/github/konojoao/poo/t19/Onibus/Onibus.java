package com.github.konojoao.poo.t19.onibus;

import java.util.ArrayList;

public class Onibus {
    private ArrayList<Viagem> viagens = new ArraList<>();

    public Onibus(){
        this.viagens.add(new Viagem());
    }

    public void adicionarViagem(){
        this.viagens.add(new Viagem());
    }
}

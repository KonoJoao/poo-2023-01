package com.github.konojoao.poo.t18;

import java.util.ArrayList;

public class Partida{
    private ArrayList<Lance> lances;
    private Jogador jogador1;
    private Jogador jogador2;

    public Partida(String j1, String j2){
        this.jogador1 = j1;
        this.jogador2 = j2;
    }

    public void adicionarLance(){
        this.lances.add(new Lance(new Posicao(1, 1), new Peca()));
    }

}
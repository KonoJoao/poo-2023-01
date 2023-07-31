package com.github.konojoao.poo.t19.onibus;

import java.util.ArrayList;

public class Viagem {
    private Motorista motorista;
    private ArrayList<Passageiro> passageiros;
    private Cidade cidadeDeOrigem;
    private Cidade cidadeDestino;

    public Viagem(){
      Motorista motorista = new Motorista();
    }
    public void adicionarPassageiros(){
        this.passageiros.add(new Passageiro());
    }
}

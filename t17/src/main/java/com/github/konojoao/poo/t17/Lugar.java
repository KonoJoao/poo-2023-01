package com.github.konojoao.poo.t17;

public class Lugar {
    private Passageiro passageiro;
    private int numeroAssento;

    public Lugar(int numero){
        this.numeroAssento = numero;
        this.passageiro = new Passageiro(numero);
    }
}

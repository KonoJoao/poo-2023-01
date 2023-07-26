package com.github.konojoao.poo.t18;

public class Posicao{
    private String posicaoInicial;
    private String posicaoFinal;

    public Posicao(String posicaoInicialParametro, String posicaoFinalParametro){
    this.posicaoFinal = posicaoFinalParametro;
    this.posicaoInicial = posicaoInicialParametro;
    }
    public String toString(){
        return "Linha: " + this.linha + " Coluna: " + this.coluna;
    }
}
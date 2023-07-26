package com.github.konojoao.poo.t18;

public class Lance{
    private Posicao posicao;
    private Peca peca;

    public Lance(Posicao posicao, Peca peca){
        this.posicao = posicao;
        this.peca = peca;
    }

    public Posicao getPosicao(){
        return this.posicao;
    }

    public Peca getPeca(){
        return this.peca;
    }

    public void setPosicao(Posicao posicao){
        this.posicao = posicao;
    }

    public void setPeca(Peca peca){
        this.peca = peca;
    }

    public boolean equals(Lance lance){
        return this.posicao.equals(lance.getPosicao()) && this.peca.equals(lance.getPeca());
    }

    public String toString(){
        return "Posicao: " + this.posicao.posicaoInicial + " - " + this.posicao.posicaoFinal + " Peca: " + this.peca;
    }
}
package com.github.konojoao.poo.t19.pixel;

public class Pixel {
    private Cor cor;
    private Ponto ponto;

    public Pixel(){
        this.cor = new Cor();
        this.ponto = new Ponto();
    }

    public void retornarCor(){
        return this.cor;
    }
        public void retornarPonto(){
        return this.ponto;
    }
}

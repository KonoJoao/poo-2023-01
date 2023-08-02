package com.github.konojoao.poo.t19.mensagem;

public class Objeto {
    

    public void printarMensagem(){
        System.out.println("Mensagem de Objeto");
    }

    public void printarMensagemDeObjeto(Objeto novoObjeto){
        novoObjeto.printarMensagem();
    }
}

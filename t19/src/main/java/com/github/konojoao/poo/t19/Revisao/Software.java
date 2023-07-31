package com.github.konojoao.poo.t19.revisao;

import java.util.ArrayList;

public class Software {
    private ArrayList<Versao> versionamentoAtual = new ArrayList<>();

    public void adicionarVersao(){
        this.versionamentoAtual.add(new Versao());
    }
}

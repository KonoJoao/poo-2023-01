package com.github.konojoao.poo.t19;

import java.util.ArrayList;

public class Mesa {
    private ArrayList<Pessoa> pessoasQueOcuparam;
    private ArrayList<Date> dataDeOcupacao;

    public void adicionarPessoa(){
        this.pessoasQueOcuparam.add(new Pessoa());
        this.dataDeOcupacao.add(new Date());
    }
}


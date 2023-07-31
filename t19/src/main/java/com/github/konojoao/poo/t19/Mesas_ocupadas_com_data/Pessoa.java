package com.github.konojoao.poo.t19;

import java.util.ArrayList;

public class Pessoa {
    private ArrayList<Mesa> mesasOcupadas;
    private ArrayList<Date> dataDeOcupacao;

    public void adicionarMesa(){
        this.mesasOcupadas.add(new Mesa());
        this.dataDeOcupacao.add(new Date());
    }
}

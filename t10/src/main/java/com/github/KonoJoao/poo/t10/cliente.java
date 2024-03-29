package com.github.konojoao.main.t10;

class Cliente{
    private String nome;
    private Demanda problema;
    private Bicicleta bicicleta;

    public void cadastrarCliente(){
       Cliente cliente = new Cliente();
        this.cadastrarCliente("João", "Bicicleta com problema no freio", "Caloi", "Azul", 500);
    }

    public void cadastrarCliente(String nome, String descricao, String modelo, String cor, float preco){
        this.nome = nome;
        this.problema = new Demanda();
        this.problema.DefinirDemanda(descricao);
        this.bicicleta = new Bicicleta();
        this.bicicleta.DescricaoBicicleta(modelo, cor, preco);
    }
}

class Bicicleta{
    private String modelo;
    private String cor;
    private float preco;

    public void DescricaoBicicleta(String modelo, String cor, float preco){
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
    }
}

class Demanda{
    private String descricao;

    public void DefinirDemanda(String descricao){
        this.descricao = descricao;
    }
}
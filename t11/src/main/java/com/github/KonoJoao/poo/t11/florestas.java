package com.github.konojoao.poo.t11;

class Floresta{
    private Arvore[] arvores;
    private int quantidadeArvores=0;

    public void Floresta(){
        this.arvores[this.quantidadeArvores] = new Arvore();
        this.quantidadeArvores++;
    }

        public void adicionarArvores(){
        this.arvores[this.quantidadeArvores] = new Arvore();
        this.quantidadeArvores++;
    }
}

class Arvore{
    private Folha[] folhas;
    private Floresta[] florestas;
    private int quantidadeFolhas=0;
    private int quantidadeFlorestas=0;

        public void Arvore(){
        this.folhas[this.quantidadefolhas] = new Folha();
        this.quantidadeFolhas++;
    }
        public void adicionarFolha(){
        this.folhas[this.quantidadefolhas] = new Folha();
        this.quantidadeFolhas++;
    }

        public void adicionarFloresta(){
        this.florestas[this.quantidadeFlorestas] = new Floresta();
        this.quantidadeFlorestass++;
    }

        public void derrubarArvore(){
        do{
        this.folhas[this.quantidadefolhas] = null;
        }while(this.quantidadeFolhas--);
    }
}

class Folha{
    private TipoFolha tipo;
}

class TipoFolha{
    private Folha folha;
}
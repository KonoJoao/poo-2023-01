
public class Lance{
    private Posicao posicao;
    private Peca peca;

    public Lance(String inicio, String pFinal, Peca peca){
        this.posicao = new Posicao(inicio, pFinal);
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


    public String toString(){
        return "Posicao de saida: " + this.posicao.retornarPosicaoInicial() + " - Posicao de chegada: " + this.posicao.retornarPosicaoFinal() + " - Peca: " + this.peca.returnNome();
    }
}

import java.util.ArrayList;

public class Partida{
    private ArrayList<Lance> lances = new ArrayList<>();
    private Jogador jogador1;
    private Jogador jogador2;

    public Partida(String j1, String j2){
        this.jogador1 = new Jogador(j1);
        this.jogador2 = new Jogador(j2);
    }

    public void adicionarLance(Posicao posicao, String nomePeca){
        this.lances.add(new Lance(posicao.retornarPosicaoInicial(), posicao.retornarPosicaoFinal(), new Peca(nomePeca)));
       // this.lances.add(new Lance(/*posicao, new Peca(nomePeca)*/));
    }

    public void imprimirJogadas(){
        for(Lance lance : this.lances){
            System.out.println(lances.toString());
        }
    }

}


public class PartidaImortal{
  //  private Posicao aux;
    public static void main(String args[]){

    Partida partidaImortal = new Partida("Adolf Anderssen", "Lionel Kieseritzky");
    partidaImortal.adicionarLance(new Posicao("e2", "e4"), "Peao");
    partidaImortal.imprimirJogadas();
    }
}
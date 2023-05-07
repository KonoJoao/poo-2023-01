import java.util.TreeSet;
package escola;
import ensino.Disciplina;

public class Pessoa{

}

public class Livro{
    
}

public class Provas{
    private byte numQuestoes;

    public byte getNumQuestoes(){
        return numQuestoes;
    }

    public void setNumQuestoes(byte n){
        if(n>0){
            numQuestoes=n;
        }
    }

}

public class TesteProva{
    public static void main(String[] args){
        Prova pf = new Prova();
    }
}

public class Casa{
    public Casa(){
        System.out.print("Mais uma Casa.");
    }

    public static void main(String[] args){
        Casa c = new Casa();
    }
}

public class Convidado{

}

public class Festa {
    private TreeSet convidados = new TreeSet();

    public void novoConvidado(Convidado c){
        convidados.add(c);
    }
    public Festa(Convidado C){
        convidados.add(c);
    }
}

public class Uniao {
    private ArrayList filhos;
    private Pessoa parceiros[2];

    public void novoFilho(Pessoa P){
        filhos.add(p);
    }

    public Uniao(Pessoa a, Pessoa b){
        parceiros[0] = a;
        parceiros[1] = b;
    }
}
public class Aluno {
    private Curso[] cursos;
}

public class Curso {
    private Aluno[] alunos;
}

public class TestaSomaNaturais {
    public static long SomaNaturais(int n){
        int c = 1;
        long s = 0;
        while(c<=n){
            s = s + c;
            c = c + 1;
        }
    }
    public static void main(String[] args){
        System.out.println(SomaNaturais(10));
    }
}

public class Permuta{
    public static void Permutacao(String p, String S){
        if (S.length() == 1){
            System.out.println(p+s)
        } else {
            String Slinha;
            String pLinha;

            for(int i =0; i<S.length();i++){
                Slinha = S.substring(0,i) + S.substring(+1)
                pLinha = p + S.charAt(i);
                Permutacao(pLinha, Slinha);
            
            }
        }
    }
    public static void main(String[] args){
        Permutacao(new String(), args[0]);
    }
}



public class Religiao {
    private ArraList devotos;

    public void novoFiel(Devoto d){
        devoto.add(d);
    }
}

public class Devoto(){
    public Devoto (Religiao r){
        r.novoFiel(this);
    }
}


public class Referencia{

}

class Revista extends Referencia(){

}

public interface Identificacao{
    String getNome();
}

class Prova implements Identificacao{

}

public class Matricula{
    private Disciplina disciplina;
}







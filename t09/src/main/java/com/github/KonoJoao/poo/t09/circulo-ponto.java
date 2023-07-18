package java.com.github.konojoao.poo.t09;

class Circulo extends Ponto{
    private Ponto centro;
    private float raio;

        @Override
        public void trasladar(float x, float y){
        System.out.println("Trasladando Circulo...");
    }
}

class Ponto{
    
    private float x;
    private float y;

    public void trasladar(float x, float y){
        System.out.println("Trasladando...");
    }
}

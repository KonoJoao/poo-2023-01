package com.github.konojoao.poo.t07;

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

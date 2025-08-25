package Exercicios;

import java.util.Scanner;

public class Exercicio3S {
    
    public static void main(String[] args) {

        Scanner numero_informado = new Scanner(System.in);

            System.out.println("informe um numero inteiro: ");

            long a = numero_informado.nextLong();

            numero_informado.close();

            System.out.println(quadrado_do_numero(a));
    }        

    public static long quadrado_do_numero(long a) {
     System.out.print( "O resultado é: "); return a *a;

        //qual o jeito certo de fazer isso?
    }
}

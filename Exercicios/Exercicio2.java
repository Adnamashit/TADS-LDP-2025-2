package Exercicios;

/*2. O algoritmo deve ter como entrada um número real e a saída deve ser o valor
atualizado com os 20%.*/

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String [] agrs) {

        Scanner pedir_um_numero = new Scanner(System.in);
        

        System.out.println("Me mande um numero real: ");

        float numero = pedir_um_numero.nextFloat();

        pedir_um_numero.close();

        System.out.println(valor_atualizado(numero));
        
    }

    public static float valor_atualizado(float numero) {
        return numero += (numero * 0.20);
    }
}
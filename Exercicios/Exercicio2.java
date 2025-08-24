package Exercicios;
// buscando na pagina
/*2. O algoritmo deve ter como entrada um número real e a saída deve ser o valor
atualizado com os 20%.*/

import java.util.Scanner;
//importando da blblioteca o scanner

public class Exercicio2 {
//criando a classe do exercicio2

    public static void main(String [] agrs) {
        //criando o metodo main

        Scanner pedir_um_numero = new Scanner(System.in);
        //criando scanner pedir um numero

        System.out.println("Me mande um numero real: ");
        //pedindo um numero real para entrada

        float numero = pedir_um_numero.nextFloat();
        //lendo o numero da entrada

        pedir_um_numero.close();
        //fechando o scanner (variavel)

        System.out.println(valor_atualizado(numero));
    }

    //chamando o metodo 
    public static float valor_atualizado(float numero) {
       
        return numero * 1.2f;

        //retornando o valor atualizado
    }
     //tive que mudar todos os int por float - porcentagem
}
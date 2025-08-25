
package Exercicios;

/*3. Desenvolva o algoritmo de um programa onde o usuário irá informar um número
inteiro e o programa deve calcular e exibir quadrado do número informado pelo
usuário. */

import java.util.Scanner;

public class Exercicio3 {
    
    public static void main(String[] args) {

        Scanner numero_informado = new Scanner(System.in);

            System.out.println("informe um numero inteiro: ");

            Long numero = numero_informado.nextLong();

            System.out.println(quadrado_do_numero(numero));

            numero_informado.close();
    }

    public static Long quadrado_do_numero(Long numero) {
        return numero *(numero);
    }
    
}

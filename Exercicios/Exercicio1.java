
package Exercicios;
// Buscando a pasta
// 1. Faça um programa que peça um número inteiro e imprima o seu antecessor.

import java.util.Scanner;
// Importando a biblioteca Scanner

public class Exercicio1 {
    // Criando a classe Exercicio1
    public static void main(String [] args) {
        // Criando o método main

        Scanner scanner = new Scanner(System.in);
         // Criando o scanner

        System.out.println("Me fale um numero inteiro: ");
        // Pedindo um número inteiro
        
        int number = scanner.nextInt();
        // Lendo o número inteiro
        
        scanner.close();
        // Fechando o scanner

        System.out.println(antecessor(number));
        // Imprimindo o antecessor do número inteiro

    }
    // Jeito certo de fazer o exercício
    public static int antecessor(int number) {
        // Criando o método antecessor

        return number - 1;
        // Retornando o antecessor do número inteiro
    }
}
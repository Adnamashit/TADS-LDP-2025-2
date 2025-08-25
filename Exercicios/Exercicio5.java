package Exercicios;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        
        Scanner celcius = new Scanner(System.in);

        System.out.println("Me informe a temperatura em Fahrenheit: ");

        Float temp_fah = celcius.nextFloat();

        celcius.close();
    
        System.out.println(em_celsius(temp_fah));

    }
    public static Float em_celsius(Float temp_fah) {

        Float temp_cel = (5*(temp_fah - 32))/9;
        
        return temp_cel;

    } 
}
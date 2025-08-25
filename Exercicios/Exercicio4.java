package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

         Scanner area_trig = new Scanner(System.in);
         
        System.out.println("Me informe o valor da base do seu triângulo: ");
         Float base = area_trig.nextFloat();

        System.out.println("Agora me informe o valor da altura");
         Float altura = area_trig.nextFloat();

         area_trig.close();

        System.out.println(areaT(base, altura));
        }
   
    public static Float areaT(Float base, Float altura) {

        Float area = (base * altura)/2f;

        System.out.print("A area do seu triangulo é: ");
        return area;
    }
}
/*Duvidas: 

    como usar dois valores recebidos de uma vez só?
    como mostrar o texto junto com a resposta?

*/

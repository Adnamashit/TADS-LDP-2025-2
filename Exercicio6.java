import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        
          Scanner notas = new Scanner(System.in);

        System.out.println("Me informe sua primeira nota: ");

        Double nota1 = notas.nextDouble();

        System.out.println("Me informe sua segunda nota: ");

        Double nota2 = notas.nextDouble();

            notas.close();

        System.out.print(met_media(nota1, nota2));
    }
    public static Double met_media(Double nota1, Double nota2){

     double media_nota = (nota1 + nota2) / 2;
    
    System.out.print("A média da sua nota é: "); return media_nota;

    } 
}
//chegando em casa eu vejo como fazer isso certinho
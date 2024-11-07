package condicionais;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean valorValido = false;
       do {
           try {

               System.out.println("Informe um valor de 1 a 7");
               int valor = sc.nextInt();

               if (valor > 0 && valor <= 7) {
                   switch (valor) {
                       case 1 -> System.out.println("Domingo");
                       case 2 -> System.out.println("Segunda-Feira");
                       case 3 -> System.out.println("Terça-feira");
                       case 4 -> System.out.println("Quarta-feira");
                       case 5 -> System.out.println("Quinta-feira");
                       case 6 -> System.out.println("Sexta-feira");
                       case 7 -> System.out.println("Sábado");
                   }
                   valorValido = true;
               } else {
                   System.out.println("Número fora do intervalo permitido. Por favor, informe um valor de 1 a 7.");
               }
           } catch (InputMismatchException e) {
               System.out.println("Informe um valor numérico válido.");
               sc.nextLine();
           }
       }while(!valorValido);
    }
}

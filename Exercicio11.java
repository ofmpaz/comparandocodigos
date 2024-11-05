package condicionais;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        /*Escreva um algoritmo que leia X eVerifique se X é maior ou igual a 10; caso seja
          verdadeiro, calcule
          R <-x + 5. Senão calcule R <-X – 7.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número");
        int x = sc.nextInt();
        int r;

        if (x >= 10) {
            r = x + 5;

        } else {
            r = x - 7;
        }

        System.out.println(r);
    }

}
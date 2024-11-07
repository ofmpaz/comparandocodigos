package condicionais;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número");

        int numero = sc.nextInt();

        if(numero % 2 == 0 && numero > 0){
            System.out.println("Valor par e positivo: " + numero);

        } else if (numero % 2 != 0 && numero > 0) {
            System.out.println("Positivo e ímpar: " + numero);

        } else if(numero % 2 == 0 && numero < 0){
            System.out.println("Negativo e par: " + numero);

        } else if (numero % 2 != 0 && numero < 0) {
            System.out.println("Negativo e ímpar: " + numero);

        } else {
            System.out.println("O número é zero, que é par e neutro.");
        }

        sc.close();
    }
}

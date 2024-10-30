package operadores.comparandocodigo;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        /*Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular
e escrever a área do retângulo (base*altura).*/

        Scanner sc = new Scanner(System.in);
        System.out.println("informe a base e a altura");
        int base = sc.nextInt();
        int altura =sc.nextInt();

        int area = (base*altura);

        System.out.println("Area: " + area);
    }
}

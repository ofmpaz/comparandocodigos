package operadores;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        //1 - Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um valor");

        int valor = sc.nextInt();
        int antecessor = valor - 1;

        System.out.println("Antecessor: " + antecessor);
    }
}

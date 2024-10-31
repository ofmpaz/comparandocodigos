import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        /*Faça um algoritmo que leia dois valores para as variáveis A e B e efetue a troca dos
        valores de forma que a variável A passe a possuir o valor da variável B e a variável B
        passe a possuir o valor da variável A. Apresente os valores trocados.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um valor para A e um valor pata B");

        int A = sc.nextInt();
        int B = sc.nextInt();
        int aux;

        aux = A;
        A = B;
        B = aux;

        System.out.println("A:" + A + " B:" + B);

    }
}

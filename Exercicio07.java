import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        /*Faça um algoritmo que leia dois valores inteiros (X e Y) e apresente o resultado do
          quadrado da soma dos valores lidos.*/

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int quadrado = 2;


        int soma = x + y;
        int resultadoFinal = soma * soma;

        System.out.println("Resultado: " + resultadoFinal);

        //Forma alternativa

        // Usando Math.pow para calcular o quadrado da soma
        double resultadoAlternativo = Math.pow(soma, 2);
        System.out.println(resultadoAlternativo);
    }
}

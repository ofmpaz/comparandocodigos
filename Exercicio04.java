import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*Faça um algoritmo que leia uma temperatura em graus Celsius e apresente-a
    convertida em graus Fahrenheit. A fórmula de conversão é: F = (9 * C + 160) / 5, na qual
    F é a temperatura em Fahrenheite C é a temperatura em Celsius.*/

        double temperaturaEmCelsius = sc.nextDouble();
        double temperaturaConvertida = (9 * temperaturaEmCelsius + 160) / 5;

        System.out.println("Temperatura em Fahrenheite: " + temperaturaConvertida);

    }
}

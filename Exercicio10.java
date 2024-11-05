import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        /* O custo de um carro novo ao consumidor é a soma do custo de fábrica com a
           porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que
           o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo
           para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor. */

        double custoConsumidor;
        double custoFabrica;
        double percentualDistribuidor = 28;
        double impostos = 45;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor de fabrica:");
        custoFabrica = sc.nextDouble();

        custoConsumidor = custoFabrica + (custoFabrica * percentualDistribuidor / 100) + (custoFabrica * impostos / 100);

        System.out.println("O valor do carro para o consumidor é: " + custoConsumidor);
        

        sc.close();
    }
}

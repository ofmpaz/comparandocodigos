package operadores.comparandocodigo;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        /*3 - Escreva um algoritmo para ler o número total de eleitores de um município, o número
de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um
representa em relação ao total de eleitores.*/

        Scanner sc = new Scanner(System.in);

        int totalEleitores, votosBrancos, votosNulos, votosValidos, somaVotos;

        System.out.println("Informe o número total de eleitores");
        totalEleitores = sc.nextInt();

        System.out.println("informe a quantidade de votos Brancos, nulos e válidos respectivamente");
        votosBrancos = sc.nextInt();
        votosNulos = sc.nextInt();
        votosValidos = sc.nextInt();

        somaVotos = (votosBrancos + votosNulos + votosValidos);

        if(totalEleitores == somaVotos){
            double percentualBrancos = ((double)votosBrancos / totalEleitores) * 100;
            double percentualBNulos = ((double)votosNulos / totalEleitores) * 100;
            double percentualBValidos = ((double)votosValidos / totalEleitores) * 100;
            System.out.println("Votos em Branco: " + percentualBrancos);
            System.out.println("Votos em Nulos: " + percentualBNulos);
            System.out.println("Votos em Válidos: " + percentualBValidos);
        }else{
            System.out.println("Números de votos não compatível com números de eleitores");
        }
    }
}

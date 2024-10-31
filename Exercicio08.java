import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        /*Admitindo que uma data é lida pelo algoritmo em uma variável inteira, e não em uma
          variável do tipo data, crie um algoritmo que leia uma data no formato DDMMAA e
          imprima essa data no formato AAMMDD*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe uma data no formato DDMMAA: ");
        int dataDDMMAA = sc.nextInt();

        // Extraindo o dia, mês e ano do número
        int dia = dataDDMMAA / 1000000;         // Extrai os dois primeiros dígitos (DD)
        int mes = (dataDDMMAA / 10000) % 100;   // Extrai os dois dígitos do meio (MM)
        int ano = dataDDMMAA % 10000;           // Extrai os dois últimos dígitos (AA)

        // Imprimindo a data no formato AAMMDD
        System.out.printf("Data: %02d/%02d/%02d%n", ano, mes, dia);

    }
}

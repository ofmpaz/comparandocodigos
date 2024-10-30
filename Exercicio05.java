import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double litrosUsados;
        double distancia;
        double tempo;
        int velocidade;

        System.out.println("Informe o tempo gasto");
        tempo = sc.nextDouble();

        System.out.println("Informe a velocidade média");
        velocidade = sc.nextInt();

        distancia = tempo * velocidade;
        litrosUsados = distancia / 12;

        System.out.println("Litros Usados: " + litrosUsados);
    }
}

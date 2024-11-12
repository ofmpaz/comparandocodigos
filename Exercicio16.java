package condicionais;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nivelDePoluentes;

        System.out.println("Informe o nível de poluição");
        nivelDePoluentes = sc.nextDouble();

        if (nivelDePoluentes >= 0.5) {
            System.out.println("As empresas de todos os níveis poderão ter suas atividades suspensas");
        } else if (nivelDePoluentes >= 0.4) {
            System.out.println("Empresas de nível 1 e 2 poderão ter suas atividades suspensas");
        } else if (nivelDePoluentes >= 0.3) {
            System.out.println("Empresas de nível 1 poderão ter suas atividades suspensas");
        } else if (nivelDePoluentes >= 0 && nivelDePoluentes <= 0.25) {
            System.out.println("As atividades estão regulamentadas");
        } else {
            System.out.println("Nível de poluição inválido.");
        }
    }
}

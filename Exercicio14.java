package condicionais;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Exercicio14 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        final int cod1 = 1001;
        final int cod2 = 1324;
        final int cod3 = 6548;
        final int cod4 = 987;
        final int cod5 = 7623;
        double somaTotal = 0;
        boolean entradaValida = false;

        do {
            try {


                System.out.println("Informe o código! ");
                switch (sc.nextInt()) {

                    case cod1, cod4:
                        System.out.println("Informe quantidade");
                        somaTotal = recebeQuantidade(sc.nextInt() * 5.32);
                        imprimeResultado(somaTotal);
                        entradaValida = true;
                        break;

                    case cod2, cod5:
                        somaTotal = recebeQuantidade(sc.nextInt() * 6.45);
                        imprimeResultado(somaTotal);
                        entradaValida = true;
                        break;

                    case cod3:
                        somaTotal = recebeQuantidade(sc.nextInt() * 2.37);
                        imprimeResultado(somaTotal);
                        entradaValida = true;
                        break;

                    default:
                        System.out.println("Opção invalida");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um código válido");
                sc.nextLine();
            }
        }while(!entradaValida);
    }

    static public double recebeQuantidade(double quantidade){
        return quantidade;
    }

    static public void imprimeResultado(double resultado){
        System.out.println("Valor total: " + resultado);
    }
}

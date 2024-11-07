package condicionais;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double redimentoDiario;
        double pesoDosPeixes;
        double multa = 0;
        double excesso;

        pesoDosPeixes = sc.nextDouble();

        if(pesoDosPeixes > 50){
            excesso = pesoDosPeixes - 50;
            multa = excesso * 4;
            System.out.println("Valor total da multa: " + multa);
        }else {
            multa = 0;
            excesso = 0;

            System.out.println("Multa: " + multa + "," + "Excesso: " + excesso);
        }
    }
}

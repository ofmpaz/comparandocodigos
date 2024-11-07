package condicionais;

import java.util.Arrays;
import java.util.Scanner;

public class Extra {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[10];
        String[] nomesImpares = new String[5];
        int indiceImpar = 0;

        for (int i = 0; i < 10; i++) {
            nomes[i] = sc.nextLine();
            if (i % 2 != 0) {
                nomesImpares[indiceImpar] = nomes[i];
                indiceImpar++;
            }
        }

        System.out.println(Arrays.toString(nomesImpares));
    }
}
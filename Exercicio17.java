package condicionais;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int CODIGO_CORRETO = 1234;
        final int SENHA_CORRETA = 9999;

        System.out.println("Informe o código do usuário");
        int codigoUser = sc.nextInt();

        if(codigoUser == CODIGO_CORRETO) {
            System.out.println("Informe a senha");
            int senhaUser = sc.nextInt();
            if (senhaUser == SENHA_CORRETA) {
                System.out.println("Acesso permitido");
            }else {
                System.out.println("Acesso negado");
            }
        } else {
            System.out.println("Usuário inválido!");
        }
    }
}

package CONDIÇÕES_COM_STRINGS;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite a senha correta:");
        String senhacorreta = "1234";
        String senhadigitada = sc.nextLine();

        if (senhadigitada.equalsIgnoreCase(senhacorreta)) {
            System.out.println("senha correta, acesso permitido");
        }else System.out.println("acesso negado, tente novamente");



    }
}

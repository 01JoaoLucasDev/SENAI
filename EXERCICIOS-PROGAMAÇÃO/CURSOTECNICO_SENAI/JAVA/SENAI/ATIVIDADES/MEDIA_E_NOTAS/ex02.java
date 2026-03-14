package MEDIA_E_NOTAS;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        int num1 = sc.nextInt();
        System.out.println("Digite a segunda nota: ");
        int num2 = sc.nextInt();
        double media = (double)(num1 + num2) / (double)2.0F;
        if (media >= (double)7.0F) {
            System.out.println("Parabéns, você foi aprovado!");
        } else if (media >= (double)5.0F && media < (double)7.0F) {
            System.out.println("Lamento, você está de recuperação!");
        } else {
            System.out.println("O aluno foi reprovado.");
        }

        sc.close();
    }
}

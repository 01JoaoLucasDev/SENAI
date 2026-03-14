package MEDIA_E_NOTAS;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma nota ");
        int num1 = sc.nextInt();
        System.out.println("Digite outra nota: ");
        int num2 = sc.nextInt();
        int media = (num1 + num2) / 2;
        if ((num1 + num2) / 2 >= 7) {
            System.out.println("parabens, voce atingiu a media, está aprovado!");
            System.out.println("sua media atual é: " + media);
        }

    }
}

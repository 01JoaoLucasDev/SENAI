package REVISÃO_TERNARIA;

import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Diga um numero: ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("numero positivo");
        } else if (num == 0) {
            System.out.println("zero");
        } else System.out.println("numero negativo");
        sc.close();
    }
}

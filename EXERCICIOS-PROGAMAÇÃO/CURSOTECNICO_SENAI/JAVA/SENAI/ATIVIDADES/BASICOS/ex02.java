package BASICOS;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        System.out.println("escrreva um numero: ");
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        if (valor % 3 == 0) {
            System.out.println("este numero é impar");
        }else if (valor % 2 == 0) {
            System.out.println("este numero é par");
        }
    }
}

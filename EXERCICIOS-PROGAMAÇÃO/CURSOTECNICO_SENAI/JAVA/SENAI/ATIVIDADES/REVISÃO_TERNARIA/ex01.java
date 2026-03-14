package REVISÃO_TERNARIA;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();
        if (numero % 2 == 0){
            System.out.print("par");
        } else System.out.print("impar");
   sc.close(); }
}

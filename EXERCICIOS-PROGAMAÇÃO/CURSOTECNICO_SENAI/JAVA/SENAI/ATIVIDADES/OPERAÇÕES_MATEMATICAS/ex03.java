package OPERAÇÕES_MATEMATICAS;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num1 = sc.nextInt();
        System.out.println("Digite outro numero: ");
        int num2 = sc.nextInt();
        if (num1 % num2 == 0) {
            System.out.println("o numero " +num1+ " é divisivel pelo numero " +num2);
        } else if (num2 % num1 == 0) {
            System.out.println("o numero " + num2 + " é divisivel pelo numero " + num1);
        } else System.out.println("os numeros nao sao divisiveis");
    }
}

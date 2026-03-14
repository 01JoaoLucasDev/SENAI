package MEDIA_E_NOTAS;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();
        double maior = nota1;
        double menor = nota1;
        if (nota2 > nota1) {
            maior = nota2;
        }

        if (nota3 > maior) {
            maior = nota3;
        }

        if (nota2 < nota1) {
            menor = nota2;
        }

        if (nota3 < menor) {
            menor = nota3;
        }

        System.out.println("A maior nota é: " + maior);
        System.out.println("A menor nota é: " + menor);
        sc.close();
    }
}

package PROGAMAÇÃO_MOVIDA_A_OBJETO;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Digite 3 notas: ");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();
        double objeto = conjunto(nota1, nota2, nota3);
        showResult(objeto);

    }

    public static double conjunto(double num1, double num2,double num3) {
        double notamaior;
        if (num1 > num2 && num2 > num3) {
            notamaior = num1;
        } else if (num2 > num1 && num1 > num3) {
            notamaior = num2;
        } else if (num3 > num2 && num2 > num1) {
            notamaior = num3;

        }else notamaior = 0;
        return (notamaior);
    }
    private static void showResult(double value) {
        System.out.println("nota maior: " + value);
    }
}

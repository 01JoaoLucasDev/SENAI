package MEDIA_E_NOTAS;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota que aluno tirou em matematica: ");
        double matematica = sc.nextDouble();
        System.out.println("Digite a nota que aluno tirou em portugues: ");
        double portugues = sc.nextDouble();
        if (matematica >= 10) {
            System.out.println("voce esta aprovado e tirou a nota maxima em matematica");
        }else System.out.println("voce esta reprovado em matematica");
        if (portugues >= 10) {
            System.out.println("voce foi aprovado em portugues e atingiu a nota maxima");
        }else System.out.println("voce foi reprovado em portugues");
    }
}

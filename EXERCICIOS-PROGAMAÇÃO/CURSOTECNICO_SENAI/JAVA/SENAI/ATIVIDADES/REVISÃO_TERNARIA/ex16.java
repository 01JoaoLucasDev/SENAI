package REVISÃO_TERNARIA;

import java.util.Scanner;

public class ex16 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um valor booleano (true/false): ");
            boolean valor = scanner.nextBoolean();

            String resultado = valor ? "Sim" : "Não";

            System.out.println("Resultado: " + resultado);

            scanner.close();
 scanner.close();       }
    }



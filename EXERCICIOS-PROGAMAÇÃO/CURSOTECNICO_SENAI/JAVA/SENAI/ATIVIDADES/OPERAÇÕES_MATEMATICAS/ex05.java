package OPERAÇÕES_MATEMATICAS;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();


        if (isQuadradoPerfeito(numero)) {
            System.out.println(numero + " é um quadrado perfeito.");
        } else {
            System.out.println(numero + " não é um quadrado perfeito.");
        }

        scanner.close();
    }


    public static boolean isQuadradoPerfeito(int numero) {
        if (numero < 0) {
            return false;
        }
        int raiz = (int) Math.sqrt(numero);
        return raiz * raiz == numero;
    }}
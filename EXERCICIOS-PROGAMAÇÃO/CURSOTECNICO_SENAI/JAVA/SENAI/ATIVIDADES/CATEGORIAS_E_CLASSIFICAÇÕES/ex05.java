package CATEGORIAS_E_CLASSIFICAÇÕES;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Celsius: ");
        double temperatura = scanner.nextDouble();
        if (temperatura < 15) {
            System.out.println("O clima etá frio");
        } else if (temperatura >= 15 && temperatura <= 25){
            System.out.println("O clima está agradavel");
        } else if (temperatura > 25) {
            System.out.println("O clima está quente");
        }
}}

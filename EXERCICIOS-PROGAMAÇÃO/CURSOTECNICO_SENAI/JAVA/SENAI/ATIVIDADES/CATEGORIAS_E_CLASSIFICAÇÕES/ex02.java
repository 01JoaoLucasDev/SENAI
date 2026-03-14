package CATEGORIAS_E_CLASSIFICAÇÕES;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();
        if (numero >= 1 && numero <= 10) {
            System.out.println("a faixa de classificação deste numero é A");
        }else if (numero >= 11 && numero <= 20){
                System.out.println("a faixa de classificação deste numero é B");
        } else if (numero >= 21 && numero <= 30){
            System.out.println("a faixa de classificação deste numero é C");
}
        }}
package POO_ATIVIDADES;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   Retangulo retangulo = new Retangulo();
        System.out.println("Digite a largura do retangulo: ");
        retangulo.largura = sc.nextDouble();
        System.out.println("Digite a altura do retangulo: ");
        retangulo.Altura = sc.nextDouble();

        System.out.println("Area do retangulo: " + retangulo.Area());
        System.out.println("Perimetro do retangulo: " + retangulo.perimetro());}

}

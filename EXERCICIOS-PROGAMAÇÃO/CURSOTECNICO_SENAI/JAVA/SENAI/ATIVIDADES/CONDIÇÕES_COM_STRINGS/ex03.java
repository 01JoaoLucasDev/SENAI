package CONDIÇÕES_COM_STRINGS;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um nome:");
        String nome = sc.nextLine().toLowerCase();

        if (nome.charAt(0) == 'a'){
            System.out.println("o nome começa com a");
        } else {
            System.out.println("o nome nao começa com a");
        }
        sc.close();}}


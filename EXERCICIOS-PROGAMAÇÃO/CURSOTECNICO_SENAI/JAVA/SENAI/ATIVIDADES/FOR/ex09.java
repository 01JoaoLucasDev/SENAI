package FOR;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para aparecer a tabuada do mesmo: ");
        int numero = sc.nextInt();
        for
        (int i = 0; i < 11; i++)
            System.out.println("tabuada " + numero +  " x " + i + " = " + ( i * numero ));
   sc.close(); }


}


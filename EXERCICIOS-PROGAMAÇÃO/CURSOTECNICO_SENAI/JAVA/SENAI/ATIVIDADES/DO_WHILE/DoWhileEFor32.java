import java.util.Scanner;

public class DoWhileEFor32 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int numero;

        System.out.println("Digite números para somar (digite 0 para encerrar):");

        do {
            System.out.print("Número: ");
            numero = sc.nextInt();
            soma += numero;
        } while (numero != 0);

        System.out.println("Soma total: " + soma);

        sc.close();
    }
}
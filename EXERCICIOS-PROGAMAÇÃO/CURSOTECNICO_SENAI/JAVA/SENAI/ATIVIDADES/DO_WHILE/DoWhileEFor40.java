import java.util.Scanner;

public class DoWhileEFor40 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int numero;
        int contador = 0;

        System.out.println("Digite números para somar (digite 0 para encerrar):");

        do {
            System.out.print("Número: ");
            numero = sc.nextInt();
            if (numero != 0) {
                contador++;
            }
            soma += numero;
        } while (numero != 0);

        System.out.println("Soma total: " + soma);
        System.out.println("Quantidade de números digitados: " + contador);

        sc.close();
    }
}

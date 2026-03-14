import java.util.Scanner;

public class DoWhileEFor48 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;
        do {
            System.out.print("Digite um número (0 para sair): ");
            number = sc.nextInt();
            if (number != 0) {
                System.out.println(number % 2 == 0 ? "Par" : "Ímpar");
            }
        } while (number != 0);
        sc.close();
    }
}

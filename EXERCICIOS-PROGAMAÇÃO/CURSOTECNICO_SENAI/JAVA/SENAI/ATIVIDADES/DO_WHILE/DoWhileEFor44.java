import java.util.Scanner;

public class DoWhileEFor44 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        int j = 1;
        System.out.print("Divisores de " + num + ": ");
        do {
            if (num % j == 0) {
                System.out.print(j + " ");
            }
            j++;
        } while (j <= num);
        System.out.println();
        sc.close();
    }
}

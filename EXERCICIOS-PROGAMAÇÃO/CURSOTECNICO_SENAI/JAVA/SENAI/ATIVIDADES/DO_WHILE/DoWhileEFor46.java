import java.util.Scanner;

public class DoWhileEFor46 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        int count = 1;
        do {
            System.out.print(n * count + " ");
            count++;
        } while (count <= 10);
        sc.close();
    }
}

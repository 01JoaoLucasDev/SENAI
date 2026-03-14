import java.util.Scanner;

public class DoWhileEFor31 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int number = 0;

        do {
            System.out.print("Type in a number: ");
            number = sc.nextInt();
            System.out.println();
        } while (number >= 0);

        sc.close();
    }
}

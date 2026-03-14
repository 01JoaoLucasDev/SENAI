import java.util.Scanner;

public class DoWhileEFor39 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;

        do {
            System.out.print("Type in a number: ");
            number = sc.nextInt();

            if (number >= 0) {
                System.out.println("Positive number: " + number);
            }

        } while (number >= 0);

        System.out.println("Negative number detected.");

        sc.close();
    }
}

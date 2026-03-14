import java.util.Scanner;

public class DoWhileEFor35 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Type in a number to see its mutiplication table: ");
        int number = sc.nextInt();
        int multiplier = 1;

        do {
            System.out.printf("%d X %d = %d%n", number, multiplier, (multiplier * number));
            multiplier ++;
        } while (multiplier < 11);

        sc.close();
    }
}

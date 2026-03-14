import java.util.Scanner;

public class DoWhileEFor43 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Type in a number: ");
        int number = sc.nextInt();
        int soma = digitSum(Math.abs(number));
        System.out.println("The sum of the digits of the number " + number + " is: " + soma);
        sc.close();
    }
    public static int digitSum(int number) {
        int sum = 0;
        do {
        sum += number % 10;
        number /= 10;
    } while (number > 0);
    return sum;
    }
}

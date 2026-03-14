import java.util.Scanner;

public class DoWhileEFor47 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Type in a number: ");
        int number = sc.nextInt();
        int divisors = 0;
        int i = 1;

        do {
            if (number % i == 0){
                divisors++;
            }
            i++;
        } while (i <= number);
        if (divisors > 2){

            System.out.printf("The number %d is not a prime number.", number);
        } else {

            System.out.printf("The number %d is a prime number.", number);
        }
        
        sc.close();
    }
}

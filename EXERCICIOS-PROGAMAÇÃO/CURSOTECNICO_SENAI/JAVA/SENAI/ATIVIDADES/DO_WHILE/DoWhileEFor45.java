import java.util.Scanner;

public class DoWhileEFor45 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Type in a number: ");
        int max = sc.nextInt();

        int num1 = 0, num2 = 1;

        do {
            System.out.print(num1 + " ");
            int aux = num2 + num1;
            num1 = num2;
            num2 = aux;
        } while (num1 < max);
    
        sc.close();
    }
}

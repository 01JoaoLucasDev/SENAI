import java.util.Scanner;

public class DoWhileEFor52 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numPrimos = 0, candidato = 2;
        do {
            if (ehPrimo(candidato)) {
                System.out.print(candidato + " ");
                numPrimos++;
            }
            candidato++;
        } while (numPrimos < 10);
        System.out.println();

        sc.close();
    }

    public static boolean ehPrimo(int num) {
        if (num < 2) return false;
        int i = 2;
        do {
            if (num % i == 0) return false;
            i++;
        } while (i <= Math.sqrt(num));
        return true;}
}


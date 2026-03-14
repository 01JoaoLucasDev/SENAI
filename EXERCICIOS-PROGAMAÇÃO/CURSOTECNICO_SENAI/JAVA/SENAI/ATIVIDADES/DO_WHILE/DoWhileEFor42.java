import java.util.Scanner;

public class DoWhileEFor42 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String input = sc.nextLine();
        String reversed = "";
        int i = input.length() - 1;
        do {
            reversed += input.charAt(i);
            i--;
        } while (i >= 0);
        System.out.println("Palavra invertida: " + reversed);

    sc.close();
    }
}

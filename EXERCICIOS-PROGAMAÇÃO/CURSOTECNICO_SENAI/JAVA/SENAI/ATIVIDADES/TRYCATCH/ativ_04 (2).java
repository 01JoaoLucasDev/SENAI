import java.util.Scanner;
import java.util.InputMismatchException;

public class ativ_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite um numero");
            int numero1 = scanner.nextInt();
            System.out.println("digite mais um numero");
            int numero2 = scanner.nextInt();

            int soma = numero1 + numero2;

            System.out.println("A soma dos dois números é: " + soma);

        } catch (InputMismatchException e) {
            System.out.println("Erro: Você deve inserir números válidos!");

        } finally {
            scanner.close();
        }
    }
}


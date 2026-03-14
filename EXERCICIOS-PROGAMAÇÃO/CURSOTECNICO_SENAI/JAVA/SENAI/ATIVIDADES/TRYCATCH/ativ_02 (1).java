import java.util.Scanner;

public class ativ_02 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.print("Digite um número: ");
                String input = scanner.nextLine();

                int numero = Integer.parseInt(input);

                System.out.println("Você digitou o número: " + numero);

            } catch (NumberFormatException e) {
                System.out.println("Erro: Você deve inserir um número válido!");

            } finally {

                 scanner.close();
            }
        }
    }



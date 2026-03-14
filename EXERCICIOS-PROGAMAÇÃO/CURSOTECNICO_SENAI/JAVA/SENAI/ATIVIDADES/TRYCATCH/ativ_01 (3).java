import java.util.Scanner;

public class ativ_01 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.print("Digite o primeiro número: ");
                int num1 = scanner.nextInt();

                System.out.print("Digite o segundo número: ");
                int num2 = scanner.nextInt();

                int resultado = num1 / num2;

                System.out.println("Resultado: " + resultado);

            } catch (ArithmeticException e) {
                System.out.println("Erro: Não é possível dividir por zero!");

            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
            } finally {
                scanner.close();
            }
        }
    }



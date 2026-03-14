import java.util.Scanner;

public class atv_03 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.print("Digite um número: ");
                double numero = scanner.nextDouble();

                if (numero < 0) {
                    throw new IllegalArgumentException("Não é possível calcular a raiz quadrada de um número negativo.");
                }

                double raizQuadrada = Math.sqrt(numero);

                System.out.println("A raiz quadrada de " + numero + " é: " + raizQuadrada);

            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());

            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());

            } finally {
                scanner.close();
            }
        }
    }



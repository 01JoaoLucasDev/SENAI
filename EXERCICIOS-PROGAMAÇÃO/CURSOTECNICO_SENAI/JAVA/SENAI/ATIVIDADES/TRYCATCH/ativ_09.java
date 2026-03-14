import java.util.InputMismatchException;
import java.util.Scanner;

class TemperaturaInvalidaException extends Exception {
    public TemperaturaInvalidaException(String message) {
        super(message);
    }
}

public class ativ_09 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.print("Digite a temperatura em Celsius: ");
                double celsius = scanner.nextDouble();

                if (celsius < -273.15) {
                    throw new TemperaturaInvalidaException("Temperatura abaixo do zero absoluto não é válida.");
                }

                double fahrenheit = (celsius * 9/5) + 32;
                System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
            } catch (TemperaturaInvalidaException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Erro: Por favor, insira um número válido para a temperatura.");
            } finally {
                scanner.close();
            }
        }
    }



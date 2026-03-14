import java.util.Scanner;
import java.util.InputMismatchException;
public class ativ_07 {


    public class CalculadoraDeMedia {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double nota1 = 0, nota2 = 0, nota3 = 0;

            try {
                System.out.print("Digite a primeira nota: ");
                nota1 = scanner.nextDouble();

                System.out.print("Digite a segunda nota: ");
                nota2 = scanner.nextDouble();

                System.out.print("Digite a terceira nota: ");
                nota3 = scanner.nextDouble();

                double media = (nota1 + nota2 + nota3) / 3;
                System.out.println("A média das notas é: " + media);

            } catch (InputMismatchException e) {
                System.out.println("Erro: Por favor, insira um número válido para as notas.");
            } finally {
                scanner.close();
            }
        }
    }

}

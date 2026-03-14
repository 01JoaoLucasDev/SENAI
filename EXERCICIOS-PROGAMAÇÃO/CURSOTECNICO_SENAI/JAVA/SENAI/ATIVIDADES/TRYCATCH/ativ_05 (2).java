import java.util.Scanner;

public class ativ_05 {
    public class ExemploArray {
        public static void main(String[] args) {
            int[] numeros = {10, 20, 30, 40, 50};

            Scanner scanner = new Scanner(System.in);

            System.out.print("Informe o índice do elemento que deseja acessar (0 a 4): ");
            int indice = scanner.nextInt();

            try {
                System.out.println("Elemento no índice " + indice + ": " + numeros[indice]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Erro: Índice fora dos limites do array. Tente um índice entre 0 e 4.");
            } finally {
                scanner.close();
            }
        }
    }
}

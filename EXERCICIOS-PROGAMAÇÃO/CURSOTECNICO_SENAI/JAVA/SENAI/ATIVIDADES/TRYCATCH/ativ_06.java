import java.util.Scanner;

// Exceção personalizada
class DadosInvalidosException extends Exception {
    public DadosInvalidosException(String message) {
        super(message);
    }
}

public class ativ_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();

            if (nome.isEmpty() || idade < 0) {
                throw new DadosInvalidosException("Nome vazio ou idade negativa não são permitidos.");
            }

            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);

        } catch (DadosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

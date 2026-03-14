import java.util.Scanner;
class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException(String message) {
        super(message);
    }
}
public class ativ_08 {



    public class VerificacaoIdade {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.print("Digite a sua idade: ");
                int idade = scanner.nextInt();

                if (idade < 0) {
                    throw new IdadeInvalidaException("Idade não pode ser negativa.");
                }

                if (idade >= 18) {
                    System.out.println("Você é maior de idade.");
                } else {
                    System.out.println("Você é menor de idade.");
                }
            } catch (IdadeInvalidaException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Erro: Entrada inválida.");
            } finally {
                scanner.close();
            }
        }
    }

}

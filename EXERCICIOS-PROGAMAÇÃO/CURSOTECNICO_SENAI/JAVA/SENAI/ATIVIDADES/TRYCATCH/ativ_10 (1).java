import java.util.Scanner;

class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String message) {
        super(message);
    }
}

class LimiteFatorialExcedidoException extends Exception {
    public LimiteFatorialExcedidoException(String message) {
        super(message);
    }
}

public class ativ_10 {
    public static int fatorial(int n) throws NumeroNegativoException, LimiteFatorialExcedidoException {
        if (n < 0) {
            throw new NumeroNegativoException("Não é possível calcular o fatorial de um número negativo.");
        }
        if (n > 20) {
            throw new LimiteFatorialExcedidoException("O número é muito grande para o cálculo de fatorial.");
        }
        if (n == 0) {
            return 1;
        }
        return n * fatorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número para calcular o fatorial: ");
            int numero = scanner.nextInt();

            int resultado = fatorial(numero);
            System.out.println("O fatorial de " + numero + " é: " + resultado);
        } catch (NumeroNegativoException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (LimiteFatorialExcedidoException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro: Entrada inválida.");
        } finally {
            scanner.close();
        }
    }
}

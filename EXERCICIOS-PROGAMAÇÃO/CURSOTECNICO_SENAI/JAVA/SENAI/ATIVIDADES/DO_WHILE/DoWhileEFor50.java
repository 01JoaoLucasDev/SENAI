import java.util.Scanner;

public class DoWhileEFor50 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senha;
        int SenhaCorreta = 123456;
        do {
            System.out.print("Digite a senha: ");
            senha = sc.nextInt();
        } while (senha == SenhaCorreta);
        System.out.println("Acesso concedido!");

        sc.close();
    }
}

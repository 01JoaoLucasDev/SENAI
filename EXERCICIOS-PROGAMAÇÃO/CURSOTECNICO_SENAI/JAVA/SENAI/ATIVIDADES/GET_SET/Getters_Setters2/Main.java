package Getters_Setters2;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("Maria");

        conta.depositar(500.0);
        conta.depositar(150.0);


        System.out.println("Saldo atual: R$ " + conta.exibirSaldo());

        conta.sacar(200.0);
        System.out.println("Saldo após saque: R$ " + conta.exibirSaldo());

          // Tentando sacar um valor maior que o saldo
        conta.sacar(500.0);
    }
}



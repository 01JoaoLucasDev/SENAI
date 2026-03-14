package Program3;

public class Main {
        public static void main(String[] args) {
            ContaBancaria conta1 = new ContaBancaria("João", 1500.0, "Poupança");
            ContaBancaria conta2 = new ContaBancaria("Maria");

            conta1.exibirInformacoes();
            conta2.exibirInformacoes();
        }
    }


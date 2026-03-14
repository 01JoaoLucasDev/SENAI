package DECISOES_FINANCEIRAS;

public class ex01 {
    public class VerificaSaldo {
        public static void main(String[] args) {
            double saldo = 1000.0;
            double valorSaque = 200.0;
            boolean saldoSuficiente = saldo >= valorSaque;
            System.out.println("Saldo suficiente para saque: " + saldoSuficiente);
        }
    }}


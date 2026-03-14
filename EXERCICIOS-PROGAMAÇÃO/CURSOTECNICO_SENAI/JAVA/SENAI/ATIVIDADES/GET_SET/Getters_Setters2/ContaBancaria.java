package Getters_Setters2;

import java.util.Locale;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String nome) {
       titular = nome;
    }
    public void depositar(double Valor) {
        if (Valor > 0) {
            saldo += Valor;
            System.out.println("O valor de " + Valor + " foi depositado com sucesso");
        } else {
            System.out.println("Deposito invalido");
        }
    }
    public void Sacar(double Valor) {
        if (Valor <= saldo && Valor > 0) {
            System.out.println("O valor de saque de " + Valor + " foi aprovado!");
        } else if (Valor > saldo) {
            System.out.println("Valor disponivel insuficiente, tente novamente com um valor mais baixo");
        } else {
            System.out.println("valor invalido");
        }
    }
    public double exibirSaldo() {
        return saldo;
    }


    public String getTitular() {
        return titular;
    }

    public void sacar(double v) {
    }
}


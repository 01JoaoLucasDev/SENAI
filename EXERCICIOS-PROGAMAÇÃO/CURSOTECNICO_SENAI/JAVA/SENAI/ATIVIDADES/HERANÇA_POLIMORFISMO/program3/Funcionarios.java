package program3;

public class Funcionarios {
 protected  String nome;
 protected double salarioBase;

    public Funcionarios(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public double calcularSalario() {
        return salarioBase;
 }
}

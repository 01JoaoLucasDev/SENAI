package program3;

class Dev extends Funcionarios {
    public Dev(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 1.10; // Aumento de 10%
    }
}
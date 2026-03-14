package Getters_Setters3;

public class Produto {
    private  String nome;
    private double preco;
    private int estoque;
    public void Verificarvalor(double preco) {
        if (preco < 0) {
            System.out.println("Valor invalido, digite um valor positivo");
        } else {
            System.out.println("preço: " + preco);
        }
    }

}

package DECISOES_FINANCEIRAS;

public class ex04 {
    public class CompraParcelada {
        public static void main(String[] args) {
            double salario = 4000.0;
            double valorProduto = 2400.0;
            int numeroParcelas = 6;
            boolean podeParcelar = (valorProduto / numeroParcelas) <= (salario * 0.1);
            System.out.println("Pode comprar parcelado: " + podeParcelar);
        }
    }

}

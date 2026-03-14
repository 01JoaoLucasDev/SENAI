package DECISOES_FINANCEIRAS;

public class ex02 {
    public class CalculoDesconto {
        public static void main(String[] args) {
            double valorTotal = 600.0;
            double desconto = valorTotal > 500 ? valorTotal * 0.1 : 0;
            double valorFinal = valorTotal - desconto;
            System.out.println("Valor final após desconto: R$" + valorFinal);
        }
    }

}

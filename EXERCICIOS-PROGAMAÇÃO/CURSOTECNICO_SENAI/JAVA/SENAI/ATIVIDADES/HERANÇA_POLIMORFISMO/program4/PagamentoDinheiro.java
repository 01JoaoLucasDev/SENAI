package program4;

public class PagamentoDinheiro extends Pagamento {
    public PagamentoDinheiro(String cartao, String dinheiro, String pix) {
        super(cartao, dinheiro, pix);
    }

    @Override
    public double pagamentoDinheiro() {
        System.out.println("Pagamento em dinheiro recebido");
        return 1; // Exemplo de retorno, pode ser alterado conforme a lógica
    }
}


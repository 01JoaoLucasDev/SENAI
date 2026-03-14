package POO_ATIVIDADE;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class principal {
    private static Map<String, pedido> pedidos = new HashMap<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        pedidos.put("1", new pedido("1", status.PENDENTE));
        pedidos.put("2", new pedido("2", status.EM_TRANSITO));
        pedidos.put("3", new pedido("3", status.ENTREGUE));
        pedidos.put("4", new pedido("4", status.CANCELADO));
        System.out.print("Digite o codigo do pedido: ");
        String codigo = scanner.nextLine();

        pedido pedido = pedidos.get(codigo);
        if (pedido != null) {
            System.out.println("Status do pedido " + codigo + ": " + pedido.getStatus());
        } else {
            System.out.println("Pedido nao encontrado");
        }
        scanner.close();
    }
}

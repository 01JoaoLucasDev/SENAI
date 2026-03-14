package POO_ATIVIDADE2;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            Account produto = new Account();


            System.out.println("Digite os dados do produto:");
            System.out.print("Nome: ");
            produto.nome = scanner.nextLine();
            System.out.print("Preço: ");
            produto.preco = scanner.nextDouble();
            System.out.print("Quantidade em estoque: ");
            produto.quantidadeEmEstoque = scanner.nextInt();


            produto.exibirDadosProduto();


            while (true) {
                System.out.print("Digite o número de produtos a serem adicionados ao estoque (ou 0 para sair): ");
                int quantidadeAdicionada = scanner.nextInt();

                if (quantidadeAdicionada == 0) {
                    break;
                }

                produto.adicionarEstoque(quantidadeAdicionada);
                produto.exibirDadosProduto();
            }

            scanner.close();
        }
    }



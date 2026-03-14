package POO_ATIVIDADE2;

import java.util.Scanner;

public class Account {
        String nome;
        double preco;
        int quantidadeEmEstoque;

        public void exibirDadosProduto() {
            double total = preco * quantidadeEmEstoque;
            System.out.printf("Produto: %s, R$ %.2f, %d unidades, total: R$ %.2f\n", nome, preco, quantidadeEmEstoque, total);
        }


        public void adicionarEstoque(int quantidade) {
            quantidadeEmEstoque += quantidade;
        }
    }


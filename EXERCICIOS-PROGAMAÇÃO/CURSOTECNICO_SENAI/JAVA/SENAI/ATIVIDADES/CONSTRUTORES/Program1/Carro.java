package Program1;

public class Carro {
        private String marca;
        private int ano;

        public Carro(String marca, int ano) {
            this.marca = marca;
            this.ano = ano;
        }

        public void exibirInformacoes() {
            System.out.println("Marca: " + marca + ", Ano: " + ano);
        }
    }




package FOR;

public class ex27 {
        public static void main(String[] args) {
            int[] numeros = {1, 2, 3, 4, 5};
            int soma = 0;

            for (int numero : numeros) {
                soma += numero;
            }

            System.out.println("A soma dos números do vetor é: " + soma);
        }
    }


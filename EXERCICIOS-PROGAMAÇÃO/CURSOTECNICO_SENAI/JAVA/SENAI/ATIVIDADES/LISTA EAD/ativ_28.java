package lista.ead;

public class ativ_28 {
        public static void main(String[] args) {
            int[][] matriz = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            int maiorElemento = Integer.MIN_VALUE;

            for (int[] linha : matriz) {
                for (int elemento : linha) {
                    if (elemento > maiorElemento) {
                        maiorElemento = elemento;
                    }
                }
            }

            System.out.println("Maior elemento da matriz: " + maiorElemento);
        }
    }



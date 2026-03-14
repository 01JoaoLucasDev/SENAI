package FOR;

public class ex24 {
        public static void main(String[] args) {
            System.out.println("Números triangulares até o décimo termo:");

            for (int n = 1; n <= 10; n++) {
                int numeroTriangular = (n * (n + 1)) / 2;
                System.out.println("T(" + n + ") = " + numeroTriangular);
            }
        }
    }


package MATH_E_EXPRESSOES_ARITMETICAS;

public class sqrtVETORES {
    public static void main(String[] args) {
        double [] raizquadrada = {16, 81, 2, 0, 144, 225, 0.25, 1, 10, 400, 0.04, 121, 625, 50, 900, 10000, 0.001, 36, 49, 169};

        for (int i = 0;i < raizquadrada.length; i++) {
            double valor = Math.sqrt(raizquadrada[i]);

            if (i == 2){
                System.out.printf("%.2f", valor);
            } else{
                System.out.println(valor);
            }

        }
    }
}

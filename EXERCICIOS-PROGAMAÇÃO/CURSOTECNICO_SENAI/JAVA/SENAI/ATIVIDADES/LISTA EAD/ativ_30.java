package lista.ead;
import java.util.ArrayList;
import java.util.List;
public class ativ_30 {

    public class SubstituirNegativosPorZero {
        public static void main(String[] args) {
            List<Integer> numeros = new ArrayList<>();
            numeros.add(-10);
            numeros.add(20);
            numeros.add(-30);
            numeros.add(40);
            numeros.add(-50);

            for (int i = 0; i < numeros.size(); i++) {
                if (numeros.get(i) < 0) {
                    numeros.set(i, 0);
                }
            }

            System.out.println("Lista após substituir os negativos por zero:");
            for (int numero : numeros) {
                System.out.print(numero + " ");
            }
        }
    }

}

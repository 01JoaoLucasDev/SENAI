package lista.ead;
import java.util.ArrayList;
import java.util.List;
public class ativ_21 {


    public class ForEachExemplo {
        public static void main(String[] args) {
            List<Integer> numeros = new ArrayList<>();
            numeros.add(10);
            numeros.add(20);
            numeros.add(30);
            numeros.add(40);
            numeros.add(50);

            System.out.println("Elementos da lista:");
            for (int numero : numeros) {
                System.out.println(numero);
            }
        }
    }

}

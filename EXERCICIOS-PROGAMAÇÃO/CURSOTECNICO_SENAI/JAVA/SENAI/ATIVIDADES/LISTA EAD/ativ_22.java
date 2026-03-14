package lista.ead;
import java.util.ArrayList;
import java.util.List;

public class ativ_22 {


    public class SomaListaForEach {
        public static void main(String[] args) {
            List<Integer> numeros = new ArrayList<>();
            numeros.add(10);
            numeros.add(20);
            numeros.add(30);
            numeros.add(40);
            numeros.add(50);

            int soma = 0;
            for (int numero : numeros) {
                soma += numero;
            }

            System.out.println("A soma de todos os elementos da lista é: " + soma);
        }
    }

}

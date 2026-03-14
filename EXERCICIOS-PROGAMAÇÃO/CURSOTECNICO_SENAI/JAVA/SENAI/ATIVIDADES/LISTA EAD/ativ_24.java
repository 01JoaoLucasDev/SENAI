package lista.ead;
import java.util.ArrayList;
import java.util.List;

public class ativ_24 {
    public static void main(String[] args) {
                List<Integer> numeros = new ArrayList<>();
                numeros.add(10);
                numeros.add(15);
                numeros.add(22);
                numeros.add(37);
                numeros.add(44);
                numeros.add(56);
                numeros.add(61);
                numeros.add(72);
                numeros.add(89);
                numeros.add(90);

                System.out.println("Números pares na lista:");
                for (int numero : numeros) {
                    if (numero % 2 == 0) {
                        System.out.println(numero);
                    }
                }
            }
        }


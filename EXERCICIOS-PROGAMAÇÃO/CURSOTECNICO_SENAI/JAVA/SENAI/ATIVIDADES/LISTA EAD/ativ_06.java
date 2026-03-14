package lista.ead;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ativ_06 {
    public static void main(String[] args) {
                List<Integer> numeros = new ArrayList<>();

                for (int i = 1; i <= 10; i++) {
                    numeros.add(i);
                }

                Iterator<Integer> iter = numeros.iterator();
                while (iter.hasNext()) {
                    if (iter.next() % 2 != 0) {
                        iter.remove();
                    }
                }

                System.out.println(numeros);
            }
        }



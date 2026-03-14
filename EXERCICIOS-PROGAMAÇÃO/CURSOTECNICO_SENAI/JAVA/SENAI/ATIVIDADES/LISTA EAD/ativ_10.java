package lista.ead;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ativ_10 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<Integer> lista1 = new ArrayList<>();
            List<Integer> lista2 = new ArrayList<>();
            List<Integer> lista3 = new ArrayList<>();

            System.out.println("Digite 5 números para a primeira lista:");
            for (int i = 0; i < 5; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                lista1.add(scanner.nextInt());
            }

            // Solicita os números para a segunda lista
            System.out.println("\nDigite 5 números para a segunda lista:");
            for (int i = 0; i < 5; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                lista2.add(scanner.nextInt());
            }

            // Junta as duas listas na terceira
            lista3.addAll(lista1);
            lista3.addAll(lista2);

            // Exibe a terceira lista
            System.out.println("\nLista resultante da junção:");
            System.out.println(lista3);

            scanner.close();
        }
    }


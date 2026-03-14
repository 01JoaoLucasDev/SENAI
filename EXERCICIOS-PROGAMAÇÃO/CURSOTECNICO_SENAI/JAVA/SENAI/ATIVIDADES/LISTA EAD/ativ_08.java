package lista.ead;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ativ_08 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                List<String> nomes = new ArrayList<>();

                System.out.println("Digite 5 nomes:");

                for (int i = 0; i < 5; i++) {
                    System.out.print("Nome " + (i + 1) + ": ");
                    nomes.add(scanner.nextLine());
                }

                Collections.sort(nomes);

                System.out.println("\nNomes em ordem alfabética:");
                for (String nome : nomes) {
                    System.out.println(nome);
                }

                scanner.close();
            }
        }



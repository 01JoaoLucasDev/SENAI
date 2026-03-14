package lista.ead;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ativ_23{
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                List<Integer> numeros = new ArrayList<>();
                numeros.add(10);
                numeros.add(20);
                numeros.add(30);
                numeros.add(40);
                numeros.add(50);

                System.out.print("Digite o valor para multiplicar os números da lista: ");
                int multiplicador = scanner.nextInt();

                System.out.println("\nResultados da multiplicação:");
                for (int numero : numeros) {
                    int resultado = numero * multiplicador;
                    System.out.println(numero + " * " + multiplicador + " = " + resultado);
                }

                scanner.close();
            }
        }


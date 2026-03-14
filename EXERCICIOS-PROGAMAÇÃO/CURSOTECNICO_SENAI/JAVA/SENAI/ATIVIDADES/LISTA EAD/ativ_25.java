package lista.ead;
import java.util.ArrayList;
import java.util.List;

public class ativ_25 {


    public class SaudacaoForEach {
        public static void main(String[] args) {
            List<String> nomes = new ArrayList<>();
            nomes.add("João");
            nomes.add("Maria");
            nomes.add("Carlos");
            nomes.add("Ana");
            nomes.add("Pedro");

            for (String nome : nomes) {
                System.out.println("Olá, " + nome + "!");
            }
        }
    }

}

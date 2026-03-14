import java.util.Scanner;

public class DoWhileEFor41 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Type a word: ");
        String word = sc.nextLine();

        int i = 0;

        do {
            System.out.println(word.charAt(i));
            i++;
        } while (i < word.length());

        sc.close();
    }
}

import java.util.Random;

public class DoWhileEFor49 {
    public static void main(String[] args) {

        Random random = new Random();
        
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String password = "";
        int count = 0;

        do {
            int index = random.nextInt(characters.length());
            password += characters.charAt(index);
            count++;
        } while (count < 6);

        System.out.println("Generated password: " + password);
    }
}

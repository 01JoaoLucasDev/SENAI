public class DoWhileEFor53 {
    public static void main(String[] args) {
        
        int number = 1;
        int count = 1;
        
        do {
            count++;
            System.out.println(number);
            number += count;
        } while (count < 10);
    }
}

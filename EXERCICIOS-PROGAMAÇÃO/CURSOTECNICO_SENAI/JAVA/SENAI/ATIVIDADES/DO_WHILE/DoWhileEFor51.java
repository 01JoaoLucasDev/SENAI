public class DoWhileEFor51 {
    public static void main(String[] args) {
        int number = 1;
        int count = 0;

        do {
            int sum = 0;
            int i = 1;

            do {
                if (number % i == 0) {
                    sum += i;
                }
                i++;
            } while (i < number);

            if (sum == number) {
                System.out.println(number);
                count++;
            }
            number++;
        } while (count < 10);
    }
}

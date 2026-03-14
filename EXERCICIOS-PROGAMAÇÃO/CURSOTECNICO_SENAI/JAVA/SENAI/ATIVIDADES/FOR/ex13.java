package FOR;

public class ex13 {
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1;

        System.out.println("Primeiros 10 termos da sequência de Fibonacci:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int proximoTermo = a + b;
            a = b;
            b = proximoTermo;
        }
    }
}

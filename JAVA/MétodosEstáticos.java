public class Matematica {

    public static int fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Fatorial de 5 é: " + Matematica.fatorial(5));
        System.out.println("Fatorial de 7 é: " + Matematica.fatorial(7));
    }
}

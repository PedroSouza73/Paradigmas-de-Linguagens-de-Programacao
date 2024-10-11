import java.util.Scanner;

class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois ou três números separados por espaço:");
        String input = scanner.nextLine();
        String[] numerosStr = input.split(" ");
        
        int[] numeros = new int[numerosStr.length];
        for (int i = 0; i < numerosStr.length; i++) {
            numeros[i] = Integer.parseInt(numerosStr[i]);
        }

        if (numeros.length == 2) {
            System.out.println("A soma é: " + calc.somar(numeros[0], numeros[1]));
        } else if (numeros.length == 3) {
            System.out.println("A soma é: " + calc.somar(numeros[0], numeros[1], numeros[2]));
        } else {
            System.out.println("Por favor, digite dois ou três números.");
        }
    }
}

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner num = new Scanner(System.in);

        System.out.println("Insira o raio: ");
        double raio = num.nextDouble();

        double pi = 3.14159;

        double resultado = pi * (raio * raio);

        System.out.printf("O resultado: " + resultado);

        num.close();
    }
}
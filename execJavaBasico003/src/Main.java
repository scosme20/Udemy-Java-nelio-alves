import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a temperatura em celsius (C):");
        double temp = sc.nextDouble();

        double fah = (double) temp * 9 / 5 + 32;

        System.out.printf("A temperatura em fahrenheit é: %.2f.%n", fah);
        sc.close();
    }
}
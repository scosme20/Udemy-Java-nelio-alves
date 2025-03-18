import java.util.Locale;
import java.util.Scanner;
import entities.dolar;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o preço do dolar:");
        double priceDollar = sc.nextDouble();

        System.out.println("Insira a quantidade: ");
        double amount = sc.nextDouble();

        double result = dolar.dollarConversor(amount, priceDollar);
        System.out.printf("O resultado é: %.2f", result);

        sc.close();
    }
}
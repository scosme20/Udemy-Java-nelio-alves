import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o código da peça 1: ");
        int codigo1 = sc.nextInt();

        System.out.println("Insira o número de peças 1: ");
        int numeroPeça1 = sc.nextInt();

        System.out.println("Insira o valor unitário da peça 1:");
        double valorPeça1 = sc.nextDouble();

        System.out.println("Insira o código da peça 2: ");
        int codigo2 = sc.nextInt();

        System.out.println("Insira o número de peças 2: ");
        int numeroPeça2 = sc.nextInt();

        System.out.println("Insira o valor unitário da peça 2:");
        double valorPeça2 = sc.nextDouble();

        double valorAPagar = ((double) numeroPeça1 * valorPeça1) + ((double) numeroPeça2 * valorPeça2);

        System.out.printf("Valor a pagar: R$ %.2f ", valorAPagar);

        sc.close();
    }
}
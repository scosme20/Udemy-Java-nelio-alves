import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números voce vai digitar ?");
        int numero = sc.nextInt();

        double[] sVet = new double[numero];

        for (int i = 0; i < numero; i++){
            System.out.println("Digite um número:");
            sVet[i] = sc.nextDouble();
        }
        System.out.println(Arrays.toString(sVet));

        double sum = 0.0;

        for(int i = 0; i < numero; i++){
            sum += sVet[i];
            System.out.printf("Soma: %.2f.%n", sum);
        }

        double divisao = sum / numero;
        System.out.printf("Media: %.2f.%n", divisao);

        sc.close();
    }
}
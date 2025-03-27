import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter ?");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for(int i = 0; i < n; i++){
            System.out.println("Digite um número:");
            vect[i] = sc.nextDouble();
        }

        double soma = 0;
        double media = 0;

        for(int i = 0; i < n; i++){
            soma = soma + vect[i];
        }

        media = soma / n;

        System.out.println("Media do vetor:" + media);

        System.out.println("Elementos abaixo da média:");
        for (int i = 0; i < n; i++){
            if(vect[i] < media) {
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}
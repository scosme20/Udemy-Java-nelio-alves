import java.util.Collection;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a quantidade de números:");
        int n = sc.nextInt();
        double[] posicao = new double[n];

        for(int i = 0; i < n; i++){
            System.out.println("Digite um número:");
            posicao[i] = sc.nextDouble();
        }

        double maior = posicao[0];
        int posMaior = 0;


        for(int i = 0; i < n; i++){
            if(posicao[i] > maior){
                maior = posicao[i];
                posMaior = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f\n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posMaior);

        sc.close();
    }
}
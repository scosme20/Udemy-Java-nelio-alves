import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números serão adicionados ao array :");
        int n = sc.nextInt();
        int[] arrayA = new int[n];
        int[] arrayB = new int[n];


        System.out.println("Insira os valores do vetor A:");
        for(int i = 0; i < n; i++){
            System.out.println("Digite um número:");
            arrayA[i] = sc.nextInt();
        }

        System.out.println("Insira os valores do vetor B:");
        for(int i = 0; i < n; i++){
            System.out.println("Digite um número:");
            arrayB[i] = sc.nextInt();
        }

        int[] soma = new int[arrayA.length];

        for (int i = 0; i <arrayA.length; i++){
            soma[i] = arrayA[i] + arrayB[i];
        }

        System.out.println("Soma:");
        for(int num : soma) {
            System.out.println(num + " ");
        }
        sc.close();
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor ?");
        int n = sc.nextInt();
        int[] vec = new int[n];
        int quant = 0;
        int soma = 0;

        for(int i = 0; i < n; i++){
            System.out.println("Digite um número");
            vec[i] = sc.nextInt();
        }
        System.out.println("Média dos pares:");
        for (int i = 0; i < n; i++){
            if (vec[i] % 2 == 0 ){
                soma = soma + vec[i];
                quant++;
            }
        }

        if(quant == 0){
            System.out.println("Nenhum número par");
        } else {
            double calc = (double) soma / quant;
            System.out.println(calc);
        }
        sc.close();
    }
}
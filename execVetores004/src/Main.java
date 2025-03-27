import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você deseja digitar ?");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Digite um número:");
            vect[i] = sc.nextInt();
        }

        int par = 0;

        System.out.println("Números pares: ");
        for (int i = 0; i < n; i++){
            if(vect[i] % 2 == 0){
                System.out.println(vect[i]);
                par = par + 1;
            }
        }

        System.out.println("Quantidade de pares: " + par);

        sc.close();
    }
}
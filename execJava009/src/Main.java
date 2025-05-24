import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a quantidade de repetições:");
        int contador = sc.nextInt();
        int num = 0;
        int soma = 0;

        while(num < contador){
            System.out.println(num);
            num++;
            soma = soma + num;
        }
        System.out.println(soma);
        sc.close();
    }
}
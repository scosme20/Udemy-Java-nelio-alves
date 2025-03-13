import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        int num1 = num.nextInt();

        System.out.println("Insira o segundo número: ");
        int num2 = num.nextInt();


        int soma = num1 + num2;

        System.out.println("O resultado é " +soma);

        num.close();
    }
}
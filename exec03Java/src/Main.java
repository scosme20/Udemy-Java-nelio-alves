import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        int a = num.nextInt();

        System.out.println("Insira o segundo número: ");
        int b = num.nextInt();

        System.out.println("Insira o terceiro número: ");
        int c = num.nextInt();

        System.out.println("Insira o quarto número: ");
        int d = num.nextInt();

        int resultado = (a * b - c * d);

        System.out.println(resultado);
        num.close();
    }
}
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor de a:");
        double a = sc.nextDouble();

        System.out.println("Insira o valor de b:");
        double b = sc.nextDouble();

        System.out.println("Insira o valor de c:");
        double c = sc.nextDouble();

        double areaT = (a * c) / 2;
        double areaC = 3.14159 * ( c * c );
        double areaTr = ((a + b ) * c) / 2;
        double areaB = b * b;
        double areaR = a * b;

        sc.close();

        System.out.printf("Triangulo: %.3f.%n", areaT);
        System.out.printf("Círculo: %.3f.%n", areaC);
        System.out.printf("Trapézio: %.3f.%n", areaTr);
        System.out.printf("Quadrado: %.3f.%n", areaB);
        System.out.printf("Retângulo: %.3f.%n", areaR);
    }
}
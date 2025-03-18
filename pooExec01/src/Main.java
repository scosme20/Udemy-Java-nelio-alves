import java.util.Locale;
import java.util.Scanner;
import entities.rectangle;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        rectangle rectangle = new rectangle();

        System.out.println("Insira a altura: ");
        rectangle.height = sc.nextDouble();

        System.out.println("Insira a largura");
        rectangle.width = sc.nextDouble();

        double area = rectangle.area();
        double perimeter = rectangle.perimeter();
        double diagonal = rectangle.diagonal();

        System.out.println(area);
        System.out.println(perimeter);
        System.out.println(diagonal);

        sc.close();
    }
}
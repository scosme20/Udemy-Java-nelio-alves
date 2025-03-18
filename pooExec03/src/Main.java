import java.util.Locale;
import java.util.Scanner;
import entities.student;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        student student = new student();

        System.out.println("Insira o nome do estudante: ");
        student.name = sc.nextLine();

        System.out.println("Insira a primeira nota:");
        student.noteOne = sc.nextDouble();

        System.out.println();

        System.out.println("Insira a segunda nota:");
        student.noteTwo = sc.nextDouble();

        System.out.println();

        System.out.println("Insira a terceira nota: ");
        student.noteThree = sc.nextDouble();

        double result = student.showResult();

        if (student.showResult() > 60.00){
            System.out.printf("Final grade: %.2f.%n", student.showResult());
            System.out.println("Pass");
        } else {
            System.out.printf("Final grade: %.2f.%n", student.finalYear());
            System.out.println("Failed");
            System.out.printf("Missing Points: %.2f.%n", student.showResult());
        }
        sc.close();
    }
}
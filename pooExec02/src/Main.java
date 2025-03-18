import java.util.Locale;
import java.util.Scanner;
import entities.employee;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        employee employee = new employee();

        System.out.println("Insira o nome do funcionário: ");
        employee.name = sc.nextLine();

        System.out.println("Insira o salário bruto: ");
        employee.grossSalary = sc.nextDouble();

        System.out.println("Insira a taxa: ");
        employee.tax = sc.nextDouble();

        double total = employee.netSalary();
        System.out.println(total);

        System.out.println("Deseja adicionar um aumento ?");
        double increase = sc.nextDouble();
        employee.increaseSalary(increase);

        System.out.println("Updated data: " + employee);

        sc.close();
    }
}
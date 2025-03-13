import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o número do funcionário: ");
        int numFunc = sc.nextInt();

        System.out.println("Insira o número de horas trabalhadas: ");
        int horas = sc.nextInt();

        System.out.println("Insira o valor por horas: ");
        double valor = sc.nextDouble();

        double salario = (double) horas * valor;

        System.out.println("Number =  " + numFunc);
        System.out.println("Salary =  U$"+salario);

        sc.close();
    }
}
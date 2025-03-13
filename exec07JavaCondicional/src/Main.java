import java.util.Scanner;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);

        System.out.println("Insira o valor do eixo x:");
        double x = sc.nextDouble();

        System.out.println("Insira o valor do eixo y:");
        double y = sc.nextDouble();

        if(x > 0 && y > 0){
            System.out.println("Quadrante: Q1");
        }
        else if (x > 0 && y < 0) {
            System.out.println("Quadrante: Q4");
        }
        else if (x < 0 && y < 0) {
            System.out.println("Quadrante: Q3");
        }
        else if (x < 0 && y > 0) {
            System.out.println("Quadrante: Q2");
        }
        else {
            System.out.println("Origem do quadrante");
        }

        sc.close();
    }
}
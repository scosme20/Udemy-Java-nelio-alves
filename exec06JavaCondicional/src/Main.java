import java.util.Scanner;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor do intervalo:");
        double valorIntervalo = sc.nextDouble();

        if(valorIntervalo >= 0.0 && valorIntervalo <= 25.00){
            System.out.println("Intervalo: [0 , 25] ");
        }
        else if (valorIntervalo >= 25.01 && valorIntervalo <= 50.00) {
            System.out.println("Intervalo: [25 , 50] ");
        }
        else if (valorIntervalo >= 50.01 && valorIntervalo <= 75.00) {
            System.out.println("Intervalo: [50 , 75] ");
        }
        else if (valorIntervalo >= 75.01 && valorIntervalo <= 100.00) {
            System.out.println("Intervalo: [75 , 100] ");
        }
        else {
            System.out.println("Fora de intervalo.");
        }

        sc.close();
    }
}
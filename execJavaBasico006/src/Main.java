import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int nota = sc.nextInt();

        if(nota >= 60){
            System.out.println("Aprovado");
        } else if (nota > 40 && nota <= 59) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        sc.close();
    }
}
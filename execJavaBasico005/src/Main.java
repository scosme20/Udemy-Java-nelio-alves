import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número:");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }

        sc.close();
    }
}
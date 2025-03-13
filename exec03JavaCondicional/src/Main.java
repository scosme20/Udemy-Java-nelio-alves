import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        int num1 = sc.nextInt();

        System.out.println("Insira o segundo número:");
        int num2 = sc.nextInt();

        if(num1 % num2 == 0 || num2 % num1 == 0){
            System.out.println("Os números " + num1 + " e " + num2 + " são multiplos");
        } else {
            System.out.println("Os números " + num1 + " e " + num2 + " não são multiplos");
        }

        sc.close();
    }
}
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número:");
        int num = sc.nextInt();

        for(int i = 0; i <= 10; i++){
            int mult = num * i;
            System.out.println(mult);
        }

        sc.close();
    }
}
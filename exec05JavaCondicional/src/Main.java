import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o código do pedido:");
        int codigo = sc.nextInt();

        System.out.println("Insira a quantidade:");
        int quantidade = sc.nextInt();

        if(codigo == 1 ){
            double valor = 4.00;
            double resultado = quantidade * valor;
            System.out.printf("Valor total: R$%.2f", resultado);

        } else if (codigo == 2) {
            double valor = 4.50;
            double resultado = quantidade * valor;
            System.out.printf("Valor total: R$%.2f", resultado);

        } else if (codigo == 3) {
            double valor = 5.00;
            double resultado = quantidade * valor;
            System.out.printf("Valor total: R$%.2f", resultado);

        } else if (codigo == 4) {
            double valor = 2.00;
            double resultado = quantidade * valor;
            System.out.printf("Valor total: R$%.2f", resultado);

        } else if (codigo == 5) {
            double valor = 1.50;
            double resultado = quantidade * valor;
            System.out.printf("Valor total: R$%.2f", resultado);

        } else {
            System.out.println("Por favor insira um código válido!");
        }

        sc.close();
    }
}
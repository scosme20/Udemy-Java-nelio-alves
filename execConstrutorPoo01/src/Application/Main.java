package Application;

import java.util.Locale;
import java.util.Scanner;
import entities.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = null;

        System.out.println("Insira o nome do titular da conta: ");
        String nome = sc.nextLine();

        System.out.println("Insira o número da conta:");
        int numeroConta = sc.nextInt();

        System.out.println("Deseja criar uma conta e adicionar saldo ?");
        char opcao = sc.next().charAt(0);

        if (opcao == 'y'){
            System.out.println("Insira o valor do deposito inicial:");
            double saldo = sc.nextDouble();
            conta = new ContaBancaria(nome, numeroConta, saldo);
            System.out.println(conta);
        } else if (opcao == 'n') {
            conta = new ContaBancaria(nome, numeroConta);
            System.out.println(conta);
        }

        System.out.println("Deseja realizar um deposito ?");
        char opcao2 = sc.next().charAt(0);

        if (opcao2 == 'y'){
            System.out.println("Insira o valor :");
            double saldo = sc.nextDouble();
            conta.addSaldo(saldo);
            System.out.println(conta);
        } else {
            System.out.println(conta);
        }

        System.out.println("Deseja realizar um saque ?");
        char opcao3 = sc.next().charAt(0);

        if(opcao3 == 'y'){
            System.out.println("Insira o valor do saque:");
            double valor = sc.nextDouble();
            conta.saque(valor);
            System.out.println(conta);
        } else if (opcao3 == 'n') {
            System.out.println(conta);
        } else {
            System.out.println("Insira um valor válido.");
        }

        sc.close();
    }
}
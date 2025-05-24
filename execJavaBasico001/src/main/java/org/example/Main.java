package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        int num1 = sc.nextInt();
        System.out.println("Insira o segundo número:");
        int num2 = sc.nextInt();
        int soma = num1 + num2;
        System.out.println("A soma dos valores é: " + soma);
        sc.close();
    }
}
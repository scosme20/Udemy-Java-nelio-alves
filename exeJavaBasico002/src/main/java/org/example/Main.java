package org.example;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor da altura do triangulo:");
        double altura = sc.nextDouble();

        System.out.println("Insira o valor da base do triangulo:");
        double base = sc.nextDouble();

        double area = altura * base;

        System.out.printf("O valor da area do triangulo é: %.2f.%n", area);
        sc.close();
    }
}
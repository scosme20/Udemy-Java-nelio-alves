package Application;

import Entities.DadosP;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão inseridas?");
        int n = sc.nextInt();
        DadosP[] pessoas = new DadosP[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da pessoa %d: ", i + 1);
            double altura = sc.nextDouble();
            System.out.printf("Gênero da pessoa %d (M/F): ", i + 1);
            char gender = sc.next().toUpperCase().charAt(0);
            pessoas[i] = new DadosP(altura, gender);
        }

        double maiorAltura = pessoas[0].getAltura();
        double menorAltura = pessoas[0].getAltura();

        for (int i = 0; i < n; i++) {
            if (pessoas[i].getAltura() > maiorAltura) {
                maiorAltura = pessoas[i].getAltura();
            }
            if (pessoas[i].getAltura() < menorAltura) {
                menorAltura = pessoas[i].getAltura();
            }
        }

        int contadorM = 0;
        int contadorF = 0;
        double alturaF = 0.0;

        for (int i = 0; i < n; i++) {
            if (pessoas[i].getGender() == 'M') {
                contadorM++;
            } else if (pessoas[i].getGender() == 'F') {
                contadorF++;
                alturaF += pessoas[i].getAltura();
            }
        }

        double alturaMediaF = (contadorF > 0) ? (alturaF / contadorF) : 0.0;

        System.out.printf("Menor altura = %.2f\n", menorAltura);
        System.out.printf("Maior altura = %.2f\n", maiorAltura);
        if (contadorF > 0) {
            System.out.printf("Média das alturas das mulheres = %.2f\n", alturaMediaF);
        } else {
            System.out.println("Nenhuma mulher na lista para calcular a média de altura.");
        }
        System.out.println("Quantidade de homens: " + contadorM);

        sc.close();
    }
}

package Application;

import Entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos serão inseridos ?");
        int n = sc.nextInt();
        Aluno[] dados = new Aluno[n];

        for(int i = 0; i < n; i++){
            System.out.println("Digite nome do aluno");
            String nome = sc.next();
            sc.nextLine();
            System.out.println("Primeira nota:");
            double nota1 = sc.nextDouble();
            System.out.println("Segunda Nota:");
            double nota2 = sc.nextDouble();
            dados[i] = new Aluno(nome, nota1, nota2);
            System.out.println(dados[i].getNome());
        }
        double media = 0;

        System.out.println("Alunos Aprovados:");
        for(int i = 0; i < n; i++){
            media = (dados[i].getPrimeiroB() + dados[i].getSegundoB()) / 2;
            if(media >= 6.0){
                System.out.println(dados[i].getNome());
            }
        }

        sc.close();

    }
}
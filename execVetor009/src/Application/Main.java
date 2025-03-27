package Application;

import Entities.Pessoa;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas você vai inserir ?");
        int n = sc.nextInt();
        Pessoa[] dados = new Pessoa[n];

        for(int i = 0; i < n; i++){
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.println("Nome:");
            String nome = sc.next();
            System.out.println("Idade");
            int idade = sc.nextInt();
            dados[i] = new Pessoa(nome, idade);
        }

        int idademaisVelho = dados[0].getIdade();
        String nomeMaisVelho = dados[0].getNome();

        for(int i = 0; i < n; i++){
            if(dados[i].getIdade() > idademaisVelho){
                idademaisVelho = dados[i].getIdade();
                nomeMaisVelho = dados[i].getNome();
            }
        }
        System.out.println("A pessoa mais velha é " + nomeMaisVelho + " com " + idademaisVelho + " anos.");

        sc.close();
    }
}
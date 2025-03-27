package Application;


import Entities.Pessoas;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão inseridas: ");
        int n = sc.nextInt();
        Pessoas[] vect = new Pessoas[n];

        for(int i = 0; i < n; i++){
            System.out.println("Insira os dados da pessoa:");
            System.out.println("Nome:");
            String nome = sc.next();
            sc.nextLine();
            System.out.println("Idade:");
            int idade = sc.nextInt();
            System.out.println("Altura:");
            double altura = sc.nextDouble();
            vect[i] = new Pessoas(nome, idade, altura);
        }

            for(Pessoas p: vect){
                
                p.exibir();
            }

        double media = 0.0;
        for (int i = 0; i < n; i++){
            media += vect[i].getAltura() / n;
        }
        System.out.printf("Altura média: %.2f.%n", media);

        int cont = 0;

        for(int i  = 0; i < n; i++ ){
            if(vect[i].getIdade() < 16){
                cont = cont + 1;
            }
        }

        double percent = cont * 100.0 / n;
        System.out.println("Pessoas com menos de 16 anos de idade: " +percent + "%.");

        
        sc.close();
    }
}
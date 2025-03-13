import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o horario de início do jogo:");
        int inicio = sc.nextInt();

        System.out.println("Insira o horário de final do jogo:");
        int fim = sc.nextInt();


        if(inicio > fim){
            int duracao = 24 - (inicio - fim) ;
            System.out.println("O jogo durou " + duracao + " horas.");

        } else if (inicio < fim ) {
            int duracao = fim - inicio;
            System.out.println("O jogo durou " + duracao + " horas.");
        } else {
            System.out.println("O jogo durou 24 horas");
        }

        sc.close();

    }
}
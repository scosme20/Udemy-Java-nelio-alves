package Entities;

public class Aluno {
    private String nome;
    private double primeiroB;
    private double segundoB;

    public Aluno(String nome, double primeiroB, double segundoB) {
        this.nome = nome;
        this.primeiroB = primeiroB;
        this.segundoB = segundoB;
    }

    public String getNome() {
        return nome;
    }

    public double getPrimeiroB() {
        return primeiroB;
    }

    public double getSegundoB() {
        return segundoB;
    }
}

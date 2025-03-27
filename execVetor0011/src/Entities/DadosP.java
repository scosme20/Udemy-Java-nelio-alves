package Entities;

public class DadosP {
    private double altura;
    private char gender;

    public DadosP(double altura, char gender) {
        this.altura = altura;
        this.gender = gender;
    }

    public double getAltura() {
        return altura;
    }

    public char getGender() {
        return gender;
    }
}

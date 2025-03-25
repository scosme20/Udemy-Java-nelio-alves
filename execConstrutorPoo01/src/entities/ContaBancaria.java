package entities;

public class ContaBancaria {
    private String nomeTitular;
    private int numeroConta;
    private double saldo;

    public ContaBancaria(String nomeTitular, int numeroConta, double saldo)  {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public ContaBancaria(String nomeTitular, int numeroConta){
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void addSaldo(double valor){
        if(valor > 0){
            saldo += valor;
        } else {
            System.out.println("O valor para depósito tem que ser maior que 0.00");
        }
    }

    public void saque(double valor){
        if(valor > 0 && valor <= saldo){
            saldo -= valor;
        } else {
          saldo -= valor;
            System.out.println("Você está negativado.");
        }
    }

    public String toString(){
        return "Numero da conta: "
                + numeroConta
                +", "
                +"Nome do titular:"
                + nomeTitular
                + ", $"
                + String.format("%.2f", saldo);
    }
}

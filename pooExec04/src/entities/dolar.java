package entities;

public class dolar {

    public static double IOF = 0.06;
    public static double dollarConversor(double amount, double dollarPrice){
        return amount * dollarPrice * (1.0 + IOF);
    }
}

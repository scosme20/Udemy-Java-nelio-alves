package entities;

public class student {
    public String name;
    public double noteOne;
    public double noteTwo;
    public double noteThree;


    public double finalYear(){
        double finalYear = (noteOne + noteTwo + noteThree);
        return finalYear;
    }

    public double showResult(){
        if (finalYear() < 60.00){
            double negative = 60.00 - finalYear();
            return negative;
        } else {
            return finalYear();
        }
    }
}

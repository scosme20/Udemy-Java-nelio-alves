package entities;

public class rectangle {
    public double width;
    public double height;

    public double area() {
        double areaR = width * height;
        return  areaR;
    }

    public double perimeter(){
        double perimeterR = 2 * (width + height);
        return perimeterR;
    }

    public double diagonal(){
        double diagonalR = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
        return diagonalR;
    }
}

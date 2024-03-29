package Problema5;

public class Sedan extends Car {
    private int length;
 
    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    @Override
    public double getSalePrice() {
        if (length > 20) {
            return super.getRegularPrice() * 0.95;
        } else {
            return super.getRegularPrice() * 0.90;
        }
    }
 
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}


package Aufgabe_1;

public class Complex {
    private double aDouble, bDouble;
    private String singleExpression;


    public Complex() {

    }

    public Complex(double aDouble, double bDouble) {
        this.aDouble = aDouble;
        this.bDouble = bDouble;
        char imaginaryNumber = 'i';
        this.singleExpression = this.aDouble + "+" + this.bDouble + imaginaryNumber;
    }


    Complex add(Complex other) {
        double realPart = this.aDouble + other.aDouble;
        double imaginayPart = this.bDouble + other.bDouble;
        return new Complex(realPart, imaginayPart);
    }

    Complex sub(Complex other) {
        double realPart = this.aDouble - other.aDouble;
        double imaginayPart = this.bDouble - other.bDouble;
        return new Complex(realPart, imaginayPart);
    }


    Complex mul(Complex other) {
        double realPart = this.aDouble * other.aDouble - this.bDouble * other.bDouble;
        double imaginayPart = this.aDouble * other.bDouble + this.bDouble * other.aDouble;
        return new Complex(realPart, imaginayPart);
    }


    Complex div(Complex other) {
        double realPart = (this.aDouble * other.aDouble + this.bDouble * other.bDouble / Math.pow(other.aDouble, 2)) + (Math.pow(
            other.bDouble, 2));
        double imaginayPart = (this.bDouble * other.aDouble - this.aDouble * other.bDouble) / (Math.pow(other.aDouble, 2) + Math.pow(
            other.bDouble, 2));
        return new Complex(realPart, imaginayPart);
    }
    public boolean equals(Complex other) {
        if(aDouble == other.aDouble && bDouble == other.bDouble){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return singleExpression.toString();
    }
}

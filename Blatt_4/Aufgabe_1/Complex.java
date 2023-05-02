
public class Complex {
    private double aDouble, bDouble;
    private String singleExpression;


    public Complex() {
        aDouble = 0;
        bDouble = 0;
    }

    public Complex(double aDouble, double bDouble) {
        this.aDouble = aDouble;
        this.bDouble = bDouble;
        char imaginaryNumber = 'i';
        this.singleExpression = this.aDouble + "+" + this.bDouble + imaginaryNumber;
    }


    public Complex add(Complex other) {
        double realPart = this.aDouble + other.aDouble;
        double imaginayPart = this.bDouble + other.bDouble;
        return new Complex(realPart, imaginayPart);
    }

    public Complex sub(Complex other) {
        double realPart = this.aDouble - other.aDouble;
        double imaginayPart = this.bDouble - other.bDouble;
        return new Complex(realPart, imaginayPart);
    }


    public Complex mul(Complex other) {
        double realPart = this.aDouble * other.aDouble - this.bDouble * other.bDouble;
        double imaginayPart = this.aDouble * other.bDouble + this.bDouble * other.aDouble;
        return new Complex(realPart, imaginayPart);
    }


    public Complex div(Complex other) {
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

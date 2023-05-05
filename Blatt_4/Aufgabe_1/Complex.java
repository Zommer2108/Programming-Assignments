package Complex;
public class Complex {
    private double real;
    private double imag;

    // Constructors
    public Complex() {
        real = 0.0;
        imag = 0.0;
    }

    public Complex(double r, double i) {
        real = r;
        imag = i;
    }

    // Getter and setter methods
    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setReal(double r) {
        real = r;
    }

    public void setImag(double i) {
        imag = i;
    }

    // Arithmetic operations
    public Complex add(Complex other) {
        double r = real + other.real;
        double i = imag + other.imag;
        return new Complex(r, i);
    }

    public Complex sub(Complex other) {
        double r = real - other.real;
        double i = imag - other.imag;
        return new Complex(r, i);
    }

    public Complex mul(Complex other) {
        double r = real * other.real - imag * other.imag;
        double i = real * other.imag + imag * other.real;
        return new Complex(r, i);
    }

    public Complex div(Complex other) {
        double denom = other.real * other.real + other.imag * other.imag;
        double r = (real * other.real + imag * other.imag) / denom;
        double i = (imag * other.real - real * other.imag) / denom;
        return new Complex(r, i);
    }

    // Override toString() method
    public String toString() {
        return "(" + real + " + " + imag + "i)";
    }

    // Override equals() method
    public boolean equals(Complex other) {
        return (real == other.real) && (imag == other.imag);
    }
}

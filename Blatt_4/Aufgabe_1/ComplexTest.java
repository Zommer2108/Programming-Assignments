package Complex;

public class ComplexTest {
    public static void main(String[] args) {
        // Test case 1: Addition
        Complex a = new Complex(3.0, 4.0);
        Complex b = new Complex(1.0, 2.0);
        Complex c = a.add(b);
        System.out.println(a + " + " + b + " = " + c);

        // Test case 2: Subtraction
        Complex d = new Complex(5.0, 7.0);
        Complex e = new Complex(2.0, 3.0);
        Complex f = d.sub(e);
        System.out.println(d + " - " + e + " = " + f);

        // Test case 3: Multiplication
        Complex g = new Complex(2.0, 3.0);
        Complex h = new Complex(4.0, -1.0);
        Complex i = g.mul(h);
        System.out.println(g + " * " + h + " = " + i);

        // Test case 4: Division
        Complex j = new Complex(-2.0, 5.0);
        Complex k = new Complex(3.0, -4.0);
        Complex l = j.div(k);
        System.out.println(j + " / " + k + " = " + l);

        // Test case 5: Imaginary unit squared
        Complex m = new Complex(0.0, 1.0);
        Complex n = m.mul(m);
        Complex expected = new Complex(-1.0, 0.0);
        boolean result = n.equals(expected);
        System.out.println(m + " squared = " + n + ", expected " + expected + ": " + result);
    }
}


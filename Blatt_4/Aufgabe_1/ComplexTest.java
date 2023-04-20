package Aufgabe_1;

public class ComplexTest {
    public static void main(String[] args) {
        Complex newNumberOne = new Complex(5.0, 4.0);
        Complex newNumberTwo= new Complex(10.0, 8.0);
        Complex testOne = new Complex(0.0, 0.0);
        Complex testTwo = new Complex(0.0, 0.0);

        System.out.println(newNumberOne.toString());
        System.out.println(newNumberTwo.toString() + "\n");
        System.out.println(newNumberOne.add(newNumberTwo) + "\n" + newNumberOne.sub(newNumberTwo) + "\n" +
            newNumberOne.mul(newNumberTwo) + "\n" + newNumberOne.div(newNumberTwo) + "\n");

        System.out.println(testOne.mul(testTwo));
        System.out.println(newNumberOne.equals(newNumberTwo));
    }
}

package FormatDemo;

public class FormatDemo {
	
    public static void main(String[] args) {
    	
        int x = 42;
        double d = 3.14159;
        intFormatDemo(x);
        doubleFormatDemo(d);
    }

    public static void intFormatDemo(int x) {
    	
        System.out.println("Ganzzahlige Formatierung:");
        System.out.println("Dezimal: " + x);
        System.out.println("Hexadezimal: " + Integer.toHexString(x));
        System.out.println("Oktal: " + Integer.toOctalString(x));
        System.out.println("Binär: " + Integer.toBinaryString(x));
    }

    public static void doubleFormatDemo(double d) {
    	
        System.out.println("Gleitkommazahlige Formatierung:");
        System.out.println("Standard: " + d);
        System.out.printf("Wissenschaftlich: %e%n", d);
        System.out.printf("Dezimal mit 2 Nachkommastellen: %.2f%n", d);
        System.out.printf("Dezimal mit Tausendertrennzeichen: %,f%n", d);
    }
}



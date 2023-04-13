package FormatDemo;

public class FormatDemoF {
	
    public static void main(String[] args) {
    	
        doubleFormatDemo(2.5);
        doubleFormatDemo(3.141592653);
        doubleFormatDemo(1e12);
        doubleFormatDemo(-0.0001234);
    }

    public static void intFormatDemo(int x) {
        String formatted = String.format("Formatted int: %d", x);
        System.out.println(formatted);
    }

    public static void doubleFormatDemo(double d) {
        String formatted = String.format("Formatted double: %.5f", d);
        System.out.println(formatted);
    }
}

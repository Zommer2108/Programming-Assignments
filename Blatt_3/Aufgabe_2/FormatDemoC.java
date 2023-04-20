package FormatDemo;

public class FormatDemoC {
    public static void main(String[] args) {
        int x = -42;                          //irgendeine Zahl
        double d = 3.14159;                   //irgendeine KommaZahl
        intFormatDemo(x);
        System.out.println();
        doubleFormatDemo(d);
    }

    public static void intFormatDemo(int x) {
        System.out.println("Formatierte Ausgabe von ganzzahligem Wert: " + x);
        System.out.printf("Dezimalzahl mit Vorzeichen: %+d%n", x);
        System.out.printf("Hexadezimalzahl mit Präfix '0x': 0x%X%n", x);
        System.out.println("Binärzahl mit Präfix '0b': 0b" + Integer.toBinaryString(x));   //Integer.toBinaryString(x)
        System.out.printf("Dezimalzahl in eckigen Klammern (linksbündig): [%-10d]%n", x);
        System.out.printf("Dezimalzahl in eckigen Klammern (rechtsbündig): [%10d]%n", x);
    }

    public static void doubleFormatDemo(double d) {
        System.out.println("Formatierte Ausgabe von Gleitkommazahl: " + d);
        System.out.printf("Standardformat: %f%n", d);
        System.out.printf("Wissenschaftliches Format: %e%n", d);
        System.out.printf("Dezimalformat mit 2 Nachkommastellen: %.2f%n", d);
        System.out.printf("Dezimalformat mit Tausendertrennzeichen: %,f%n", d);
    }
}


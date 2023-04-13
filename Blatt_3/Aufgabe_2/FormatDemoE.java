package FormatDemo;
import java.util.Formatter;

public class FormatDemoE{
    public static void main(String[] args) {
        intFormatDemo(100);
        intFormatDemo(1023);
        intFormatDemo(0xFFF1234);
        intFormatDemo(-3);

        doubleFormatDemo(1234.5678);
    }

    public static void intFormatDemo(int x) {
        System.out.println("Dezimalzahl mit Vorzeichen: " + String.format("%+d", x));
        System.out.println("8-stellige Hexadezimalzahl: " + String.format("0x%8X", x));
        System.out.println("32-stellige Zahl im Binärsystem: " + String.format("0b%s", Integer.toBinaryString(x)).replace(" ", "0"));
        System.out.println("Dezimalzahl in eckigen Klammern (linksbündig): " + String.format("[%10d]", x));
        System.out.println("Dezimalzahl in eckigen Klammern (rechtsbündig): " + String.format("[%-10d]", x));
        System.out.println();
    }

    public static void doubleFormatDemo(double d) {
        System.out.println("Dezimalzahl mit zwei Stellen hinter dem Komma: " + String.format("%25.2f", d));
        System.out.println("Dezimalzahl in wissenschaftlicher Notation: " + String.format("%25.2E", d));
        System.out.println("Hexadezimales Exponentialformat: " + String.format("%25a", d));
    }
}

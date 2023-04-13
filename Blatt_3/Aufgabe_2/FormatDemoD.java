package FormatDemo;

public class FormatDemoD {

    public static void main(String[] args) {
        intFormatDemo(100);
        intFormatDemo(1023);
        intFormatDemo(0xFFF1234);
        intFormatDemo(-3);
    }

    public static void intFormatDemo(int x) {
        System.out.printf("Dezimalzahl mit Vorzeichen: %+d%n", x);
        System.out.printf("8-stellige Hexadezimalzahl: 0x%8X%n", x);
        System.out.printf("32-stellige Binärzahl: 0b%s%n", Integer.toBinaryString(x).replace(" ", "0"));
        System.out.printf("Dezimalzahl in eckigen Klammern (linksbündig): [%-10d]%n", x);
        System.out.printf("Dezimalzahl in eckigen Klammern (rechtsbündig): [%10d]%n", x);
    }
}


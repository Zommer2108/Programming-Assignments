package Quersumme;

import java.util.Scanner;

public class Quersumme {
    // Methode zur Berechnung der Quersumme für Dezimalzahlen
    public static int quersumme(int x) {
        int sum = 0;
        while (x != 0) {
            sum += x % 10; // Letzte Ziffer zur Summe hinzufügen
            x /= 10; // Letzte Ziffer entfernen
        }
        return sum;
    }

    // Methode zur Berechnung der Quersumme für Hexadezimalzahlen
    public static int quersummeHex(String hex) {
        int sum = 0;
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            } else {
                int value = Integer.parseInt(String.valueOf(c), 16);
                sum += value;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie eine Dezimalzahl ein (maximal dreistellig): ");
        int zahl = scanner.nextInt(); // Dezimalzahl von der Konsole einlesen
        scanner.nextLine(); // Absorbieren des Zeilenumbruchs
        System.out.print("Geben Sie eine Hexadezimalzahl ein (maximal dreistellig): ");
        String hex = scanner.nextLine(); // Hexadezimalzahl von der Konsole einlesen
        scanner.close();
        int quersummeDezimal = quersumme(zahl); // Quersumme für Dezimalzahl berechnen
        int quersummeHexadecimal = quersummeHex(hex); // Quersumme für Hexadezimalzahl berechnen
        System.out.println("Die Quersumme von " + zahl + " (Dezimal) ist: " + quersummeDezimal);
        System.out.println("Die Quersumme von " + hex + " (Hexadezimal) ist: " + quersummeHexadecimal);
        System.out.println("Die Quersumme von " + hex + " (Hexadezimal) als Hexadezimalzahl ist: " + Integer.toHexString(quersummeHexadecimal)); // Quersumme als Hexadezimalzahl ausgeben
    }
}


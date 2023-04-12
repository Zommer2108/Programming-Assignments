package Aufgabe_1;

import java.util.Scanner;

public class Quersumme {

    static int quersumme(int x) {
        int quersumme = 0;
        while (x != 0) {
            quersumme += x % 10;
            x /= 10;
        }
        return quersumme;
    }

    static String quersummeHex(String eingabeZahl) {
        int calcSum = 0;
        int digitSum = 0;
        char[] eingabeZahlLiterale = eingabeZahl.toCharArray();

        if (checkIfHexNumber(eingabeZahlLiterale)) {

            for (int i = 0; i < eingabeZahlLiterale.length; i++) {

                if (Character.isLetter(eingabeZahlLiterale[i])) {

                    calcSum += returnNumberFromHex(eingabeZahlLiterale[i]);

                } else {

                    calcSum += Character.digit(eingabeZahlLiterale[i], 16);
                }
            }

            digitSum = calcSum;

        } else {

            digitSum = quersumme(Integer.parseInt(eingabeZahl));
        }

        return Integer.toHexString(digitSum).toUpperCase();
    }

    private static int returnNumberFromHex(char character) {
        int returnValue = 0;

        switch (character) {
            case ('A'):
                returnValue = 10;
                break;

            case ('B'):
                returnValue = 11;
                break;

            case ('C'):
                returnValue = 12;
                break;
            case ('D'):
                returnValue = 13;
                break;
            case ('E'):
                returnValue = 14;
                break;
            case ('F'):
                returnValue = 15;
                break;
            default:
                return returnValue;
        }
        return returnValue;
    }

    private static boolean checkIfHexNumber(char[] charArray) {
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLetter(charArray[i])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Zu berechnende Zahl: ");
        int zahl = userInput.nextInt();
        int quit = 0;
        int modus = 0;

        while (quit == 0) {
            System.out.println("Das ist der Quersummenrechner");
            System.out.println("(1) Wenn Sie die Quersumme einer Dezimalzahl berechnen wollen \n" +
                "(2) Wenn Sie die Quersumme als Hexadezimalzahl wollen (die Eingabe nimmt auch Dezimalzahlen entgegen!");
            modus = userInput.nextInt();

            switch (modus) {
                case 1:
                    System.out.print("Bitte geben Sie die Zahl für die Berechnung der Quersumme ein: ");
                    zahl = userInput.nextInt();
                    System.out.println("Quersumme von " + zahl + " ist: " + quersumme(zahl));
                    break;
                case 2:
                    System.out.print("Bitte geben Sie die Hexadezimal- oder Dezimalzahl \n" +
                        " für die Berechnung der Quersumme ein: ");
                    zahl = userInput.nextInt();
                    System.out.println("Quersumme von " + zahl + "HEX ist: " + quersummeHex(zahl));
                default:
                    System.out.printf("Ungültige Eingabe!");
            }
            System.out.print("Programm beenden? (0 = Nein), (1 = Ja)");
            switch (userInput.nextInt()){
                case 1:
                    quit = 1;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Ungültige Eingabe!");
                    break;
            }


        /*
        Es macht mehr sinn eine Klassenmethode zu verwenden, da die Zahl unabhängig von
        der Instanz berechnet werden kann. Man braucht nicht für jede Zahl ein Objekt zu erstellen sondern kann bzw.
        sollte sie direkt berechnen können
         */

            //Klassenmethode
            System.out.println("Quersumme von " + zahl + " ist: " + quersumme(zahl));

            //"gewöhnliche" Methode
            Quersumme_b quersumme = new Quersumme_b();
            System.out.println(quersumme(zahl));

            System.out.print("Zu berechende Hexadezimalzahl eingeben: ");
            String hexZahl = userInput.next();


            userInput.close();


        }
    }
}

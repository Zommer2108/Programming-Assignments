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
        int digitSum = 0;
        char[] eingabeZahlLiterale = eingabeZahl.toCharArray();

        //Checks if calculating number is a hex number if not we can directly form the digit sum
        if (checkIfHexNumber(eingabeZahlLiterale)) {

            for (int i = 0; i < eingabeZahlLiterale.length; i++) {

                //Checking if the digit is a letter or digit for proper calculations
                if (Character.isLetter(eingabeZahlLiterale[i])) {
                    digitSum += returnNumberFromHex(eingabeZahlLiterale[i]);

                } else {
                    digitSum += Character.digit(eingabeZahlLiterale[i], 16);
                }
            }

        } else {

            digitSum = quersumme(Integer.parseInt(eingabeZahl));
        }

        return Integer.toHexString(digitSum).toUpperCase();
    }

    /**
     * Method to return the numeric value of hex numbers.
     * Was too lazy to remove it, there are easier ways.
     * Like subtracting character - 55
     *
     * @param character is the input to decide which numeric value to get
     * @return returns either the value when it is not a char or the numeric value of the corresponding char
     */
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

    /**
     * Checks if the char array includes at least one character
     *
     * @param charArray array that is going to be checked
     * @return true when there is a char found, false if it does not
     */
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
        String hexZahl;
        int zahl = 0;
        int quit = 0;
        int modus = 0;


        System.out.println("Das ist der Quersummenrechner");
        System.out.println("Geben Sie (1) ein wenn Sie die Quersumme einer Dezimalzahl berechnen wollen \n" +
            "Geben Sie (2) ein wenn Sie die Quersumme als Hexadezimalzahl wollen (die Eingabe nimmt auch Dezimalzahlen entgegen!");
        System.out.print("Eingabe: ");
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
                hexZahl = userInput.next();
                System.out.println("Quersumme von " + hexZahl + "HEX ist: " + quersummeHex(hexZahl));
                break;
            default:
                System.out.printf("Ungültige Eingabe!");
                break;
        }
        userInput.close();
    }
}

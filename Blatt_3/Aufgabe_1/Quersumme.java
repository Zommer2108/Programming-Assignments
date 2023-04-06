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

        if (checkIfHexNumber(eingabeZahlLiterale)) {
            char[] eingabeZahlLiterale = new char[eingabeZahl.length()];

            for (int i = 0; i < eingabeZahlLiterale.length - 1; i++) {
                eingabeZahlLiterale[i] = eingabeZahl.charAt(i);
            }

            /*
            TODO Hier weitermachen, ausrechnen des Wertes der Hexa-
            dezimalzahl und hinzufügen zu einem neuer Quersumme die
            wieder in eine Hexadezimalzahl umgeformt werden soll.
             */
            int digitPosition = 0;
            for(int j = eingabeZahlLiterale.length-1; j >= 0; j--){
                if(eingabeZahlLiterale[digitPosition])
            }
        }

        int quersumme = quersumme(Integer.parseInt(eingabeZahl));
        return transformToHexNumber(quersumme);
    }

    static boolean checkIfHexNumber(char[] charArray) {
        for (int i = 0; i < charArray.length - 1; i++) {
            if (Character.isLetter(charArray[i])) {
                return true;
            }
        }
        return false;
    }

    static String transformToHexNumber(int calcNumber) {
        int counter = 0;
        int[] hexNumber = new int[lengthInteger(calcNumber)];
        String returnValue = "";

        while (calcNumber != 0) {
            hexNumber[counter] = calcNumber % 16;
            calcNumber /= 16;
            counter++;
        }

        for (int i = hexNumber.length - 1; i >= 0; i--) {
            if (hexNumber[i] > 9) {
                returnValue += (55 + hexNumber[i]);
            }
            returnValue += hexNumber[i];
        }
        return returnValue;
    }

    static int lengthInteger(int integer) {
        int lengthCounter = 0;
        while (integer != 0) {
            integer /= 10;
            lengthCounter++;
        }
        return lengthCounter;
    }

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Zu berechnende Zahl: ");
        int zahl = userInput.nextInt();

        /*
        Es macht mehr sinn eine Klassenmethode zu verwenden, da die Zahl unabhängig von
        der Instanz berechnet werden kann. Man braucht nicht für jede Zahl ein Objekt zu erstellen sondern kann bzw.
        sollte sie direkt berechnen können
         */

        //Klassenmethode
        System.out.println("Quersumme von " + zahl + " ist: " + quersumme(zahl));

        //"gewöhnliche" Methode
        Quersumme quersumme = new Quersumme();
        System.out.println(quersumme(zahl));

        System.out.print("Zu berechende Hexadezimalzahl eingeben: ");
        String hexZahl = userInput.next();
        System.out.println("Quersumme von " + hexZahl + "HEX ist: " + quersummeHex(hexZahl));

        userInput.close();


    }
}

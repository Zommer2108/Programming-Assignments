package Aufgabe_1;

public class Quersumme {

    static int quersumme(int x) {
        int quersumme = 0;
        while (x != 0) {
            quersumme += x % 10;
            x /= 10;
        }
        return quersumme;
    }

    /*
    TODO Diese Methode. Methode muss unterscheiden können zwischen
    Hex-Zahlen und Dezimalzahlen. Vermutung ist: falls kein Buchstabe vorhanden
    dann ist es eine Dezimalzahl, falls doch ist es eine Hex-Zahl. Beim rechnen
    muss die normale Dezimalzahl einfach die Quersumme gebildet werden und als HEX-Zahl
    zurückgegeben werden. Wenn es eine Hex-Zahl ist muss diese:
    1. In eine Dezimalzahl umgewandelt werden (ausrechenen mit 16-Potenzbasis)
    2. Diese Dezimalzahl wird dann gleichzeitig in die quersummen-Variabel auf adiert (13+12+67 anstatt die ganze Zahl)
    3. fertige Quersumme dann mit der transformToHex zur einer Hexadezimalzahl umwandeln.
     */
    static String quersummeHex(String eingabeZahl) {
        int quersumme = 0;
        int digitPosition = 0;
        char[] eingabeZahlLiterale = new char[eingabeZahl.length()];

        for (int i = 0; i < eingabeZahlLiterale.length - 1; i++) {
            eingabeZahlLiterale[i] = eingabeZahl.charAt(i);
        }
        if (checkIfHexNumber(eingabeZahlLiterale)) {




            for (int j = eingabeZahlLiterale.length - 1; j >= 0; j--) {
                if (Character.isLetter(eingabeZahlLiterale[digitPosition])) {
                    quersumme += Math.pow(16.0, (double) j) * returnNumberFromHex(eingabeZahlLiterale[digitPosition]);
                }
                quersumme += Math.pow(16.0, (double) j) * returnNumberFromHex(eingabeZahlLiterale[digitPosition]);
                digitPosition++;
            }
        }
        for (int k = eingabeZahlLiterale.length - 1; k >= 0; k--) {
            quersumme += Math.pow(16.0, (double) k) * (eingabeZahlLiterale[digitPosition]);
            digitPosition++;
        }

        return transformToHexNumber(quersumme);
    }

    static int returnNumberFromHex(char character) {
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
            hexNumber[counter] = calcNumber % 10;
            calcNumber /= 10;
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
/*
        Scanner userInput = new Scanner(System.in);
        System.out.print("Zu berechnende Zahl: ");
        int zahl = userInput.nextInt();

        /*
        Es macht mehr sinn eine Klassenmethode zu verwenden, da die Zahl unabhängig von
        der Instanz berechnet werden kann. Man braucht nicht für jede Zahl ein Objekt zu erstellen sondern kann bzw.
        sollte sie direkt berechnen können
         */
/*
        //Klassenmethode
        System.out.println("Quersumme von " + zahl + " ist: " + quersumme(zahl));

        //"gewöhnliche" Methode
        Quersumme quersumme = new Quersumme();
        System.out.println(quersumme(zahl));

        System.out.print("Zu berechende Hexadezimalzahl eingeben: ");
        String hexZahl = userInput.next();
        System.out.println("Quersumme von " + hexZahl + "HEX ist: " + quersummeHex(hexZahl));

        userInput.close();
*/

        String hexZahl = "159";

        System.out.println("Quersumme von " + hexZahl + " ist: " + quersummeHex(hexZahl));

    }
}

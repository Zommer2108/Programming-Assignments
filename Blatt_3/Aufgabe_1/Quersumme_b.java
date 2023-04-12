package Aufgabe_1;

public class Quersumme_b {

    static int quersumme(int x) {
        int quersumme = 0;
        while (x != 0) {
            quersumme += x % 10;
            x /= 10;
        }
        return quersumme;
    }

    public static void main(String[] args) {

        /*
        Es macht mehr sinn eine Klassenmethode zu verwenden, da die args[0] unabhängig von
        der Instanz berechnet werden kann. Man braucht nicht für jede args[0] ein Objekt zu erstellen sondern kann bzw.
        sollte sie direkt berechnen können
         */

        //Klassenmethode
        System.out.println("Quersumme von " + args[0] + " ist: " + quersumme(args[0]));

        //"gewöhnliche" Methode
        Quersumme_b quersumme = new Quersumme_b();
        System.out.println(quersumme(args[0]));

    }
}

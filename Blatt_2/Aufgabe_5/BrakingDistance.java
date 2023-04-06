import java.util.Scanner;

public class BrakingDistance {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Geschwindigkeit (in km/h): ");
        double velocity = userInput.nextDouble();
        double brakeDistance = velocity / 10.0 * velocity / 10.0;

        /*
         * Der Datentyp kann das Ergebnis unpräzise angeben oder
         * gar falsche Ergebnisse liefern.
         */
        int brakeDistanceTest = (int) (velocity / 10 * velocity / 10);

        System.out.print("Bremsweg (in Meter): " + brakeDistance + "\n");
        System.out.print("Bremsweg (in Meter): " + brakeDistanceTest + "\n");
        userInput.close();
    }
}

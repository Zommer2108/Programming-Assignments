import java.util.Scanner;
import java.util.Locale;

public class Babaku {

    public static class HalloumiPiece {
        private double length;
        private double width;

        public HalloumiPiece(double length, double width) {
            this.length = length;
            this.width = width;
        }

        public double calculateCheeseArea() {
            return this.length * this.width;
        }
    }

    public static double calculateCirlceArea(double diameter) {
        return (Math.pow((diameter / 2.0), 2.0) * Math.PI);
    }

    public static double estimateCheeseAmount(double areaGrill, double areaCheesePiece) {
        return areaGrill / areaCheesePiece;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // Initialising value for calculations and estimation by the user
        System.out.println("Willkommem beim Bakaku Grillfest Rechner!");
        System.out.print("Durchmesser vom Grill: ");
        double diameter = userInput.nextDouble();

        System.out.print("Länge der Halloumi Stücks: ");
        double length = userInput.nextDouble();

        System.out.print("Breite der Halloumi Stücks: ");
        double width = userInput.nextDouble();

        // calculating the results
        HalloumiPiece halloumiPieces = new HalloumiPiece(length, width);
        double areaCheesePiece = halloumiPieces.calculateCheeseArea();
        double areaGrill = calculateCirlceArea(diameter);

        // outputing the results on Terminal
        System.out.println("Es passen " + (int) estimateCheeseAmount(areaGrill, areaCheesePiece)
                + " Halloumi Käse Stücke auf den Grill");
        userInput.close();
    }
}

import java.util.Scanner;
import java.util.Locale;

public class Babaku_b {

    public static class HalloumiPiece {
        private double length;
        private double width;

        public HalloumiPiece(double length, double width) {
            this.length = length;
            this.width = width;
        }

        public double calculateArea() {
            return this.length * this.width;
        }
    }

    public static double calculateAreaCirlce(double diameter) {
        return (Math.pow((diameter / 2.0), 2.0) * Math.PI);
    }

    public static double calculateCheeseAmount(double areaGrill, double areaCheesePiece) {
        return areaGrill / areaCheesePiece;
    }

    public static int calculateEatAmount(int amountOfAdults, int amountOfChildren) {
        final int EAT_AMOUNT_ADULT = 2;
        final int EAT_AMOUNT_CHILD = 1;

        return amountOfAdults * EAT_AMOUNT_ADULT + amountOfChildren * EAT_AMOUNT_CHILD;
    }

    public static int estimateRefillings(double amountOfCheese, int eatAmount) {
        int refillings = 0;

        if (amountOfCheese > eatAmount) {
            return refillings;
        }

        while (amountOfCheese < eatAmount) {
            eatAmount = (int) (eatAmount / amountOfCheese);
            refillings++;
        }
        return refillings;
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

        System.out.print("Anzahl der Erwachsenen: ");
        int adults = userInput.nextInt();

        System.out.print("Anzahl der Kinder: ");
        int children = userInput.nextInt();

        // calculating the results
        HalloumiPiece halloumiPieces = new HalloumiPiece(length, width);
        double areaPiece = halloumiPieces.calculateArea();
        double areaGrill = calculateAreaCirlce(diameter);

        // outputing the results on Terminal
        System.out.println(
                "Es passen " + calculateCheeseAmount(areaGrill, areaPiece) + " Halloumi Käse Stücke auf den Grill");
        System.out.println("Es muss "
                + estimateRefillings(calculateCheeseAmount(areaGrill, areaPiece), calculateEatAmount(adults, children))
                + " befüllt werden");
        userInput.close();
    }
}

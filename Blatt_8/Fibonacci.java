import java.util.Scanner;

public class Fibonacci {

    public static int fibonacciIter(int n) {
        int totalSum = 0;
        int tempSumTwo = 1;
        int tempSumOne = 1;

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        for (int i = 2; i < n; i++) {

            totalSum = tempSumOne + tempSumTwo;
            tempSumTwo = tempSumOne;
            tempSumOne = totalSum;

        }
        return totalSum;
    }

    public static int fibonacciRec(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        }

        return fibonacciRec(n - 2) + fibonacciRec(n - 1);
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int n;

        System.out.println("Geben Sie an bis zu welchem n-ten Glied \n" + "die Fibonacci Folge berechnet werden soll.");
        System.out.print("Eingabe (nur natürliche Zahlen: 1,2,3,etc..) n:");
        n = userInput.nextInt();
        userInput.close();

        System.out.println("Ausgabe Fibonacci Folge iterativ von (" + n + ") Folge: " + fibonacciIter(n));
        System.out.println("Ausgabe Fibonacci Folge rekusriv von (" + n + ") Folge: " + fibonacciRec(n));
    }
}

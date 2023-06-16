import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciBigInteger {

    public static BigInteger fibonacciIter(int n) {
        int totalSum = 0;
        int tempSumTwo = 1;
        int tempSumOne = 1;

        if (n == 0) {
            return BigInteger.valueOf(0);
        } else if (n == 1) {
            return BigInteger.valueOf(1);
        }
        for (int i = 2; i < n; i++) {
            totalSum = tempSumOne + tempSumTwo;
            tempSumTwo = tempSumOne;
            tempSumOne = totalSum;
        }

        return BigInteger.valueOf(totalSum);
    }

    public static BigInteger fibonacciRec(int n) {
        if (n == 1) {
            return BigInteger.valueOf(1);
        } else if (n == 0) {
            return BigInteger.valueOf(0);
        }

        BigInteger tempSumOne = fibonacciRec(n - 2);
        BigInteger tempSumTwo = fibonacciRec(n - 1);
        return tempSumOne.add(tempSumTwo);
    }

    /*
    public static BigInteger fibonacciRecCache(int n){
        int[] cache = new int[n+1];
        return BigInteger.valueOf(fibonacciRecCache(n, cache));
    }

    private static BigInteger fibonacciRecCache(int n, int[] cache) {
        if(cache[n] == 0){
            return fibonacciRecCache(n-1, cache);
        } else if (cache[n] == 1) {
            return fibonacciRecCache(n-1, cache);
        }
    }

*/

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

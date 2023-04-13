package Heron;

import java.util.Scanner;

public class Heron10 {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie eine positive Zahl a ein: ");
        
        double a = scanner.nextDouble();
        scanner.close();

        double x = a; // Startwert x0 = a
        System.out.println("Annäherungsschritte an √a mit dem Heron-Verfahren:");
        
        for (int i = 1; i <= 10; i++) {
            x = 0.5 * (x + a / x); // Rekursionsformel xn+1 = 0.5 * (xn + a / xn)
            System.out.println("x" + i + " = " + x);
        }
    }
}


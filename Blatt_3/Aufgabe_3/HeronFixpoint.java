package Heron;

import java.util.Scanner;

public class HeronFixpoint {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie eine positive Zahl a ein: ");
        
        double a = scanner.nextDouble();
        
        scanner.close();

        double x = a; // Startwert x0 = a
        
        double prevX; // Variable für den vorherigen Näherungswert
        System.out.println("Näherungswerte mit dem Heron-Verfahren bis zum Fixpunkt:");
        
        do {
            prevX = x; // Speichern des vorherigen Näherungswerts
            x = 0.5 * (x + a / x); // Rekursionsformel xn+1 = 0.5 * (xn + a / xn)
            System.out.println("x = " + x);
        } while (x != prevX); // Wiederhole solange, bis xn+1 = xn gilt
    }
}




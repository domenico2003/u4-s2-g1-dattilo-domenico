package exception;

import java.util.Scanner;

public class Esercizio2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Calcola i Km/litro percorsi.");
		System.out.println("inserisci i km percorsi:");
		int kmPercorsi=in.nextInt();
		System.out.println("inserisci i litri di carburante consumati:");
		int litriConsumati=in.nextInt();
		
		try {
			int kmXLitro=(kmPercorsi/litriConsumati);
			System.out.println("i Km/litro percorsi sono: "+ kmXLitro);
		}catch(ArithmeticException e) {
			System.out.println("ERRORE: " + e.getMessage() + "; non puoi mettere 0 tra i consumi!");
			litriConsumati=in.nextInt();
		}finally {
			in.close();
		}
	}

}

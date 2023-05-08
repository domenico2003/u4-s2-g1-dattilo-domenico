package exception;

import java.util.Arrays;
import java.util.Scanner;

public class Esercizio1 {

	public static void main(String[] args) {
		int[] arrayInt = new int[5]; 
		Scanner in = new Scanner(System.in);
		
		for(int i = 0 ; i <5 ;i++) {
			arrayInt[i]=  (int) (Math.random()*10)+1;
		}
		
		System.out.println(Arrays.toString(arrayInt));
		System.out.println("scrivi un nuovo numero per avviare la procedura di modifica dell'array ,scrivi 0 per saltare l'operazione");
		int numeroInserito = in.nextInt();
		while(numeroInserito != 0) {
			System.out.println("scrivi il nuovo numero da inserire nell'array ,scrivi 0 per uscire");
			numeroInserito =in.nextInt();
			if(numeroInserito == 0 ) {
				continue;
			}
			System.out.println("inserisci la posizione dell'array in cui inserire il nuovo numero ");
			
			try {
				int posizioneArray=in.nextInt();
				arrayInt[posizioneArray-1]=numeroInserito;
				System.out.println(Arrays.toString(arrayInt));
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("ERRORE: " + e.getMessage() + "; posizione inserita non valida! ricominciare");
				System.out.println("scrivi un numero per ricominciare ,scrivi 0 per uscire");
				numeroInserito =in.nextInt();
			}
		}
		System.out.println("uscita avvenuta con successo!");
		in.close();
	}

}

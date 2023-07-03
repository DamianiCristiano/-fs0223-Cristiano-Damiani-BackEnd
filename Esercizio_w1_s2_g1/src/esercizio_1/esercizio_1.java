package esercizio_1;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class esercizio_1 {

	public static void main(String[] args) {
		
		int max = 10;
		int min = 1;
		int range = max - min + 1;
		

		int[] valori = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < valori.length; i++) {
			int rand = (int)(Math.random() * range) + min;
			System.out.println(rand);
			valori[i] = rand;
		}
		
		int scelta = 0;
		
		
	
		do {
			try {
			System.out.println("scegli un numero da inserire dentro l'array: ");
			scelta = sc.nextInt();
				if(scelta < 0 || scelta > 10) {
					throw new MyException("inserisci un numero tra 1 e 10: ");
				}
			
				if(scelta >= 1 && scelta <= 10) {
					System.out.println("scegli la posizione nell' array: ");
					int peppe = sc.nextInt() - 1;
					valori[peppe] = scelta;
				
					for (int i = 0; i < valori.length; i++) {
						System.out.println(valori[i]);
					}
				} 
			}
			
			catch (MyException e) {
				System.out.println("Errore: " + e.getMessage());
				
				sc.nextLine();
				}
			
			catch (InputMismatchException e) {
				System.out.println("Non scrivere una stringa: ");
				
				sc.nextLine();
			}
			
		}
		while(scelta != 0);

	} 	
	
}

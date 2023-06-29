package esercizi;

import java.util.Scanner;

public class esercizio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Switch();
	}

	
	public static void Switch() {
		int x;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("inserisci un numero: ");
		x = sc.nextInt();
		
		switch (x) {
		case 0:
			System.out.print("zero");
			break;
		case 1:
			System.out.print("uno");
			break;
		case 2:
			System.out.print("due");
			break;
		case 3:
			System.out.print("tre");
			break;

		default:
			System.out.print("ERRORE!!");
			break;
		}
	}
	
}

package esercizio_2;

import java.util.InputMismatchException;
import java.util.Scanner;

import esercizio_1.MyException;

public class esercizio_2 {

	public static void main(String[] args) {

		francesco();

	}

	public static void francesco() {

		while (true) {

			Scanner sc = new Scanner(System.in);
			System.out.println("quanti km hai percorso: ");
			try {
				int km = sc.nextInt();

				if (km >= 0) {
					System.out.println("quanti litri hai consumato: ");
					int litri = sc.nextInt();
					if (litri >= 0)
						System.out.println(km / litri);
				} else {
					throw new MyException("scrivi un numero maggiore o uguale a 0");
				}

			} catch (ArithmeticException e) {
				System.out.println("Non divisibile per 0");

				sc.nextLine();

			} catch (InputMismatchException e) {
				System.out.println("Non scrivere una stringa");

				sc.nextLine();

			} catch (MyException e) {
				System.out.println("Errore: " + e.getMessage());

				sc.nextLine();
			}
		}
	}

}

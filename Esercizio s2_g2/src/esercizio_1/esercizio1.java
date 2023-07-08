package esercizio_1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class esercizio1 {

	public static void main(String[] args) {

		peppe();

	}

	private static void peppe() {
		Set<String> s = new HashSet<String>();
		System.out.println("quanti elementi vuoi nell' array? ");
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < N; i++) {
			System.out.println("inserisci parola da mettere nell' array: ");
			String p = sc.nextLine();
			s.add(p);
		}

		Object[] arr = s.toArray();

		for (Object e : arr) {
			System.out.print(e + ",");
			System.out.println(e);
		}

		System.out.println(s.size());

		for (Object e : arr) {
			System.out.print(e + ",");
		}
	}

}

package esercizio_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class esercizio2 {

	public static void main(String[] args) {

		Franco();
		Giovanni();
	}

	static int up = 100;

	static List<String> l = new ArrayList<String>();

	public static void Franco() {
		Scanner sc = new Scanner(System.in);

		Random rand = new Random();

		System.out.println("quanti numeri vuoi generare?");

		int s = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < s; i++) {
			int n = rand.nextInt(up + 1);
			l.add("elemento:" + n);
		}

		System.out.println("questa e' l: " + l);

	}

	private static void Giovanni() {
		Scanner sc = new Scanner(System.in);
		List<String> m = l;
		Collections.reverse(m);
		System.out.println("questa e' m: " + m);
		Object[] arr = m.toArray();
		System.out.print("true or false? ");
		Boolean bool = sc.nextBoolean();
		if (bool == true) {
			for (int i = 2; i < arr.length; i += 2) {
				System.out.println(arr[i]);
			}
		} else {
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		}
	}

}

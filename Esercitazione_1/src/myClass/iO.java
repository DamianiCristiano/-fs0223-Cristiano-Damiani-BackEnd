package myClass;

import java.util.Scanner;

public class iO {

	public static void printLn(Object obj) {
		System.out.println(obj);
	};
	
	public static void print(Object obj) {
		System.out.print(obj);
	};
	
	public static String inputString() {
		Scanner sc = new Scanner(System.in);
		String ris = sc.nextLine();
		return ris;
	}
	
	public static int inputInt() {
        Scanner sc = new Scanner(System.in);
        int ris = sc.nextInt();
        sc.nextLine();
        return ris;
    }
	
	
	public static int randomInt(int intMax) {
		return (int) Math.floor(Math.random() * intMax);
	}
	
}

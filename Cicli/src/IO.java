import java.util.Scanner;

public class IO {
	static Scanner sc = new Scanner(System.in);
	
	public static void printLn(Object obj) {
        System.out.println(obj);;
    }
	
	public static String readString() {
		return sc.nextLine();
	}
	
	public static int readInt() {
        int scanner = sc.nextInt();
        sc.nextLine();
        return scanner;
	}
	
	public static double readDouble() {
        double scanner = sc.nextDouble();
        return scanner;
	}
	
	public static boolean readBoolean() {
        boolean scanner = sc.nextBoolean();
        return scanner;
	}
}

import java.util.Scanner;

public class IO {
	static Scanner sc = new Scanner(System.in);
	
	public static void printLn(Object obj) {
        System.out.print(obj);
    }
	
	public static String readString() {
		String scanner = sc.nextLine();
		return scanner;
	}
	
	public static int readInt() {
        int scanner = sc.nextInt();
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

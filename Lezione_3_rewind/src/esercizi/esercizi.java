package esercizi;

public class esercizi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stringaPariDispari("ciao"));
		System.out.println(annoBisestile(2023));
	}

	public static boolean stringaPariDispari(String x) {
		if (x.length() % 2 == 0) {
			return true;
		}
		else {
			return false;
			}
		
	}
	
	public static boolean annoBisestile (int x) {
		if (x % 4 == 0) {
			return true;
		}
		else if (x % 100 == 0 && x % 400 == 0) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
}

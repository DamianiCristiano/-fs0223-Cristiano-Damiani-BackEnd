public class Main {

	public static void main(String[] args) {

//		IO.printLn("Inserisci eta'");
//		int anni = IO.readInt();
//		
//		if (anni >= 50) {
//			System.out.println("sei anziano");
//		}	
//		else if (anni >= 30){
//			System.out.println("sei grandicello");
//		}
//		else if (anni >= 18) {
//			System.out.println("sei maggiorenne");
//		} 

//		int giorno;
//		
//		do {
//			IO.printLn("inserisci numero tra 1-7: ");
//			giorno = IO.readInt();
//			switch (giorno) {
//			case 1 :
//				System.out.println("lunedi");
//				break;
//				
//			case 2 :
//				System.out.println("martedi");
//				break;
//				
//			case 3 :
//				System.out.println("mercoledi");
//				break;
//				
//			case 4 :
//				System.out.println("giovedi");
//				break;
//				
//			case 5 :
//				System.out.println("venerdi");
//				break;
//				
//			case 6 :
//				System.out.println("sabato");
//				break;
//				
//			case 7 :
//				System.out.println("domenica");
//				break;
//				
//			default : System.out.println("inserito numero non compreso tra 1-7");
//			}
//			
//		} while (giorno < 1 || giorno > 7);

//		int base = 2;
//		int n = 1;
//		
//		do {
//			System.out.println(base * n);
//			n++;
//			
//		} while (n <= 10);

		String risposta;

		do {
			IO.printLn("Scegli la base");
			int base = IO.readInt();

			int n = 1;
			while (n <= 10) {
				IO.printLn(base * n);
				n++;
			}

			do {
                System.out.println("Vuoi ripetere il gioco? (si/no)");
                risposta = IO.readString().toUpperCase();
            } while (!risposta.equals("SI") && !risposta.equals("NO"));

        } while (risposta.equals("SI"));

	}
}

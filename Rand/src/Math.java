import java.util.Random;
import java.util.Scanner;

public class Math {
	
	public static void main(String[] args) {
//		int dado;
//		int min = 3;
//		int max = 10;
//		
//		do {
//			dado = min + rand.nextInt(max - min + 1);
//			System.out.println(dado);
//		} while (dado != max);
		
		
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		String sceltaMia;
		
		int moneta;
		String scelta = null;
		int min = 1;
		String continua;
		
		
		
		do {
			System.out.println("Scegli tra testa o croce: ");
			sceltaMia = sc.nextLine().toLowerCase();
			
			moneta = min + rand.nextInt(2);
			
            switch (moneta) {
                case 1:
                	scelta = "testa";
                    break;
                case 2:
                	scelta = "croce";
                    break;
            }
            System.out.println(scelta);
            
            if (sceltaMia.equals(scelta)) {
            	System.out.println("Hai vinto!");
            } else {
            	System.out.println("Hai perso :(");
            }
            System.out.println("Vuoi giocare di nuovo? (si/no)");
            continua = sc.nextLine().toLowerCase();
        
			} while (continua.equals("si"));
    
			System.out.println("Grazie per aver giocato!");
    		sc.close();
		
		
	}

}

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
/*		esercizio 1
		
		int treno[];
		treno = new int[5];
		int i = 0;
		
		
		while(i < 5) {
			System.out.println("inserisci quante persone ci sono nel vagone " + (i+1));
			treno[i] = sc.nextInt();
			sc.nextLine();
			i++;
		}
		
		for (int ite = 0; ite < treno.length; ite++) {
			System.out.println(treno[ite]);
		}
		
 */
		
		System.out.println("quanti studenti in classe?");
		int x = sc.nextInt();
		int studenti[] = new int[x];
		int i = 0;
		
        while (i < studenti.length) {
        	System.out.println("Quanti anni ha lo studente " + (i+1) + "?");
            studenti[i] = sc.nextInt();
            sc.nextLine();
            i++;
        }
        
        int media = 0;
        for (int ite = 0; ite < studenti.length; ite++) {
        	media += studenti[ite];
        }
        media = media/studenti.length;
        System.out.println(media);
        
        int maggiorenne = 0;
        int minorenne = 0;
        for (int j = 0; j < studenti.length; j++) {
			if (studenti[i] < 18) {
				minorenne++;
			} else {
				maggiorenne++;
			}
		System.out.println(maggiorenne + " " + minorenne);
		}
			
        
        
        
		}
}

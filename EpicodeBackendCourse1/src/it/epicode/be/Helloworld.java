package it.epicode.be;

import java.util.Scanner;

public class Helloworld {

public static void main (String[] args)
		{
		// Stampa a console  la frase
		System.out.println("This is my first Epicode Java Project!");
		System.out.println(moltiplicazione(10,20));
		System.out.println(conc("KEKW",20));
		asdrubale();
		System.out.println(perimetroRettangolo(10,20));
		System.out.println(pariDispari(10));
		System.out.println(perimetroTriangolo(6,6,8));
		}
		
		public static int moltiplicazione(int x, int y) {
			int result = x * y;
			return result;
		}
		
		public static String conc(String x, int y) {
			String result = x + " " + y;
			return result;
		}
		
		//esercizio 3
		
		public static void asdrubale(){
			Scanner sc = new Scanner(System.in);
			System.out.print("inserisci il tuo nome: ");
			String nome = sc.nextLine();
			System.out.print("inserisci il tuo cognome: ");
			String cognome = sc.nextLine();
			System.out.print("inserisci la tua citta': ");
			String citta = sc.nextLine();
			System.out.println ("Ciao " + nome + " " + cognome + " da " + citta);
			System.out.println ("Ciao " + cognome + " " + nome + " da " + citta);
		}
		
		//esercizio 4
		
		public static float perimetroRettangolo (float x , float y) {
			float result = (x + y) * 2;
			return result;
		}
		
		public static int pariDispari (int x) {
			if (x % 2 == 0) {
				return 0;
			}
			else return 1;
		}
		
		public static int perimetroTriangolo (float x,float y, float z) {
			float p = (x + y + z) / 2;
			float area = (float) Math.sqrt(p * (p - x) * (p - y) * (p - z));
			return (int) area;
		}
}

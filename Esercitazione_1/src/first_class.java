import java.util.Scanner;
import myClass.iO;

public class first_class {

	
	public static void main(String[] args) {
//		Persona p = new Persona("giorgio", 20);
//		System.out.println(p.getNome() + " " + p.getEta());
//		bambino b = new bambino("giorgio", 10, "cristo");
//		p.giorgio(p);
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Inserisci il tuo nome:");
//		String nome = sc.nextLine();
		
//		if (nome.equalsIgnoreCase("cristiano")) {
//			System.out.print("Inserisci il tuo cognome:");
//			String cognome = sc.nextLine();
//			System.out.print("ciao " + nome + " " + cognome);
//		} else {System.out.print("SUS");}
		
//		String messaggio = nome.equals("cristiano") ? "Inserisci il tuo cognome:" : "bye bye";
//		System.out.print(messaggio);
//		String cognome = sc.nextLine();
//		System.out.println("ciao " + nome + " " +  cognome);
		
//		int x = iO.randomInt(10);
//		System.out.println(x);
		
		Scanner sc = new Scanner(System.in);
		
		double n1,n2;
		
		System.out.println("dammi il primo numero:");
		n1 = sc.nextDouble();
		System.out.println("dammi il secondo numero:");
		n2 = sc.nextDouble();
		System.out.println(("La somma è: " + (n1 + n2)).replace(".", ","));
		
		
	}
}

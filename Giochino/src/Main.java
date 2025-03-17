import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		int[] numeri = new int[0];
		Scanner sc = new Scanner(System.in);
		String scelta;
		
		do {
			System.out.println("1) aggiungi un numero");
			System.out.println("2) visualizza i numeri");
			System.out.println("3) modifica un numero");
			System.out.println("4) rimuovi un numero");
			System.out.println("5) Esci");
			
			scelta = sc.nextLine();
			
			if (scelta.equals("1")) 
			{
				int n = numeri.length;
				int[] tempArr = numeri;
				numeri = new int[n + 1];
				
				for (int i = 0; i < n; i++) {
					numeri[i] = tempArr[i];
				}
				
				System.out.println("inserisci il numero da aggiungere: ");
				numeri[n] = sc.nextInt();
				sc.nextLine();
			}
			
			if (scelta.equals("2")) 
			{
				for (int i = 0; i < numeri.length; i++) 
				{
					
					System.out.println(numeri[i]+ ", ");
					
				}
			}	
				
			if (scelta.equals("3")) 
			{
				System.out.print("scegli la posizione del numero che vuoi modificare: ");
				int pos = sc.nextInt();
				if (pos < 0 || pos >= numeri.length) 
				{
					System.out.println("posizione non valida");
				} else 
				{
					System.out.print("scegli il numero: ");
					numeri[pos] = sc.nextInt();
					sc.nextLine();					
				}
			}
			
			if (scelta.equals("4")) 
			{
				System.out.print("scegli la posizione del numero che vuoi eliminare: ");
				int pos = sc.nextInt();
				if (pos < 0 || pos >= numeri.length) 
				{
					System.out.println("posizione non valida");
				} else 
				{
					System.out.print("scegli la posizione: ");
					int[] arrTemp = numeri;
					numeri = new int[arrTemp.length - 1];
					for (int i = 0 , j = 0; i < arrTemp.length; i++)
						if (i!= pos) 
                        {
                            numeri[j] = arrTemp[i];
                            j++;
                        }
					
				}
				
			}
				
			
			
			
			
		}while (!scelta.equals("5"));
		System.out.println("arrivederci!!");
		
	}

}

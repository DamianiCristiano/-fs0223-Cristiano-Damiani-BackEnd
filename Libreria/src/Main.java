import classiMie.DynamicArray;
import classiMie.IO;

public class Main {
	static DynamicArray libri  = new DynamicArray();

	public static void main(String[] args) {
		
int scelta;
		
		do
		{
			IO.println("1. Aggiungi libro");
			IO.println("2. Rimuovi libro");
			IO.println("3. Visualizza libri");
			IO.println("0. Esci");
			
			do {
					scelta = IO.getInt("Fai la tua scelta...");
			}while(scelta<0 || scelta>3 || IO.getHasError());
			
			switch (scelta) {
				
				case 1:
					Libro l = new Libro();
					String titolo = IO.getString("Inserisci il titolo del libro");
					String autore = IO.getString("Inserisci l'autore del libro");
					int anno = IO.getInt("Inserisci l'anno del libro");
					
					l.setTitolo(titolo);
					l.setAutore(autore);
					l.setAnno(anno);
					
					libri.add(l);
				break;
				
				case 2:
					libri.printArray();
					
					int pos = IO.getInt("Inserisci il numero del libro da rimuovere");
					if (pos > 0 && pos <= libri.size()) {
						libri.remove(pos - 1);
					} else {
						IO.println("Numero non valido");
					}
					
				break;
				
				case 3:
					libri.printArray();
					for (int i = 0; i < libri.size(); i++) {
						Libro C = (Libro) libri.get(i);
						System.out.println(C.getAnno());
						System.out.println(C.getTitolo());
						System.out.println(C.getAutore());
					}
				break;
			}
			
			
		}while(scelta!=0);
		
		IO.println("Arrivederci!");
	}


		
	

}

import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) {
		IO.printLn("inserisci il tuo nome: ");
		String nome = IO.readString();
		try {
			IO.printLn("Inserisci la tua eta': ");
			int eta = IO.readInt();
			System.out.println("nome: " + nome + "\n eta: " + eta);	
			
		} catch (InputMismatchException e){
			System.out.println("inserire numero intero");
		}
	}

}

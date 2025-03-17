import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroConto;
		int scelta;

		Cliente cliente1 = new Cliente("Marco", "Rossi");
		Conto c1 = new Conto(0.0, 1, cliente1);
		c1.deposita(100.2, 1);
		c1.getSaldo();

		do {
			System.out.println("inserisci il numero del tuo conto:");
			numeroConto = sc.nextInt();

			while (numeroConto <= 0) {
				System.out.println("Numero conto non valido. Riprova:");
				numeroConto = sc.nextInt();

			}
			do {
				System.out.println("1. Effettuare un versamento");
				System.out.println("2. Effettuare un prelievo");
				System.out.println("3. Visualizzare saldo");
				System.out.println("4. Esci");

				scelta = sc.nextInt();

				switch (scelta) {
				case 1:
					System.out.println("Quanto vuoi depositare?");
					double deposito = sc.nextDouble();
					c1.deposita(deposito, numeroConto);
					System.out.println("Saldo aggiornato: " + c1.getSaldo());
					break;
				case 2:
					System.out.println("Quanto vuoi prelevare?");
					double prelievo = sc.nextDouble();
					if (prelievo <= c1.getSaldo()) {
						c1.preleva(prelievo, numeroConto);
						System.out.println("Saldo aggiornato: " + c1.getSaldo());
					} else {
						System.out.println("Saldo insufficiente!");
					}
					break;
				case 3:
					System.out.println("Saldo: " + c1.getSaldo());
					break;
				case 4:
					System.out.println("Arrivederci!");
					break;
				default:
					System.out.println("Scelta non valida!");
				}
			} while (scelta != 4);
		} while (scelta <= 0);


	}
}
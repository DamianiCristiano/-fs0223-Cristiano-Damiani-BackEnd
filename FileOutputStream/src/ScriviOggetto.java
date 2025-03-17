/*	
 * COSA SONO I FILE BINARI?

	I file binari sono file che contengono dati in un formato non testuale.
	Un file testuale generalmente ha estensioni tipo .txt, .java, .html, .json, ecc. e contiene dati in formato testuale in chiaro!
	...
	Un file binario invece contiene dati in un formato non testuale, ovvero in un formato che non è leggibile direttamente dall'essere umano.
	Generalmente dei file binari possono avere qualunque tipo di estensione.
	Alcune estensioni conosciute sono: .dat, .bin, .exe, .mp3, .jpg, .png, .mp4, ecc.


 * 
 * fileOutputStream che serve a scrivere dati binari in un file
 * ObjectOutputStream che serve a scrivere oggetti in un file
 */
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.io.IOException;

public class ScriviOggetto {
	public static void main(String args[])
	{
		
		
		
		String nomeFile = "persona.dat";
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeFile)))
		{
			oos.writeObject(new Persona("Luigi", 30));
			oos.writeObject(new Persona("Mario", 25));
			System.out.println("Oggetto scritto correttamente su file");
		}
		catch(IOException e)	
		{
			System.out.println("Porca miseria! ERRORE!");
			
		}
	}
}
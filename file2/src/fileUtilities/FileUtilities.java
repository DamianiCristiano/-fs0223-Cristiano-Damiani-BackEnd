package fileUtilities;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtilities {
	/*
	 * Metodo generale per scrivere su un file
	 * Se append=true -> attiva modalità append per aggiungere contenuto a un file
	 * Altrimenti sovrascrive il file
	 * Ritorna true/false in base alla riuscita dell'operazione
	 */
	public static boolean writeFile(String fileName, String text, boolean append) {
		try {
			FileWriter fileWriter;
			
			if(append) {
				fileWriter = new FileWriter(fileName, true);
			}
			else {
				fileWriter = new FileWriter(fileName);
			}
			
			fileWriter.write(text);
			fileWriter.write(System.lineSeparator());
			
			fileWriter.close();
			return true;
		} catch (IOException e) {
			return false;
		}
	}
	
	/*
	 * Metodo generale per leggere da un file
	 * Continua a leggere e a costruire la stringa di ritorno fintantoché trova un carattere valido (codice ASCII != -1)
	 * Se fallisce la lettura ritorna una stringa vuota ""
	 */
	public static String readFile(String fileName) {
		try {
			FileReader fileReader = new FileReader(fileName);
			StringBuilder sb = new StringBuilder();
			int intChar;
			
			do {
				intChar = fileReader.read();
				char character = (char) intChar;
				sb.append(character);
			} while (intChar != -1);
			
			fileReader.close();			
			return sb.toString();
		} catch (IOException e) {
			return "";
		}
	}
}
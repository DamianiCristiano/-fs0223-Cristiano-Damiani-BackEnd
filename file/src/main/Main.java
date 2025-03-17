package main;

import java.util.Scanner;

import fileUtilities.FileUtilities;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nomeFile = "Esempio.txt";
		String testoFile;
		
		// Prima scrittura
		System.out.print("Testo 1: ");
		testoFile = scanner.nextLine();
		if(!FileUtilities.writeFile(nomeFile, testoFile, false))
			System.out.println("Errore nella scrittura sul file " + nomeFile);
		
		// Seconda scrittura
		System.out.print("Testo 2: ");
		testoFile = scanner.nextLine();
		if(!FileUtilities.writeFile(nomeFile, testoFile, true))
			System.out.println("Errore nella scrittura sul file " + nomeFile);
		
		// Lettura		
		String testoDaFile = FileUtilities.readFile(nomeFile);
		if(testoDaFile.equals(""))
			System.out.println("File vuoto/Errore nella lettura del file.");
		else
			System.out.println("File letto correttamente:\n" + testoDaFile);
		
		scanner.close();
	}
}
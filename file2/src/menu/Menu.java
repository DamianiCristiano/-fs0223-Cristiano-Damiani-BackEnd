package menu;

import java.io.File;
import java.util.ArrayList;

import fileUtilities.FileUtilities;

public class Menu {
	private static final String DIRECTORY = "media";  // Path relativo (inizia a cercare dalla source directory del progetto)
	private static ArrayList<String> txtFiles = new ArrayList<String>();
	
	public static void menu() {
		// Dichiaro directory e files al suo interno
		File directory = new File(DIRECTORY);
		File[] files = directory.listFiles();
		
		// Itero i files ottenuti ed estraggo i file.txt		
		for(int i = 0; i < files.length; i++) {
			if(files[i].isFile()) {
				String fileName = files[i].getName();
				
				if(fileName.endsWith(".txt"))
					txtFiles.add(fileName);
			}
		}
		
		// Stampo i file.txt esistenti e il loro contenuto
		if(!txtFiles.isEmpty()) {
			System.out.println(String.format("Files.txt contenuti dentro %s:", DIRECTORY));
			for(String s : txtFiles) {
				System.out.println("--------------------------------------------------");
				System.out.println(s);
				System.out.println(FileUtilities.readFile(DIRECTORY + File.separator + s));  // Portabile
//				System.out.println(FileUtilities.readFile(DIRECTORY + "\\" + s));  Windows
//				System.out.println(FileUtilities.readFile(DIRECTORY + "/" + s));  Linux/Mac
			}
		}
		else
			System.out.println(String.format("Nessun file.txt all'interno di %s", DIRECTORY));
	}
}
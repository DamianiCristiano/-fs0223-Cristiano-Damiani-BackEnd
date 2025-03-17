import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import classiMie.IO;

public class Main {

	public static void main(String[] args) {

		String nomeFile = "info.txt";

		String info = IO.getString("scrivi qualcosa");
		IO.println("hai scritto: " + info);
		File infoFile = new File(nomeFile);

		if (infoFile.exists()) {
			IO.println("il file esiste");
			try {
				BufferedReader reader = new BufferedReader(new FileReader(infoFile));
				String testo;
				while ((testo = reader.readLine()) != null) {
					IO.println("testo: " + testo);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		IO.println("il file non esiste ora lo creo");

		try {

// 			versione con FileWriter

			FileWriter fw = new FileWriter(infoFile);
			fw.write(info);
			fw.close();

// 			versione con BufferedWriter

//			BufferedWriter f = new BufferedWriter(new FileWriter(infoFile));
//			f.write(info);;
//			f.close();

			IO.println("file salvato");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

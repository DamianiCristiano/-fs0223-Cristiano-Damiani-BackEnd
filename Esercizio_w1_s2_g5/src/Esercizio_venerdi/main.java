package Esercizio_venerdi;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;

public class main {

	public static void main(String[] args) {

		libri libro1 = new libri("1", "lord of the ring", 1954, 1500, "J.r.r.Tolkien", "fantasy");
		libri libro2 = new libri("2", "Il Silmarillion", 1977, 1500, "J.r.r.Tolkien", "fantasy");

		aggiungi(libro1);
		aggiungi(libro2);
		cercaISBN("1");
		System.out.println(ricercaAnnoPubblicazione(1954));
		System.out.println(ricercaAutore("J.r.r.Tolkien"));

		try {
			salvaSuTxt();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			libreria = (Map<String, catalogo>) caricaDaFile();
			for (catalogo c : libreria.values()) {
				System.out.println(c.toString());
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (java.lang.NumberFormatException e) {
			System.out.println("file inseriti");
		}

		try {
			caricaDaFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (java.lang.NumberFormatException e) {
			System.out.println("file letti");
		}

	}

	static Map<String, catalogo> libreria = new HashMap<String, catalogo>();

	public static void aggiungi(catalogo l) {
		libreria.put(l.getIsbn(), l);
		System.out.println(l.getIsbn() + " " + l.getTitolo() + " " + l.getAnnoPublicazione());
	}

	public static void rimuovi(String i) {
		catalogo eleRimosso = libreria.remove(i);
	}

	public static void cercaISBN(String i) {
		libreria.get(i);
		System.out.println(libreria.get(i));
	}

	public static List<catalogo> ricercaAnnoPubblicazione(Integer anno) {

		return libreria.values().stream()

				.filter(ele -> anno.equals(ele.getAnnoPublicazione()))

				.collect(Collectors.toList());

	};

	public static List<libri> ricercaAutore(String autore) {

		return libreria.values().stream()

				.filter(ele -> ele instanceof libri)

				.map(ele -> (libri) ele)

				.filter(ele -> autore.equalsIgnoreCase(ele.getAutore()))

				.collect(Collectors.toList());
	}

	private static File file = new File("documenti/catalogo.txt");

	public static void salvaSuTxt() throws IOException {
		String txt = "";

		for (catalogo i : libreria.values()) {
			txt += i.getIsbn() + "@" + i.getTitolo() + "#" + "\n";
		}

		FileUtils.writeStringToFile(file, txt, "UTF-8", true);
		System.out.println("libri salvati su file " + file.getPath());
	}

	public static List<catalogo> caricaDaFile() throws IOException {
		libreria.clear();

		String textFile = FileUtils.readFileToString(file, "UTF-8");

		String[] p = textFile.split("#");

		for (String i : p) {

			String[] par = i.split("@");
			catalogo libri = new catalogo(par[0], i, Integer.parseInt(par[1]), null);
			((List<catalogo>) libreria).add(libri);
		}

		return (List<catalogo>) libreria;

	}

}

package tf.dados;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Daniel Lopes
 * @category Trabalho Final de AlPro II
 *
 */
public class Dados implements Serializable {

	public Dados() {

	}

	public void leDados() {
		Path path = Paths.get("acidentes.csv");
		// Path path = Paths.get("acidentes-2013.csv");
		try (BufferedReader br = Files.newBufferedReader(path,
				Charset.defaultCharset())) {
			String linha = null;
			while ((linha = br.readLine()) != null) {
				// separador: ;
				Scanner sc = new Scanner(linha).useDelimiter(";");
				// System.out.println(sc.next() + " | " + sc.next() + " | " +
				// sc.next() + " | " + sc.next());
				System.out.format("%-10s" + " | " + "%-40s" + " | "
						+ "%-20s \n", sc.next(), sc.next(), sc.next());
			}
		} catch (IOException e) {
			System.err.format("Erro de E/S: %s%n", e);
		}

	}

	public LinkedList carregaAcidentes() {
		LinkedList<Acidente> lst = new LinkedList<>();
		Path path = Paths.get("acidentes2.csv");
		try (BufferedReader br = Files.newBufferedReader(path,
				Charset.defaultCharset())) {
			String linha = null;
			Scanner sc = new Scanner(linha).useDelimiter(";");
			sc.nextLine();
			while ((linha = br.readLine()) != null) {

				lst.add(new Acidente(sc.next().toString(),
						sc.next().toString(), sc.next().toString()));
			}
			return lst;
		} catch (IOException e) {
			System.err.format("Erro de E/S: %s%n", e);
		}
		return null;

	}
}

package tf.dados;

import java.util.List;

public class Main {
	static Acidente acd = new Acidente();
	static LinkedList<Acidente> lst = new LinkedList<Acidente>();
	static LinkedList<Acidente> lst2 = new LinkedList<>();

	public static void main(String[] args) {
		// lst2.add(acd);
		// lst2.add(acd);
		// lst2.add(acd);
		// lst2.remove(acd);

		Dados dt = new Dados();
		lst2 = dt.carregaAcidentes();
		
		// System.out.println(acd);
		for (int i = 0; i < lst2.size(); i++) {
			System.out.println(lst2);
		}
	}

}

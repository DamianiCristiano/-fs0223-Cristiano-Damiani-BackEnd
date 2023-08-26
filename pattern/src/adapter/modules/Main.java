package adapter.modules;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Info x1 = new Info();

		x1.setNome("sciao");
		x1.setCognome("belo");
		x1.DataDiNascita(LocalDate.of(2000, 10, 10));

		Adapter a = new Adapter(x1);

		System.out.println(a.getNomeCompleto() + a.getEta());

	}

}

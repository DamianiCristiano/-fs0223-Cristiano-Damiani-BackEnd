package adapter.modules;

import java.time.LocalDate;
import java.time.Period;

public class Adapter implements DataSource {

	private Info x;

	public Adapter(Info x) {
		this.x = x;
	};

	@Override
	public String getNomeCompleto() {
		return this.x.getNome() + " " + this.x.getCognome();
	}

	@Override
	public int getEta() {
		this.x.getDataDiNascita().getYear();
		Period eta = Period.between(LocalDate.now(), this.x.getDataDiNascita());
		return eta.getYears();
	}
}

package gestione.incendi.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Sonde")
public class Sonda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long Id;
	
	@Column(nullable = false)
	private String latitudine;
	
	@Column(nullable = false)
	private String longitudine;
	
	@Column(nullable = false)
	private Integer smokeLevel;
	
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getLatitudine() {
		return latitudine;
	}

	public void setLatitudine(String latitudine) {
		this.latitudine = latitudine;
	}

	public String getLongitudine() {
		return longitudine;
	}

	public void setLongitudine(String longitudine) {
		this.longitudine = longitudine;
	}


	public Integer getSmokeLevel() {
		return smokeLevel;
	}

	public void setSmokeLevel(Integer smokeLevel) {
		this.smokeLevel = smokeLevel;
	}

	public Sonda(String latitudine, String longitudine, Integer smokeLevel) {
		super();
		this.latitudine = latitudine;
		this.longitudine = longitudine;
		this.smokeLevel = smokeLevel;
	}

}

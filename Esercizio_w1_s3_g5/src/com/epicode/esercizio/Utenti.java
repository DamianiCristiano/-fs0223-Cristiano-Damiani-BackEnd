package com.epicode.esercizio;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Utenti {

	@Id
	@Column(unique = true)
	private Integer numeroDiTessera;

	private String nome;
	private String cognome;
	private LocalDate dataDiNascita;

	public Utenti(String nome, String cognome, LocalDate dataDiNascita, Integer numeroDiTessera) {
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
		this.numeroDiTessera = numeroDiTessera;
	}

	public Utenti() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(LocalDate dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

	public Integer getNumeroDiTessera() {
		return numeroDiTessera;
	}

	public void setNumeroDiTessera(Integer numeroDiTessera) {
		this.numeroDiTessera = numeroDiTessera;
	}

}

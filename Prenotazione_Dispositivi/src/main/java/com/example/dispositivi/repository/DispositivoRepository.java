package com.example.dispositivi.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.dispositivi.classes.Dispositivo;

public interface DispositivoRepository extends CrudRepository<Dispositivo, Long> {

	public Dispositivo findById(int i);

}

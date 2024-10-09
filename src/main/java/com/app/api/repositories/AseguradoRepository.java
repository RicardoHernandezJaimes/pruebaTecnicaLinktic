package com.app.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.api.models.Asegurado;

@Repository
public interface AseguradoRepository extends JpaRepository<Asegurado, Integer> {

	Asegurado findByNumeroIdentificacion(String nroIdentificacion);

}

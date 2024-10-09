package com.app.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.api.models.Amparo;

@Repository
public interface AmparoRepository extends JpaRepository<Amparo, Integer> {

}

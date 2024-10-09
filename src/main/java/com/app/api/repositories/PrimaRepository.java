package com.app.api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.api.models.Prima;

@Repository
public interface PrimaRepository extends JpaRepository<Prima, Integer> {

	List<Prima> findByEdadMinimaLessThanEqualAndEdadMaximaGreaterThanEqual(int edad, int edad2);

}

package br.com.marvastsi.assesment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.marvastsi.assesment.model.Person;

@Repository
public interface PersonRepository extends JpaRepository <Person, Long> {

}

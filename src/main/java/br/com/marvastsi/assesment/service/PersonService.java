package br.com.marvastsi.assesment.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import br.com.marvastsi.assesment.model.Person;
import br.com.marvastsi.assesment.repository.PersonRepository;


@Service
@Transactional
public class PersonService {

	@Autowired
	@Qualifier("personRepository")
	private PersonRepository personRepository;

	public Person getById(Long id) {
		Optional<Person> person = personRepository.findById(id);
		return person.get();
	}

	public Person save(Person person) {
		return personRepository.save(person);
	}

	public Iterable<Person> findAll() {
		return personRepository.findAll();
	}

}

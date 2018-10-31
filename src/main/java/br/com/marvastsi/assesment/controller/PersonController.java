package br.com.marvastsi.assesment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.marvastsi.assesment.model.Person;
import br.com.marvastsi.assesment.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	@Qualifier("personService")
	private PersonService personService;

	@RequestMapping(value = "/person/preview/{id}", method = RequestMethod.GET)
	public ResponseEntity<Person> findById(@PathVariable("id") String id) {
		return new ResponseEntity<Person>(personService.getById(Long.parseLong(id)), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/person/preview", method = RequestMethod.GET)
	public ResponseEntity<Iterable<Person>> findAll() {
		return new ResponseEntity<Iterable<Person>>(personService.findAll(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/person/pedir", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)
    public void save(@RequestBody Person person) {
		personService.save(person);
    }
	
	
}

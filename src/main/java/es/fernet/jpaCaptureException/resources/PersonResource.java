package es.fernet.jpaCaptureException.resources;

import es.fernet.jpaCaptureException.models.Person;
import es.fernet.jpaCaptureException.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class PersonResource {

	@Autowired
	private PersonService personService;

	@PostMapping("/addPerson")
	public ResponseEntity<Person> insertPerson(@RequestBody Person newPerson){
		return ResponseEntity.ok(personService.insertPerson(newPerson));
	}
}

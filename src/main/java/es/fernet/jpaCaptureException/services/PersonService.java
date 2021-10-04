package es.fernet.jpaCaptureException.services;

import es.fernet.jpaCaptureException.models.Person;
import es.fernet.jpaCaptureException.repositories.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PersonService {

	@Autowired
	private PersonRepository personRepository;

	public Person insertPerson(Person newPerson) {
		return personRepository.save(newPerson);
	}



}

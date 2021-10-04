package es.fernet.jpaCaptureException.repositories;

import es.fernet.jpaCaptureException.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}

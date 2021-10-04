package es.fernet.jpaCaptureException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PersonResourceTest {

	public void insertTest() {
		HttpUriRequest request = new HttpPost( "https://api.github.com/users/" + name );
	}
}

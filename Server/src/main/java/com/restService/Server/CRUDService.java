package com.restService.Server;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.json.JSONException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "http://localhost:3000" , methods = {RequestMethod.GET , RequestMethod.POST , RequestMethod.PUT , RequestMethod.DELETE})
@RestController
public class CRUDService {

	private List<Person> listPerson = new ArrayList<Person>();
	private final AtomicInteger counter = new AtomicInteger();

	@GetMapping("/listPerson")
	public ResponseEntity<Message> getListPerson() throws JSONException {
		Message message = new Message();
		
		if (listPerson != null && !listPerson.isEmpty()) {
			message.setId(0);
			message.setMessage("notEmpty");
		} else {
			message.setId(1);
			message.setMessage("empty");
		}
		message.setListPerson(listPerson);

		return new ResponseEntity<Message>(message, HttpStatus.OK);
	}

	@PostMapping(path = "/addPerson", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Message> addPerson(@RequestBody PersonDTO personDTO) {

		HttpStatus httpStatus;
		Message message = new Message();
		if (personDTO != null) {
			Person person = new Person();
			person.setId(counter.getAndIncrement());
			person.setName(personDTO.getName());
			person.setAge(personDTO.getAge());
			listPerson.add(person);
			message.setId(1);
			message.setMessage("success");
			httpStatus = HttpStatus.CREATED;
		} else {
			message.setId(0);
			message.setMessage("echec");
			httpStatus = HttpStatus.NO_CONTENT;
		}
		return new ResponseEntity<Message>(message, httpStatus);
	}

	@PutMapping(path = "/updatePerson/{id}", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Message> updatePerson(@PathVariable("id") int id, @RequestBody PersonDTO personDTO) {
		HttpStatus httpStatus;
		Message message = new Message();

		Person person = listPerson.stream().filter(p -> id == p.getId()).findFirst().orElseGet(null);
		if (person != null) {
			person.setAge(personDTO.getAge());
			person.setName(personDTO.getName());
			message.setId(1);
			message.setMessage("success");
			httpStatus = HttpStatus.OK;
		} else {
			message.setId(0);
			message.setMessage("echec");
			httpStatus = HttpStatus.NO_CONTENT;
		}
		return new ResponseEntity<Message>(message, httpStatus);

	}

	@DeleteMapping(path = "/deletePerson/{id}")
	public ResponseEntity<Message> deletePerson(@PathVariable("id") int id) {
		HttpStatus httpStatus;
		Message message = new Message();
		boolean remove = listPerson.removeIf(p -> id == p.getId());
		if (remove) {
			message.setId(1);
			message.setMessage("success");
			httpStatus = HttpStatus.OK;

		} else {

			message.setId(0);
			message.setMessage("echec");
			httpStatus = HttpStatus.NOT_FOUND;
		}

		return new ResponseEntity<Message>(message, httpStatus);

	}

}

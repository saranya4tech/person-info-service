package com.example.demo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.example.demo.models.Person;
import com.example.demo.models.PersonSummary;

@RestController
@RequestMapping("/person")
public class PersonResource {

	public PersonResource() {
		// TODO Auto-generated constructor stub
	}

	@Value("${api.key}")
	private String apiKey;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/{personId}")
	public Person getPersonInfo(@PathVariable String personId) {
		PersonSummary personSummary = restTemplate.getForObject("https://api.themoviedb.org/3/person/" + personId + "?api_key=" + apiKey + "&language=en-US", PersonSummary.class);
		return new Person(personSummary.getId(),personSummary.getName(),personSummary.getBiography());
	}
}

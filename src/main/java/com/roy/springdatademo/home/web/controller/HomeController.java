package com.roy.springdatademo.home.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.roy.springdatademo.person.Person;
import com.roy.springdatademo.person.service.PersonService;

@RestController
public class HomeController {
	
	@Autowired
	private PersonService personService;
	
	@RequestMapping(value = "/hello")
	@ResponseBody
	public String hello() {
		return "hello";
	}
	
	@RequestMapping(value = "/person")
	public List<Person> person() {
		return personService.findAll();
	}
	
	@RequestMapping(value = "/person/{id:\\d+$}")
	public Person detail(@PathVariable(value="id") long id) {
		return personService.getOne(id);
	}
}

package com.github.bobbylough.springReferenceRest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.bobbylough.springReferenceRest.model.Person;
import com.github.bobbylough.springReferenceRest.service.PersonService;

@RestController
@RequestMapping("/")
public class PersonController {
	@Autowired
	private PersonService personService;
	@RequestMapping("/helloPerson")
	public Person getPersonDetail(@RequestParam(value = "id",required = false, defaultValue = "0") Integer id) {
		Person p = personService.getPersonDetail(id);
		return p;
	}
}
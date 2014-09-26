package com.github.bobbylough.springReferenceRest.service;

import org.springframework.stereotype.Component;

import com.github.bobbylough.springReferenceRest.model.Person;

@Component
public class PersonServiceImpl implements PersonService {
	@Override
	public Person getPersonDetail(Integer id){
		Person p = new Person();
		p.setId(id);
		p.setName("Bobby");
		return p;
	}
}

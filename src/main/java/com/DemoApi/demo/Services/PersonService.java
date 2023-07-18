package com.DemoApi.demo.Services;

import com.DemoApi.demo.Entity.Person;
import com.DemoApi.demo.Payload.PersonDto;

import java.util.List;

public interface PersonService {


    //save data
    PersonDto saveperson(PersonDto personDto);

    //Update
    PersonDto UpdatePerson(PersonDto person, Long pid);

    //delete
    PersonDto DeletedPerson(Long pid);

    //getById
    PersonDto getOnePerson(Long pid);

    //getAllPerson
    List<PersonDto> getAllPerson();

}

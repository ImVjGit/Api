package com.DemoApi.demo.ServiceImpl;

import com.DemoApi.demo.Entity.Person;
import com.DemoApi.demo.Payload.PersonDto;
import com.DemoApi.demo.Repositories.PersonRepository;
import com.DemoApi.demo.Services.PersonService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public PersonDto saveperson(PersonDto personDto) {
        Person person = modelMapper.map(personDto, Person.class);
        Person save = personRepository.save(person);
        return modelMapper.map(save,PersonDto.class);
    }

    @Override
    public PersonDto UpdatePerson(PersonDto person, Long pid) {
        return null;
    }

    @Override
    public PersonDto DeletedPerson(Long pid) {
        return null;
    }

    @Override
    public PersonDto getOnePerson(Long pid) {
        return null;
    }

    @Override
    public List<PersonDto> getAllPerson() {
        return null;
    }
}

package com.DemoApi.demo.Controller;

import com.DemoApi.demo.Payload.PersonDto;
import com.DemoApi.demo.Services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vi/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/save")
    public ResponseEntity<PersonDto> savePerson(@RequestBody PersonDto personDto)
    {
        return new ResponseEntity<PersonDto>(personService.saveperson(personDto), HttpStatus.CREATED);
    }
}

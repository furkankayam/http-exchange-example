package com.example.demo.controller;

import com.example.demo.client.PersonClient;
import com.example.demo.model.dto.PersonDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PersonController {

    private final PersonClient personClient;

    @GetMapping
    public PersonDTO hello() {
        return personClient.getPerson();
    }

}

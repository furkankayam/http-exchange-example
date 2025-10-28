package com.example.demo.client;

import com.example.demo.model.dto.PersonDTO;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface PersonClient {

    @GetExchange("/persons")
    PersonDTO getPerson();
}

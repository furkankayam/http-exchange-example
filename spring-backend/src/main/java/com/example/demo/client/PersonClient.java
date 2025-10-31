package com.example.demo.client;

import com.example.demo.model.dto.PersonDTO;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
// @HttpExcahnge iki sekil kullanim alani var.
// 1.
// Bütün metotlar "/persons" yolu ile başlayacak
// @HttpExchange("/persons")
public interface PersonClient {

    @GetExchange("/persons")
    PersonDTO getPerson();

    // 2.
    // HTTP metodu ve path aynı anda belirtilir
    // @HttpExchange(method = "GET", url = "/persons") 
    //Person getPerson();
}

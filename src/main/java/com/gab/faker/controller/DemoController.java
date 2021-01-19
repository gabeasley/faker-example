package com.gab.faker.controller;

import com.github.javafaker.Faker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    Faker faker = new Faker();
    @GetMapping("/")
    public String getPokemon() {
        return faker.pokemon().name();
    }

}

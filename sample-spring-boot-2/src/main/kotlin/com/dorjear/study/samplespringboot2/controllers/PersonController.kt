package com.dorjear.study.samplespringboot2.controllers

import com.dorjear.study.samplespringboot2.models.Person
import com.dorjear.study.samplespringboot2.services.PersonRegistrationService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus.CREATED
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController("/persons")
class PersonController {
    @Autowired
    lateinit var personRegistrationService: PersonRegistrationService

    @PostMapping
    @ResponseStatus(CREATED)
    fun addPerson(@RequestBody person: Person): Person {
        return personRegistrationService.addPerson(person)
    }
}

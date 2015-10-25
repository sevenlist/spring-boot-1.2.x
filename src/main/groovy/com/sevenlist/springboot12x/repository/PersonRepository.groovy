package com.sevenlist.springboot12x.repository

import com.sevenlist.springboot12x.domain.Person
import org.springframework.data.repository.Repository

interface PersonRepository extends Repository<Person, Long> {

    List<Person> findByFirstName(String firstName)
}
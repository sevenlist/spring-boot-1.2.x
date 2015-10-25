package com.sevenlist.springboot12x

import com.sevenlist.springboot12x.repository.PersonRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
public class Application {

    @Autowired
    PersonRepository personRepository

    @RequestMapping('/')
    String home() {
        personRepository.findByFirstName('Seven').first()
    }

    static main(args) {
        SpringApplication.run(Application, args)
    }
}
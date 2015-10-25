package com.sevenlist.springboot12x

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping('/')
    String home() {
        'Hello World!'
    }

    static main(args) {
        SpringApplication.run(Application, args)
    }
}
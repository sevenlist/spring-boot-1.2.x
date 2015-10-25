package com.sevenlist.springboot12x.domain

import groovy.transform.ToString

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
@ToString(includeFields = true, includeNames = true)
class Person {

    @Id
    @GeneratedValue
    private Long id

    @Column
    private String firstName

    @Column
    private String lastName
}

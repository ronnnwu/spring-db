package com.prism.test.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_TABLE")
public class Person {

    @Id
    @Column(name = "USER_ID")
    int id;

    @Column(name = "USER_USERNAME")
    String userName;

    @Column(name = "USER_EMAIL")
    String userEmail;

}

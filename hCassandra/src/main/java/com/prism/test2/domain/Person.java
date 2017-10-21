package com.prism.test2.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;

@Table(value = "user_table")
public class Person {

    @Id
    @Column(value="id")
    public String id;

    @Column(value = "user_username")
    public String username;

    @Column(value = "user_email")
    public String email;
}

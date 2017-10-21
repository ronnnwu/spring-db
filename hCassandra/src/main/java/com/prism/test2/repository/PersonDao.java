package com.prism.test2.repository;

import com.prism.test2.domain.Person;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;

import java.util.List;

public interface PersonDao extends CassandraRepository<Person> {

    @Query("Select * from user_table where user_username=?0")
    List<Person> findByName(String name);
}

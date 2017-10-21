package com.prism.test.repository;

import com.prism.test.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonDao extends JpaRepository<Person, Long> {

    @Query(value = "SELECT * FROM USER_TABLE WHERE USER_USERNAME=?", nativeQuery = true)
    List<Person> findByName(String name);

}

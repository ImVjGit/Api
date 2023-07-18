package com.DemoApi.demo.Repositories;

import com.DemoApi.demo.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}

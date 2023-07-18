package com.DemoApi.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Person_id")
    private Long id;
    @Column(name = "Person_Name")
    private String name;
    @Column(name = "Person_LastName")
    private String lastname;
    @Column(name = "Person_Age")
    private Long age;
    @Column(name = "Person_Address")
    private String Address;
}

package com.crud.cruud.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "tbl_user")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private  long userId;

    private long password;

    private String firstName;

    private  String lastName;

}

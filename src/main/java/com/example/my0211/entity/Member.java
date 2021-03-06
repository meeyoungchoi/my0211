package com.example.my0211.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class Member {

    @Id
    @GeneratedValue
    private Long id;
    private String username;
}

package com.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by semihunaldi on 15.08.2021
 */

@Entity
@Table(name = "USER")
@Data
public class User {

    @Id
    private String id;

    private String name;
}

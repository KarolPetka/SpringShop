package com.project.shop.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Product {

    @Id
    private long id;
    private String name;
    private String description;
}

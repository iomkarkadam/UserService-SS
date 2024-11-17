package com.bits.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Table(name= "users")
public class User {

    @Id
    private String userId;

    private String userName;

    private String pincode;

}

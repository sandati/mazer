/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mazerproject.mazer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.javalite.activejdbc.Model;

/**
 *
 * @author yahaya
 */
@Entity
@Table(name = "user")
public class User extends Model {
    @Id
    @GeneratedValue
    private long id;
    
    @Column(name = "firstname", nullable = false)
    private String firstname;
    
    @Column(name = "lastname", nullable = false)
    private String lastname; 
    
    @Column(name = "gender", nullable = false)
    private char gender; 
}

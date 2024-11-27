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
@Table(name = "agenda_spot")
public class AgendaSpot extends Model {
    @Id
    @GeneratedValue
    private long id;
    
    @Column(name = "start_time", nullable = false)
    private String startTime;
    
    @Column(name = "end_time", nullable = false)
    private String endTime;
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mazerproject.mazer.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author yahaya
 */
@Entity
@Table(name = "agenda_booking")
public class AgendaBooking {
    @Id
    @GeneratedValue
    private long id;
    
    @Column(name = "title", nullable = false)
    private String title;
    
    @Column(name = "description", nullable = false)
    private String description;
    
    @Column(name = "date", nullable = false)
    private String date;
    
    @Column(name = "user_id", nullable = false)
    private String userId;
    
    @Column(name = "agent_id", nullable = false)
    private String agentId;
    
    @Column(name = "agenda_spot_id", nullable = false)
    private String agendaSpotId;
}

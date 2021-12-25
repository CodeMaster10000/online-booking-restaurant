package com.mile.pc.mile.restoraunt.app.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.transaction.Transactional;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String username;
    private String password;
    private Long balance;
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonBackReference
    private Reservation reservation;
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Role> roles;
    @OneToOne(mappedBy = "user")
    @JsonIgnore
    private TimeContainer timeContainer;
    @Transactional
    public void setUReservation(Reservation reservation) {
    	this.reservation = reservation;
    	reservation.setUser(this);
    }
}

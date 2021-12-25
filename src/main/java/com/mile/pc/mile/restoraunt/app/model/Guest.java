package com.mile.pc.mile.restoraunt.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Guest {
	
	@Id
	@GeneratedValue
	private Long id;
	@OneToOne
	private Reservation reservation; 
}

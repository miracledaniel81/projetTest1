package com.produit.appli.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Bulletin extends AbstractEntity {
	private Integer note;
	
	
	@ManyToOne
	@JoinColumn(name="matiere_id")
	private Matiere matiere;

}

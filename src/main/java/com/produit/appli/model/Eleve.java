package com.produit.appli.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

import lombok.experimental.SuperBuilder;

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Eleve extends AbstractEntity {
	private String nom_eleve;
	private String prenom_eleve;
	private Integer age_eleve;
	
	
	@OneToOne
	@JoinColumn(name="classe_id")
	private Classe classe;

}

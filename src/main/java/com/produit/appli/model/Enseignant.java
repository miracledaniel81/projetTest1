package com.produit.appli.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Enseignant extends AbstractEntity{
	private String nom_prof;
	private String prenom_prof;

	
	
	@ManyToOne
	@JoinColumn(name="classe_id")
	private Classe classe;
	
	
	
	@OneToOne
	@JoinColumn(name="matiere_id")
	private Matiere matiere;
}

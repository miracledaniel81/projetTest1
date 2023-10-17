package com.produit.appli.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Matiere extends AbstractEntity{
	private String nom_matiere;
	private Integer coef;
	
	
	@OneToMany(mappedBy="matiere")
	private List<Enseignant> enseignant;
	
	@OneToMany(mappedBy="matiere")
	private List<Bulletin> bulletin;
	
	

}

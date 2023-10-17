package com.produit.appli.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
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
public class Classe extends AbstractEntity {
	private String lib_classe;
	
	
	
	@OneToMany(mappedBy="classe")
	private List<Eleve> eleve;
	
	
	@OneToMany(mappedBy="classe")
	private List<Enseignant> enseignant;

}

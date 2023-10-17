package com.produit.appli.dto;

import com.produit.appli.model.Eleve;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class EleveDto {
	private String nom_eleve;
	private String prenom_eleve;
	private Integer age_eleve;
	private ClasseDto classe;
	
	
	public static EleveDto EntityToDto(Eleve eleve)
	{
	return EleveDto.builder()
			.nom_eleve(eleve.getNom_eleve())
			.prenom_eleve(eleve.getPrenom_eleve())
			.age_eleve(eleve.getAge_eleve())
			.classe(ClasseDto.EntityToDto(eleve.getClasse()))
			.build();
	}
	
	public static Eleve DtoToEntity(EleveDto eleve) 
	{
		return Eleve.builder()
				.nom_eleve(eleve.getNom_eleve())
				.prenom_eleve(eleve.getPrenom_eleve())
				.age_eleve(eleve.age_eleve)
				.classe(ClasseDto.DtoToEntity(eleve.getClasse()))
				.build();
	}
	
}

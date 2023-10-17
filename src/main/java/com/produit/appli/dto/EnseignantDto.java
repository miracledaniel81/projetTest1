package com.produit.appli.dto;

import com.produit.appli.model.Enseignant;
import com.produit.appli.model.Matiere;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class EnseignantDto {
	private String nom_prof;
	private String prenom_prof;
	private MatiereDto matiere;
	private ClasseDto classe;
	
	
	
	public static EnseignantDto EntityToDto(Enseignant enseignant)
	{
		return EnseignantDto.builder()
				.nom_prof(enseignant.getNom_prof())
				.prenom_prof(enseignant.getPrenom_prof())	
				.matiere(MatiereDto.EntityToDto(enseignant.getMatiere()))
				.classe(ClasseDto.EntityToDto(enseignant.getClasse()))	
				.build();
	}
	
	
	public static Enseignant DtoToEntity(EnseignantDto enseignant)
	{
		return Enseignant.builder()
				.nom_prof(enseignant.getNom_prof())
				.prenom_prof(enseignant.getPrenom_prof())
				.matiere(MatiereDto.DtoToEntity(enseignant.getMatiere()))
				.classe(ClasseDto.DtoToEntity(enseignant.getClasse()))	
				.build();
	}

}

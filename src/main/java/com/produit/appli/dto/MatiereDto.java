package com.produit.appli.dto;



import com.produit.appli.model.Matiere;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@Builder
public class MatiereDto {
	private String nom_matiere;
	private Integer coef;
	
	public static MatiereDto EntityToDto(Matiere matiere)
	{
		return MatiereDto.builder()
				.nom_matiere(matiere.getNom_matiere())
				.coef(matiere.getCoef())
				.build();
	}
	
	public static Matiere DtoToEntity(MatiereDto matiere)
	{
		return Matiere.builder()
				.nom_matiere(matiere.getNom_matiere())
				.coef(matiere.getCoef())
				.build();
	}

}

package com.produit.appli.dto;

import com.produit.appli.model.Classe;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class ClasseDto {
	private String lib_classe;
	
	private EnseignantDto enseignant;
	
	
	
	public static ClasseDto EntityToDto(Classe classe)
	{ 
		return ClasseDto.builder()
				.lib_classe(classe.getLib_classe())	
				.build();
	}
	
	public static Classe DtoToEntity(ClasseDto classe)
	{
		return Classe.builder()
				.lib_classe(classe.getLib_classe())			
				.build();
	}

}

package com.produit.appli.dto;

import com.produit.appli.model.Bulletin;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class BulletinDto {
	private Integer note;
	
   private MatiereDto matiere;
	
	
	public static BulletinDto EntityToDto(Bulletin bulletin)
	{
		return BulletinDto.builder()
				.note(bulletin.getNote())	
				.matiere(MatiereDto.EntityToDto(bulletin.getMatiere()))
				.build();
	}
	
	
	public static Bulletin DtoToEntity(BulletinDto bulletin)
	{
		return Bulletin.builder()
				.note(bulletin.getNote())
				.matiere(MatiereDto.DtoToEntity(bulletin.getMatiere()))
				.build();
	}
	
	
	
}

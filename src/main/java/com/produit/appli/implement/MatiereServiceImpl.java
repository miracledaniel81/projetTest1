package com.produit.appli.implement;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.produit.appli.dto.MatiereDto;
import com.produit.appli.repository.MatiereRepository;
import com.produit.appli.service.MatiereService;

import jakarta.persistence.EntityNotFoundException;

import com.produit.appli.model.Matiere;

@Service
public class MatiereServiceImpl implements MatiereService {

	@Autowired
	private MatiereRepository repos;
	
	@Override
	public Long save(MatiereDto dto) {
		Matiere matiere = MatiereDto.DtoToEntity(dto);
		return repos.save(matiere).getId();
	}
	
	@Override
	public MatiereDto findById(Long id) {
		
		return repos.findById(id)
				.map(MatiereDto::EntityToDto)
				.orElseThrow(()->new EntityNotFoundException("Introuvable"));
	}

	@Override
	public List<MatiereDto> FindAll() {
		
		return repos.findAll()
				.stream()
				.map(MatiereDto::EntityToDto)
				.collect(Collectors.toList());
	}

	@Override
	public void delete(Long id) {
		repos.deleteById(id);
		
	}

	

}

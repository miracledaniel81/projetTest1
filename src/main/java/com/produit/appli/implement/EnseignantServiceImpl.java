package com.produit.appli.implement;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.produit.appli.dto.EnseignantDto;
import com.produit.appli.model.Enseignant;
import com.produit.appli.repository.EnseignantRepository;
import com.produit.appli.service.EnseignantService;

import jakarta.persistence.EntityNotFoundException;

@Service
public class EnseignantServiceImpl implements EnseignantService {
	
	@Autowired
	private EnseignantRepository repos;

	@Override
	public Long save(EnseignantDto dto) {
	
		Enseignant enseignant = EnseignantDto.DtoToEntity(dto);
		return repos.save(enseignant).getId();
	}
	
	@Override
	public EnseignantDto findById(Long id) {
		return repos.findById(id)
				.map(EnseignantDto::EntityToDto)
				.orElseThrow(()->new EntityNotFoundException("Introuvable"));
	}

	@Override
	public List<EnseignantDto> FindAll() {
		
		return repos.findAll()
				.stream()
				.map(EnseignantDto::EntityToDto)
				.collect(Collectors.toList());
	}

	@Override
	public void delete(Long id) {
		repos.deleteById(id);
		
	}

	

}

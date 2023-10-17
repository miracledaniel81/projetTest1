package com.produit.appli.implement;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.produit.appli.dto.EleveDto;
import com.produit.appli.model.Eleve;
import com.produit.appli.repository.EleveRepository;
import com.produit.appli.service.EleveService;

import jakarta.persistence.EntityNotFoundException;

@Service
public class EleveServiceImpl implements EleveService {

	@Autowired
	private EleveRepository repos;
	
	@Override
	public Long save(EleveDto dto) {
	  Eleve eleve = EleveDto.DtoToEntity(dto);
		return repos.save(eleve).getId();
	}

	@Override
	public EleveDto findById(Long id) {

		return repos.findById(id)
				.map(EleveDto::EntityToDto)
				.orElseThrow(() -> new EntityNotFoundException("Introuvable"));
	}

	@Override
	public List<EleveDto> FindAll() {
		
		return repos.findAll()
				.stream()
				.map(EleveDto::EntityToDto)
				.collect(Collectors.toList());
	}

	@Override
	public void delete(Long id) {
		repos.deleteById(id);
		
	}

	

}

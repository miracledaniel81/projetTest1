package com.produit.appli.implement;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.produit.appli.dto.ClasseDto;
import com.produit.appli.model.Classe;
import com.produit.appli.repository.ClasseRepository;
import com.produit.appli.service.ClasseService;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ClasseServiceImpl implements ClasseService {
	
	@Autowired
	private ClasseRepository repos;

	@Override
	public Long save(ClasseDto dto) {
	 Classe classe = ClasseDto.DtoToEntity(dto);
		return repos.save(classe).getId();
	}

	@Override
	public ClasseDto findById(Long id) {
	
		return repos.findById(id)
				.map(ClasseDto::EntityToDto)
				.orElseThrow(()-> new EntityNotFoundException("Introuvable"))
				;
	}

	@Override
	public List<ClasseDto> FindAll() {
		return repos.findAll()
				.stream()
				.map(ClasseDto::EntityToDto)
				.collect(Collectors.toList())
				;
	}

	@Override
	public void delete(Long id) {
		repos.deleteById(id);
		
	}

	

}

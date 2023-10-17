package com.produit.appli.implement;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.produit.appli.dto.BulletinDto;
import com.produit.appli.model.Bulletin;
import com.produit.appli.repository.BulletinRepository;
import com.produit.appli.service.BulletinService;

import jakarta.persistence.EntityNotFoundException;


@Service
public class BulletinServiceImpl implements BulletinService {
	
	@Autowired
	private BulletinRepository repos;

	
	@Override
	public Long save(BulletinDto dto) {
		Bulletin bulletin = BulletinDto.DtoToEntity(dto);
		return  repos.save(bulletin).getId();
	}
	

	@Override
	public BulletinDto findById(Long id) {
		
		return repos.findById(id)
				.map(BulletinDto::EntityToDto)
				.orElseThrow(() -> new EntityNotFoundException("Donnée introuvable"));
				
	}

	@Override
	public List<BulletinDto> FindAll() {
		
		return  repos.findAll()
				.stream()
				.map(BulletinDto::EntityToDto)
				.collect(Collectors.toList());
	}

	@Override
	public void delete(Long id) {
		repos.deleteById(id);
		
	}

	

}

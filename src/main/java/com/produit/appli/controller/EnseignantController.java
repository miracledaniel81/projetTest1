package com.produit.appli.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produit.appli.dto.EnseignantDto;

import com.produit.appli.service.EnseignantService;


import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/enseignants")
@RequiredArgsConstructor


public class EnseignantController {
	
@Autowired
	
	private final EnseignantService service;

@PostMapping("/")
public ResponseEntity<Long> save(@RequestBody EnseignantDto enseignantDto)
{
	return ResponseEntity.ok(service.save(enseignantDto));
}

@GetMapping("/")
public ResponseEntity<List<EnseignantDto>> findAll()
{
	return ResponseEntity.ok(service.FindAll());
}

@GetMapping("/{id}")
public ResponseEntity<EnseignantDto> findById(@PathVariable("id") Long id)
{
	return ResponseEntity.ok(service.findById(id));
}


@DeleteMapping("/{id}")

public ResponseEntity<Void>  delete(@PathVariable("id") Long id)
{
	service.delete(id);
	
	return ResponseEntity.accepted().build();
}
}

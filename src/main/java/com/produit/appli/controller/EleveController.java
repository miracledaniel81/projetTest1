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


import com.produit.appli.dto.EleveDto;

import com.produit.appli.service.EleveService;


import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/eleves")
@RequiredArgsConstructor
public class EleveController {
	
@Autowired
	
	private final EleveService service;

@PostMapping("/")
public ResponseEntity<Long> save(@RequestBody EleveDto eleveDto)
{
	return ResponseEntity.ok(service.save(eleveDto));
}

@GetMapping("/")
public ResponseEntity<List<EleveDto>> findAll()
{
	return ResponseEntity.ok(service.FindAll());
}

@GetMapping("/{id}")
public ResponseEntity<EleveDto> findById(@PathVariable("id") Long id)
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

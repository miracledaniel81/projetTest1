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

import com.produit.appli.dto.BulletinDto;
import com.produit.appli.service.BulletinService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/bulletins")
@RequiredArgsConstructor
public class BulletinController {
	
	@Autowired
	private final BulletinService service;
	
	// save data
	@PostMapping("/")
	
	public ResponseEntity<Long> save(@RequestBody BulletinDto bulletindto)
	{
		return ResponseEntity.ok(service.save(bulletindto));
	}
	
	
	@GetMapping("/")
	public ResponseEntity<List<BulletinDto>> findAll()
	{
		return ResponseEntity.ok(service.FindAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<BulletinDto> findById(@PathVariable("id") Long id)
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

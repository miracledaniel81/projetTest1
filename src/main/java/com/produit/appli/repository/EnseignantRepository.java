package com.produit.appli.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produit.appli.model.Enseignant;

public interface EnseignantRepository extends JpaRepository<Enseignant, Long> {

}

package com.produit.appli.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produit.appli.model.Eleve;

public interface EleveRepository extends JpaRepository<Eleve, Long> {

}

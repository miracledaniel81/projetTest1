package com.produit.appli.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produit.appli.model.Bulletin;

public interface BulletinRepository extends JpaRepository<Bulletin,Long> {

}

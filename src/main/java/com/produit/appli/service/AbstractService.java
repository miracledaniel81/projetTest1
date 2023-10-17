package com.produit.appli.service;

import java.util.List;

public interface AbstractService<T> {
	
	Long save(T dto);
	T findById(Long id);
	List<T> FindAll();
	void delete(Long id);

}

package com.utransparency.service;

import java.util.List;

import com.utransparency.model.TypeProgresive;

public interface TypeProgresiveService {
	
	public List<TypeProgresive> findAll();
	
	public TypeProgresive findById(int idType);
	
	public List<TypeProgresive> findBySubtype(int idType) ;
	
	

}

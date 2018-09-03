package com.cvs.xml.processor;

import org.springframework.batch.item.ItemProcessor;

import com.cvs.xml.model.Personne;

public class CustomProcessor implements ItemProcessor<Personne, Personne> {

	@Override
	public Personne process(Personne personne) throws Exception {
		System.out.println("Processing..." + personne); 
	      return personne; 
	}

}

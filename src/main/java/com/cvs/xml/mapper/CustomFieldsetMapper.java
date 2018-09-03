package com.cvs.xml.mapper;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.cvs.xml.model.Personne;

public class CustomFieldsetMapper implements FieldSetMapper<Personne>{

	@Override
	public Personne mapFieldSet(FieldSet fieldSet) throws BindException {
		// créer une instance
		Personne personne = new Personne();

		// lire les colonnes
		personne.setId(fieldSet.readString(0));	
		personne.setId(fieldSet.readString(1));
		personne.setId(fieldSet.readString(2));
		
		return personne;
	}

}

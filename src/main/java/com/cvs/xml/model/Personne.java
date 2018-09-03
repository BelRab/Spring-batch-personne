package com.cvs.xml.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="personne")
public class Personne {

	private String id;
	private String name;
	private String ville;

	public Personne(String id, String name, String ville) {
		this.id = id;
		this.name = name;
		this.ville = ville;
	}

	public Personne() {
	}

	/**
	 * @return the id
	 */
	@XmlAttribute(name="id")
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	@XmlAttribute(name="name")
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the ville
	 */
	@XmlAttribute(name="ville")
	public String getVille() {
		return ville;
	}

	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Personne [id=" + id + ", name=" + name + ", ville=" + ville + "]";
	}
	

}

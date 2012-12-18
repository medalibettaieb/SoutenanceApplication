package tn.esprit.soutenanceApplication.persistence;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Etudiant
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name="t_etudiant")

public class Etudiant implements Serializable {

	
	private int id;
	private String nom;
	private String prenom;
	
	private List<Note> notes;
	

	public Etudiant() {
		super();
	}   
	@Id    
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	@OneToMany(mappedBy="etudiant")
	public List<Note> getNotes() {
		return notes;
	}
	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}
   
}

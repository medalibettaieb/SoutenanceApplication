package tn.esprit.soutenanceApplication.persistence;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Enseignant
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name="t_enseignant")

public class Enseignant implements Serializable {

	
	private int id;
	private String nom;
	private String prenom;
	
	private List<ParticipationEnseignant> participations;
	

	
	public Enseignant() {
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
	@OneToMany (mappedBy="enseignant")
	public List<ParticipationEnseignant> getParticipations() {
		return participations;
	}
	public void setParticipations(List<ParticipationEnseignant> participations) {
		this.participations = participations;
	}
}

package tn.esprit.soutenanceApplication.persistence;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Soutenance
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name="t_soutenance")

public class Soutenance implements Serializable {

	
	private int id;
	private String libelle;
	private Date dateSoutenance;
	
	private Salle salle;
	private List<Note> notes;
	private List<ParticipationEnseignant> participationEnseignants;
	

	public Soutenance() {
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
	public Date getDateSoutenance() {
		return this.dateSoutenance;
	}

	public void setDateSoutenance(Date dateSoutenance) {
		this.dateSoutenance = dateSoutenance;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getLibelle() {
		return libelle;
	}
	@ManyToOne
	public Salle getSalle() {
		return salle;
	}
	public void setSalle(Salle salle) {
		this.salle = salle;
	}
@OneToMany(mappedBy="soutenance")
	public List<Note> getNotes() {
		return notes;
	}
	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}
	@OneToMany(mappedBy="soutenance")
	public List<ParticipationEnseignant> getParticipationEnseignants() {
		return participationEnseignants;
	}
	public void setParticipationEnseignants(
			List<ParticipationEnseignant> participationEnseignants) {
		this.participationEnseignants = participationEnseignants;
	}
   
}

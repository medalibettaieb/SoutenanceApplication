package tn.esprit.soutenanceApplication.persistence;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Note
 *
 */

@Entity
@Table(name="t_note")

public class Note implements Serializable {


	
	private int id;
	private int noteDeSoutenance;
	
	private Soutenance soutenance;
	private Etudiant etudiant;
	

	public Note() {
		
	}   
	@Id   
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public int getNoteDeSoutenance() {
		return this.noteDeSoutenance;
	}

	public void setNoteDeSoutenance(int noteDeSoutenance) {
		this.noteDeSoutenance = noteDeSoutenance;
	}
	@ManyToOne
	public Soutenance getSoutenance() {
		return soutenance;
	}
	public void setSoutenance(Soutenance soutenance) {
		this.soutenance = soutenance;
	}
	@ManyToOne
	public Etudiant getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
   
}

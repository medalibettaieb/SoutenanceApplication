package tn.esprit.soutenanceApplication.persistence;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Participation
 *
 */
@Entity
@Table(name="t_participation")

public class ParticipationEnseignant implements Serializable {

	
	private int id;
	private String role;
	
	private Enseignant enseignant;	
	private Soutenance soutenance;

	public ParticipationEnseignant() {
		// TODO Auto-generated constructor stub
	}   
	@Id   
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	@ManyToOne
	public Enseignant getEnseignant() {
		return enseignant;
	}
	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}
	@ManyToOne
	public Soutenance getSoutenance() {
		return soutenance;
	}
	public void setSoutenance(Soutenance soutenance) {
		this.soutenance = soutenance;
	}
   
}

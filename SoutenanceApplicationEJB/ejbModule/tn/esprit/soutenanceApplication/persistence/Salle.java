package tn.esprit.soutenanceApplication.persistence;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Salle
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name="t_salle")
public class Salle implements Serializable {

	
	private int num;
	private String libelle;
	
	private List<Soutenance> soutenances;
	

	public Salle() {
		super();
	}   
	@Id    
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getNum() {
		return this.num;
	}

	public void setNum(int num) {
		this.num = num;
	}   
	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	@OneToMany(mappedBy="salle")
	public List<Soutenance> getSoutenances() {
		return soutenances;
	}
	public void setSoutenances(List<Soutenance> soutenances) {
		this.soutenances = soutenances;
	}
   
}

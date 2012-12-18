package tn.esprit.soutenanceApplication.dao.interfaces;
import java.util.List;

import javax.ejb.Local;

import tn.esprit.soutenanceApplication.persistence.Enseignant;

@Local
public interface EnseignantDaoLocal {
	public void add(Enseignant enseignant);
	public void delete(int id);
	public void update(Enseignant enseignant);
	public Enseignant findEnseignantById(int id);
	public List<Enseignant> findall();

}

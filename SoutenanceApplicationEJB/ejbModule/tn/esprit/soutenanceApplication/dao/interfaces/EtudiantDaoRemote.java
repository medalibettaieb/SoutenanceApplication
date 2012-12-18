package tn.esprit.soutenanceApplication.dao.interfaces;
import java.util.List;

import javax.ejb.Remote;

import tn.esprit.soutenanceApplication.persistence.Etudiant;

@Remote
public interface EtudiantDaoRemote {
	public void add(Etudiant etudiant);
	public void delete(int id);
	public void update(Etudiant etudiant);
	public Etudiant findEtudiantById(int id);
	public List<Etudiant> findall();
}

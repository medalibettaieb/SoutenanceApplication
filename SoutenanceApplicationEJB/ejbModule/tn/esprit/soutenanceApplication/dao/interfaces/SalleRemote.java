package tn.esprit.soutenanceApplication.dao.interfaces;
import java.util.List;

import javax.ejb.Remote;

import tn.esprit.soutenanceApplication.persistence.Salle;


@Remote
public interface SalleRemote {
	public void add(Salle salle);
	public void delete(int id);
	public void update(Salle salle);
	public Salle findSalleById(int id);
	public List<Salle> findall();
}

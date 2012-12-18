package tn.esprit.soutenanceApplication.dao.interfaces;
import java.util.List;

import javax.ejb.Local;

import tn.esprit.soutenanceApplication.persistence.Salle;


@Local
public interface SalleLocal {
	public void add(Salle salle);
	public void delete(int id);
	public void update(Salle salle);
	public Salle findSalleById(int id);
	public List<Salle> findall();
}

package tn.esprit.soutenanceApplication.dao.interfaces;
import java.util.List;

import javax.ejb.Local;

import tn.esprit.soutenanceApplication.persistence.Soutenance;

@Local
public interface SoutenanceDaoLocal {
	public void add(Soutenance soutenance);
	public void delete(int id);
	public void update(Soutenance soutenance);
	public Soutenance findSoutenanceById(int id);
	public List<Soutenance> findall();
}

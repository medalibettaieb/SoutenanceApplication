package ctr;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.model.SelectItem;

import tn.esprit.soutenanceApplication.dao.interfaces.SalleLocal;
import tn.esprit.soutenanceApplication.dao.interfaces.SoutenanceDaoLocal;
import tn.esprit.soutenanceApplication.persistence.Salle;
import tn.esprit.soutenanceApplication.persistence.Soutenance;

public class SoutenanceCtr {
	@EJB(name = "SoutenanceApplication/SoutenanceDao/local")
	private SoutenanceDaoLocal daoLocal;
	@EJB(name = "SoutenanceApplication/SalleDao/local")
	private SalleLocal salleLocal;

	private List<SelectItem> items;
	private int selectedSalleId;

	private Soutenance soutenance = new Soutenance();
	private Salle salle = new Salle();
	private List<Salle> salles = new ArrayList<Salle>();

	public String doAdd() {
		soutenance.setSalle(salleLocal.findSalleById(selectedSalleId));

		daoLocal.add(soutenance);
		return "";
	}

	public void setSoutenance(Soutenance soutenance) {
		this.soutenance = soutenance;
	}

	public Soutenance getSoutenance() {
		return soutenance;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	public Salle getSalle() {
		return salle;
	}

	public void setSalles(List<Salle> salles) {
		this.salles = salles;
	}

	public List<Salle> getSalles() {
		salles = salleLocal.findall();
		return salles;
	}

	public List<SelectItem> getItems() {
		List<Salle> salles = salleLocal.findall();
		items = new ArrayList<SelectItem>(salles.size() + 1);
		items.add(new SelectItem(-1, "select one..."));
		for (Salle s : salles)
			items.add(new SelectItem(s.getNum(), s.getLibelle()));

		return items;
	}

	public void setItems(List<SelectItem> items) {
		this.items = items;
	}

	public int getSelectedSalleId() {
		return selectedSalleId;
	}

	public void setSelectedSalleId(int selectedSalleId) {
		this.selectedSalleId = selectedSalleId;
	}

}
